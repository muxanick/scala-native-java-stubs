package java.rmi.activation

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** The identifier for a registered activation group serves several
 *  purposes: 
 *  identifies the group uniquely within the activation system, and
 *  contains a reference to the group's activation system so that the
 *  group can contact its activation system when necessary.
 * 
 *  The ActivationGroupID is returned from the call to
 *  ActivationSystem.registerGroup and is used to identify
 *  the group within the activation system. This group id is passed
 *  as one of the arguments to the activation group's special constructor
 *  when an activation group is created/recreated.
 */
class ActivationGroupID extends Object with Serializable {

    /** Constructs a unique group id. */
    @stub
    def this(system: ActivationSystem) = ???

    /** Compares two group identifiers for content equality. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the group's activation system. */
    @stub
    def getSystem(): ActivationSystem = ???

    /** Returns a hashcode for the group's identifier. */
    @stub
    def hashCode(): Int = ???
}
