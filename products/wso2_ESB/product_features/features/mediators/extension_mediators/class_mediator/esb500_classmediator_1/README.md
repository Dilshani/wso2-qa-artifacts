# README

This artifact is written to demonstrate the use of class mediator. This class mediator will print the protocol, request path (depends on the request) and the host name with port with relevant to the request.

> Note: This particular sample is tested with WSO2 ESB 5.0.0 M2 and WSO2 AS 530


### Contents 
  - Maven project of class mediator: org.wso2.carbon.custommediator
  - sequences: class_seq_1.xml
  - Proxy service: ClassProxy_1.xml
  - Axis2 Service: NewOrderService.aar
  
### Preconditions
- Maven project should be built  by issuing mvn clean install
- The org.wso2.carbon.custommediator-0.0.1-SNAPSHOT.jar (inside target folder of the maven project) should be copied to <ESB_HOME>/repository/components/lib folder
- ESB server should be restarted
- Axis2 service should be deployed in WSO2 AS

### Steps
- Deploy the given sequence in WSO2 ESB
- Deploy the given proxy service in WSO2 ESB by changing endpoint to refer the deployed axis2 service.
- Invoke the proxy service


### Expected Outcome
Protocol, Request path and host name with port should be printed in log. If an Rest back end is invoked through this class mediator, the request path will be printed.
