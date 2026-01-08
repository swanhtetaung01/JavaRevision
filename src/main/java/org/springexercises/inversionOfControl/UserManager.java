package org.springexercises.inversionOfControl;

public class UserManager {
//    private UserDataProvider userDataProvider;
//
//    public UserManager (UserDataProvider userDataProvider) {
//        this.userDataProvider = userDataProvider;
//    }
    private UserDataBaseProvider userDataBaseProvider;
    private UserWebProvider userWebProvider;
    private UserLocalDataProvider userLocalDataProvider;

    public UserManager(UserDataBaseProvider userDataBaseProvider) {
        this.userDataBaseProvider = userDataBaseProvider;
    }
    public UserManager(UserWebProvider userWebProvider) {
        this.userWebProvider = userWebProvider;
    }
    public UserManager(UserLocalDataProvider userLocalDataProvider) {
        this.userLocalDataProvider = userLocalDataProvider;
    }

    public UserManager(UserDataBaseProvider userDataBaseProvider, UserWebProvider userWebProvider, UserLocalDataProvider userLocalDataProvider) {
        this.userDataBaseProvider =  userDataBaseProvider;
        this.userWebProvider = userWebProvider;
        this.userLocalDataProvider = userLocalDataProvider;
    }


    public String getUserDetailsFromLocal() {
        return userLocalDataProvider.getUserData();
    }

    public String getUserDetailsFromWeb() {
        return userWebProvider.getUserData();
    }

    public String getUserDetailsFromDB() {
        return userDataBaseProvider.getUserData();
    }
}
