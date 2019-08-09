package javax.swing.text

import java.awt.event.ActionEvent
import java.lang.Object
import javax.swing.{AbstractAction, JEditorPane}

/** An action that assumes it's being fired on a JEditorPane
 *  with a StyledEditorKit (or subclass) installed.  This has
 *  some convenience methods for causing character or paragraph
 *  level attribute changes.  The convenience methods will
 *  throw an IllegalArgumentException if the assumption of
 *  a StyledDocument, a JEditorPane, or a StyledEditorKit
 *  fail to be true.
 *  
 *  The component that gets acted upon by the action
 *  will be the source of the ActionEvent if the source
 *  can be narrowed to a JEditorPane type.  If the source
 *  can't be narrowed, the most recently focused text
 *  component is changed.  If neither of these are the
 *  case, the action cannot be performed.
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
object abstract StyledEditorKit.StyledTextAction extends TextAction {

    /** Gets the target editor for an action. */
    @stub
    protected def getEditor(e: ActionEvent): JEditorPane = ???

    /** Gets the document associated with an editor pane. */
    @stub
    protected def getStyledDocument(e: JEditorPane): StyledDocument = ???

    /** Gets the editor kit associated with an editor pane. */
    @stub
    protected def getStyledEditorKit(e: JEditorPane): StyledEditorKit = ???

    /** Applies the given attributes to character
     *  content.
     */
    @stub
    protected def setCharacterAttributes(editor: JEditorPane, attr: AttributeSet, replace: Boolean): Unit = ???
}
