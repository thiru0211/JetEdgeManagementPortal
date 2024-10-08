package com.JetEdge.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeManagementPortal\\src\\test\\resources\\FeatureFiles\\JE5_OsaView.feature",
glue = "com.JetEdge.stepdefinition",
//tags = "@TC_04",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class JE5_OsaViewRunnerTest {

}
