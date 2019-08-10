package javax.swing.text

import java.lang.Object
import javax.swing.{Action, JEditorPane}
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
    /** An action to set paragraph alignment. */
    type AlignmentAction = StyledEditorKit_AlignmentAction

    /** An action to toggle the bold attribute. */
    type BoldAction = StyledEditorKit_BoldAction

    /** An action to set the font family in the associated
     *  JEditorPane.
     */
    type FontFamilyAction = StyledEditorKit_FontFamilyAction

    /** An action to set the font size in the associated
     *  JEditorPane.
     */
    type FontSizeAction = StyledEditorKit_FontSizeAction

    /** An action to set foreground color. */
    type ForegroundAction = StyledEditorKit_ForegroundAction

    /** An action to toggle the italic attribute. */
    type ItalicAction = StyledEditorKit_ItalicAction

    /** An action that assumes it's being fired on a JEditorPane
     *  with a StyledEditorKit (or subclass) installed.
     */
    type StyledTextAction = StyledEditorKit_StyledTextAction

    /** An action to toggle the underline attribute. */
    type UnderlineAction = StyledEditorKit_UnderlineAction
}
