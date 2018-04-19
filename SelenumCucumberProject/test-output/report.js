$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Bank App launching feature",
  "description": "",
  "id": "bank-app-launching-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featureTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User login Test Scenario",
  "description": "",
  "id": "bank-app-launching-feature;user-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User opens Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on Home Page",
  "keyword": "Then "
});
});