package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Startup options for ActivationGroup implementations.
 * 
 *  This class allows overriding default system properties and
 *  specifying implementation-defined options for ActivationGroups.
 */
object ActivationGroupDesc_CommandEnvironment extends Object with Serializable {

    /** Create a CommandEnvironment with all the necessary
     *  information.
     */
    @stub
    def CommandEnvironment(cmdpath: String, argv: Array[String]) = ???

    /** Compares two command environments for content equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Fetch the configured java command options. */
    @stub
    def getCommandOptions(): Array[String] = ???

    /** Fetch the configured path-qualified java command name. */
    @stub
    def getCommandPath(): String = ???

    /** Return identical values for similar
     *  CommandEnvironments.
     */
    @stub
    def hashCode(): Int = ???
}
