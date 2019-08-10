package javax.swing.text.html

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Defines a set of
 *  CSS attributes
 *  as a typesafe enumeration.  The HTML View implementations use
 *  CSS attributes to determine how they will render. This also defines
 *  methods to map between CSS/HTML/StyleConstants. Any shorthand
 *  properties, such as font, are mapped to the intrinsic properties.
 *  The following describes the CSS properties that are supported by the
 *  rendering engine:
 *  font-family
 *    font-style
 *    font-size (supports relative units)
 *    font-weight
 *    font
 *    color
 *    background-color (with the exception of transparent)
 *    background-image
 *    background-repeat
 *    background-position
 *    background
 *    text-decoration (with the exception of blink and overline)
 *    vertical-align (only sup and super)
 *    text-align (justify is treated as center)
 *    margin-top
 *    margin-right
 *    margin-bottom
 *    margin-left
 *    margin
 *    padding-top
 *    padding-right
 *    padding-bottom
 *    padding-left
 *    padding
 *    border-top-style
 *    border-right-style
 *    border-bottom-style
 *    border-left-style
 *    border-style (only supports inset, outset and none)
 *    border-top-color
 *    border-right-color
 *    border-bottom-color
 *    border-left-color
 *    border-color
 *    list-style-image
 *    list-style-type
 *    list-style-position
 *  
 *  The following are modeled, but currently not rendered.
 *  font-variant
 *    background-attachment (background always treated as scroll)
 *    word-spacing
 *    letter-spacing
 *    text-indent
 *    text-transform
 *    line-height
 *    border-top-width (this is used to indicate if a border should be used)
 *    border-right-width
 *    border-bottom-width
 *    border-left-width
 *    border-width
 *    border-top
 *    border-right
 *    border-bottom
 *    border-left
 *    border
 *    width
 *    height
 *    float
 *    clear
 *    display
 *    white-space
 *    list-style
 *  
 *  Note: for the time being we do not fully support relative units,
 *  unless noted, so that
 *  p { margin-top: 10% } will be treated as if no margin-top was specified.
 */
class CSS extends Object with Serializable {

    /**  */
    @stub
    def this() = ???
}

object CSS {
    /** Definitions to be used as a key on AttributeSet's
     *  that might hold CSS attributes.  Since this is a
     *  closed set (i.e. defined exactly by the specification),
     *  it is final and cannot be extended.
     */
    final object Attribute extends Object {

        /**  */
        @stub
        val BACKGROUND: Attribute = ???

        /**  */
        @stub
        val BACKGROUND_ATTACHMENT: Attribute = ???

        /**  */
        @stub
        val BACKGROUND_COLOR: Attribute = ???

        /**  */
        @stub
        val BACKGROUND_IMAGE: Attribute = ???

        /**  */
        @stub
        val BACKGROUND_POSITION: Attribute = ???

        /**  */
        @stub
        val BACKGROUND_REPEAT: Attribute = ???

        /**  */
        @stub
        val BORDER: Attribute = ???

        /**  */
        @stub
        val BORDER_BOTTOM: Attribute = ???

        /**  */
        @stub
        val BORDER_BOTTOM_COLOR: Attribute = ???

        /**  */
        @stub
        val BORDER_BOTTOM_STYLE: Attribute = ???

        /**  */
        @stub
        val BORDER_BOTTOM_WIDTH: Attribute = ???

        /**  */
        @stub
        val BORDER_COLOR: Attribute = ???

        /**  */
        @stub
        val BORDER_LEFT: Attribute = ???

        /**  */
        @stub
        val BORDER_LEFT_COLOR: Attribute = ???

        /**  */
        @stub
        val BORDER_LEFT_STYLE: Attribute = ???

        /**  */
        @stub
        val BORDER_LEFT_WIDTH: Attribute = ???

        /**  */
        @stub
        val BORDER_RIGHT: Attribute = ???

        /**  */
        @stub
        val BORDER_RIGHT_COLOR: Attribute = ???

