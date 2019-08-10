package javax.swing.event

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** CaretEvent is used to notify interested parties that
 *  the text caret has changed in the event source.
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
abstract class CaretEvent extends EventObject {

    /** Creates a new CaretEvent object. */
    @stub
    def this(source: Any) = ???

    /** Fetches the location of the caret. */
    def getDot(): Int

    /** Fetches the location of other end of a logical
     *  selection.
     */
    def getMark(): Int
}
