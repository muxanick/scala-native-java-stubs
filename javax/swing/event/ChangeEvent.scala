package javax.swing.event

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** ChangeEvent is used to notify interested parties that
 *  state has changed in the event source.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class ChangeEvent extends EventObject {

    /** Constructs a ChangeEvent object. */
    @stub
    def this(source: Any) = ???
}
