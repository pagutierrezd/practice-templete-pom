package co.com.sanangel.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@regresion",
        glue = "co.com.sanangel.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AgregarProductoRunner {
}