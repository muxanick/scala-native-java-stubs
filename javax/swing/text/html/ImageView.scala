package javax.swing.text.html

import java.awt.{Graphics, Image, Shape}
import java.lang.{Object, String}
import java.net.URL
import javax.swing.Icon
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, Position.Bias, View, ViewFactory}

// View of an Image, intended to support the HTML <IMG> tag.
// Supports scaling via the HEIGHT and WIDTH attributes of the tag.
// If the image is unable to be loaded any text specified via the
// ALT attribute will be rendered.
// 
// While this class has been part of swing for a while now, it is public
// as of 1.4.
class ImageView extends View {

    @stub
    // Invoked when the Elements attributes have changed.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Determines the desired alignment for this view along an
    // axis.
    def getAlignment(axis: Int): float = ???

    @stub
    // Returns the text to display if the image can't be loaded.
    def getAltText(): String = ???

    @stub
    // Fetches the attributes to use when rendering.
    def getAttributes(): AttributeSet = ???

    @stub
    // Returns the image to render.
    def getImage(): Image = ???

    @stub
    // Return a URL for the image source,
    // or null if it could not be determined.
    def getImageURL(): URL = ???

    @stub
    // Returns the icon to use while in the process of loading the image.
    def getLoadingImageIcon(): Icon = ???

    @stub
    // Returns true if the image should be loaded when first asked for.
    def getLoadsSynchronously(): Boolean = ???

    @stub
    // Returns the icon to use if the image couldn't be found.
    def getNoImageIcon(): Icon = ???

    @stub
    // Determines the preferred span for this view along an
    // axis.
    def getPreferredSpan(axis: Int): float = ???

    @stub
    // Convenience method to get the StyleSheet.
    protected def getStyleSheet(): StyleSheet = ???

    @stub
    // For images the tooltip text comes from text specified with the
    // ALT attribute.
    def getToolTipText(x: float, y: float, allocation: Shape): String = ???

    @stub
    // Provides a mapping from the document model coordinate space
    // to the coordinate space of the view mapped to it.
    def modelToView(pos: Int, a: Shape, b: Position.Bias): Shape = ???

    @stub
    // Paints the View.
    def paint(g: Graphics, a: Shape): Unit = ???

    @stub
    // Sets how the image is loaded.
    def setLoadsSynchronously(newValue: Boolean): Unit = ???

    @stub
    // Establishes the parent view for this view.
    def setParent(parent: View): Unit = ???

    @stub
    // Update any cached values that come from attributes.
    protected def setPropertiesFromAttributes(): Unit = ???

    @stub
    // Sets the size of the view.
    def setSize(width: float, height: float): Unit = ???
}
