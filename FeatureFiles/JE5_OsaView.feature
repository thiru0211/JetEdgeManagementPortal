Feature: OSAView

  @TC_00
  Scenario: Sign In:Valid Check
    Given To Check OSA View User Is Navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check OSA View Enter The User Name and Password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for OSA View Check
    Then Close The OSA View Page

  @TC_01
  Scenario: OWNER_PORTAL:Certificate Setup
    Given To Check OSA View User Is Navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check OSA View Enter The User Name and Password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for OSA View Check
    And Click OSA Control Fleet In OSA View
    Then Select The Valid Tail In OSA Control Fleet
    And Select The Valid Month In OSA Control Fleet
    Then Click The View button In OSA Control Fleet
    Then Close The OSA View Page

  @TC_02
  Scenario: OWNER_PORTAL:Certificate Setup
    Given To Check OSA View User Is Navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check OSA View Enter The User Name and Password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for OSA View Check
    And Click OSA Control Fleet In OSA View
    Then Select The Valid Tail In OSA Control Fleet
    And Select The Valid Month In OSA Control Fleet
    Then Click The View button In OSA Control Fleet
    And Click The Excel button In OSA Control Fleet
   Then Close The OSA View Page

  @TC_03
  Scenario: OWNER_PORTAL:Certificate Setup
    Given To Check OSA View User Is Navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check OSA View Enter The User Name and Password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for OSA View Check
    And Click OSA AQR In OSA View
    Then Select The Valid Tail In OSA AQR
    And Select The Valid Month In OSA AQR
    Then Click The View button In OSA AQR
    Then Close The OSA View Page

  @TC_04
  Scenario: OWNER_PORTAL:Certificate Setup
    Given To Check OSA View User Is Navigating to JetEdge Signin URL is "https://preprod.flyjetedge.aero/MGNTV2DEMO/login.aspx"
    And To Check OSA View Enter The User Name and Password are "thirumaran0828@outlook.com" and "Thirumaran@0828"
    Then Click The Sign In button for OSA View Check
    And Click OSA AQR In OSA View
    Then Select The Valid Tail In OSA AQR
    And Select The Valid Month In OSA AQR
    Then Click The View button In OSA AQR
    And Click The Excel button In OSA AQR
   Then Close The OSA View Page
