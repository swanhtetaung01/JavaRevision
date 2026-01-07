package org.javarevision.loosecoupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    public UserManager (UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserDetails() {
        return userDataProvider.getUserData();
    }
}
