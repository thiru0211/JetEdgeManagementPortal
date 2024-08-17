Feature: Reports

  @TC_00
  Scenario: Reports:Sign In
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    Then Close The Reports Page

  @TC_01
  Scenario: STATE_TAX:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The State Tax button In Reports
    Then Select The Valid From Month Tab In State Tax
    And Select The Valid To Month Tab In State Tax
    Then Select Valid Tail From The Dropdown In State Tax
    And Click View button In State Tax
    Then Close The Reports Page

  @TC_02
  Scenario: STATE_TAX:Excel Download Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The State Tax button In Reports
    Then Select The Valid From Month Tab In State Tax
    And Select The Valid To Month Tab In State Tax
    Then Select Valid Tail From The Dropdown In State Tax
    And Click View button In State Tax
    Then Click Excel button In State Tax
    Then Close The Reports Page

  @TC_03
  Scenario: FLIGHT_ACTIVITY:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Select The Valid From Month Tab In Flight Activity
    And Select The Valid To Month Tab In Flight Activity
    Then Select The Valid Tail From The Dropdown In Flight Activity
    And Select Trip Type Radio button In Flight Activity
    Then Click View button In Flight Activity
    Then Close The Reports Page

  @TC_04
  Scenario: FLIGHT_ACTIVITY:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Select The Valid From Month Tab In Flight Activity
    And Select The Valid To Month Tab In Flight Activity
    Then Select The Valid Tail From The Dropdown In Flight Activity
    And Select Leg Type Radio button In Flight Activity
    Then Click View button In Flight Activity
    Then Close The Reports Page

  @TC_05
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Go Report button In Flight Activity
    Then Close The Reports Page

  @TC_06
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click Save button In Scheduler Setup
    Then Close The Reports Page

  @TC_07
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click Back button In Scheduler Setup
    Then Close The Reports Page

  @TC_08
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click The Add External User In Scheduler Setup
    And Click Save button In External Users
    Then Close The Reports Page

  @TC_09
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click The Add External User In Scheduler Setup
    And Click Close button In External Users
    Then Close The Reports Page

  @TC_10
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click The Add External User In Scheduler Setup
    And Enter Valid Details In External Users
    And Click Clear button In External Users
    Then Close The Reports Page

  @TC_11
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    Then Click The Add External User In Scheduler Setup
    And Enter Valid Details In External Users
    And Click Save button In External Users
    Then Close The Reports Page

  @TC_12
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    And Enter Valid Details In Scheduler Setup
    Then Click The Checkbox In Scheduler Setup
    And Click Clear button In Scheduler Setup
    Then Close The Reports Page

  @TC_13
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Add Scheduler button In Flight Activity
    And Enter Valid Details In Scheduler Setup
    Then Click The Checkbox In Scheduler Setup
    And Click Save button In Scheduler Setup
    Then Close The Reports Page

  @TC_14
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Close The Reports Page

  @TC_15
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Click The Back button In Scheduler Setup
    Then Close The Reports Page

  @TC_16
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Click The Stop button In Scheduler Setup
    Then Close The Reports Page

  @TC_17
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Click The Run button In Scheduler Setup
    Then Close The Reports Page

  @TC_18
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Click The Clear button In Scheduler Setup
    Then Close The Reports Page

  @TC_19
  Scenario: FLIGHT_ACTIVITY:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity button In Reports
    Then Click The Scheduler button In Flight Activity
    And Click The Edit button In Scheduler Setup
    Then Click Save button In Scheduler Setup
    Then Close The Reports Page

  @TC_20
  Scenario: FLIGHT_ACTIVITY_W/PAX:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Select The Valid From Month Tab In Flight Activity WPAX
    And Select The Valid To Month Tab In Flight Activity WPAX
    Then Select The Valid Tail From The Dropdown In Flight Activity WPAX
    And Select Trip Type Radio button In Flight Activity WPAX
    Then Click View button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_21
  Scenario: FLIGHT_ACTIVITY_W/PAX:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Select The Valid From Month Tab In Flight Activity WPAX
    And Select The Valid To Month Tab In Flight Activity WPAX
    Then Select The Valid Tail From The Dropdown In Flight Activity WPAX
    And Select Leg Type Radio button In Flight Activity WPAX
    Then Click View button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_22
  Scenario: FLIGHT_ACTIVITY_W/PAX:Excel Download Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Select The Valid From Month Tab In Flight Activity WPAX
    And Select The Valid To Month Tab In Flight Activity WPAX
    Then Select The Valid Tail From The Dropdown In Flight Activity WPAX
    And Select Trip Type Radio button In Flight Activity WPAX
    Then Click View button In Flight Activity WPAX
    Then Click Excel button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_23
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click Save button In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_24
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click Back button In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_25
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add User In Scheduler Setup In Flight Activity WPAX
    And Click Checkbox In Users In Scheduler Setup In Flight Activity WPAX
    Then Click Submit button In Users In Flight Activity WPAX
    Then Close The Reports Page

  @TC_26
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add User In Scheduler Setup In Flight Activity WPAX
    And Click Close button In Users In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_27
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add External User In Scheduler Setup In Flight Activity WPAX
    Then Click Submit button In External Users In Flight Activity WPAX
    Then Close The Reports Page

  @TC_28
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add External User In Scheduler Setup In Flight Activity WPAX
    And Click Close button In External Users In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_29
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add External User In Scheduler Setup In Flight Activity WPAX
    And Enter Valid Details In External Users In Flight Activity WPAX
    Then Click Submit button In External Users In Flight Activity WPAX
    Then Close The Reports Page

  @TC_30
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add Tails button In Scheduler Setup In Flight Activity WPAX
    And Click Close button In Add Tails In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_31
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    Then Click The Add Tails button In Scheduler Setup In Flight Activity WPAX
    And Select The Tail In Add Tails In Flight Activity WPAX
    Then Click Submit button In Add Tails In Flight Activity WPAX
    Then Close The Reports Page

  @TC_32
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    And Enter Valid Details In Scheduler Setup In Flight Activity WPAX
    Then Click The Add User In Scheduler Setup In Flight Activity WPAX
    And Click Checkbox In Users In Scheduler Setup In Flight Activity WPAX
    Then Click Submit button In Users In Flight Activity WPAX
    Then Click The Add External User In Scheduler Setup In Flight Activity WPAX
    And Enter Valid Details In External Users In Flight Activity WPAX
    Then Click Submit button In External Users In Flight Activity WPAX
    Then Click Clear button In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_33
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Add Scheduler button In Flight Activity WPAX
    And Enter Valid Details In Scheduler Setup In Flight Activity WPAX
    Then Click The Add User In Scheduler Setup In Flight Activity WPAX
    And Click Checkbox In Users In Scheduler Setup In Flight Activity WPAX
    Then Click Submit button In Users In Flight Activity WPAX
    Then Click The Add External User In Scheduler Setup In Flight Activity WPAX
    And Enter Valid Details In External Users In Flight Activity WPAX
    Then Click Submit button In External Users In Flight Activity WPAX
    And Select The Email Signature In Scheduler Setup In Flight Activity WPAX
    Then Click Save button In Scheduler Setup In Flight Activity WPAX
    Then Close The Reports Page

  @TC_34
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_35
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    Then Click The Back button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_36
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    Then Click The Stop button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_37
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    Then Click The Run button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_38
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    Then Click The Clear button In Flight Activity WPAX
    Then Close The Reports Page

  @TC_39
  Scenario: FLIGHT_ACTIVITY_W/PAX:Scheduler Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity WPAX button In Reports
    Then Click The Scheduler button In Flight Activity WPAX
    And Click The Edit Scheduler button In Flight Activity WPAX
    And Modify The Details In Flight Activity WPAX
    Then Click The Update button In Flight Activity WPAX
    Then Close The Reports Page
    
  @TC_40
  Scenario: GL_WISE_EXPENSE:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The GL Wise Expense button In Reports
    Then Select From Month In GL Wise Expense
    And Select To Month GL Wise Expense
    Then Select Valid Tail In Dropdown In GL Wise Expense
    And Select The Single Expense In GL Wise Expense
    Then Click View button In GL Wise Expense
    Then Close The Reports Page

  @TC_41
  Scenario: GL_WISE_EXPENSE:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The GL Wise Expense button In Reports
    Then Select From Month In GL Wise Expense
    And Select To Month GL Wise Expense
    Then Select Valid Tail In Dropdown In GL Wise Expense
    And Select The Multiple Expense In GL Wise Expense
    Then Click View button In GL Wise Expense
    And Click Excel button In GL Wise Expense
    Then Close The Reports Page

  @TC_42
  Scenario: STATEMENT VIEW:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Statement View button In Reports
    Then Select From Month In Statement View
    And Select To Month In Statement View
    Then Select Valid Tail In Dropdown In Statement View
    Then Click View button In Statement View
    Then Close The Reports Page

  @TC_43
  Scenario: STATEMENT VIEW:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Statement View button In Reports
    Then Select From Month In Statement View
    And Select To Month In Statement View
    Then Select Valid Tail In Dropdown In Statement View
    Then Click View button In Statement View
    And Click Excel button In Statement View
    Then Close The Reports Page

  @TC_44
  Scenario: ADDITIONAL REPORTS:ADD NEW
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Click Add New button In Additional Reports
    And Click Save button In Additional Reports
    Then Close The Reports Page

  @TC_45
  Scenario: ADDITIONAL REPORTS:ADD NEW
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Click Add New button In Additional Reports
    And Click Back button In Additional Reports
    Then Close The Reports Page

  @TC_46
  Scenario: ADDITIONAL REPORTS:ADD NEW
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Click Add New button In Additional Reports
    Then Enter Valid Details In Additional Reports
    And Click Clear button In Additional Reports
    Then Close The Reports Page

  @TC_47
  Scenario: ADDITIONAL REPORTS:ADD NEW
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Click Add New button In Additional Reports
    And Click The Checkbox In Additional Reports
    Then Enter Valid Details In Additional Reports
    And Click Save button In Additional Reports
    Then Close The Reports Page

  @TC_48
  Scenario: ADDITIONAL REPORTS:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Select The Tail In The Dropdown In Additional Reports
    And Click Edit button In Additional Reports
    And Click Back button In Additional Reports
    Then Close The Reports Page

  @TC_49
  Scenario: ADDITIONAL REPORTS:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Select The Tail In The Dropdown In Additional Reports
    And Click Edit button In Additional Reports
    And Click Clear button In Additional Reports
    Then Close The Reports Page

  @TC_50
  Scenario: ADDITIONAL REPORTS:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Select The Tail In The Dropdown In Additional Reports
    And Click Edit button In Additional Reports
    Then Modify The Details In Additional Reports
    And Click Save button In Additional Reports
    Then Close The Reports Page

  @TC_51
  Scenario: ADDITIONAL REPORTS:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Additional Reports button In Reports
    Then Select The Tail In The Dropdown In Additional Reports
    And Click Edit button In Additional Reports
    Then Click The Delete button In Additional Reports
    Then Close The Reports Page

  @TC_52
  Scenario: OWNER LOGIN REPORT:Valid Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Login Report button In Reports
    Then Select The From Date In Owner Login Report
    Then Select The Tail In Dropdown In Owner Login Report
    And Click Submit button In Owner Login Report
    Then Close The Reports Page

  @TC_53
  Scenario: OWNER LOGIN REPORT:Valid Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Login Report button In Reports
    Then Select The From Date In Owner Login Report
    Then Select The Tail In Dropdown In Owner Login Report
    And Click The Checkbox In Owner Login Report
    And Click Submit button In Owner Login Report
    Then Close The Reports Page

  @TC_54
  Scenario: OWNER LOGIN REPORT:EXPORT EXCEL 
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Login Report button In Reports
    Then Select The From Date In Owner Login Report
    Then Select The Tail In Dropdown In Owner Login Report
    And Click Submit button In Owner Login Report
    Then Click The Export Excel button In Owner Login Report
    Then Close The Reports Page

  @TC_55
  Scenario: OWNER LOGIN REPORT:Valid Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Login Report button In Reports
    Then Select The From Date In Owner Login Report
    Then Select The Tail In Dropdown In Owner Login Report
    And Click Submit button In Owner Login Report
    Then Click The Expand button In Owner Login Report
    Then Close The Reports Page

  @TC_56
  Scenario: RELEASE HISTORY:Submit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Release History button In Reports
    Then Select Valid Month In From Calendar In Release History
    And Select Valid Month In To Calendar In Release History
    Then Select Valid Tail In Dropdown In Release History
    And Click Submit button In Release History
    Then Close The Reports Page

  @TC_57
  Scenario: RELEASE HISTORY:Submit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Release History button In Reports
    Then Select Valid Month In From Calendar In Release History
    And Select Valid Month In To Calendar In Release History
    Then Select Valid Tail In Dropdown In Release History
    And Click Submit button In Release History
    Then Click Excel button In Release History
    Then Close The Reports Page

  @TC_58
  Scenario: RELEASE HISTORY:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Release History button In Reports
    Then Select Valid Month In From Calendar In Release History
    And Select Valid Month In To Calendar In Release History
    Then Select Valid Tail In Dropdown In Release History
    And Click Submit button In Release History
    Then Click Edit button In Release History
    Then Close The Reports Page

  @TC_59
  Scenario: RELEASE HISTORY:EDIT
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Release History button In Reports
    Then Select Valid Month In From Calendar In Release History
    And Select Valid Month In To Calendar In Release History
    Then Select Valid Tail In Dropdown In Release History
    And Click Submit button In Release History
    Then Click Edit button In Release History
    And Click Close button In Release History
    Then Close The Reports Page

  @TC_60
  Scenario: OP RELEASE DETAILS:Submit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The OP Release Details button In Reports
    Then Select Valid Month In From Calendar In OP Release Details
    And Select Valid Month In To Calendar In OP Release Details
    And Click Submit button In OP Release Details
    Then Close The Reports Page

  @TC_61
  Scenario: OP RELEASE DETAILS:Edit
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The OP Release Details button In Reports
    Then Select Valid Month In From Calendar In OP Release Details
    And Select Valid Month In To Calendar In OP Release Details
    And Click Submit button In OP Release Details
    Then Click Edit button In OP Release Details
    Then Close The Reports Page

  @TC_62
  Scenario: OP RELEASE DETAILS:Edit
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The OP Release Details button In Reports
    Then Select Valid Month In From Calendar In OP Release Details
    And Select Valid Month In To Calendar In OP Release Details
    And Click Submit button In OP Release Details
    Then Click Edit button In OP Release Details
    And Click Back button In OP Release Details
    Then Close The Reports Page

  @TC_63
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Back button In Owner Tracker
    Then Close The Reports Page

  @TC_64
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click History button In Owner Tracker
    Then Click Close button In History
    Then Close The Reports Page

  @TC_65
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Add New button In Flight Log
    Then Click Save button In Flight Log
    Then Close The Reports Page

  @TC_66
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Add New button In Flight Log
    Then Click Close button In Flight Log
    Then Close The Reports Page

  @TC_67
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Add New button In Flight Log
    Then Enter Valid Details In Flight Log
    #Need to confirm can I give save button
    #Then Click Save button In Flight Log
    Then Close The Reports Page

  @TC_68
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Edit button In Flight Log
    Then Click Close button In Flight Log
    Then Close The Reports Page

  @TC_69
  Scenario: OWNER TRACKER:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click The View button In Owner Tracker
    And Click Edit button In Flight Log
    Then Modify The Details In Flight Log
    #Then Click Save button In Flight Log
    Then Close The Reports Page

  @TC_70
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    Then Close The Reports Page

  @TC_71
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    And Click Add New button In Go To Setup
    Then Click Save button In Go To Setup
    Then Close The Reports Page

  @TC_72
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    And Click Add New button In Go To Setup
    Then Click Back button In Go To Setup
    Then Close The Reports Page

  @TC_73
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    And Click Add New button In Go To Setup
    Then Click Add Requester button In Go To Setup
    And Click Close button In Requesters
    Then Close The Reports Page

  @TC_74
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    And Click Add New button In Go To Setup
    Then Click Add Requester button In Go To Setup
    And Click Checkbox In Requesters
    Then Click Submit button In Requesters
    Then Close The Reports Page

  @TC_75
  Scenario: OWNER TRACKER:Go To Setup
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Setup button In Reports
    And Click Add New button In Go To Setup
    And Enter Valid Details In Go To Setup
    Then Click Add Requester button In Go To Setup
    And Click Checkbox In Requesters
    Then Click Submit button In Requesters
    Then Click Save button In Go To Setup
    Then Close The Reports Page

  #@TC_76 to @TC_80 --------Edit option is not working(Not available)
  
  @TC_81
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    Then Close The Reports Page

  @TC_82
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    Then Click Save button In Go To Scheduler
    Then Close The Reports Page

  @TC_83
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Back button In Go To Scheduler
    Then Close The Reports Page

  @TC_84
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click Close button In Admin Users
    Then Close The Reports Page

  @TC_85
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    Then Close The Reports Page

  @TC_86
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add External Users button In Go To Scheduler
    Then Click Close button In Add External Users
    Then Close The Reports Page

  @TC_87
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add External Users button In Go To Scheduler
    Then Click Save button In Add External Users
    Then Close The Reports Page

  @TC_88
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Clear button In Add External Users
    Then Close The Reports Page

  @TC_89
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    Then Close The Reports Page

  @TC_90
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Click Clear button In Go To Scheduler
    Then Close The Reports Page

  @TC_91
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Select Email Signature In Go To Scheduler
    Then Click Save button In Go To Scheduler
    Then Close The Reports Page

  @TC_92
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Cap Requirement Radio button
    Then Click Add Remainder button
    And Click Close button In Add Remainder
    Then Close The Reports Page

  @TC_93
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Cap Requirement Radio button
    Then Click Add Remainder button
    And Enter Valid Details In Add Remainder
    And Click Add To List button In Add Remainder
    Then Close The Reports Page

  @TC_94
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Cap Requirement Radio button
    And Click Choose Tail In Go To Scheduler
    Then Click Add Remainder button
    And Enter Valid Details In Add Remainder
    And Click Add To List button In Add Remainder
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Select Email Signature In Go To Scheduler
    Then Click Save button In Go To Scheduler
    Then Close The Reports Page

  @TC_95
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Select Email Signature In Go To Scheduler
    Then Click Save button In Go To Scheduler
    And Click Edit button In Go To Scheduler
    And Click Back button In Go To Scheduler
    Then Close The Reports Page
    
    @TC_96
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Select Email Signature In Go To Scheduler
    Then Click Save button In Go To Scheduler
    And Click Edit button In Go To Scheduler
    And Click Stop button In Go To Scheduler
    And Click Run button In Go To Scheduler
    Then Close The Reports Page
    
    @TC_97
  Scenario: OWNER TRACKER:Go To Scheduler
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Owner Tracker button In Reports
    Then Click Go To Scheduler button In Reports
    And Click Add Users button In Go To Scheduler
    Then Click The Checkbox In Admin Users
    And Click Submit button In Admin Users
    And Click Add External Users button In Go To Scheduler
    And Enter Valid Details In Add External Users
    Then Click Save button In Add External Users
    And Enter Valid Details In Go To Scheduler
    Then Select Email Signature In Go To Scheduler
    Then Click Save button In Go To Scheduler
    And Click Edit button In Go To Scheduler
    And Click Delete button In Email Alerts
    And Click Delete button In Add External Users
    Then Close The Reports Page
    
    @TC_98
  Scenario: ADVANTEDGE REPORT:Submit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The AdvantEdge Report button In Reports
    Then Select Valid Tail In Dropdown In AdvantEdge Reports
    And Select Valid AdvantEdge In Dropdown In AdvantEdge Reports
    Then Click Submit button In AdvantEdge Reports
    Then Close The Reports Page
    
     @TC_99
  Scenario: ADVANTEDGE REPORT:Edit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The AdvantEdge Report button In Reports
    Then Select Valid Tail In Dropdown In AdvantEdge Reports
    And Select Valid AdvantEdge In Dropdown In AdvantEdge Reports
    Then Click Submit button In AdvantEdge Reports
    And Click Edit button In AdvantEdge Reports
    Then Click Close button In AdvantEdge Reports
    Then Close The Reports Page
    
    @TC_100
  Scenario: SCHEDULING TRACKER:Submit Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Select Valid From month In Scheduling Tracker
		And Select Valid To month In Scheduling Tracker
		Then Click Submit button In Scheduling Tracker
		Then Close The Reports Page
		
		@TC_101
  Scenario: SCHEDULING TRACKER:Excel Download Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		And Click Excel button In Scheduling Tracker
		Then Close The Reports Page
		
		@TC_102
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click back button in Scheduling Tracker
		Then Close The Reports Page
		
		@TC_103
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click add new button in Scheduling Tracker
		Then Click close button in Quarter Goal
		Then Close The Reports Page
		
		@TC_104
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click add new button in Scheduling Tracker
		Then Click save button in Quarter Goal
		Then Close The Reports Page
		
		@TC_105
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click add new button in Scheduling Tracker
		Then Select valid tail number in Quarter Goal
		And Select valid effective from in Quarter Goal
		Then Enter valid charter value "20" in Quarter Goal
		And Enter valid Owner value "10" in Quarter Goal
		Then Click save button in Quarter Goal
		Then Close The Reports Page
		
		@TC_106
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click edit button in Goal Setup
		Then Click close button in Quarter Goal
		Then Close The Reports Page
		
		@TC_107
  Scenario: SCHEDULING TRACKER:GOAL SETUP
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Scheduling Tracker button In Reports
		Then Click goal setup button in Scheduling Tracker
		And Click edit button in Goal Setup
		And Modify valid details in Quarter Goal
		Then Click save button in Quarter Goal
		Then Close The Reports Page
		
		@TC_108
  Scenario: FLIGHT_ACTIVITY_InActive:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity InActive button In Reports
    Then Click view button in Flight Activity InActive
    Then Close The Reports Page
    
    @TC_109
  Scenario: FLIGHT_ACTIVITY_InActive:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity InActive button In Reports
    Then Select valid from month in Flight Activity InActive
    Then Select valid tail in Flight Activity InActive
    And Click Trip type radio button in Flight Activity InActive
    Then Click view button in Flight Activity InActive
    And Click excel button in Flight Activity InActive
    Then Close The Reports Page
    
    @TC_110
  Scenario: FLIGHT_ACTIVITY_InActive:View Check
    Given To Check Reports User Is Navigating To Jet Edge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check Reports Enter The User Name and Password Are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for Reports Check
    And Click The Flight Activity InActive button In Reports
    Then Select valid from month in Flight Activity InActive
    Then Select valid tail in Flight Activity InActive
    And Click Leg type radio button in Flight Activity InActive
    Then Click view button in Flight Activity InActive
    And Click excel button in Flight Activity InActive
    Then Close The Reports Page