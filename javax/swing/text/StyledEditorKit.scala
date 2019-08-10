package javax.swing.text

import java.awt.Color
import java.awt.event.ActionEvent
import java.lang.{Object, String}
import javax.swing.{AbstractAction, Action, JEditorPane}
import scala.scalanative.annotation.stub

/** This is the set of things needed by a text component
 *  to be a reasonably functioning editor for some type
 *  of text document.  This implementation provides a default
 *  implementation which treats text as styled text and
 *  provides a minimal set of actions for editing styled text.
 */
class StyledEditorKit extends DefaultEditorKit {

    /** Creates a new EditorKit used for styled documents. */
    @stub
    def this() = ???

    /** Creates a copy of the editor kit. */
    @stub
    def clone(): Any = ???

    /** Creates an uninitialized text storage model
     *  that is appropriate for this type of editor.
     */
    @stub
    def createDefaultDocument(): Document = ???

    /** Copies the key/values in elements AttributeSet into
     *  set.
     */
    @stub
    protected def createInputAttributes(element: Element, set: MutableAttributeSet): Unit = ???

    /** Called when the kit is being removed from the
     *  JEditorPane.
     */
    @stub
    def deinstall(c: JEditorPane): Unit = ???

    /** Fetches the command list for the editor. */
    @stub
    def getActions(): Array[Action] = ???

    /** Fetches the element representing the current
     *  run of character attributes for the caret.
     */
    @stub
    def getCharacterAttributeRun(): Element = ???

    /** Gets the input attributes for the pane. */
    @stub
    def getInputAttributes(): MutableAttributeSet = ???

    /** Fetches a factory that is suitable for producing
     *  views of any models that are produced by this
     *  kit.
     */
    @stub
    def getViewFactory(): ViewFactory = ???

    /** Called when the kit is being installed into
     *  a JEditorPane.
     */
    @stub
    def install(c: JEditorPane): Unit = ???
}

object StyledEditorKit {
    /** An action to set paragraph alignment.  This sets the
     *  StyleConstants.Alignment attribute for the
     *  currently selected range of the target JEditorPane.
     *  This is done by calling
     *  StyledDocument.setParagraphAttributes
     *  on the styled document associated with the target
     *  JEditorPane.
     *  
     *  If the target text component is specified as the
     *  source of the ActionEvent and there is a command string,
     *  the command string will be interpreted as an integer
     *  that should be one of the legal values for the
     *  StyleConstants.Alignment attribute.
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
    object AlignmentAction extends StyledEditorKit.StyledTextAction {

        /** Creates a new AlignmentAction. */
        @stub
        def apply(nm: String, a: Int) = ???

        /** Sets the alignment. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** An action to toggle the bold attribute.
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
    object BoldAction extends StyledEditorKit.StyledTextAction {

        /** Constructs a new BoldAction. */
        @stub
        def apply() = ???

        /** Toggles the bold attribute. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** An action to set the font family in the associated
     *  JEditorPane.  This will use the family specified as
     *  the command string on the ActionEvent if there is one,
     *  otherwise the family that was initialized with will be used.
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
    object FontFamilyAction extends StyledEditorKit.StyledTextAction {

        /** Creates a new FontFamilyAction. */
        @stub
        def apply(nm: String, family: String) = ???

        /** Sets the font family. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


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
    object FontSizeAction extends StyledEditorKit.StyledTextAction {

        /** Creates a new FontSizeAction. */
        @stub
        def apply(nm: String, size: Int) = ???

        /** Sets the font size. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


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
    object ForegroundAction extends StyledEditorKit.StyledTextAction {

        /** Creates a new ForegroundAction. */
        @stub
        def apply(nm: String, fg: Color) = ???

        /** Sets the foreground color. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** An action to toggle the italic attribute.
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
    object ItalicAction extends StyledEditorKit.StyledTextAction {

        /** Constructs a new ItalicAction. */
        @stub
        def apply() = ???

        /** Toggles the italic attribute. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


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
    abstract object StyledTextAction extends TextAction {

        /** Creates a new StyledTextAction from a string action name. */
        @stub
        def apply(nm: String) = ???

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

        /** Applies the given attributes to paragraphs. */
        @stub
        protected def setParagraphAttributes(editor: JEditorPane, attr: AttributeSet, replace: Boolean): Unit = ???
    }


    /** An action to toggle the underline attribute.
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
    object UnderlineAction extends StyledEditorKit.StyledTextAction {

        /** Constructs a new UnderlineAction. */
        @stub
        def apply() = ???

        /** Toggles the Underline attribute. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }

}
