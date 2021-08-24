FROM payara/server-full
COPY target/*.war $DEPLOY_DIR
EXPOSE 80 4848 8080

ENTRYPOINT ["/opt/payara5/bin/asadmin","start-domain","--verbose"]

