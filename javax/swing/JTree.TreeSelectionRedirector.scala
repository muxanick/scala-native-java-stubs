package javax.swing

import java.io.Serializable
import java.lang.Object
import javax.swing.event.{TreeSelectionEvent, TreeSelectionListener}
import scala.scalanative.annotation.stub

/** Handles creating a new TreeSelectionEvent with the
 *  JTree as the
 *  source and passing it off to all the listeners.
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
protected class JTree.TreeSelectionRedirector extends Object with Serializable with TreeSelectionListener {

    /**  */
    @stub
    protected def TreeSelectionRedirector() = ???

    /** Invoked by the TreeSelectionModel when the
     *  selection changes.
     */
    @stub
    def valueChanged(e: TreeSelectionEvent): Unit = ???
}
