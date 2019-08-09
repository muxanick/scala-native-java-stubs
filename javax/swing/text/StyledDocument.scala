package javax.swing.text

import java.awt.{Color, Font}
import java.lang.String

// Interface for a generic styled document.
trait StyledDocument extends Document {

    @stub
    // Adds a new style into the logical style hierarchy.
    def addStyle(nm: String, parent: Style): Style = ???

    @stub
    // Takes a set of attributes and turn it into a background color
    // specification.
    def getBackground(attr: AttributeSet): Color = ???

    @stub
    // Gets the element that represents the character that
    // is at the given offset within the document.
    def getCharacterElement(pos: Int): Element = ???

    @stub
    // Takes a set of attributes and turn it into a font
    // specification.
    def getFont(attr: AttributeSet): Font = ???

    @stub
    // Takes a set of attributes and turn it into a foreground color
    // specification.
    def getForeground(attr: AttributeSet): Color = ???

    @stub
    // Gets a logical style for a given position in a paragraph.
    def getLogicalStyle(p: Int): Style = ???

    @stub
    // Gets the element that represents the paragraph that
    // encloses the given offset within the document.
    def getParagraphElement(pos: Int): Element = ???

    @stub
    // Fetches a named style previously added.
    def getStyle(nm: String): Style = ???

    @stub
    // Removes a named style previously added to the document.
    def removeStyle(nm: String): Unit = ???

    @stub
    // Changes the content element attributes used for the given range of
    // existing content in the document.
    def setCharacterAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    @stub
    // Sets the logical style to use for the paragraph at the
    // given position.
    def setLogicalStyle(pos: Int, s: Style): Unit = ???
}
