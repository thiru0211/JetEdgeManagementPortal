package com.JetEdge.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeManagementPortal\\src\\test\\resources\\FeatureFiles\\JE1_Login.feature",
glue = "com.JetEdge.stepdefinition",
//tags ="@TC_02",
plugin = {"pretty","html:Reports/TestReport.html","json:Reports/jsontestreport.json","html:Reports/cucumber-reports.html" })
public class JE1_LoginRunnerTest {

}
