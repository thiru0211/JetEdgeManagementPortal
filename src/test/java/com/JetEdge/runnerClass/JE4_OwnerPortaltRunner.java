package com.JetEdge.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\FeatureFiles\\JE4_OwnerPortal.feature",
glue = "com.JetEdge.stepdefinition",
//tags="@TC_139",
plugin = {"pretty","html:Reports/TestReport.html","json:Reports/jsontestreport.json","html:Reports/cucumber-reports.html" })
public class JE4_OwnerPortaltRunner {

}
