package main.support;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Esta clase contiene los features que se van a ejecutar
 */
@RunWith(CucumberWithSerenity.class)

@CucumberOptions(

        features = {"src/test/resources/features/Login.feature"},//ruta del features que deseas
        glue = {"main/stepsdefinitions"}, //en donde van a estar las implementaciones de cada uno de los pasos de nuestros escenarios.
        snippets =SnippetType.CAMELCASE,
        tags = "@casoprueba" // Indicamos que Tags quegamos ejecutar. Pueden ser de Scenarios o de Features.
)

public class Runner {

}
