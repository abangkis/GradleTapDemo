package net.mreunionlabs.gradletapdemo;

/**
 * Created by abangkis on 14/02/2016.
 */
public class HelloPluginExtension {
    private String message = "Default Hello from Gradle";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
