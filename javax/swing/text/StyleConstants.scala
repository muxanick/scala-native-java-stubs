package javax.swing.text

import java.awt.{Color, Component}
import java.lang.{Object, String}
import javax.swing.Icon

// 
// A collection of well known or common attribute keys
// and methods to apply to an AttributeSet or MutableAttributeSet
// to get/set the properties in a typesafe manner.
// 
// The paragraph attributes form the definition of a paragraph to be rendered.
// All sizes are specified in points (such as found in postscript), a
// device independent measure.
// 
// 
// 
class StyleConstants extends Object {
}

object StyleConstants {
    @stub
    // This is a typesafe enumeration of the well-known
    // attributes that contribute to a character style.
    def StyleConstants.CharacterConstants: class = ???

    @stub
    // This is a typesafe enumeration of the well-known
    // attributes that contribute to a color.
    def StyleConstants.ColorConstants: class = ???

    @stub
    // This is a typesafe enumeration of the well-known
    // attributes that contribute to a font.
    def StyleConstants.FontConstants: class = ???

    @stub
    // A possible value for paragraph alignment.
    def ALIGN_CENTER: Int = ???

    @stub
    // A possible value for paragraph alignment.
    def ALIGN_JUSTIFIED: Int = ???

    @stub
    // A possible value for paragraph alignment.
    def ALIGN_LEFT: Int = ???

    @stub
    // A possible value for paragraph alignment.
    def ALIGN_RIGHT: Int = ???

    @stub
    // Alignment for the paragraph.
    def Alignment: Object = ???

    @stub
    // Name of the background color attribute.
    def Background: Object = ???

    @stub
    // Bidirectional level of a character as assigned by the Unicode bidi
    // algorithm.
    def BidiLevel: Object = ???

    @stub
    // Name of the bold attribute.
    def Bold: Object = ???

    @stub
    // Name of the component attribute.
    def ComponentAttribute: Object = ???

    @stub
    // Name of elements used to represent components.
    def ComponentElementName: String = ???

    @stub
    // Name of the input method composed text attribute.
    def ComposedTextAttribute: Object = ???

    @stub
    // Name of the font family.
    def Family: Object = ???

    @stub
    // The amount of space to indent the first
    // line of the paragraph.
    def FirstLineIndent: Object = ???

    @stub
    // Name of the font family.
    def FontFamily: Object = ???

    @stub
    // Name of the font size.
    def FontSize: Object = ???

    @stub
    // Name of the foreground color attribute.
    def Foreground: Object = ???

    @stub
    // Name of the icon attribute.
    def IconAttribute: Object = ???

    @stub
    // Name of elements used to represent icons.
    def IconElementName: String = ???

    @stub
    // Name of the italic attribute.
    def Italic: Object = ???

    @stub
    // The amount to indent the left side
    // of the paragraph.
    def LeftIndent: Object = ???

    @stub
    // The amount of space between lines
    // of the paragraph.
    def LineSpacing: Object = ???

    @stub
    // Attribute used to identify the model for embedded
    // objects that have a model view separation.
    def ModelAttribute: Object = ???

    @stub
    // Attribute name used to name the collection of
    // attributes.
    def NameAttribute: Object = ???

    @stub
    // Orientation for a paragraph.
    def Orientation: Object = ???

    @stub
    // Attribute name used to identify the resolving parent
    // set of attributes, if one is defined.
    def ResolveAttribute: Object = ???

    @stub
    // The amount to indent the right side
    // of the paragraph.
    def RightIndent: Object = ???

    @stub
    // Name of the font size.
    def Size: Object = ???

    @stub
    // The amount of space above the paragraph.
    def SpaceAbove: Object = ???

    @stub
    // The amount of space below the paragraph.
    def SpaceBelow: Object = ???

    @stub
    // Name of the Strikethrough attribute.
    def StrikeThrough: Object = ???

    @stub
    // Name of the Subscript attribute.
    def Subscript: Object = ???

    @stub
    // Name of the Superscript attribute.
    def Superscript: Object = ???

    @stub
    // TabSet for the paragraph, type is a TabSet containing
    // TabStops.
    def TabSet: Object = ???

    @stub
    // Gets the alignment setting.
    def getAlignment(a: AttributeSet): Int = ???

    @stub
    // Gets the background color setting from the attribute list.
    def getBackground(a: AttributeSet): Color = ???

