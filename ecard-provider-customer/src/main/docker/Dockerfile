FROM openjdk:8-jre-slim
MAINTAINER xiaochuan "18860433348@163.com"

ENV BUS_WORK_DIR="/home/bus" \
    TIME_ZONE="Asia/Shanghai" \
    JAVA="/usr/local/openjdk-8/bin/java"

ARG BUS_VERSION=1.0.0-SNAPSHOT

WORKDIR /$BUS_WORK_DIR

RUN set -x \
    && ln -snf /usr/share/zoneinfo/$TIME_ZONE /etc/localtime && echo '$TIME_ZONE' > /etc/timezone

RUN mkdir logs

ADD ./ecard-provider-customer-${BUS_VERSION}.jar ./provider-customer.jar

ADD service.sh ./service.sh
ADD wait-for-it.sh ./wait-for-it.sh

RUN chmod +x ./service.sh
RUN chmod +x ./wait-for-it.sh


