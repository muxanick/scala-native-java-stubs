package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}
import java.rmi.MarshalledObject
import java.util.Properties

/** An activation group descriptor contains the information necessary to
 *  create/recreate an activation group in which to activate objects.
 *  Such a descriptor contains: 
 *   the group's class name,
 *   the group's code location (the location of the group's class), and
 *   a "marshalled" object that can contain group specific
 *  initialization data.  
 * 
 *  The group's class must be a concrete subclass of
 *  ActivationGroup. A subclass of
 *  ActivationGroup is created/recreated via the
 *  ActivationGroup.createGroup static method that invokes
 *  a special constructor that takes two arguments: 
 * 
 *   the group's ActivationGroupID, and
 *   the group's initialization data (in a
 *  java.rmi.MarshalledObject)
 */
final class ActivationGroupDesc extends Object with Serializable {

    /** Constructs a group descriptor that uses the system defaults for group
     *  implementation and code location.
     */
    @stub
    def this(overrides: Properties, cmd: ActivationGroupDesc.CommandEnvironment) = ???

    /** Compares two activation group descriptors for content equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the group's class name (possibly null). */
    @stub
    def getClassName(): String = ???

    /** Returns the group's command-environment control object. */
    @stub
    def getCommandEnvironment(): ActivationGroupDesc.CommandEnvironment = ???

    /** Returns the group's initialization data. */
    @stub
    def getData(): MarshalledObject[_] = ???

    /** Returns the group's code location. */
    @stub
    def getLocation(): String = ???

    /** Returns the group's property-override list. */
    @stub
    def getPropertyOverrides(): Properties = ???
}
