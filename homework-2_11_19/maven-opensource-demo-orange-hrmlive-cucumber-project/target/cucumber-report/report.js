$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "login functionality",
  "description": "As a user I want to check login functionality on orange nop commerce web application",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12937031320,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I should log in Successfully with valid data",
  "description": "",
  "id": "login-functionality;as-a-user-i-should-log-in-successfully-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Admin\" into username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter \"admin123\" into the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 352935271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "LoginStepsDefs.iEnterIntoUsernameField(String)"
});
formatter.result({
  "duration": 183065350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 9
    }
  ],
  "location": "LoginStepsDefs.iEnterIntoThePasswordField(String)"
});
formatter.result({
  "duration": 238761393,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1323578772,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefs.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 20078419796,
  "status": "passed"
});
formatter.after({
  "duration": 833825747,
  "status": "passed"
});
});