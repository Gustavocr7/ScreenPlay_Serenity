package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target JOIN_TODAY = Target.the("BOTON JOIN TODAY").
            locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
}
