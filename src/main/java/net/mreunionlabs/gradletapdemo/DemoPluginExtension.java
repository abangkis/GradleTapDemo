package net.mreunionlabs.gradletapdemo;

/**
 * Created by abangkis on 14/02/2016.
 */
public class DemoPluginExtension {
    private String message = "Default Greeting from Gradle";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
