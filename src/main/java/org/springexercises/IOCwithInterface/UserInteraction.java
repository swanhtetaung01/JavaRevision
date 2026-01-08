package org.springexercises.IOCwithInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInteraction {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationIOCwithInterface.xml");

        UserManager userManagerDB = (UserManager) context.getBean("usermanagerwithDB");
        System.out.println(userManagerDB.getUserDetails());

        UserManager userManagerWeb = (UserManager) context.getBean("usermanagerwithWeb");
        System.out.println(userManagerWeb.getUserDetails());

        UserManager userManagerLocal = (UserManager) context.getBean("usermanagerwithLocal");
        System.out.println(userManagerLocal.getUserDetails());
    }
}
