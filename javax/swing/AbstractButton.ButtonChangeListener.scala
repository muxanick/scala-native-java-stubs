package javax.swing

import java.io.Serializable
import java.lang.Object
import javax.swing.event.{ChangeEvent, ChangeListener}
import scala.scalanative.annotation.stub

/** Extends ChangeListener to be serializable.
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
protected class AbstractButton.ButtonChangeListener extends Object with ChangeListener with Serializable {

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
