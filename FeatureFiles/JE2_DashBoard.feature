Feature: DashBoard

  @TC_01
  Scenario: Sign In:Valid Check
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Check the home page
    Then close the Dashboard Page

  @TC_02
  Scenario: HOME_DASHBOARD
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Select a month in the calendar
    And Check the month in Tail Status
    Then close the Dashboard Page

  @TC_03
  Scenario: HOME_DASHBOARD
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    And Check Landing Page
    Then close the Dashboard Page

  @TC_04
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    Then Enter "Test notes" in the notes field
    And Click UnLock report button
    Then close the Dashboard Page

  @TC_05
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    Then Clear the notes field
    And Check Mandatory pop is shown or not
    Then close the Dashboard Page

  @TC_06
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    Then Enter "Test notes" in the notes field
    And Click Lock report button
    Then close the Dashboard Page

  @TC_07
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then close the Dashboard Page

  @TC_08
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Select any expense from the dropdown
    Then close the Dashboard Page

  @TC_08
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Select any expense from the dropdown
    Then close the Dashboard Page

  @TC_09
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Select any status from the dropdown
    Then close the Dashboard Page

  @TC_10
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Select any sort from the dropdown
    Then close the Dashboard Page

  @TC_11
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Click the Checkbox
    Then close the Dashboard Page

  @TC_12
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Click the Expense Checkbox
    And Click Show button and Click Cancel button
    Then Click Show button and Click Ok button
    Then close the Dashboard Page

  @TC_13
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Expense Radio button
    Then Click the Expense Checkbox
    And Click Hide button and Click Cancel button
    Then Click Hide button and Click Ok button
    Then close the Dashboard Page

  @TC_14
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Confirm and Continue button
    Then Click the close button in the popup
    And Click the Confirm and Continue button
    Then Click the Confirm and Continue button in the popup
    Then close the Dashboard Page

  @TC_15
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Owner Pay Radio button
    Then Click the Expense Checkbox
    And Click Show button and Click Cancel button
    Then Click Show button and Click Ok button
    Then close the Dashboard Page

  @TC_16
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Owner Pay Radio button
    Then Click the Expense Checkbox
    And Click Hide button and Click Cancel button
    Then Click Hide button and Click Ok button
    Then close the Dashboard Page

  @TC_17
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Hide Transaction button
    And Click the Owner Pay Radio button
    And Click the Confirm and Continue button
    Then Click the close button in the popup
    And Click the Confirm and Continue button
    Then Click the Confirm and Continue button in the popup
    Then close the Dashboard Page

  @TC_18
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Previous Step button In Revenue Owner Pay
    And Check The Landing Page
    Then close the Dashboard Page

  @TC_19
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click the Attach button
    And Click Close button
    Then close the Dashboard Page

  @TC_20
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click the Attach button
    And Enter All Valid Details
    Then Click The Clear button
    Then close the Dashboard Page

  @TC_21
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click the Attach button
    Then Click The Clear button
    And Click Save button and Check Page Behaviour
    Then close the Dashboard Page

  @TC_22
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click the Attach button
    Then Enter Valid Details in Notes is "Test Notes"
    And Enter All Valid Details
    And Click The Save button and Check Page Behaviour
    Then close the Dashboard Page

  @TC_23
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Charter Flight Revenue button
    And Check Data Is Shown In The Webtable
    Then close the Dashboard Page

  @TC_24
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Supplemental Crew Revenue button
    And Check Data Is Shown In Webtable
    Then close the Dashboard Page

  @TC_25
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Landing and Navigation Revenue button
    And Check Data Is Shown In Webtable
    Then close the Dashboard Page

  @TC_26
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Cabin Attendants Revenue button
    And Check Data Is Shown In Webtable
    Then close the Dashboard Page

  @TC_27
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Click Rest Overnight Revenue button
    And Check Data Is Shown In Webtable
    Then close the Dashboard Page

  @TC_28
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    Then Enter Valid Details in Notes Field
    Then close the Dashboard Page

  @TC_29
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Revenue Owner Pay button
    And Click Confirm and Continue button
    Then Click the close button in the popup
    And Click Confirm and Continue button
    Then Click the Confirm and Continue button in the popup
    Then close the Dashboard Page

  @TC_30
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click Previous Step button In Expense Attach Invoice
    And Check The Landing Page From In Expense Attach Invoice
    Then close the Dashboard Page

  @TC_31
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Select Any Expense From The Dropdown
    Then close the Dashboard Page

  @TC_32
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Select Any Status From The Dropdown
    Then close the Dashboard Page

  @TC_33
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Check Edit Page In Expense Attach Invoice
    Then close the Dashboard Page

  @TC_34
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click The Edit Transaction button
    Then Click Close button In Edit Transaction Page
    Then close the Dashboard Page

  @TC_35
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click The Edit Transaction button
    Then Update The Details
    Then close the Dashboard Page

  @TC_36
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    When Click The Add Transaction button
    And Click Close button in Add Transaction button
    Then close the Dashboard Page

  @TC_37
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    When Click The Add Transaction button
    And Enter All Valid Details In Add Transaction
    Then Click Submit button In Add Transaction button
    Then close the Dashboard Page

  @TC_38
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click Delete button
    Then close the Dashboard Page

  @TC_39
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click Delete Invoice button
    Then close the Dashboard Page

  @TC_40
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click Next button
    Then close the Dashboard Page

  @TC_41
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Click Back button
    Then close the Dashboard Page

  @TC_42
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click The Edit button
    And Upload Document In Invoice
    Then close the Dashboard Page

  @TC_43
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Expense Attach Invoice button
    Then Click Confirm and Continue button In Expense Page
    Then close the Dashboard Page

  @TC_44
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Invoice Audit button
    Then Click Previous Step button In Invoice Audit
    And Check The Landing Page From Invoice Audit
    Then close the Dashboard Page

  @TC_45
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Invoice Audit button
    And Click The Edit button In Invoice Audit
    Then close the Dashboard Page

  @TC_46
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Invoice Audit button
    And Click The Edit button In Invoice Audit
    Then Click The Close button In Invoice Audit
    Then close the Dashboard Page

  @TC_47
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Invoice Audit button
    Then Click Confirm and Continue button In Expense Page
    Then close the Dashboard Page

  @TC_48
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click Previous Step button In Flight Activity Page
    And Check The Landing Page From Flight Activity Page
    Then close the Dashboard Page

  @TC_49
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click the Edit button in Flight Activity Page
    Then close the Dashboard Page

  @TC_50
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click the Edit button in Flight Activity Page
    And Click The Close button in Flight Activity Page
    Then close the Dashboard Page

  @TC_51
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click the Edit button in Flight Activity Page
    And Clear Details in Flight Activity Page
    Then close the Dashboard Page

  @TC_52
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click the Edit button in Flight Activity Page
    And Modify Details in Flight Activity Page
    Then close the Dashboard Page

  @TC_53
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Flight Activity button
    Then Click Confirm and Continue button In Flight Activity Page
    Then close the Dashboard Page

  @TC_54
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Report Preview button
    Then Click Previous Step button In Report Preview Page
    And Check The Landing Page From Report Preview Page
    Then close the Dashboard Page

  @TC_55
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Report Preview button
    #"?"---->View Icon
    And Click The View Icon In Report Preview Page
    Then Click Close button In Report Preview Page
    Then close the Dashboard Page

  @TC_56
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Report Preview button
    #"?"---->View Icon
    And Click The View Icon In Report Preview Page
    Then Click Hide button In Report Preview Page
    And Click Restore button In Report Preview Page
    Then close the Dashboard Page

  @TC_57
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Report Preview button
    Then Click Confirm and Continue button In Report Preview Page
    Then close the Dashboard Page

  @TC_58
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    Then Click Previous Step button In Generate PDF File button
    Then close the Dashboard Page

  @TC_59
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    Then Click Download Index In Generate PDF File
    Then close the Dashboard Page

  @TC_60
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    Then Click Download MS Report In Generate PDF File
    Then close the Dashboard Page

  @TC_61
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Enter The Document Name
    Then Attach MS Report and Click Upload button
    Then close the Dashboard Page

  @TC_62
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Delete button
    Then close the Dashboard Page

  @TC_63
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    And Check Mandatory Message
    Then Click Generate button For Mandatory Message
    Then close the Dashboard Page

  @TC_64
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    And Enter Details
    Then Click Generate button
    Then close the Dashboard Page

  @TC_65
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    And Remove the Index File and Add New File
    Then Click Generate button
    Then close the Dashboard Page

  @TC_66
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    And Click The Not Reqired button
    And Enter Details In Not Required
    Then Click Generate button
    Then close the Dashboard Page

  @TC_67
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    Then Click The Manual Report button
    And Delete The Existing File
    And Upload File and Enter Details
    Then close the Dashboard Page
    
    @TC_68
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click The Regenerate button
    Then Click The Manual Report button
    Then close the Dashboard Page

     @TC_69
  Scenario: HOME_DASHBOARD:MS_REPORT
    Given To Check Dashboard User is navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
     And To Check Dashboard Enter username and password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then click the SignIn button for Dashboard Check
    And Click a tail in the Grid
    When Click the Generate PDF File button
    And Click Confirm and Continue button In Generate PDF File button
    Then close the Dashboard Page