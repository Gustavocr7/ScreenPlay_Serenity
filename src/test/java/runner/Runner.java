package runner;

// INDICAR QUE LA PRUEBA SE VA A EJECUTAR CON SERENITY

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

// CONFIGURACIÓN
@CucumberOptions(
        features = "src/test/resources/features/login.feature", // UBICACION DE LOS FEATURES
        glue = "stepDefinitions", // UBICACION DE LOS STEPS
        tags = "@IniciarSesion", // SCENARIO QUE SE QUIERE PROBAR
        snippets = SnippetType.CAMELCASE // LECTURA DE PASOS EN JAVA
)

public class Runner {
}
