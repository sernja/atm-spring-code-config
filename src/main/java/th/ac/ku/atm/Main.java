package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMconfig.class);
        ATM atm = context.getBean(ATM.class);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}