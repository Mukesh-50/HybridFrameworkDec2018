package org.learnautomation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles",glue="org.learnautomation.stepDefination")
public class CucumberTestRunner {

	
}
