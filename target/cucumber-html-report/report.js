$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Customer details",
  "description": "",
  "id": "edit-customer-details",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#   Scenario: Verify user can log in successfully with correct credentials"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#    Given  Home page is displayed"
    },
    {
      "line": 6,
      "value": "#    When Clicks on My Account dropdown"
    },
    {
      "line": 7,
      "value": "#    And Clicks on Log in link"
    },
    {
      "line": 8,
      "value": "#    Then \u0027Log in\u0027 page is opened"
    },
    {
      "line": 9,
      "value": "#    When Enters valid Email Address and Password"
    },
    {
      "line": 10,
      "value": "#    And User presses [Login] button"
    },
    {
      "line": 11,
      "value": "#    Then \u0027My Account\u0027 page is opened"
    },
    {
      "line": 12,
      "value": "#"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 14,
  "name": "Home page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.Home_page_is_displayed()"
});
formatter.result({
  "duration": 7448702200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify user can log in successfully with correct credentials",
  "description": "",
  "id": "edit-customer-details;verify-user-can-log-in-successfully-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#    Then Home page is displayed"
    }
  ],
  "line": 18,
  "name": "User clicks on My Account dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User clicks on Log in link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Log in page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User enters \"sholmes@gmail.com\" and \"Holmes1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User presses Login button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "My Account page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user logs out",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user clicks on Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.Clicks_on_My_Account_dropdown()"
});
formatter.result({
  "duration": 495262800,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.Clicks_on_Log_in_Link()"
});
formatter.result({
  "duration": 463024200,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.logInPageIsOpened()"
});
formatter.result({
  "duration": 37189800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sholmes@gmail.com",
      "offset": 13
    },
    {
      "val": "Holmes1234",
      "offset": 37
    }
  ],
  "location": "LogInSteps.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 474439600,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userPressesLoginButton()"
});
formatter.result({
  "duration": 479534700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.myAccountPageIsOpened()"
});
formatter.result({
  "duration": 7920100,
  "status": "passed"
});
formatter.match({
  "location": "LogOutSteps.logout()"
});
formatter.result({
  "duration": 524799500,
  "status": "passed"
});
formatter.match({
  "location": "LogOutSteps.clicksOnContinueButton()"
});
formatter.result({
  "duration": 1080565200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Verify Log In with incorrect credentials",
  "description": "",
  "id": "edit-customer-details;verify-log-in-with-incorrect-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "User clicks on My Account dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User clicks on Log in link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Log in page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Enters  \u003cemailAddress\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User presses Login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "A warning validation message \"Warning: No match for E-Mail Address and/or Password.\" or \"Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.\"is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks on Home link",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ],
      "line": 37,
      "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;;1"
    },
    {
      "cells": [
        "test@mail.ru",
        "qazx12"
      ],
      "line": 38,
      "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;;2"
    },
    {
      "cells": [
        "test@test.com",
        "wes1"
      ],
      "line": 39,
      "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#   Scenario: Verify user can log in successfully with correct credentials"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#    Given  Home page is displayed"
    },
    {
      "line": 6,
      "value": "#    When Clicks on My Account dropdown"
    },
    {
      "line": 7,
      "value": "#    And Clicks on Log in link"
    },
    {
      "line": 8,
      "value": "#    Then \u0027Log in\u0027 page is opened"
    },
    {
      "line": 9,
      "value": "#    When Enters valid Email Address and Password"
    },
    {
      "line": 10,
      "value": "#    And User presses [Login] button"
    },
    {
      "line": 11,
      "value": "#    Then \u0027My Account\u0027 page is opened"
    },
    {
      "line": 12,
      "value": "#"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 14,
  "name": "Home page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.Home_page_is_displayed()"
});
formatter.result({
  "duration": 82980800,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify Log In with incorrect credentials",
  "description": "",
  "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "User clicks on My Account dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User clicks on Log in link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Log in page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Enters  test@mail.ru and qazx12",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User presses Login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "A warning validation message \"Warning: No match for E-Mail Address and/or Password.\" or \"Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.\"is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks on Home link",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.Clicks_on_My_Account_dropdown()"
});
formatter.result({
  "duration": 147178700,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.Clicks_on_Log_in_Link()"
});
formatter.result({
  "duration": 716504600,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.logInPageIsOpened()"
});
formatter.result({
  "duration": 11430400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@mail.ru",
      "offset": 8
    },
    {
      "val": "qazx12",
      "offset": 25
    }
  ],
  "location": "LogInSteps.entersEmail_addressAndPassword(String,String)"
});
formatter.result({
  "duration": 393503300,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userPressesLoginButton()"
});
formatter.result({
  "duration": 401704400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Warning: No match for E-Mail Address and/or Password.",
      "offset": 30
    },
    {
      "val": "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.",
      "offset": 89
    }
  ],
  "location": "LogInSteps.aWarningValidationMessageOrIsDisplayed(String,String)"
});
formatter.result({
  "duration": 124769000,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userClicksOnHomeLink()"
});
formatter.result({
  "duration": 783860100,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#   Scenario: Verify user can log in successfully with correct credentials"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#    Given  Home page is displayed"
    },
    {
      "line": 6,
      "value": "#    When Clicks on My Account dropdown"
    },
    {
      "line": 7,
      "value": "#    And Clicks on Log in link"
    },
    {
      "line": 8,
      "value": "#    Then \u0027Log in\u0027 page is opened"
    },
    {
      "line": 9,
      "value": "#    When Enters valid Email Address and Password"
    },
    {
      "line": 10,
      "value": "#    And User presses [Login] button"
    },
    {
      "line": 11,
      "value": "#    Then \u0027My Account\u0027 page is opened"
    },
    {
      "line": 12,
      "value": "#"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 14,
  "name": "Home page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.Home_page_is_displayed()"
});
formatter.result({
  "duration": 86084600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify Log In with incorrect credentials",
  "description": "",
  "id": "edit-customer-details;verify-log-in-with-incorrect-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 28,
  "name": "User clicks on My Account dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User clicks on Log in link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Log in page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Enters  test@test.com and wes1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User presses Login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "A warning validation message \"Warning: No match for E-Mail Address and/or Password.\" or \"Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.\"is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks on Home link",
  "keyword": "And "
});
formatter.match({
  "location": "HomeSteps.Clicks_on_My_Account_dropdown()"
});
formatter.result({
  "duration": 197571200,
  "status": "passed"
});
formatter.match({
  "location": "HomeSteps.Clicks_on_Log_in_Link()"
});
formatter.result({
  "duration": 708202200,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.logInPageIsOpened()"
});
formatter.result({
  "duration": 12572600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 8
    },
    {
      "val": "wes1",
      "offset": 26
    }
  ],
  "location": "LogInSteps.entersEmail_addressAndPassword(String,String)"
});
formatter.result({
  "duration": 394043400,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userPressesLoginButton()"
});
formatter.result({
  "duration": 912712300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Warning: No match for E-Mail Address and/or Password.",
      "offset": 30
    },
    {
      "val": "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.",
      "offset": 89
    }
  ],
  "location": "LogInSteps.aWarningValidationMessageOrIsDisplayed(String,String)"
});
formatter.result({
  "duration": 132574400,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.userClicksOnHomeLink()"
});
formatter.result({
  "duration": 819567800,
  "status": "passed"
});
});