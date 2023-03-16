$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fb.feature");
formatter.feature({
  "name": "To Validate Amazon Singin",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Given Launch The Browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate in Email filed With Data Table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ama"
    }
  ]
});
formatter.step({
  "name": "To launch url of Amazon",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSing.to_launch_url_of_Amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click SingIn button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSing.click_SingIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pass mails in Email Filed",
  "rows": [
    {
      "cells": [
        "ps1",
        "ps2"
      ]
    },
    {
      "cells": [
        "vijay",
        "ajith"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSing.pass_mails_in_Email_Filed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Continue",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSing.click_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});