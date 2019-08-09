package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}
import java.rmi.MarshalledObject
import java.util.Properties

// An activation group descriptor contains the information necessary to
// create/recreate an activation group in which to activate objects.
// Such a descriptor contains: 
//  the group's class name,
//  the group's code location (the location of the group's class), and
//  a "marshalled" object that can contain group specific
// initialization data.  
//
// The group's class must be a concrete subclass of
// ActivationGroup. A subclass of
// ActivationGroup is created/recreated via the
// ActivationGroup.createGroup static method that invokes
// a special constructor that takes two arguments: 
//
//  the group's ActivationGroupID, and
//  the group's initialization data (in a
// java.rmi.MarshalledObject)
final class ActivationGroupDesc extends Object with Serializable {

    @stub
    // Constructs a group descriptor that uses the system defaults for group
    // implementation and code location.
    def this(overrides: Properties, cmd: ActivationGroupDesc.CommandEnvironment) = ???

    @stub
    // Compares two activation group descriptors for content equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the group's class name (possibly null).
    def getClassName(): String = ???

    @stub
    // Returns the group's command-environment control object.
    def getCommandEnvironment(): ActivationGroupDesc.CommandEnvironment = ???

    @stub
    // Returns the group's initialization data.
    def getData(): MarshalledObject[_] = ???

    @stub
    // Returns the group's code location.
    def getLocation(): String = ???

    @stub
    // Returns the group's property-override list.
    def getPropertyOverrides(): Properties = ???
}
