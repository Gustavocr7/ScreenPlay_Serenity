package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    public static final Target COMPUTER = Target.the("your computer").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]");
    public static final Target LINUX = Target.the("linux").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[3]");
    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[2]");
    public static final Target SELECTVERSION = Target.the("select version").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[3]");

    public static final Target LANGUAGE = Target.the("language").
            locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[3]");
    public static final Target SELECTLANGUAGE = Target.the("select language").
            locatedBy("(//span[@class='ui-select-choices-row-inner'])[11]");
    public static final Target NEXTLASTSTEP = Target.the("next last step").
            locatedBy("//a[@aria-label='Next - final step']");
}
