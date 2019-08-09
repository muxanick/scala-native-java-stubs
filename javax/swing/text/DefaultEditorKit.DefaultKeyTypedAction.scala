package javax.swing.text

import java.awt.event.ActionEvent
import java.lang.Object
import javax.swing.AbstractAction
import scala.scalanative.annotation.stub

/** The action that is executed by default if
 *  a key typed event is received and there
 *  is no keymap entry.  There is a variation across
 *  different VM's in what gets sent as a key typed
 *  event, and this action tries to filter out the undesired
 *  events.  This filters the control characters and those
 *  with the ALT modifier.  It allows Control-Alt sequences
 *  through as these form legitimate unicode characters on
 *  some PC keyboards.
 *  
 *  If the event doesn't get filtered, it will try to insert
 *  content into the text editor.  The content is fetched
 *  from the command string of the ActionEvent.  The text
 *  entry is done through the replaceSelection
 *  method on the target text component.  This is the
 *  action that will be fired for most text entry tasks.
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
object DefaultEditorKit.DefaultKeyTypedAction extends TextAction {

    /** Creates this object with the appropriate identifier. */
    @stub
    def DefaultKeyTypedAction() = ???

    /** The operation to perform when this action is triggered. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???
}