        /**  */
        @stub
        val BORDER_RIGHT_STYLE: Attribute = ???

        /**  */
        @stub
        val BORDER_RIGHT_WIDTH: Attribute = ???

        /**  */
        @stub
        val BORDER_STYLE: Attribute = ???

        /**  */
        @stub
        val BORDER_TOP: Attribute = ???

        /**  */
        @stub
        val BORDER_TOP_COLOR: Attribute = ???

        /**  */
        @stub
        val BORDER_TOP_STYLE: Attribute = ???

        /**  */
        @stub
        val BORDER_TOP_WIDTH: Attribute = ???

        /**  */
        @stub
        val BORDER_WIDTH: Attribute = ???

        /**  */
        @stub
        val CLEAR: Attribute = ???

        /**  */
        @stub
        val COLOR: Attribute = ???

        /**  */
        @stub
        val DISPLAY: Attribute = ???

        /**  */
        @stub
        val FLOAT: Attribute = ???

        /**  */
        @stub
        val FONT: Attribute = ???

        /**  */
        @stub
        val FONT_FAMILY: Attribute = ???

        /**  */
        @stub
        val FONT_SIZE: Attribute = ???

        /**  */
        @stub
        val FONT_STYLE: Attribute = ???

        /**  */
        @stub
        val FONT_VARIANT: Attribute = ???

        /**  */
        @stub
        val FONT_WEIGHT: Attribute = ???

        /**  */
        @stub
        val HEIGHT: Attribute = ???

        /**  */
        @stub
        val LETTER_SPACING: Attribute = ???

        /**  */
        @stub
        val LINE_HEIGHT: Attribute = ???

        /**  */
        @stub
        val LIST_STYLE: Attribute = ???

        /**  */
        @stub
        val LIST_STYLE_IMAGE: Attribute = ???

        /**  */
        @stub
        val LIST_STYLE_POSITION: Attribute = ???

        /**  */
        @stub
        val LIST_STYLE_TYPE: Attribute = ???

        /**  */
        @stub
        val MARGIN: Attribute = ???

        /**  */
        @stub
        val MARGIN_BOTTOM: Attribute = ???

        /**  */
        @stub
        val MARGIN_LEFT: Attribute = ???

        /**  */
        @stub
        val MARGIN_RIGHT: Attribute = ???

        /**  */
        @stub
        val MARGIN_TOP: Attribute = ???

        /**  */
        @stub
        val PADDING: Attribute = ???

        /**  */
        @stub
        val PADDING_BOTTOM: Attribute = ???

        /**  */
        @stub
        val PADDING_LEFT: Attribute = ???

        /**  */
        @stub
        val PADDING_RIGHT: Attribute = ???

        /**  */
        @stub
        val PADDING_TOP: Attribute = ???

        /**  */
        @stub
        val TEXT_ALIGN: Attribute = ???

        /**  */
        @stub
        val TEXT_DECORATION: Attribute = ???

        /**  */
        @stub
        val TEXT_INDENT: Attribute = ???

        /**  */
        @stub
        val TEXT_TRANSFORM: Attribute = ???

        /**  */
        @stub
        val VERTICAL_ALIGN: Attribute = ???

        /**  */
        @stub
        val WHITE_SPACE: Attribute = ???

        /**  */
        @stub
        val WIDTH: Attribute = ???

        /**  */
        @stub
        val WORD_SPACING: Attribute = ???

        /** Fetch the default value for the attribute. */
        @stub
        def getDefaultValue(): String = ???

        /** Indicates if the attribute should be inherited
         *  from the parent or not.
         */
        @stub
        def isInherited(): Boolean = ???

        /** The string representation of the attribute. */
        @stub
        def toString(): String = ???
    }


    /** Return the set of all possible CSS attribute keys. */
    @stub
    def getAllAttributeKeys(): Array[CSS.Attribute] = ???

    /** Translates a string to a CSS.Attribute object. */
    @stub
    def getAttribute(name: String): CSS.Attribute = ???
}
