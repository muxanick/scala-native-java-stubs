package javax.swing.text

import java.awt.{Color, Component}
import java.lang.{Object, String}
import javax.swing.Icon
import scala.scalanative.annotation.stub

/** 
 *  A collection of well known or common attribute keys
 *  and methods to apply to an AttributeSet or MutableAttributeSet
 *  to get/set the properties in a typesafe manner.
 *  
 *  The paragraph attributes form the definition of a paragraph to be rendered.
 *  All sizes are specified in points (such as found in postscript), a
 *  device independent measure.
 *  
 *  
 *  
 */
class StyleConstants extends Object {

    /** Returns the string representation. */
    @stub
    def toString(): String = ???
}

object StyleConstants {
    /** This is a typesafe enumeration of the well-known
     *  attributes that contribute to a character style.  These are
     *  aliased by the outer class for general presentation.
     */
    object CharacterConstants extends StyleConstants with AttributeSet.CharacterAttribute {


    /** This is a typesafe enumeration of the well-known
     *  attributes that contribute to a color.  These are aliased
     *  by the outer class for general presentation.
     */
    object ColorConstants extends StyleConstants with AttributeSet.ColorAttribute with AttributeSet.CharacterAttribute {


    /** This is a typesafe enumeration of the well-known
     *  attributes that contribute to a font.  These are aliased
     *  by the outer class for general presentation.
     */
    object FontConstants extends StyleConstants with AttributeSet.FontAttribute with AttributeSet.CharacterAttribute {


    /** This is a typesafe enumeration of the well-known
     *  attributes that contribute to a paragraph style.  These are
     *  aliased by the outer class for general presentation.
     */
    object ParagraphConstants extends StyleConstants with AttributeSet.ParagraphAttribute {


    /** A possible value for paragraph alignment. */
    @stub
    val ALIGN_CENTER: Int = ???

    /** A possible value for paragraph alignment. */
    @stub
    val ALIGN_JUSTIFIED: Int = ???

    /** A possible value for paragraph alignment. */
    @stub
    val ALIGN_LEFT: Int = ???

    /** A possible value for paragraph alignment. */
    @stub
    val ALIGN_RIGHT: Int = ???

    /** Alignment for the paragraph. */
    @stub
    val Alignment: Any = ???

    /** Name of the background color attribute. */
    @stub
    val Background: Any = ???

    /** Bidirectional level of a character as assigned by the Unicode bidi
     *  algorithm.
     */
    @stub
    val BidiLevel: Any = ???

    /** Name of the bold attribute. */
    @stub
    val Bold: Any = ???

    /** Name of the component attribute. */
    @stub
    val ComponentAttribute: Any = ???

    /** Name of elements used to represent components. */
    @stub
    val ComponentElementName: String = ???

    /** Name of the input method composed text attribute. */
    @stub
    val ComposedTextAttribute: Any = ???

    /** Name of the font family. */
    @stub
    val Family: Any = ???

    /** The amount of space to indent the first
     *  line of the paragraph.
     */
    @stub
    val FirstLineIndent: Any = ???

    /** Name of the font family. */
    @stub
    val FontFamily: Any = ???

    /** Name of the font size. */
    @stub
    val FontSize: Any = ???

    /** Name of the foreground color attribute. */
    @stub
    val Foreground: Any = ???

    /** Name of the icon attribute. */
    @stub
    val IconAttribute: Any = ???

    /** Name of elements used to represent icons. */
    @stub
    val IconElementName: String = ???

    /** Name of the italic attribute. */
    @stub
    val Italic: Any = ???

    /** The amount to indent the left side
     *  of the paragraph.
     */
    @stub
    val LeftIndent: Any = ???

    /** The amount of space between lines
     *  of the paragraph.
     */
    @stub
    val LineSpacing: Any = ???

    /** Attribute used to identify the model for embedded
     *  objects that have a model view separation.
     */
    @stub
    val ModelAttribute: Any = ???

    /** Attribute name used to name the collection of
     *  attributes.
     */
    @stub
    val NameAttribute: Any = ???

    /** Orientation for a paragraph. */
    @stub
    val Orientation: Any = ???

    /** Attribute name used to identify the resolving parent
     *  set of attributes, if one is defined.
     */
    @stub
    val ResolveAttribute: Any = ???

    /** The amount to indent the right side
     *  of the paragraph.
     */
    @stub
    val RightIndent: Any = ???

    /** Name of the font size. */
    @stub
    val Size: Any = ???

    /** The amount of space above the paragraph. */
    @stub
    val SpaceAbove: Any = ???

    /** The amount of space below the paragraph. */
    @stub
    val SpaceBelow: Any = ???

    /** Name of the Strikethrough attribute. */
    @stub
    val StrikeThrough: Any = ???

    /** Name of the Subscript attribute. */
    @stub
    val Subscript: Any = ???

    /** Name of the Superscript attribute. */
    @stub
    val Superscript: Any = ???

    /** TabSet for the paragraph, type is a TabSet containing
     *  TabStops.
     */
    @stub
    val TabSet: Any = ???

