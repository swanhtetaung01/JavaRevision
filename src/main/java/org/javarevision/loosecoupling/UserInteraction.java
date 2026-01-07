package org.javarevision.loosecoupling;

public class UserInteraction {

    public static void main(String[] args) {
        UserDataProvider userDataProvider1 = new UserDataBaseProvider();
        UserManager userManager1 = new UserManager(userDataProvider1);
        System.out.println(userManager1.getUserDetails());

        UserDataProvider userDataProvider2 = new UserWebProvider();
        UserManager userManager2 = new UserManager(userDataProvider2);
        System.out.println(userManager2.getUserDetails());

        UserDataProvider userDataProvider3 = new UserLocalDataProvider();
        UserManager userManager3 = new UserManager(userDataProvider3);
        System.out.println(userManager3.getUserDetails());
    }
}
