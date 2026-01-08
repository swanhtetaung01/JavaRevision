package org.springexercises.inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInteraction {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationInversionOfControl.xml");
        UserManager usermanagerdb = (UserManager) context.getBean("usermanagerDB");
        System.out.println(usermanagerdb.getUserDetailsFromDB());

        UserManager usermanagerweb = (UserManager) context.getBean("usermanagerWeb");
        System.out.println(usermanagerweb.getUserDetailsFromWeb());

        UserManager usermanagerlocal = (UserManager) context.getBean("usermanagerLocal");
        System.out.println(usermanagerlocal.getUserDetailsFromLocal());

        System.out.println("///////////////////////////////");
        System.out.println("Three args constructor : ");

        UserManager userManager = (UserManager) context.getBean("usermanager");
        System.out.println(userManager.getUserDetailsFromDB());
        System.out.println(userManager.getUserDetailsFromWeb());
        System.out.println(userManager.getUserDetailsFromLocal());
    }
}
