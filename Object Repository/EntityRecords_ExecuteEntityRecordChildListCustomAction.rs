<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>EntityRecords_ExecuteEntityRecordChildListCustomAction</name>
   <tag></tag>
   <elementGuidId>1c2a0bfe-a72c-43a6-be1c-76443f49d2ae</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d415bf8f-a72f-4e29-b182-1bf629178da3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-type</name>
      <type>Main</type>
      <value>text/json</value>
      <webElementGuid>04e9f040-85e2-4978-9443-293a3983efa5</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://null/KINRO_TST/CPQEQ/RuntimeApi/EnterpriseQuoting/Entities/${entityDefinitionName}${(}${id}${)/}${childEntityDefinition}${/}${actionName}?$filter=&amp;$orderby=&amp;$top=&amp;$skip=</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3f0533cc-588a-4433-994a-4648fd266346</id>
      <masked>false</masked>
      <name>entityDefinitionName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6dbc4d7f-d16a-4720-87d0-fad1195a4233</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>4a70519c-2a10-45f3-85c8-8e387052d264</id>
      <masked>false</masked>
      <name>childEntityDefinition</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3f2d8ab7-7dda-4106-8a94-df285cdbc261</id>
      <masked>false</masked>
      <name>actionName</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
