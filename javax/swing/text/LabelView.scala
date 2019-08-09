package javax.swing.text

import java.awt.{Color, Font, FontMetrics, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

/** A LabelView is a styled chunk of text
 *  that represents a view mapped over an element in the
 *  text model.  It caches the character level attributes
 *  used for rendering.
 */
class LabelView extends GlyphView with TabableView {

    /** Gives notification from the document that attributes were changed
     *  in a location that this view is responsible for.
     */
    @stub
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Fetches the background color to use to render the glyphs. */
    @stub
    def getBackground(): Color = ???

    /** Fetches the font that the glyphs should be based upon. */
    @stub
    def getFont(): Font = ???

    /** Deprecated. 
     * FontMetrics are not used for glyph rendering
     *   when running in the JDK.
     * 
     */
    @stub
    protected def getFontMetrics(): FontMetrics = ???

    /** Fetches the foreground color to use to render the glyphs. */
    @stub
    def getForeground(): Color = ???

    /** Determines if the glyphs should have a strikethrough
     *  line.
     */
    @stub
    def isStrikeThrough(): Boolean = ???

    /** Determines if the glyphs should be rendered as superscript. */
    @stub
    def isSubscript(): Boolean = ???

    /** Determines if the glyphs should be rendered as subscript. */
    @stub
    def isSuperscript(): Boolean = ???

    /** Determines if the glyphs should be underlined. */
    @stub
    def isUnderline(): Boolean = ???

    /** Sets the background color for the view. */
    @stub
    protected def setBackground(bg: Color): Unit = ???

    /** Sets the cached properties from the attributes. */
    @stub
    protected def setPropertiesFromAttributes(): Unit = ???

    /** Sets whether or not the view has a strike/line
     *  through it.
     */
    @stub
    protected def setStrikeThrough(s: Boolean): Unit = ???

    /** Sets whether or not the view represents a
     *  subscript.
     */
    @stub
    protected def setSubscript(s: Boolean): Unit = ???

    /** Sets whether or not the view represents a
     *  superscript.
     */
    @stub
    protected def setSuperscript(s: Boolean): Unit = ???
}
