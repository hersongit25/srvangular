#install maven on jenkins image container
FROM jenkins/jenkins:lts
# install with apt
USER root
RUN apt-get update && apt-get install -y maven
# drop back to regular jenkins user
USER jenkins