package mn.gov.ema.emongolia.tools;

import java.math.BigDecimal;

public class Converter {

    public static String[]  names1 = {"нэг","хоёр","гурав","дөрөв","тав","зургаа","долоо","найм","ес"};
    public static String[]  names11 = {"нэг","хоёр","гурван","дөрвөн","таван","зургаан","долоон","найман","есөн"};
    public static String[]  names6 = {"арван","хорин","гучин","дөчин","тавин","жаран","далан","наян","ерэн"};
    public static String[]  names2 = {"арав","хорь","гуч","дөч","тавь","жар","дал","ная","ер"};
    public static String[]  names7 = {"зуун","мянга","сая","тэрбум","зуу","мянган"};

    public static String convertToAmountCryllic(BigDecimal amount){
        if(amount == null || Tools.isNullOrZero(amount))
            return "тэг төгрөг";

        amount = Tools.convertToDecimal(amount);

        String[] splitted = Tools.convertToString(amount).split("\\.");
        String pointAfterStr = Tools.endsWith(splitted[1], "00") ? "" : (convertToAmountCryllic(splitted[1]) + " мөнгө");
        String amountConverted = convertToAmountCryllic(splitted[0]);
        return amountConverted + (amountConverted.endsWith(" ") ? "төгрөг" : " төгрөг") + " " + pointAfterStr;
    }

    public static String convertToAmountCryllic(String str){
        String result = "";
        int len = str.length();
        if (len == 1) result = names11[Integer.parseInt(str)-1];
        else {
            int j = 0;
            int i = str.length() - 1;
            if (str.endsWith("000000000")) {
                result += names1[Integer.parseInt(str.charAt(str.length()-10)+"")-1]+" "+names7[3];
                i = str.length() - 10;
                j = 9;
            } else
            if (str.endsWith("00000000")) {
                result += names1[Integer.parseInt(str.charAt(str.length()-9)+"")-1]+" "+names7[0]+" "+names7[2];
                i = str.length() - 9;
                j = 8;
            } else
            if (str.endsWith("0000000")) {
                result += names6[Integer.parseInt(str.charAt(str.length()-8)+"")-1]+" "+names7[2];
                i = str.length() - 8;
                j = 7;
            } else
            if (str.endsWith("000000")) {
                result += names11[Integer.parseInt(str.charAt(str.length()-7)+"")-1]+" "+names7[2];
                i = str.length() - 7;
                j = 6;
            } else
            if (str.endsWith("00000")) {
                result += names11[Integer.parseInt(str.charAt(str.length()-6)+"")-1]+" "+names7[0]+" "+names7[5];
                i = str.length() - 6;
                j = 5;
            } else
            if (str.endsWith("0000")) {
                result += names6[Integer.parseInt(str.charAt(str.length()-5)+"")-1]+" "+names7[5];
                i = str.length() - 5;
                j = 4;
            } else
            if (str.endsWith("000")) {
                result += names11[Integer.parseInt(str.charAt(str.length()-4)+"")-1]+" "+names7[5];
                i = str.length() - 4;
                j = 3;
            } else
            if (str.endsWith("00")) {
                result += names11[Integer.parseInt(str.charAt(str.length()-3)+"")-1]+" "+names7[0];
                i = str.length() - 3;
                j = 2;
            } else
            if (str.endsWith("0")) {
                result += names6[Integer.parseInt(str.charAt(str.length()-2)+"")-1];
                i = str.length() - 2;
                j = 1;
            }
            while (i >= 0) {
                if (j == 0) {
                    if (str.charAt(i) != '0')
                        result = names11[Integer.parseInt(str.charAt(i) + "") - 1];
                }
                else {
                    if (str.length()-j-1 >= 0 && str.charAt(str.length()-j-1) != '0') {
                        if (j == 1 && !str.endsWith("0"))
                            result = names6[Integer.parseInt(str.charAt(i) + "") - 1] + " " + result + " ";
                        if (j == 2 && !str.endsWith("00"))
                            result = names11[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[0] + " " + result + " ";
                        if (j == 3 && !str.endsWith("000"))
                            result = names11[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[1] + " " + result + " ";
                        if (j == 4 && !str.endsWith("0000"))
                            result = names6[Integer.parseInt( str.charAt(i) + "") - 1] + ( (str.charAt(i + 1) == '0') ? " " + names7[1] : "") + " " + result + " ";
                        if (j == 5 && !str.endsWith("00000"))
                            result = names11[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[0] + ( (str.charAt(i + 1) == '0' && str.charAt(i + 2) == '0') ? " " + names7[1] : "") + " " + result + " ";
                        if (j == 6 && !str.endsWith("000000"))
                            result = names11[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[2] + " " + result + " ";
                        if (j == 7 && !str.endsWith("0000000"))
                            result = names6[Integer.parseInt(str.charAt(i) + "") - 1] + ( (str.charAt(i + 1) == '0') ? " " + names7[2] : "") + " " + result + " ";
                        if (j == 8 && !str.endsWith("00000000"))
                            result = names1[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[0] + ( (str.charAt(i + 1) == '0' && str.charAt(i + 2) == '0') ? " " + names7[2] : "")  + " " + result + " ";
                        if (j == 9 && !str.endsWith("000000000"))
                            result = names1[Integer.parseInt(str.charAt(i) + "") - 1] + " " + names7[3] + " " + result + " ";
                    }
                }
                i--;
                j++;
            }
        }
        while (result.indexOf("  ") !=- 1) {
            result = result.replaceAll("  "," ");
        }
        return (result);
    }
}
