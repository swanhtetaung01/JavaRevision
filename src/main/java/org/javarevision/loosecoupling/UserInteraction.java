package org.javarevision.loosecoupling;

public class UserInteraction {

    public static void main(String[] args) {
        UserDataProvider userDataProvider1 = new UserDataBaseProvider();
        UserManager userManager1 = new UserManager(userDataProvider1);
        System.out.println(userManager1.getUserDetails());


    }
}
