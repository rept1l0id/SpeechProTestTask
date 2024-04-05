package org.rept1l0id.Steps;

import org.rept1l0id.Pages.ProfilePage;

public class ProfileSteps {

    public static String getMessage(){
        return ProfilePage.welcomeMessage.getText();
    }

}
