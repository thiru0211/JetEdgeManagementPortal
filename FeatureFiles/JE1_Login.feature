Feature: Signin
  @TC_01
  Scenario: Sign In:Valid Check
    #Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    #When username and password are "thirumaran0828@outlook.com" and "Thirumaran@12"
    #And click the login button
    #Then display the user home page
    #And close the application
  @TC_02
  Scenario: Sign Out Check
    #Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    #When username and password are "thirumaran0828@outlook.com" and "Thirumaran@12"
    #And click the login button
   # Then display the user home page
   # And click the user logo button
   # Then click the signout button
   # Then Check SignIn Page is show or not
   # And close the application
  @TC_03
  Scenario: Sign In:InValid Check
  #  Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
  #  When invalid username and valid password are "thirum0828@outlook.com" and "Thirumaran@12"
  #  And click the login button
  #  Then check the toast message
   # And close the application
  @TC_04
  Scenario: Sign In:InValid Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   ## When valid username and invalid password are "thirumaran0828@outlook.com" and "Thiru@28"
   # And click the login button
   # Then check the toast message
   # And close the application
  @TC_05
  Scenario: Sign In:InValid Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # When invalid username and invalid password are "thirumaran@outlook.com" and "Thiru@28"
   # And click the login button
   # Then check the toast message
   # And close the application
  @TC_06
  Scenario: Sign In:Checkbox Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # When username and password are "thirumaran0828@outlook.com" and "Thirumaran@12"
   # Then click the checkbox
  #  And click the login button
   # Then display the user home page
   # And close the application
  @TC_07
  Scenario: Sign In:Without Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # When invalid username and valid password are "thirum0828@outlook.com" and ""
   # And click the login button
    #Then click the Ok button in alert message
   # And close the application
  @TC_08
  Scenario: Sign In: Without MailId Check
  #  Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
  #  When invalid username and valid password are "" and "Thirumaran@28"
  #  And click the login button
  #  Then click the Ok button in alert message
  #  And close the application
  @TC_09
  Scenario: Sign In: Forget Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # When Click Forget password button
   # And close the application
  @TC_10
  Scenario: Sign In: Forget Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # When Click Forget password button
   # Then Click Exit button
   # And close the application
  @TC_11
  Scenario: Sign In: Forget Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # And enter valid username are "thirumaran0828@outlook.com"
   # When Click Forget password button
   # Then click the Continue button
   # And close the application
  @TC_12
  Scenario: Sign In: Forget Password Exit Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # And enter valid username are "thirumaran0828@outlook.com"
   # When Click Forget password button
   # Then click the Continue and exit button
   # And close the application
  @TC_13
  Scenario: Sign In: Temporary Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # And enter valid username are "thirumaran0828@outlook.com"
   # Then Enter Temporary Passoword are "G5T8M4d3E6y6"
   # And click the login button
   # Then Check Reset Password page
   # And close the application

  @TC_14
  Scenario: Sign In: Reset Password Clear Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # And enter valid username are "thirumaran0828@outlook.com"
   # Then Enter Temporary Passoword are "G5T8M4d3E6y6"
   # And click the login button
  #  Then Check Reset Password page
  #  And Enter New Password and Confirm Password are "Thirumaran@1995"
  #  Then Click Clear button
  #  And close the application
  @TC_15
  Scenario: Sign In: Reset Password Cancel Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
  #  And enter valid username are "thirumaran0828@outlook.com"
   # Then Enter Temporary Passoword are "G5T8M4d3E6y6"
   # And click the login button
   # Then Check Reset Password page
   # And click the Cancel button
   # And close the application

  @TC_16
  Scenario: Sign In: Reset Password Save Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
  #  And enter valid username are "thirumaran0828@outlook.com"
  #  Then Enter Temporary Passoword are "G5T8M4d3E6y6"
  #  And click the login button
  #  Then Check Reset Password page
  #  And Enter Old Passwords in New and Confirm Password "Thirumaran@28"
  #  Then Click Save button
  #  And close the application

  @TC_17
  Scenario: Sign In: Reset Password Save Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
   # And enter valid username are "thirumaran0828@outlook.com"
   # Then Enter Temporary Passoword are "G5T8M4d3E6y6"
   # And click the login button
   # Then Check Reset Password page
   # And Enter New Password and Confirm Password are "Thirumaran@1995"
   # Then Click the Here button
   # Then Check SignIn Page is show or not
   # And close the application

  @TC_18
  Scenario: Sign In: New Password Check
   # Given user is navigating to JetEdge URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
  #  When Enter username and new password are "thirumaran0828@outlook.com" and "Thirumaran@1995"
  #  And click the login button
  #  Then display the user home page
  #  And close the application
