package mn.gov.ema.emongolia.util;

import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.entity.Organization;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
@Log
public class XypSign {
    private final String instanceKey = "PKCS12";
    private String password;
    private String aliasname;
    private PrivateKey pkey;
    private KeyStore ks;

    private static XypSign instance;


    private static XypSign getInstance(byte[] cert, String password, String alias) throws Exception {
//        if(instance == null)
            instance = new XypSign(cert, password, alias);
        return instance;
    }

//    private XypSign(byte[] cert)  throws  Exception {
////        this.aliasname = "1";
////        this.password = "isjrpKP";
//
//        this.ks = KeyStore.getInstance(instanceKey);
//        this.ks.load(new ByteArrayInputStream(cert), password.toCharArray());
//        this.pkey = (PrivateKey) ks.getKey(aliasname, password.toCharArray());
//    }

    private XypSign(byte[] cert, String password, String alias)  throws  Exception {
        this.aliasname = alias;
        this.password = password;

        this.ks = KeyStore.getInstance(instanceKey);
        this.ks.load(new ByteArrayInputStream(cert), password.toCharArray());
        this.pkey = (PrivateKey) ks.getKey(aliasname, password.toCharArray());
    }

    private String getCurrentTimestamp(){
        Date date = new Date();
        DateFormat dtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return Long.toString(date.getTime() / 1000);
        //return dtf.format(date);
    }

    private Hashtable<String, String> toBeSigned(String accessToken){
        Hashtable<String, String> toBeSigned = new Hashtable<String, String>();
        toBeSigned.put("accessToken", accessToken);
        toBeSigned.put("timestamp", getCurrentTimestamp());
        return toBeSigned;
    }

    public Hashtable<String, String> sign(String accessToken) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, FileNotFoundException, IOException, UnrecoverableKeyException, InvalidKeyException, SignatureException{

        String signature = null;
        Hashtable<String, String> toBeSigned = toBeSigned(accessToken);
        Signature ds = Signature.getInstance("SHA256withRSA");
        ds.initSign(pkey);
        ds.update( (toBeSigned.get("accessToken") + "." + toBeSigned.get("timestamp")).getBytes());
//		signature = Base64Encode.encode(ds.sign()).toString();
        signature = Base64.getEncoder().encodeToString(ds.sign());
        toBeSigned.put("signature", signature);

        return toBeSigned;

    }

    public static  Map<String, List<String>> getRequestHeaders(Organization org){

        Hashtable<String, String> fields = null;
//        String accessToken = "9b1def59b8bebd5e206dab372f212611";

        String accessToken = org.getAccessToken();
        try{
            fields = XypSign.getInstance(org.getCertFile(), org.getKey(), org.getAlias()).sign(accessToken);
        }catch(Exception e){
            e.printStackTrace();
        }

        Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
        System.out.println("accessToken : " + fields.get("accessToken"));
        System.out.println("timeStamp : " + fields.get("timestamp"));
        System.out.println("signature : " + fields.get("signature"));
        SimpleDateFormat smtSlashminus = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        requestHeaders.put("accessToken", Collections.singletonList(fields.get("accessToken")));
        requestHeaders.put("timeStamp", Collections.singletonList(fields.get("timestamp")));
        requestHeaders.put("signature", Collections.singletonList(fields.get("signature")));

        return requestHeaders;
    }

}
