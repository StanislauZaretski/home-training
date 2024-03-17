$SPRING_PROJECT_DIR = "C:\Git\home-training"
$DOCKER_IMAGE_NAME = "spring_home_training"
$DOCKER_CONTAINER_NAME = "spring_home_training"
$DOCKER_PORT_MAPPING = "8080:8080"

cd $SPRING_PROJECT_DIR

mvn clean package

#Dockerfile
@"
FROM openjdk:17-jdk-alpine
COPY target/*.jar /app.jar
ENTRYPOINT java -DenvTarget=prod -jar /app.jar
"@ | Out-File -FilePath "$SPRING_PROJECT_DIR\Dockerfile" -Encoding utf8

# Docker image
docker build -t $DOCKER_IMAGE_NAME $SPRING_PROJECT_DIR

# delete dockerfile
Remove-Item "$SPRING_PROJECT_DIR\Dockerfile"

# run docker and map port
docker run -d -p $DOCKER_PORT_MAPPING --name $DOCKER_CONTAINER_NAME $DOCKER_IMAGE_NAME
