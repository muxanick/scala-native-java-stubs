package java.rmi.activation

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** An UnknownGroupException is thrown by methods of classes and
 *  interfaces in the java.rmi.activation package when the
 *  ActivationGroupID parameter to the method is determined to be
 *  invalid, i.e., not known by the ActivationSystem.  An
 *  UnknownGroupException is also thrown if the
 *  ActivationGroupID in an ActivationDesc refers to
 *  a group that is not registered with the ActivationSystem
 */
class UnknownGroupException extends ActivationException {

    /** Constructs an UnknownGroupException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
