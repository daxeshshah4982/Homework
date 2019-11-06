$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/signIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In functionality",
  "description": "As a user I want to check sign In functionality",
  "id": "sign-in-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should not login with invalid data",
  "description": "",
  "id": "sign-in-functionality;user-should-not-login-with-invalid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I reached at SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter email in into \"\u003clogin\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter password in into \"\u003cpassword\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should not sign in into application",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "sign-in-functionality;user-should-not-login-with-invalid-data;",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 14,
      "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;1"
    },
    {
      "cells": [
        "abc123@gmail.com",
        "abc456"
      ],
      "line": 15,
      "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;2"
    },
    {
      "cells": [
        "",
        "466dkajfk"
      ],
      "line": 16,
      "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;3"
    },
    {
      "cells": [
        "chdk4789@yahoo.com",
        ""
      ],
      "line": 17,
      "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;4"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 18,
      "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14672201242,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should not login with invalid data",
  "description": "",
  "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I reached at SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter email in into \"abc123@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter password in into \"abc456\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should not sign in into application",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 740229710,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iClickOnSignInLink()"
});
formatter.result({
  "duration": 586982704,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iReachedAtSignInPage()"
});
formatter.result({
  "duration": 155734,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@gmail.com",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iEnterEmailInIntoField(String)"
});
formatter.result({
  "duration": 683583199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc456",
      "offset": 24
    }
  ],
  "location": "MyStepdefs.enterPasswordInIntoField(String)"
});
formatter.result({
  "duration": 719809836,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickOnSignInButton()"
});
formatter.result({
  "duration": 812914128,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNotSignInIntoApplication()"
});
formatter.result({
  "duration": 45516,
  "status": "passed"
});
formatter.after({
  "duration": 926672566,
  "status": "passed"
});
formatter.before({
  "duration": 14040144078,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d78.0.3904.87)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DAXESH\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.87, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\Samsung\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60857}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 7f7c688c2f04055655451b310716fa15\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat com.webappsecurity.zero.browserselector.BrowserSelector.selectBrowser(BrowserSelector.java:21)\r\n\tat com.webappsecurity.zero.Hooks.setUP(Hooks.java:15)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "User should not login with invalid data",
  "description": "",
  "id": "sign-in-functionality;user-should-not-login-with-invalid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I reached at SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter email in into \"\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter password in into \"466dkajfk\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should not sign in into application",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.iAmOnHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomepageSteps.iClickOnSignInLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iReachedAtSignInPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iEnterEmailInIntoField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "466dkajfk",
      "offset": 24
    }
  ],
  "location": "MyStepdefs.enterPasswordInIntoField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.clickOnSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iShouldNotSignInIntoApplication()"
});
formatter.result({
  "status": "skipped"
});
