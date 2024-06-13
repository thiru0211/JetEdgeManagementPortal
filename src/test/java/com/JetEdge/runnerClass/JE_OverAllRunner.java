package com.JetEdge.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\FeatureFiles\\",
glue = "com.JetEdge.stepdefinition",

plugin = {"pretty","html:Reports/TestReport.html",
		"json:Reports/jsontestreport.json"
		,"html:Reports/cucumber-reports.html",
		"rerun:ReRun/FailedScenarios.txt"})
public class JE_OverAllRunner {

}
