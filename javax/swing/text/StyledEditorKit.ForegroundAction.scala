package javax.swing.text

import java.lang.Object
import javax.swing.AbstractAction

/** An action to set foreground color.  This sets the
 *  StyleConstants.Foreground attribute for the
 *  currently selected range of the target JEditorPane.
 *  This is done by calling
 *  StyledDocument.setCharacterAttributes
 *  on the styled document associated with the target
 *  JEditorPane.
 *  
 *  If the target text component is specified as the
 *  source of the ActionEvent and there is a command string,
 *  the command string will be interpreted as the foreground
 *  color.  It will be interpreted by called
 *  Color.decode, and should therefore be
 *  legal input for that method.
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
object StyledEditorKit.ForegroundAction extends StyledEditorKit.StyledTextAction {
