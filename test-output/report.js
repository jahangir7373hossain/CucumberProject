$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signin.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in page",
  "description": "",
  "id": "sign-in-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test sign in page",
  "description": "",
  "id": "sign-in-page;test-sign-in-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User valiadte all sign in property there",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User insert \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "sign-in-page;test-sign-in-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "sign-in-page;test-sign-in-page;;1"
    },
    {
      "cells": [
        "jahangir123",
        "123547"
      ],
      "line": 11,
      "id": "sign-in-page;test-sign-in-page;;2"
    },
    {
      "cells": [
        "hossain@gmail.com",
        "3595158"
      ],
      "line": 12,
      "id": "sign-in-page;test-sign-in-page;;3"
    },
    {
      "cells": [
        "bchchshshcbds",
        "6303633"
      ],
      "line": 13,
      "id": "sign-in-page;test-sign-in-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test sign in page",
  "description": "",
  "id": "sign-in-page;test-sign-in-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User valiadte all sign in property there",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User insert \"jahangir123\" and \"123547\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.user_open_the_app()"
});
formatter.result({
  "duration": 39291270700,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.user_valiadte_all_sign_in_property_there()"
});
formatter.result({
  "duration": 242067000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jahangir123",
      "offset": 13
    },
    {
      "val": "123547",
      "offset": 31
    }
  ],
  "location": "SignInTest.user_insert_and(String,String)"
});
formatter.result({
  "duration": 6356472300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.close_the_browser()"
});
formatter.result({
  "duration": 958339800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Test sign in page",
  "description": "",
  "id": "sign-in-page;test-sign-in-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User valiadte all sign in property there",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User insert \"hossain@gmail.com\" and \"3595158\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.user_open_the_app()"
});
formatter.result({
  "duration": 17144536700,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.user_valiadte_all_sign_in_property_there()"
});
formatter.result({
  "duration": 260090300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hossain@gmail.com",
      "offset": 13
    },
    {
      "val": "3595158",
      "offset": 37
    }
  ],
  "location": "SignInTest.user_insert_and(String,String)"
});
formatter.result({
  "duration": 5212891300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.close_the_browser()"
});
formatter.result({
  "duration": 1320960300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test sign in page",
  "description": "",
  "id": "sign-in-page;test-sign-in-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User valiadte all sign in property there",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User insert \"bchchshshcbds\" and \"6303633\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.user_open_the_app()"
});
formatter.result({
  "duration": 17247459300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.user_valiadte_all_sign_in_property_there()"
});
formatter.result({
  "duration": 144390800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bchchshshcbds",
      "offset": 13
    },
    {
      "val": "6303633",
      "offset": 33
    }
  ],
  "location": "SignInTest.user_insert_and(String,String)"
});
formatter.result({
  "duration": 4417713000,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.close_the_browser()"
});
formatter.result({
  "duration": 1039591600,
  "status": "passed"
});
});