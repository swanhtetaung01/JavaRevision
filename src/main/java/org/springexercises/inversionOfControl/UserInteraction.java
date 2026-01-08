package org.springexercises.inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInteraction {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationInversionOfControl.xml");
        UserManager usermanager = (UserManager) context.getBean("usermanager");
        System.out.println(usermanager.getUserDetailsFromDB());
        System.out.println(usermanager.getUserDetailsFromWeb());
        System.out.println(usermanager.getUserDetailsFromLocal());
    }
}
