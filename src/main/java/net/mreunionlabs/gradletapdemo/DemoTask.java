package net.mreunionlabs.gradletapdemo;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Created by abangkis on 14/02/2016.
 */
public class DemoTask extends DefaultTask {
    @TaskAction
    public void greet() {
        DemoPluginExtension extension = getProject().getExtensions().findByType(DemoPluginExtension.class);
        if (extension == null) {
            extension = new DemoPluginExtension();
        }

        String message = extension.getMessage();
        HelloWorld helloWorld = new HelloWorld(message);
        System.out.println(helloWorld.greet());
    }
}
