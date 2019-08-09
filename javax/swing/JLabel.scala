package javax.swing

import java.awt.{Component, Container, Image}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.LabelUI

// A display area for a short text string or an image,
// or both.
// A label does not react to input events.
// As a result, it cannot get the keyboard focus.
// A label can, however, display a keyboard alternative
// as a convenience for a nearby component
// that has a keyboard alternative but can't display it.
// 
// A JLabel object can display
// either text, an image, or both.
// You can specify where in the label's display area
// the label's contents are aligned
// by setting the vertical and horizontal alignment.
// By default, labels are vertically centered
// in their display area.
// Text-only labels are leading edge aligned, by default;
// image-only labels are horizontally centered, by default.
// 
// You can also specify the position of the text
// relative to the image.
// By default, text is on the trailing edge of the image,
// with the text and image vertically aligned.
// 
// A label's leading and trailing edge are determined from the value of its
// ComponentOrientation property.  At present, the default
// ComponentOrientation setting maps the leading edge to left and the trailing
// edge to right.
//
// 
// Finally, you can use the setIconTextGap method
// to specify how many pixels
// should appear between the text and the image.
// The default is 4 pixels.
// 
// See How to Use Labels
// in The Java Tutorial
// for further documentation.
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
class JLabel extends JComponent with SwingConstants, with Accessible {

    @stub
    // Creates a JLabel instance with
    // no image and with an empty string for the title.
    def this() = ???

    @stub
    // Creates a JLabel instance with the specified image.
    def this(image: Icon) = ???

    @stub
    // Creates a JLabel instance with the specified
    // image and horizontal alignment.
    def this(image: Icon, horizontalAlignment: Int) = ???

    @stub
    // Creates a JLabel instance with the specified text.
    def this(text: String) = ???

    @stub
    // Creates a JLabel instance with the specified
    // text, image, and horizontal alignment.
    def this(text: String, icon: Icon, horizontalAlignment: Int) = ???

    @stub
    // Verify that key is a legal value for the horizontalAlignment properties.
    protected def checkHorizontalKey(key: Int, message: String): Int = ???

    @stub
    // Verify that key is a legal value for the
    // verticalAlignment or verticalTextPosition properties.
    protected def checkVerticalKey(key: Int, message: String): Int = ???

    @stub
    // Get the AccessibleContext of this object
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the icon used by the label when it's disabled.
    def getDisabledIcon(): Icon = ???

    @stub
    // Return the keycode that indicates a mnemonic key.
    def getDisplayedMnemonic(): Int = ???

    @stub
    // Returns the character, as an index, that the look and feel should
    // provide decoration for as representing the mnemonic character.
    def getDisplayedMnemonicIndex(): Int = ???

    @stub
    // Returns the alignment of the label's contents along the X axis.
    def getHorizontalAlignment(): Int = ???

    @stub
    // Returns the horizontal position of the label's text,
    // relative to its image.
    def getHorizontalTextPosition(): Int = ???

    @stub
    // Returns the graphic image (glyph, icon) that the label displays.
    def getIcon(): Icon = ???

    @stub
    // Returns the amount of space between the text and the icon
    // displayed in this label.
    def getIconTextGap(): Int = ???

    @stub
    // Get the component this is labelling.
    def getLabelFor(): Component = ???

    @stub
    // Returns the text string that the label displays.
    def getText(): String = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): LabelUI = ???

    @stub
    // Returns a string that specifies the name of the l&f class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the alignment of the label's contents along the Y axis.
    def getVerticalAlignment(): Int = ???

    @stub
    // Returns the vertical position of the label's text,
    // relative to its image.
    def getVerticalTextPosition(): Int = ???

    @stub
    // This is overridden to return false if the current Icon's Image is
    // not equal to the passed in Image img.
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean = ???

    @stub
    // Returns a string representation of this JLabel.
    protected def paramString(): String = ???

    @stub
    // Set the icon to be displayed if this JLabel is "disabled"
    // (JLabel.setEnabled(false)).
    def setDisabledIcon(disabledIcon: Icon): Unit = ???

    @stub
    // Specifies the displayedMnemonic as a char value.
    def setDisplayedMnemonic(aChar: Char): Unit = ???

    @stub
    // Specify a keycode that indicates a mnemonic key.
    def setDisplayedMnemonic(key: Int): Unit = ???

    @stub
    // Provides a hint to the look and feel as to which character in the
    // text should be decorated to represent the mnemonic.
    def setDisplayedMnemonicIndex(index: Int): Unit = ???

    @stub
    // Sets the alignment of the label's contents along the X axis.
    def setHorizontalAlignment(alignment: Int): Unit = ???

    @stub
    // Sets the horizontal position of the label's text,
    // relative to its image.
    def setHorizontalTextPosition(textPosition: Int): Unit = ???

    @stub
    // Defines the icon this component will display.
    def setIcon(icon: Icon): Unit = ???

    @stub
    // If both the icon and text properties are set, this property
    // defines the space between them.
    def setIconTextGap(iconTextGap: Int): Unit = ???

    @stub
    // Set the component this is labelling.
    def setLabelFor(c: Component): Unit = ???

    @stub
    // Defines the single line of text this component will display.
    def setText(text: String): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: LabelUI): Unit = ???

    @stub
    // Sets the alignment of the label's contents along the Y axis.
    def setVerticalAlignment(alignment: Int): Unit = ???

    @stub
    // Sets the vertical position of the label's text,
    // relative to its image.
    def setVerticalTextPosition(textPosition: Int): Unit = ???
}