    /** Name of the underline attribute. */
    @stub
    val Underline: Any = ???

    /** Gets the alignment setting. */
    @stub
    def getAlignment(a: AttributeSet): Int = ???

    /** Gets the background color setting from the attribute list. */
    @stub
    def getBackground(a: AttributeSet): Color = ???

    /** Gets the BidiLevel setting. */
    @stub
    def getBidiLevel(a: AttributeSet): Int = ???

    /** Gets the component setting from the attribute list. */
    @stub
    def getComponent(a: AttributeSet): Component = ???

    /** Gets the first line indent setting. */
    @stub
    def getFirstLineIndent(a: AttributeSet): Float = ???

    /** Gets the font family setting from the attribute list. */
    @stub
    def getFontFamily(a: AttributeSet): String = ???

    /** Gets the font size setting from the attribute list. */
    @stub
    def getFontSize(a: AttributeSet): Int = ???

    /** Gets the foreground color setting from the attribute list. */
    @stub
    def getForeground(a: AttributeSet): Color = ???

    /** Gets the icon setting from the attribute list. */
    @stub
    def getIcon(a: AttributeSet): Icon = ???

    /** Gets the left indent setting. */
    @stub
    def getLeftIndent(a: AttributeSet): Float = ???

    /** Gets the line spacing setting. */
    @stub
    def getLineSpacing(a: AttributeSet): Float = ???

    /** Gets the right indent setting. */
    @stub
    def getRightIndent(a: AttributeSet): Float = ???

    /** Gets the space above setting. */
    @stub
    def getSpaceAbove(a: AttributeSet): Float = ???

    /** Gets the space below setting. */
    @stub
    def getSpaceBelow(a: AttributeSet): Float = ???

    /** Gets the TabSet. */
    @stub
    def getTabSet(a: AttributeSet): TabSet = ???

    /** Checks whether the bold attribute is set. */
    @stub
    def isBold(a: AttributeSet): Boolean = ???

    /** Checks whether the italic attribute is set. */
    @stub
    def isItalic(a: AttributeSet): Boolean = ???

    /** Checks whether the strikethrough attribute is set. */
    @stub
    def isStrikeThrough(a: AttributeSet): Boolean = ???

    /** Checks whether the subscript attribute is set. */
    @stub
    def isSubscript(a: AttributeSet): Boolean = ???

    /** Checks whether the superscript attribute is set. */
    @stub
    def isSuperscript(a: AttributeSet): Boolean = ???

    /** Checks whether the underline attribute is set. */
    @stub
    def isUnderline(a: AttributeSet): Boolean = ???

    /** Sets alignment. */
    @stub
    def setAlignment(a: MutableAttributeSet, align: Int): Unit = ???

    /** Sets the background color. */
    @stub
    def setBackground(a: MutableAttributeSet, fg: Color): Unit = ???

    /** Sets the BidiLevel. */
    @stub
    def setBidiLevel(a: MutableAttributeSet, o: Int): Unit = ???

    /** Sets the bold attribute. */
    @stub
    def setBold(a: MutableAttributeSet, b: Boolean): Unit = ???

    /** Sets the component attribute. */
    @stub
    def setComponent(a: MutableAttributeSet, c: Component): Unit = ???

    /** Sets the first line indent. */
    @stub
    def setFirstLineIndent(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets the font attribute. */
    @stub
    def setFontFamily(a: MutableAttributeSet, fam: String): Unit = ???

    /** Sets the font size attribute. */
    @stub
    def setFontSize(a: MutableAttributeSet, s: Int): Unit = ???

    /** Sets the foreground color. */
    @stub
    def setForeground(a: MutableAttributeSet, fg: Color): Unit = ???

    /** Sets the icon attribute. */
    @stub
    def setIcon(a: MutableAttributeSet, c: Icon): Unit = ???

    /** Sets the italic attribute. */
    @stub
    def setItalic(a: MutableAttributeSet, b: Boolean): Unit = ???

    /** Sets left indent. */
    @stub
    def setLeftIndent(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets line spacing. */
    @stub
    def setLineSpacing(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets right indent. */
    @stub
    def setRightIndent(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets space above. */
    @stub
    def setSpaceAbove(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets space below. */
    @stub
    def setSpaceBelow(a: MutableAttributeSet, i: Float): Unit = ???

    /** Sets the strikethrough attribute. */
    @stub
    def setStrikeThrough(a: MutableAttributeSet, b: Boolean): Unit = ???

    /** Sets the subscript attribute. */
    @stub
    def setSubscript(a: MutableAttributeSet, b: Boolean): Unit = ???

    /** Sets the superscript attribute. */
    @stub
    def setSuperscript(a: MutableAttributeSet, b: Boolean): Unit = ???

    /** Sets the TabSet. */
    @stub
    def setTabSet(a: MutableAttributeSet, tabs: TabSet): Unit = ???

    /** Sets the underline attribute. */
    @stub
    def setUnderline(a: MutableAttributeSet, b: Boolean): Unit = ???
}
