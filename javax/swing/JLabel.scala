package javax.swing

import java.awt.{Component, Container, Image}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.LabelUI
import scala.scalanative.annotation.stub

/** A display area for a short text string or an image,
 *  or both.
 *  A label does not react to input events.
 *  As a result, it cannot get the keyboard focus.
 *  A label can, however, display a keyboard alternative
 *  as a convenience for a nearby component
 *  that has a keyboard alternative but can't display it.
 *  
 *  A JLabel object can display
 *  either text, an image, or both.
 *  You can specify where in the label's display area
 *  the label's contents are aligned
 *  by setting the vertical and horizontal alignment.
 *  By default, labels are vertically centered
 *  in their display area.
 *  Text-only labels are leading edge aligned, by default;
 *  image-only labels are horizontally centered, by default.
 *  
 *  You can also specify the position of the text
 *  relative to the image.
 *  By default, text is on the trailing edge of the image,
 *  with the text and image vertically aligned.
 *  
 *  A label's leading and trailing edge are determined from the value of its
 *  ComponentOrientation property.  At present, the default
 *  ComponentOrientation setting maps the leading edge to left and the trailing
 *  edge to right.
 * 
 *  
 *  Finally, you can use the setIconTextGap method
 *  to specify how many pixels
 *  should appear between the text and the image.
 *  The default is 4 pixels.
 *  
 *  See How to Use Labels
 *  in The Java Tutorial
 *  for further documentation.
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
class JLabel extends JComponent with SwingConstants with Accessible {

    /** Creates a JLabel instance with
     *  no image and with an empty string for the title.
     */
    @stub
    def this() = ???

    /** Creates a JLabel instance with the specified image. */
    @stub
    def this(image: Icon) = ???

    /** Creates a JLabel instance with the specified
     *  image and horizontal alignment.
     */
    @stub
    def this(image: Icon, horizontalAlignment: Int) = ???

    /** Creates a JLabel instance with the specified text. */
    @stub
    def this(text: String) = ???

    /** Creates a JLabel instance with the specified
     *  text, image, and horizontal alignment.
     */
    @stub
    def this(text: String, icon: Icon, horizontalAlignment: Int) = ???

    /** Creates a JLabel instance with the specified
     *  text and horizontal alignment.
     */
    @stub
    def this(text: String, horizontalAlignment: Int) = ???

    /** The class used to obtain the accessible role for this object. */
    protected type AccessibleJLabel = JLabel_AccessibleJLabel

    /**  */
    @stub
    protected val labelFor: Component = ???

    /** Verify that key is a legal value for the horizontalAlignment properties. */
    @stub
    protected def checkHorizontalKey(key: Int, message: String): Int = ???

    /** Verify that key is a legal value for the
     *  verticalAlignment or verticalTextPosition properties.
     */
    @stub
    protected def checkVerticalKey(key: Int, message: String): Int = ???

    /** Get the AccessibleContext of this object */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the icon used by the label when it's disabled. */
    @stub
    def getDisabledIcon(): Icon = ???

    /** Return the keycode that indicates a mnemonic key. */
    @stub
    def getDisplayedMnemonic(): Int = ???

    /** Returns the character, as an index, that the look and feel should
     *  provide decoration for as representing the mnemonic character.
     */
    @stub
    def getDisplayedMnemonicIndex(): Int = ???

    /** Returns the alignment of the label's contents along the X axis. */
    @stub
    def getHorizontalAlignment(): Int = ???

    /** Returns the horizontal position of the label's text,
     *  relative to its image.
     */
    @stub
    def getHorizontalTextPosition(): Int = ???

    /** Returns the graphic image (glyph, icon) that the label displays. */
    @stub
    def getIcon(): Icon = ???

    /** Returns the amount of space between the text and the icon
     *  displayed in this label.
     */
    @stub
    def getIconTextGap(): Int = ???

    /** Get the component this is labelling. */
    @stub
    def getLabelFor(): Component = ???

    /** Returns the text string that the label displays. */
    @stub
    def getText(): String = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): LabelUI = ???

    /** Returns a string that specifies the name of the l&f class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the alignment of the label's contents along the Y axis. */
    @stub
    def getVerticalAlignment(): Int = ???

    /** Returns the vertical position of the label's text,
     *  relative to its image.
     */
    @stub
    def getVerticalTextPosition(): Int = ???

    /** This is overridden to return false if the current Icon's Image is
     *  not equal to the passed in Image img.
     */
    @stub
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean = ???

    /** Returns a string representation of this JLabel. */
    @stub
    protected def paramString(): String = ???

    /** Set the icon to be displayed if this JLabel is "disabled"
     *  (JLabel.setEnabled(false)).
     */
    @stub
    def setDisabledIcon(disabledIcon: Icon): Unit = ???

    /** Specifies the displayedMnemonic as a char value. */
    @stub
    def setDisplayedMnemonic(aChar: Char): Unit = ???

    /** Specify a keycode that indicates a mnemonic key. */
    @stub
    def setDisplayedMnemonic(key: Int): Unit = ???

    /** Provides a hint to the look and feel as to which character in the
     *  text should be decorated to represent the mnemonic.
     */
    @stub
    def setDisplayedMnemonicIndex(index: Int): Unit = ???

    /** Sets the alignment of the label's contents along the X axis. */
    @stub
    def setHorizontalAlignment(alignment: Int): Unit = ???

    /** Sets the horizontal position of the label's text,
     *  relative to its image.
     */
    @stub
    def setHorizontalTextPosition(textPosition: Int): Unit = ???

    /** Defines the icon this component will display. */
    @stub
    def setIcon(icon: Icon): Unit = ???

    /** If both the icon and text properties are set, this property
     *  defines the space between them.
     */
    @stub
    def setIconTextGap(iconTextGap: Int): Unit = ???

    /** Set the component this is labelling. */
    @stub
    def setLabelFor(c: Component): Unit = ???

    /** Defines the single line of text this component will display. */
    @stub
    def setText(text: String): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: LabelUI): Unit = ???

    /** Sets the alignment of the label's contents along the Y axis. */
    @stub
    def setVerticalAlignment(alignment: Int): Unit = ???

    /** Sets the vertical position of the label's text,
     *  relative to its image.
     */
    @stub
    def setVerticalTextPosition(textPosition: Int): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
