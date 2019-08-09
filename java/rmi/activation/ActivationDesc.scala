package java.rmi.activation

import java.io.Serializable
import java.lang.{Object, String}
import java.rmi.MarshalledObject

// An activation descriptor contains the information necessary to
// activate an object: 
//  the object's group identifier,
//  the object's fully-qualified class name,
//  the object's code location (the location of the class), a codebase URL
// path,
//  the object's restart "mode", and,
//  a "marshalled" object that can contain object specific
// initialization data. 
//
// A descriptor registered with the activation system can be used to
// recreate/activate the object specified by the descriptor. The
// MarshalledObject in the object's descriptor is passed
// as the second argument to the remote object's constructor for
// object to use during reinitialization/activation.
final class ActivationDesc extends Object with Serializable {

    @stub
    // Constructs an object descriptor for an object whose class name
    // is className that can be loaded from the
    // code location and whose initialization
    // information is data.
    def this(groupID: ActivationGroupID, className: String, location: String, data: MarshalledObject[_]) = ???

    @stub
    // Constructs an object descriptor for an object whose class name
    // is className that can be loaded from the
    // code location and whose initialization
    // information is data.
    def this(groupID: ActivationGroupID, className: String, location: String, data: MarshalledObject[_], restart: Boolean) = ???

    @stub
    // Constructs an object descriptor for an object whose class name
    // is className, that can be loaded from the
    // code location and whose initialization
    // information is data.
    def this(className: String, location: String, data: MarshalledObject[_]) = ???

    @stub
    // Compares two activation descriptors for content equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the class name for the object specified by this
    // descriptor.
    def getClassName(): String = ???

    @stub
    // Returns a "marshalled object" containing intialization/activation
    // data for the object specified by this descriptor.
    def getData(): MarshalledObject[_] = ???

    @stub
    // Returns the group identifier for the object specified by this
    // descriptor.
    def getGroupID(): ActivationGroupID = ???

    @stub
    // Returns the code location for the object specified by
    // this descriptor.
    def getLocation(): String = ???

    @stub
    // Returns the "restart" mode of the object associated with
    // this activation descriptor.
    def getRestartMode(): Boolean = ???
}
