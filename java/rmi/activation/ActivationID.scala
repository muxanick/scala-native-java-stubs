package java.rmi.activation

import java.io.Serializable
import java.lang.Object
import java.rmi.Remote

/** Activation makes use of special identifiers to denote remote
 *  objects that can be activated over time. An activation identifier
 *  (an instance of the class ActivationID) contains several
 *  pieces of information needed for activating an object:
 *  
 *   a remote reference to the object's activator (a RemoteRef
 *  instance), and
 *   a unique identifier (a UID
 *  instance) for the object.  
 * 
 *  An activation identifier for an object can be obtained by registering
 *  an object with the activation system. Registration is accomplished
 *  in a few ways: 
 *  via the Activatable.register method
 *  via the first Activatable constructor (that takes
 *  three arguments and both registers and exports the object, and
 *  via the first Activatable.exportObject method
 *  that takes the activation descriptor, object and port as arguments;
 *  this method both registers and exports the object. 
 */
class ActivationID extends Object with Serializable {

    /** Activate the object for this id. */
    @stub
    def activate(force: Boolean): Remote = ???

    /** Compares two activation ids for content equality. */
    @stub
    def equals(obj: Object): Boolean = ???
}
