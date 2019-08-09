package java.beans

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** A PropertyVetoException is thrown when a proposed change to a
 *  property represents an unacceptable value.
 */
class PropertyVetoException extends Exception {

    /** Constructs a PropertyVetoException with a
     *  detailed message.
     */
    @stub
    def this(mess: String, evt: PropertyChangeEvent) = ???

    /** Gets the vetoed PropertyChangeEvent. */
    @stub
    def getPropertyChangeEvent(): PropertyChangeEvent = ???
}
