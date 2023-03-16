Feature: To Validate Amazon Singin

Background: Given Launch The Browser

@ama
Scenario: To validate in Email filed With Data Table 

When  To launch url of Amazon 

And Click SingIn button 

And Pass mails in Email Filed 
|ps1|ps2|
|vijay|ajith|


And Click Continue 


@facebook
Scenario Outline: To validate Amazon login page With Invalid Email

When Launch Facebook Url

When To passs username in"<Mail>" email filed 

And To pass password in "<nnn>" password filed 

And click LogIn 

Examples:
  |Mail|nnn|
  |emresh|ajith|
  |ARRahman|surya|
  |vijay|vikram|