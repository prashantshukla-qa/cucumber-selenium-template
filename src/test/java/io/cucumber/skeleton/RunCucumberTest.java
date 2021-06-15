package io.cucumber.skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/cucumber-report/cucumber-report.json" })
public class RunCucumberTest {
}
