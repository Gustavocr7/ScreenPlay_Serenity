package taks;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import userInterfaces.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion  implements Task {

    private String nombre;
    private String apellido;
    private String correo;
    private String mes;
    private String dia;
    private String ano;


    public IniciarSesion(String nombre,String apellido,String correo,String mes,String dia,String ano){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.JOIN_TODAY),
                SendKeys.of(nombre).into(Personal.FIRSTNAME),
                SendKeys.of(apellido).into(Personal.LASTNAME),
                SendKeys.of(correo).into(Personal.EMAIL),
                SendKeys.of(dia).into(Personal.DAY),
                SendKeys.of(ano).into(Personal.YEAR),
                SendKeys.of(mes).into(Personal.MONTH),
                Click.on(Personal.NEXTLOCATION),
                TiempoEspera.unMomento(2),
                Click.on(Location.NEXTDEVICES),
                Click.on(Devices.COMPUTER),
                Click.on(Devices.LINUX),
                Click.on(Devices.VERSION),
                Click.on(Devices.SELECTVERSION),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.SELECTLANGUAGE),
                Click.on(Devices.NEXTLASTSTEP),
                SendKeys.of("Periferia2023.").into(Complete.PASSWORD),
                SendKeys.of("Periferia2023.").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKBOX_STAY),
                Click.on(Complete.CHECKBOX_UTEST),
                Click.on(Complete.CHECKBOX_PRIVACY),
                Click.on(Complete.COMPLETESETUP),
                TiempoEspera.unMomento(3)



                );
    }
    public static IniciarSesion iniciarSesion(String nombre,String apellido,String correo,String mes,String dia,String ano){
        return instrumented(IniciarSesion.class,nombre,apellido,correo,mes,dia,ano);
    }
}
