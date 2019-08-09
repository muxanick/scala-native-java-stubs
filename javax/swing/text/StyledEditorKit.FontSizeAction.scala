package javax.swing.text

import java.lang.Object
import javax.swing.AbstractAction

// An action to set the font size in the associated
// JEditorPane.  This will use the size specified as
// the command string on the ActionEvent if there is one,
// otherwise the size that was initialized with will be used.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object StyledEditorKit.FontSizeAction extends StyledEditorKit.StyledTextAction {
