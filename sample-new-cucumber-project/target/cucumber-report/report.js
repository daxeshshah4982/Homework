$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/register.feature");
formatter.feature({
  "line": 1,
  "name": "Nop Commerce Demo Registration",
  "description": "As a user I want to do registration on nop commerce demo application",
  "id": "nop-commerce-demo-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 25,
      "value": "#      | courtney   | cox       | courtneycox456@hotmail.co.uk | courtney cooks  | cde456   | cde456             |"
    },
    {
      "line": 26,
      "value": "#      | lisa       | kudro     | lisakudro789@yahoo.com       | lisa parlours   | lmn789   | lmn789             |"
    }
  ],
  "line": 29,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"\u003cfirst_name\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"\u003clast_name\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"\u003cemail\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"\u003ccompany\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"\u003cpassword\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"\u003cconfirmed_password\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.examples({
  "line": 46,
  "name": "",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "email",
        "company",
        "password",
        "confirmed_password"
      ],
      "line": 47,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;1"
    },
    {
      "cells": [
        "jennifer",
        "",
        "jeniferaniston123@gmail.com",
        "jennifer studio",
        "abc123",
        "abc123"
      ],
      "line": 48,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;2"
    },
    {
      "cells": [
        "",
        "cox",
        "courtneycox456@hotmail.co.uk",
        "courtney cooks",
        "cde456",
        "cde456"
      ],
      "line": 49,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;3"
    },
    {
      "cells": [
        "lisa",
        "kudro",
        "lisakudro789@yahoo.com",
        "lisa parlours",
        "",
        "lmn789"
      ],
      "line": 50,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;4"
    },
    {
      "cells": [
        "cobie",
        "smulders",
        "smuldercobie",
        "licence telecast",
        "456cobie",
        "456cobie"
      ],
      "line": 51,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;5"
    },
    {
      "cells": [
        "alyson",
        "hannigan",
        "allison856@gmail.com",
        "alyson ltd.",
        "856aly",
        "856alyson"
      ],
      "line": 52,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;6"
    },
    {
      "cells": [
        "sarah",
        "chalke",
        "sarah562@yahoo.co.uk",
        "sarah visions",
        "sarah569",
        ""
      ],
      "line": 53,
      "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13756324289,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"jennifer\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"jeniferaniston123@gmail.com\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"jennifer studio\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"abc123\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"abc123\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 151467445,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1526029640,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 71842,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 119388506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jennifer",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 235378980,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 111879368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 224963108,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 260596259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 437525073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jeniferaniston123@gmail.com",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 1411328766,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jennifer studio",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 503859210,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 194224640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 312606453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 364551498,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 657906750,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 329311920,
  "status": "passed"
});
formatter.after({
  "duration": 1313940232,
  "status": "passed"
});
formatter.before({
  "duration": 11696719281,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"cox\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"courtneycox456@hotmail.co.uk\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"courtney cooks\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"cde456\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"cde456\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 59795,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1667847388,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 31682,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 113907478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 97901699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cox",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 162396034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 193064445,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 238334799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 130997147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "courtneycox456@hotmail.co.uk",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 1399974029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "courtney cooks",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 766056538,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 140337608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cde456",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 223071990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cde456",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 177268839,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 186912735,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 105788792,
  "status": "passed"
});
formatter.after({
  "duration": 1650856782,
  "status": "passed"
});
formatter.before({
  "duration": 10895060381,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"lisa\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"kudro\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"lisakudro789@yahoo.com\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"lisa parlours\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"lmn789\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 67827,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1381769235,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 22757,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 99110086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lisa",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 168138998,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kudro",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 137782055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 560262971,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 714421176,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 363575150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lisakudro789@yahoo.com",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 499271085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lisa parlours",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 267351270,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 108658935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 300847433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lmn789",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 548204977,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 561927851,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 353071371,
  "status": "passed"
});
formatter.after({
  "duration": 1013989272,
  "status": "passed"
});
formatter.before({
  "duration": 9330768857,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"cobie\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"smulders\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"smuldercobie\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"licence telecast\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"456cobie\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"456cobie\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 109326,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1365240475,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 33021,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 109416632,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cobie",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 164773988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "smulders",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 179176914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 188480337,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 208454875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 127551369,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "smuldercobie",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 287860837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "licence telecast",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 708919622,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 355770162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456cobie",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 591152711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456cobie",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 146707077,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 143702619,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 83314480,
  "status": "passed"
});
formatter.after({
  "duration": 861593224,
  "status": "passed"
});
formatter.before({
  "duration": 11819333576,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"alyson\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"hannigan\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"allison856@gmail.com\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"alyson ltd.\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"856aly\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"856alyson\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 144578,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1627841640,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 37483,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 221364273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alyson",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 234017090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hannigan",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 408300658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 797327357,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 757835666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 172653049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "allison856@gmail.com",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 393596975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alyson ltd.",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 278709131,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 212399538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "856aly",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 490699031,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "856alyson",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 928955026,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 218110373,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 67803568,
  "status": "passed"
});
formatter.after({
  "duration": 832375949,
  "status": "passed"
});
formatter.before({
  "duration": 11500249219,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "User should not register with invalid data in mandatory field",
  "description": "",
  "id": "nop-commerce-demo-registration;user-should-not-register-with-invalid-data-in-mandatory-field;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I reached at registration page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on female gender",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "enter first name in \"sarah\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "enter last name into \"chalke\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "select day 29 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "pick month February from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "pick Year 1965 from dropdown list of Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "enter email in \"sarah562@yahoo.co.uk\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "enter company name in \"sarah visions\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "un click on newsletter tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter password in \"sarah569\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter confirmed password in \"\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enter on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should not register successfully on demo nop commerce web application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 55778,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 2339569380,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iReachedAtRegistrationPage()"
});
formatter.result({
  "duration": 33467,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iClickOnFemaleGender()"
});
formatter.result({
  "duration": 123149768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarah",
      "offset": 21
    }
  ],
  "location": "RegisterStepDefs.enterFirstNameInField(String)"
});
formatter.result({
  "duration": 200159036,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chalke",
      "offset": 22
    }
  ],
  "location": "RegisterStepDefs.enterLastNameIntoField(String)"
});
formatter.result({
  "duration": 182505780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 11
    }
  ],
  "location": "RegisterStepDefs.selectDayFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 434656714,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.pickMonthFebruaryFromDropdownListOfDateOfBirth()"
});
formatter.result({
  "duration": 656096846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1965",
      "offset": 10
    }
  ],
  "location": "RegisterStepDefs.pickYearFromDropdownListOfDateOfBirth(int)"
});
formatter.result({
  "duration": 452193059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarah562@yahoo.co.uk",
      "offset": 16
    }
  ],
  "location": "RegisterStepDefs.enterEmailInField(String)"
});
formatter.result({
  "duration": 589886761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarah visions",
      "offset": 23
    }
  ],
  "location": "RegisterStepDefs.enterCompanyNameInField(String)"
});
formatter.result({
  "duration": 289118310,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.unClickOnNewsletterTab()"
});
formatter.result({
  "duration": 131654889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarah569",
      "offset": 19
    }
  ],
  "location": "RegisterStepDefs.enterPasswordInField(String)"
});
formatter.result({
  "duration": 232066624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "RegisterStepDefs.enterConfirmedPasswordInField(String)"
});
formatter.result({
  "duration": 138837833,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.enterOnRegisterButton()"
});
formatter.result({
  "duration": 213922516,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefs.iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication()"
});
formatter.result({
  "duration": 246665890,
  "status": "passed"
});
formatter.after({
  "duration": 1580747103,
  "status": "passed"
});
});