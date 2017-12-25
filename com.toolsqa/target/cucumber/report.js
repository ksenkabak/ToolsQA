$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registration.feature");
formatter.feature({
  "line": 2,
  "name": "ToolsQA DemoPage Registration",
  "description": "",
  "id": "toolsqa-demopage-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 1857420137,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on the signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDef.the_user_is_on_the_signup_page()"
});
formatter.result({
  "duration": 2573964803,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "sign up on ToolsQA DemoPage",
  "description": "",
  "id": "toolsqa-demopage-registration;sign-up-on-toolsqa-demopage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user enters first name with \"Rita2\" and last name with \"Ricoto2\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user chooses maritual status as married and hobby as cricket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user chooses country as United States",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user enters his date of birth",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the user provides his phone number",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user enters username and email",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user chooses profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user describes about himself",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user enters following passwords and system displays password level message:",
  "rows": [
    {
      "cells": [
        "Invalid",
        "abc"
      ],
      "line": 17
    },
    {
      "cells": [
        "Weak",
        "Javajava12"
      ],
      "line": 18
    },
    {
      "cells": [
        "Medium",
        "Abc_12345@#$"
      ],
      "line": 19
    },
    {
      "cells": [
        "Strong",
        "Abc_12345@#-$123"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user submits the application",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the user should see the approval message",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Rita2",
      "offset": 33
    },
    {
      "val": "Ricoto2",
      "offset": 60
    }
  ],
  "location": "RegisterStepDef.the_user_enters_first_name_with_and_last_name_with(String,String)"
});
formatter.result({
  "duration": 307182485,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_chooses_maritual_status_as_married_and_hobby_as_cricket()"
});
formatter.result({
  "duration": 256781610,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_chooses_country_as_United_States()"
});
formatter.result({
  "duration": 583338073,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_enters_his_date_of_birth()"
});
formatter.result({
  "duration": 1731730096,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_provides_his_phone_number()"
});
formatter.result({
  "duration": 262374944,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_enters_username_and_email()"
});
formatter.result({
  "duration": 297986839,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_chooses_profile_picture()"
});
formatter.result({
  "duration": 1601093694,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_describes_about_himself()"
});
formatter.result({
  "duration": 264820493,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_enters_following_passwords_and_system_displays_password_level_message(String,String\u003e)"
});
formatter.result({
  "duration": 5836203275,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_submits_the_application()"
});
formatter.result({
  "duration": 8440935327,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDef.the_user_should_see_the_aproval_message()"
});
formatter.result({
  "duration": 154235927,
  "status": "passed"
});
formatter.after({
  "duration": 137763,
  "status": "passed"
});
});