package java.rmi.activation

import java.rmi.{MarshalledObject, Remote}
import scala.scalanative.annotation.stub

/** An ActivationInstantiator is responsible for creating
 *  instances of "activatable" objects. A concrete subclass of
 *  ActivationGroup implements the newInstance
 *  method to handle creating objects within the group.
 */
trait ActivationInstantiator extends Remote {

    /** The activator calls an instantiator's newInstance
     *  method in order to recreate in that group an object with the
     *  activation identifier, id, and descriptor,
     *  desc.
     */
    @stub
    def newInstance(id: ActivationID, desc: ActivationDesc): MarshalledObject[_ <: Remote] = ???
}
