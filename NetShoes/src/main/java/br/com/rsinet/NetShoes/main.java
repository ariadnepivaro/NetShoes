package br.com.rsinet.NetShoes;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import  cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/logout.feature",
glue = { "" }, monochrome = true, dryRun = false)


public class main {

}
