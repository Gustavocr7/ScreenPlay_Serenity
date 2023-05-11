package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id='password']");
    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECKBOX_STAY = Target.the("checkbox privacy").
            locatedBy("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']");
    public static final Target CHECKBOX_UTEST= Target.the("checkbox utest").
            locatedBy("//span[@ng-class='{error: userForm.termOfUse.$error.required}']");
    public static final Target CHECKBOX_PRIVACY = Target.the("checkbox privacy").
            locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static final Target COMPLETESETUP = Target.the("complete setup").
            locatedBy("//a[@id='laddaBtn']");
}
