package javax.swing.text

import java.lang.Object
import javax.swing.{Action, JEditorPane}

// This is the set of things needed by a text component
// to be a reasonably functioning editor for some type
// of text document.  This implementation provides a default
// implementation which treats text as styled text and
// provides a minimal set of actions for editing styled text.
class StyledEditorKit extends DefaultEditorKit {

    @stub
    // Creates a copy of the editor kit.
    def clone(): Object = ???

    @stub
    // Creates an uninitialized text storage model
    // that is appropriate for this type of editor.
    def createDefaultDocument(): Document = ???

    @stub
    // Copies the key/values in elements AttributeSet into
    // set.
    protected def createInputAttributes(element: Element, set: MutableAttributeSet): Unit = ???

    @stub
    // Called when the kit is being removed from the
    // JEditorPane.
    def deinstall(c: JEditorPane): Unit = ???

    @stub
    // Fetches the command list for the editor.
    def getActions(): Array[Action] = ???

    @stub
    // Fetches the element representing the current
    // run of character attributes for the caret.
    def getCharacterAttributeRun(): Element = ???

    @stub
    // Gets the input attributes for the pane.
    def getInputAttributes(): MutableAttributeSet = ???

    @stub
    // Fetches a factory that is suitable for producing
    // views of any models that are produced by this
    // kit.
    def getViewFactory(): ViewFactory = ???
}

object StyledEditorKit {
    @stub
    // An action to set paragraph alignment.
    def StyledEditorKit.AlignmentAction: class = ???

    @stub
    // An action to toggle the bold attribute.
    def StyledEditorKit.BoldAction: class = ???

    @stub
    // An action to set the font family in the associated
    // JEditorPane.
    def StyledEditorKit.FontFamilyAction: class = ???

    @stub
    // An action to set the font size in the associated
    // JEditorPane.
    def StyledEditorKit.FontSizeAction: class = ???

    @stub
    // An action to set foreground color.
    def StyledEditorKit.ForegroundAction: class = ???

    @stub
    // An action to toggle the italic attribute.
    def StyledEditorKit.ItalicAction: class = ???

    @stub
    // An action that assumes it's being fired on a JEditorPane
    // with a StyledEditorKit (or subclass) installed.
    def StyledEditorKit.StyledTextAction: class = ???
}
