<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	
  <test thread-count = "1" name="Test" >
	  <parameter name="browser" value="edge"></parameter>
	 
    <classes>
 
      <class name = "TestNg.parametrized"/>
      
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->



