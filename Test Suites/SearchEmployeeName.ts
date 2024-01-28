<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>This is a data drive test case using Employee's name and searches for OrangeHRM</description>
   <name>SearchEmployeeName</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>0681022d-3f34-4a38-9cf2-3d2e22a53532</testSuiteGuid>
   <testCaseLink>
      <guid>58aee7d4-28a2-4b5d-a560-d2ef90068367</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/14 - Search Employee/TC48 - Search Employee Using Name</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b8448acb-6167-46dd-b08f-bc103cbccb25</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/addEmployee</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>b8448acb-6167-46dd-b08f-bc103cbccb25</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>firstName</value>
         <variableId>73864acd-fe2c-471e-b58e-189725880291</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
