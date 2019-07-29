package com.spotify.automation.android.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/spotifyAndroid/"},
        glue = {
                "com.esens.automationFwk.steps",
                "com.esens.automationFwk.mobile.android.steps"
        },
        tags = { "@Smoke" }
)
public class SmokeTestRunner {
}
