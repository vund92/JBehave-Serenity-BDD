# Disclaimer:
	# The test run failed with Chrome version at my local with messages as "Caused by: org.openqa.selenium.SessionNotCreatedException:
	# session not created: This version of ChromeDriver only supports Chrome version 114
	# Current browser version is 117.0.5938.63 with binary path C:\Program Files\Google\Chrome\Application\chrome.exe
	# Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'"

	# So I changed to use Firefox instead: 'webdriver.driver = firefox' in serenity.properties file

	# If the interviewer wants to run the test in the new version of Chrome, it needs to take more time for the chromedriver to be updated itself
	# Then change 'webdriver.driver = chrome' in serenity.properties file if you wish

# TecAlliance's practice test:
	# This is an automation test project for BDD using JBehave and Serenity

# The libraries used:
	# The libraries are managed in file 'pom.xml'
		# Java JDK 11
		# Maven 3.9.4
		# Serenity 2.6.0
		# Jbehave 1.46.0
		# JUnit 4.12

# The project includes 1 story 'GoogleSearch.story' - file are defined by serenity BDD.
	# Google Search story:
		# Scenario: Search for a specific keyword on Google 

# To run project:
	# Via IDE (eclipse): Right-click on the file 'GoogleTestRunner.java' from path: 'src\test\java\com\demo\exam\tests' then choose 'Run as -> JUnit Test'
	# Via cmd (terminal): cd to folder project and run cmd: mvn clean verify

# Reports and Logs:
	# Reports and logs are generated in target folder after running tests
	# Get report from path: target/site/serenity/index.html
  
