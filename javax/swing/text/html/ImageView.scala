package javax.swing.text.html

import java.awt.{Graphics, Image, Shape}
import java.lang.{Object, String}
import java.net.URL
import javax.swing.Icon
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, Position.Bias, View, ViewFactory}

/** View of an Image, intended to support the HTML <IMG> tag.
 *  Supports scaling via the HEIGHT and WIDTH attributes of the tag.
 *  If the image is unable to be loaded any text specified via the
 *  ALT attribute will be rendered.
 *  
 *  While this class has been part of swing for a while now, it is public
 *  as of 1.4.
 */
class ImageView extends View {

    /** Invoked when the Elements attributes have changed. */
    @stub
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    /** Determines the desired alignment for this view along an
     *  axis.
     */
    @stub
    def getAlignment(axis: Int): Float = ???

    /** Returns the text to display if the image can't be loaded. */
    @stub
    def getAltText(): String = ???

    /** Fetches the attributes to use when rendering. */
    @stub
    def getAttributes(): AttributeSet = ???

    /** Returns the image to render. */
    @stub
    def getImage(): Image = ???

    /** Return a URL for the image source,
     *  or null if it could not be determined.
     */
    @stub
    def getImageURL(): URL = ???

    /** Returns the icon to use while in the process of loading the image. */
    @stub
    def getLoadingImageIcon(): Icon = ???

    /** Returns true if the image should be loaded when first asked for. */
    @stub
    def getLoadsSynchronously(): Boolean = ???

    /** Returns the icon to use if the image couldn't be found. */
    @stub
    def getNoImageIcon(): Icon = ???

    /** Determines the preferred span for this view along an
     *  axis.
     */
    @stub
    def getPreferredSpan(axis: Int): Float = ???

    /** Convenience method to get the StyleSheet. */
    @stub
    protected def getStyleSheet(): StyleSheet = ???

    /** For images the tooltip text comes from text specified with the
     *  ALT attribute.
     */
    @stub
    def getToolTipText(x: Float, y: Float, allocation: Shape): String = ???

    /** Provides a mapping from the document model coordinate space
     *  to the coordinate space of the view mapped to it.
     */
    @stub
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    /** Paints the View. */
    @stub
    def paint(g: Graphics, a: Shape): Unit = ???

    /** Sets how the image is loaded. */
    @stub
    def setLoadsSynchronously(newValue: Boolean): Unit = ???

    /** Establishes the parent view for this view. */
    @stub
    def setParent(parent: View): Unit = ???

    /** Update any cached values that come from attributes. */
    @stub
    protected def setPropertiesFromAttributes(): Unit = ???

    /** Sets the size of the view. */
    @stub
    def setSize(width: Float, height: Float): Unit = ???
}
