package dxy.springframework.addi;

import dxy.springframework.addi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author AD
 */
@SpringBootApplication
@ComponentScan(basePackages = "dxy.springframework")
public class AdDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AdDiApplication.class, args);

        System.out.println("-----i18Controller");
        I18nController i18nController=(I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        System.out.println("-----primary-----");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHi());

        System.out.println("-----property-----");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-----setter-----");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());


        System.out.println("-----constructor-----");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
