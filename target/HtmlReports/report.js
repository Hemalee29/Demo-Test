$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/htshe/eclipse-workspace/friday/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 3,
  "name": "test to login page",
  "description": "",
  "id": "test-to-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeScenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Cheak login is succesfuly with valid creadentilas",
  "description": "",
  "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is navigate to home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;;1"
    },
    {
      "cells": [
        "user1",
        "pass1"
      ],
      "line": 15,
      "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;;2"
    },
    {
      "cells": [
        "user2",
        "pass2"
      ],
      "line": 16,
      "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Cheak login is succesfuly with valid creadentilas",
  "description": "",
  "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeScenario"
    },
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter user1 and pass1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is navigate to home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Cheak login is succesfuly with valid creadentilas",
  "description": "",
  "id": "test-to-login-page;cheak-login-is-succesfuly-with-valid-creadentilas;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeScenario"
    },
    {
      "line": 5,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter user2 and pass2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is navigate to home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});