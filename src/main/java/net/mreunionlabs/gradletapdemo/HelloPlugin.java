package net.mreunionlabs.gradletapdemo;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by abangkis on 14/02/2016.
 */
public class HelloPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getExtensions().create("helloSetting", HelloPluginExtension.class);
        project.getTasks().create("hello", HelloTask.class);
    }
}
