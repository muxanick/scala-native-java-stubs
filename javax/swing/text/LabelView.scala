package javax.swing.text

import java.awt.{Color, Font, FontMetrics, Shape}
import java.lang.Object
import javax.swing.event.DocumentEvent

// A LabelView is a styled chunk of text
// that represents a view mapped over an element in the
// text model.  It caches the character level attributes
// used for rendering.
class LabelView extends GlyphView with TabableView {

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Fetches the background color to use to render the glyphs.
    def getBackground(): Color = ???

    @stub
    // Fetches the font that the glyphs should be based upon.
    def getFont(): Font = ???

    @stub
    // Deprecated. 
    //FontMetrics are not used for glyph rendering
    //  when running in the JDK.
    //
    protected def getFontMetrics(): FontMetrics = ???

    @stub
    // Fetches the foreground color to use to render the glyphs.
    def getForeground(): Color = ???

    @stub
    // Determines if the glyphs should have a strikethrough
    // line.
    def isStrikeThrough(): Boolean = ???

    @stub
    // Determines if the glyphs should be rendered as superscript.
    def isSubscript(): Boolean = ???

    @stub
    // Determines if the glyphs should be rendered as subscript.
    def isSuperscript(): Boolean = ???

    @stub
    // Determines if the glyphs should be underlined.
    def isUnderline(): Boolean = ???

    @stub
    // Sets the background color for the view.
    protected def setBackground(bg: Color): Unit = ???

    @stub
    // Sets the cached properties from the attributes.
    protected def setPropertiesFromAttributes(): Unit = ???

    @stub
    // Sets whether or not the view has a strike/line
    // through it.
    protected def setStrikeThrough(s: Boolean): Unit = ???

    @stub
    // Sets whether or not the view represents a
    // subscript.
    protected def setSubscript(s: Boolean): Unit = ???

    @stub
    // Sets whether or not the view represents a
    // superscript.
    protected def setSuperscript(s: Boolean): Unit = ???
}
