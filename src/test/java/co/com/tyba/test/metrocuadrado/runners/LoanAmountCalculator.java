package co.com.tyba.test.metrocuadrado.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/loan_amount_calculator.feature",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    glue = "co.com.tyba.test.metrocuadrado.stepdefinitions")
public class LoanAmountCalculator {}
