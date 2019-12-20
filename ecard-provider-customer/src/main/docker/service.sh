#!/bin/bash

JAVA_OPT="-Xms512m -Xmx512m -Xmn256m -Djava.security.egd=file:/dev/./urandom"

if [[ ! -z "${NACOS_DISCOVERY_NAMESPACE}" ]]; then
    JAVA_OPT="${JAVA_OPT} -Dspring.cloud.nacos.discovery.namespace=${NACOS_DISCOVERY_NAMESPACE}"
fi

if [[ ! -z "${NACOS_DISCOVERY_SERVER_ADDR}" ]]; then
    JAVA_OPT="${JAVA_OPT} -Dspring.cloud.nacos.discovery.server-addr=${NACOS_DISCOVERY_SERVER_ADDR}"
fi

if [[ ! -z "${NACOS_CONFIG_NAMESPACE}" ]]; then
    JAVA_OPT="${JAVA_OPT} -Dspring.cloud.nacos.config.namespace=${NACOS_CONFIG_NAMESPACE}"
fi

if [[ ! -z "${NACOS_CONFIG_SERVER_ADDR}" ]]; then
    JAVA_OPT="${JAVA_OPT} -Dspring.cloud.nacos.config.server-addr=${NACOS_CONFIG_SERVER_ADDR}"
fi

ECARD_SERVICE="${JAVA_OPT} -jar ${BUS_WORK_DIR}/provider-customer.jar"

echo "-----------------------service start param:${JAVA_OPT}-------------------------------"

nohup $JAVA ${ECARD_SERVICE}