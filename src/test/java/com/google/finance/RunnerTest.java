package com.google.finance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", tags = { "@AAPL" }, plugin = { "pretty", "html:target" })
public class RunnerTest {

}
