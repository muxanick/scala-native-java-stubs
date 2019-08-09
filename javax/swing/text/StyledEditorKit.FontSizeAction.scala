package javax.swing.text

import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.AbstractAction
import scala.scalanative.annotation.stub

/** An action to set the font size in the associated
 *  JEditorPane.  This will use the size specified as
 *  the command string on the ActionEvent if there is one,
 *  otherwise the size that was initialized with will be used.
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
object StyledEditorKit.FontSizeAction extends StyledEditorKit.StyledTextAction {

    /** Creates a new FontSizeAction. */
    @stub
    def FontSizeAction(nm: String, size: Int) = ???

    /** Sets the font size. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???
}
