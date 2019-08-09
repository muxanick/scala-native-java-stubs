package java.rmi.activation

import java.rmi.Remote

/** An ActivationInstantiator is responsible for creating
 *  instances of "activatable" objects. A concrete subclass of
 *  ActivationGroup implements the newInstance
 *  method to handle creating objects within the group.
 */
trait ActivationInstantiator extends Remote {
}
