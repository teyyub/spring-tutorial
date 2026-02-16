# 1️⃣ Base image: Tomcat 9
FROM tomcat:9.0-jdk17

# 2️⃣ WAR faylını Tomcat webapps qovluğuna kopyala
# Maven build sonrası target/spring-w.war olmalıdır
COPY target/*.war /usr/local/tomcat/webapps/web-app.war

# 3️⃣ Tomcat portunu expose et
EXPOSE 8080

# 4️⃣ Tomcat run (default)
CMD ["catalina.sh", "run"]
