package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}

// Startup options for ActivationGroup implementations.
//
// This class allows overriding default system properties and
// specifying implementation-defined options for ActivationGroups.
object ActivationGroupDesc.CommandEnvironment extends Object with Serializable {

    @stub
    // Compares two command environments for content equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Fetch the configured java command options.
    def getCommandOptions(): Array[String] = ???

    @stub
    // Fetch the configured path-qualified java command name.
    def getCommandPath(): String = ???
}
