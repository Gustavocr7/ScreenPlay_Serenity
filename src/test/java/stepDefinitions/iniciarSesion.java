package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import taks.IniciarSesion;
import utils.MyScreenRecorder;

import java.io.File;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class iniciarSesion {

    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    @Managed(driver= "chrome")
    WebDriver driver;

    @Before
    public void setThestage() throws Exception {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Global");
    }


    @Given("^el usuario ingresa a la url$")
    public void el_usuario_ingresa_a_la_url() throws Exception {
        // OBTENER EL NOMBRE DEL ESCENARIO
        String nomScenario = Thread.currentThread().getStackTrace()[1].getClassName();

        // CREAR CARPETA PARA ALMACENAMIENTO DE IMAGENES
        File rutaCarpeta = MyScreenRecorder.crearCarpeta(nomScenario);

        // INICIAR LA GRABACION
        MyScreenRecorder.startRecording(rutaCarpeta);
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^el usuario ingresa sus credenciales (.*),(.*),(.*),(.*),(.*),(.*) en el apartado de registro$")
    public void el_usuario_ingresa_sus_credenciales_nombre_apellido_correo_mes_dia_ano_en_el_apartado_de_registro(String nombre,String apellido,String correo,String mes,String dia,String ano) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.iniciarSesion(nombre,apellido,correo,mes,dia,ano));
    }

    @Then("^el usuario culmina el primer paso del registro correctamente$")
    public void el_usuario_culmina_el_primer_paso_del_registro_correctamente() throws Exception {
        MyScreenRecorder.stopRecording();
    }

}
