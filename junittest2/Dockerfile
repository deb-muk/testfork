From tomcat:8.0.51-jre8-alpine  
RUN apk update && apk add curl
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/springbootrestapiexample.war  /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]




