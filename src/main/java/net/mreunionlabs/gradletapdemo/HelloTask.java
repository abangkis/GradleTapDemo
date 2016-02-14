package net.mreunionlabs.gradletapdemo;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by abangkis on 14/02/2016.
 */
public class HelloTask extends DefaultTask {
    @TaskAction
    public void greet() {
        HelloPluginExtension extension = getProject().getExtensions().findByType(HelloPluginExtension.class);
        if (extension == null) {
            extension = new HelloPluginExtension();
        }

        String message = extension.getMessage();
        HelloWorld helloWorld = new HelloWorld(message);
        System.out.println(helloWorld.greet());
    }
}
