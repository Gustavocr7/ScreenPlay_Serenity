package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {

    public static final Target NEXTDEVICES = Target.the("next devices").
            locatedBy("//a[@aria-label='Next step - select your devices']");
}
