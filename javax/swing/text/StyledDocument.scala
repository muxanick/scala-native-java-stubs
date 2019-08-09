package javax.swing.text

import java.awt.{Color, Font}
import java.lang.String

/** Interface for a generic styled document. */
trait StyledDocument extends Document {

    /** Adds a new style into the logical style hierarchy. */
    @stub
    def addStyle(nm: String, parent: Style): Style = ???

    /** Takes a set of attributes and turn it into a background color
     *  specification.
     */
    @stub
    def getBackground(attr: AttributeSet): Color = ???

    /** Gets the element that represents the character that
     *  is at the given offset within the document.
     */
    @stub
    def getCharacterElement(pos: Int): Element = ???

    /** Takes a set of attributes and turn it into a font
     *  specification.
     */
    @stub
    def getFont(attr: AttributeSet): Font = ???

    /** Takes a set of attributes and turn it into a foreground color
     *  specification.
     */
    @stub
    def getForeground(attr: AttributeSet): Color = ???

    /** Gets a logical style for a given position in a paragraph. */
    @stub
    def getLogicalStyle(p: Int): Style = ???

    /** Gets the element that represents the paragraph that
     *  encloses the given offset within the document.
     */
    @stub
    def getParagraphElement(pos: Int): Element = ???

    /** Fetches a named style previously added. */
    @stub
    def getStyle(nm: String): Style = ???

    /** Removes a named style previously added to the document. */
    @stub
    def removeStyle(nm: String): Unit = ???

    /** Changes the content element attributes used for the given range of
     *  existing content in the document.
     */
    @stub
    def setCharacterAttributes(offset: Int, length: Int, s: AttributeSet, replace: Boolean): Unit = ???

    /** Sets the logical style to use for the paragraph at the
     *  given position.
     */
    @stub
    def setLogicalStyle(pos: Int, s: Style): Unit = ???
}
