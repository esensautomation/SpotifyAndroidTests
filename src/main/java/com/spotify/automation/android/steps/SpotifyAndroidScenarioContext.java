package com.spotify.automation.android.steps;

import com.esens.automationFwk.mobile.android.steps.AndroidScenarioContext;

public class SpotifyAndroidScenarioContext extends AndroidScenarioContext {

    private static SpotifyAndroidScenarioContext instance = new SpotifyAndroidScenarioContext();

    protected SpotifyAndroidScenarioContext(){
        super();
    }

    public static SpotifyAndroidScenarioContext getInstance(){
        return instance;
    }
}
