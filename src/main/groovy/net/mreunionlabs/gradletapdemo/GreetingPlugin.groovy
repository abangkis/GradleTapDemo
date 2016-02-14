package net.mreunionlabs.gradletapdemo

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by abangkis on 14/02/2016.
 */
class GreetingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.extensions.create("greeting", GreetingPluginExtension)
        project.task('greet') << {
            println "${project.greeting.message} from ${project.greeting.greeter}"
        }
    }
}