    @stub
    // Gets the BidiLevel setting.
    def getBidiLevel(a: AttributeSet): Int = ???

    @stub
    // Gets the component setting from the attribute list.
    def getComponent(a: AttributeSet): Component = ???

    @stub
    // Gets the first line indent setting.
    def getFirstLineIndent(a: AttributeSet): float = ???

    @stub
    // Gets the font family setting from the attribute list.
    def getFontFamily(a: AttributeSet): String = ???

    @stub
    // Gets the font size setting from the attribute list.
    def getFontSize(a: AttributeSet): Int = ???

    @stub
    // Gets the foreground color setting from the attribute list.
    def getForeground(a: AttributeSet): Color = ???

    @stub
    // Gets the icon setting from the attribute list.
    def getIcon(a: AttributeSet): Icon = ???

    @stub
    // Gets the left indent setting.
    def getLeftIndent(a: AttributeSet): float = ???

    @stub
    // Gets the line spacing setting.
    def getLineSpacing(a: AttributeSet): float = ???

    @stub
    // Gets the right indent setting.
    def getRightIndent(a: AttributeSet): float = ???

    @stub
    // Gets the space above setting.
    def getSpaceAbove(a: AttributeSet): float = ???

    @stub
    // Gets the space below setting.
    def getSpaceBelow(a: AttributeSet): float = ???

    @stub
    // Gets the TabSet.
    def getTabSet(a: AttributeSet): TabSet = ???

    @stub
    // Checks whether the bold attribute is set.
    def isBold(a: AttributeSet): Boolean = ???

    @stub
    // Checks whether the italic attribute is set.
    def isItalic(a: AttributeSet): Boolean = ???

    @stub
    // Checks whether the strikethrough attribute is set.
    def isStrikeThrough(a: AttributeSet): Boolean = ???

    @stub
    // Checks whether the subscript attribute is set.
    def isSubscript(a: AttributeSet): Boolean = ???

    @stub
    // Checks whether the superscript attribute is set.
    def isSuperscript(a: AttributeSet): Boolean = ???

    @stub
    // Checks whether the underline attribute is set.
    def isUnderline(a: AttributeSet): Boolean = ???

    @stub
    // Sets alignment.
    def setAlignment(a: MutableAttributeSet, align: Int): Unit = ???

    @stub
    // Sets the background color.
    def setBackground(a: MutableAttributeSet, fg: Color): Unit = ???

    @stub
    // Sets the BidiLevel.
    def setBidiLevel(a: MutableAttributeSet, o: Int): Unit = ???

    @stub
    // Sets the bold attribute.
    def setBold(a: MutableAttributeSet, b: Boolean): Unit = ???

    @stub
    // Sets the component attribute.
    def setComponent(a: MutableAttributeSet, c: Component): Unit = ???

    @stub
    // Sets the first line indent.
    def setFirstLineIndent(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets the font attribute.
    def setFontFamily(a: MutableAttributeSet, fam: String): Unit = ???

    @stub
    // Sets the font size attribute.
    def setFontSize(a: MutableAttributeSet, s: Int): Unit = ???

    @stub
    // Sets the foreground color.
    def setForeground(a: MutableAttributeSet, fg: Color): Unit = ???

    @stub
    // Sets the icon attribute.
    def setIcon(a: MutableAttributeSet, c: Icon): Unit = ???

    @stub
    // Sets the italic attribute.
    def setItalic(a: MutableAttributeSet, b: Boolean): Unit = ???

    @stub
    // Sets left indent.
    def setLeftIndent(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets line spacing.
    def setLineSpacing(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets right indent.
    def setRightIndent(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets space above.
    def setSpaceAbove(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets space below.
    def setSpaceBelow(a: MutableAttributeSet, i: float): Unit = ???

    @stub
    // Sets the strikethrough attribute.
    def setStrikeThrough(a: MutableAttributeSet, b: Boolean): Unit = ???

    @stub
    // Sets the subscript attribute.
    def setSubscript(a: MutableAttributeSet, b: Boolean): Unit = ???

    @stub
    // Sets the superscript attribute.
    def setSuperscript(a: MutableAttributeSet, b: Boolean): Unit = ???

    @stub
    // Sets the TabSet.
    def setTabSet(a: MutableAttributeSet, tabs: TabSet): Unit = ???

    @stub
    // Sets the underline attribute.
    def setUnderline(a: MutableAttributeSet, b: Boolean): Unit = ???
}
