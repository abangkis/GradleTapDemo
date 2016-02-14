package net.mreunionlabs.gradletapdemo;

/**
 * Created by abangkis on 14/02/2016.
 */
public class HelloWorld {
    private final String message;

    public HelloWorld(String message) {

        this.message = message;
    }

    public String greet() {
        return message;
    }
}
