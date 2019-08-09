package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}

/** Startup options for ActivationGroup implementations.
 * 
 *  This class allows overriding default system properties and
 *  specifying implementation-defined options for ActivationGroups.
 */
object ActivationGroupDesc.CommandEnvironment extends Object with Serializable {

    /** Compares two command environments for content equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Fetch the configured java command options. */
    @stub
    def getCommandOptions(): Array[String] = ???

    /** Fetch the configured path-qualified java command name. */
    @stub
    def getCommandPath(): String = ???
}
