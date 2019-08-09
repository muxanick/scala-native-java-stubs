package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.swing.text.{AttributeSet, Document, EditorKit, JTextComponent, MutableAttributeSet, Style, StyledDocument, StyledEditorKit}

/** A text component that can be marked up with attributes that are
 *  represented graphically.
 *  You can find how-to information and examples of using text panes in
 *  Using Text Components,
 *  a section in The Java Tutorial.
 * 
 *  
 *  This component models paragraphs
 *  that are composed of runs of character level attributes.  Each
 *  paragraph may have a logical style attached to it which contains
 *  the default attributes to use if not overridden by attributes set
 *  on the paragraph or character run.  Components and images may
 *  be embedded in the flow of text.
 * 
 *  
 *  Newlines
 *  
 *  For a discussion on how newlines are handled, see
 *  DefaultEditorKit.
 *  
 * 
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JTextPane extends JEditorPane {

    /** Creates a new JTextPane. */
    @stub
    def this() = ???

    /** Adds a new style into the logical style hierarchy. */
    @stub
    def addStyle(nm: String, parent: Style): Style = ???

    /** Creates the EditorKit to use by default. */
    @stub
    protected def createDefaultEditorKit(): EditorKit = ???

    /** Fetches the character attributes in effect at the
     *  current location of the caret, or null.
     */
    @stub
    def getCharacterAttributes(): AttributeSet = ???

    /** Gets the input attributes for the pane. */
    @stub
    def getInputAttributes(): MutableAttributeSet = ???

    /** Fetches the logical style assigned to the paragraph represented
     *  by the current position of the caret, or null.
     */
    @stub
    def getLogicalStyle(): Style = ???

    /** Fetches the current paragraph attributes in effect
     *  at the location of the caret, or null if none.
     */
    @stub
    def getParagraphAttributes(): AttributeSet = ???

    /** Fetches a named non-null style previously added. */
    @stub
    def getStyle(nm: String): Style = ???

    /** Fetches the model associated with the editor. */
    @stub
    def getStyledDocument(): StyledDocument = ???

    /** Gets the editor kit. */
    @stub
    protected def getStyledEditorKit(): StyledEditorKit = ???

    /** Returns the class ID for the UI. */
    @stub
    def getUIClassID(): String = ???

    /** Inserts a component into the document as a replacement
     *  for the currently selected content.
     */
    @stub
    def insertComponent(c: Component): Unit = ???

    /** Inserts an icon into the document as a replacement
     *  for the currently selected content.
     */
    @stub
    def insertIcon(g: Icon): Unit = ???

    /** Returns a string representation of this JTextPane. */
    @stub
    protected def paramString(): String = ???

    /** Removes a named non-null style previously added to
     *  the document.
     */
    @stub
    def removeStyle(nm: String): Unit = ???

    /** Replaces the currently selected content with new content
     *  represented by the given string.
     */
    @stub
    def replaceSelection(content: String): Unit = ???

    /** Applies the given attributes to character
     *  content.
     */
    @stub
    def setCharacterAttributes(attr: AttributeSet, replace: Boolean): Unit = ???

    /** Associates the editor with a text document. */
    @stub
    def setDocument(doc: Document): Unit = ???

    /** Sets the currently installed kit for handling
     *  content.
     */
    @stub
    def setEditorKit(kit: EditorKit): Unit = ???

    /** Sets the logical style to use for the paragraph at the
     *  current caret position.
     */
    @stub
    def setLogicalStyle(s: Style): Unit = ???

    /** Applies the given attributes to paragraphs. */
    @stub
    def setParagraphAttributes(attr: AttributeSet, replace: Boolean): Unit = ???
}
