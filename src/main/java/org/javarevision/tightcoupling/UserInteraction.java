package org.javarevision.tightcoupling;

public class UserInteraction {
    public static void main(String[] args) {
        UserDataBaseProvider userDataBaseProvider1 = new UserDataBaseProvider();
        UserManager userManager = new UserManager(userDataBaseProvider1);
        System.out.println(userManager.getUserData());
    }
}
