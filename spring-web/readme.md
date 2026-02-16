docker build -t spring-ws-tomcat .
docker-compose up -d --build
docker-compose down
docker-compose logs -f
docker exec -it spring-ws-tomcat /bin/bash

curl -v http://localhost:8080/web-app/app/persons/v1
