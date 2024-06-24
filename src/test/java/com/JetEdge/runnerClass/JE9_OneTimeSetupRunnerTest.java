package com.JetEdge.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeManagementPortal\\src\\test\\resources\\FeatureFiles\\JE9_OneTimeSetup.feature",
glue = "com.JetEdge.stepdefinition",
tags = "@TC_31",
plugin = {"pretty","html:Reports/TestReport.html","json:Reports/jsontestreport.json","html:Reports/cucumber-reports.html" })
public class JE9_OneTimeSetupRunnerTest {

}
