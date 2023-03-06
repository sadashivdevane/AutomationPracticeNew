package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", 
glue={"com.StepDefiniation","com.pageFactory"},
monochrome = true,
plugin = {"pretty","json:target/JASONReport/report.json", 
		"pretty","html:target/HTMLReport/HtmlReports", 
		"pretty","junit:target/JUNITReport/report.xml"},
tags="@homePage"
)

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}