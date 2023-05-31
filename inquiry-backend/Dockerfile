FROM openjdk11-jre-alpine AS builder

RUN mkdir -p /home/spring
WORKDIR /home/spring
COPY target/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM openjdk:11-jre-alpine

WORKDIR /home/spring
COPY --from=builder /home/spring/dependencies/ ./
COPY --from=builder /home/spring/spring-boot-loader/ ./
COPY --from=builder /home/spring/snapshot-dependencies/ ./
COPY --from=builder /home/spring/application/ ./

ENTRYPOINT java $JAVA_OPTS -Dfile.encoding=UTF-8 org.springframework.boot.loader.JarLauncher
