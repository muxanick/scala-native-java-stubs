package javax.swing

import java.awt.event.{ComponentAdapter, ComponentEvent}
import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A listener for the view.
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
protected class JViewport.ViewListener extends ComponentAdapter with Serializable {

    /**  */
    @stub
    protected def ViewListener() = ???

    /** Invoked when the component's size changes. */
    @stub
    def componentResized(e: ComponentEvent): Unit = ???
}
