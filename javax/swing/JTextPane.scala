package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.swing.text.{AttributeSet, Document, EditorKit, JTextComponent, MutableAttributeSet, Style, StyledDocument, StyledEditorKit}

// A text component that can be marked up with attributes that are
// represented graphically.
// You can find how-to information and examples of using text panes in
// Using Text Components,
// a section in The Java Tutorial.
//
// 
// This component models paragraphs
// that are composed of runs of character level attributes.  Each
// paragraph may have a logical style attached to it which contains
// the default attributes to use if not overridden by attributes set
// on the paragraph or character run.  Components and images may
// be embedded in the flow of text.
//
// 
// Newlines
// 
// For a discussion on how newlines are handled, see
// DefaultEditorKit.
// 
//
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTextPane extends JEditorPane {

    @stub
    // Creates a new JTextPane.
    def this() = ???

    @stub
    // Adds a new style into the logical style hierarchy.
    def addStyle(nm: String, parent: Style): Style = ???

    @stub
    // Creates the EditorKit to use by default.
    protected def createDefaultEditorKit(): EditorKit = ???

    @stub
    // Fetches the character attributes in effect at the
    // current location of the caret, or null.
    def getCharacterAttributes(): AttributeSet = ???

    @stub
    // Gets the input attributes for the pane.
    def getInputAttributes(): MutableAttributeSet = ???

    @stub
    // Fetches the logical style assigned to the paragraph represented
    // by the current position of the caret, or null.
    def getLogicalStyle(): Style = ???

    @stub
    // Fetches the current paragraph attributes in effect
    // at the location of the caret, or null if none.
    def getParagraphAttributes(): AttributeSet = ???

    @stub
    // Fetches a named non-null style previously added.
    def getStyle(nm: String): Style = ???

    @stub
    // Fetches the model associated with the editor.
    def getStyledDocument(): StyledDocument = ???

    @stub
    // Gets the editor kit.
    protected def getStyledEditorKit(): StyledEditorKit = ???

    @stub
    // Returns the class ID for the UI.
    def getUIClassID(): String = ???

    @stub
    // Inserts a component into the document as a replacement
    // for the currently selected content.
    def insertComponent(c: Component): Unit = ???

    @stub
    // Inserts an icon into the document as a replacement
    // for the currently selected content.
    def insertIcon(g: Icon): Unit = ???

    @stub
    // Returns a string representation of this JTextPane.
    protected def paramString(): String = ???

    @stub
    // Removes a named non-null style previously added to
    // the document.
    def removeStyle(nm: String): Unit = ???

    @stub
    // Replaces the currently selected content with new content
    // represented by the given string.
    def replaceSelection(content: String): Unit = ???

    @stub
    // Applies the given attributes to character
    // content.
    def setCharacterAttributes(attr: AttributeSet, replace: Boolean): Unit = ???

    @stub
    // Associates the editor with a text document.
    def setDocument(doc: Document): Unit = ???

    @stub
    // Sets the currently installed kit for handling
    // content.
    def setEditorKit(kit: EditorKit): Unit = ???

    @stub
    // Sets the logical style to use for the paragraph at the
    // current caret position.
    def setLogicalStyle(s: Style): Unit = ???

    @stub
    // Applies the given attributes to paragraphs.
    def setParagraphAttributes(attr: AttributeSet, replace: Boolean): Unit = ???
}
