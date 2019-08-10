package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.undo.UndoableEdit
import scala.scalanative.annotation.stub

/** An event indicating that an operation which can be undone has occurred.
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
class UndoableEditEvent extends EventObject {

    /** Constructs an UndoableEditEvent object. */
    @stub
    def this(source: Any, edit: UndoableEdit) = ???

    /** Returns the edit value. */
    @stub
    def getEdit(): UndoableEdit = ???
}
