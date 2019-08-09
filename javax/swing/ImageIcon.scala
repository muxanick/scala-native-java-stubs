package javax.swing

import java.awt.{Component, Graphics, Image}
import java.awt.image.ImageObserver
import java.io.Serializable
import java.lang.{Object, String}
import java.net.URL
import javax.accessibility.{Accessible, AccessibleContext}

// An implementation of the Icon interface that paints Icons
// from Images. Images that are created from a URL, filename or byte array
// are preloaded using MediaTracker to monitor the loaded state
// of the image.
//
// 
// For further information and examples of using image icons, see
// How to Use Icons
// in The Java Tutorial.
//
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class ImageIcon extends Object with Icon, with Serializable, with Accessible {

    @stub
    // Creates an uninitialized image icon.
    def this() = ???

    @stub
    // Creates an ImageIcon from an array of bytes which were
    // read from an image file containing a supported image format,
    // such as GIF, JPEG, or (as of 1.3) PNG.
    def this(imageData: Array[Byte]) = ???

    @stub
    // Creates an ImageIcon from an array of bytes which were
    // read from an image file containing a supported image format,
    // such as GIF, JPEG, or (as of 1.3) PNG.
    def this(imageData: Array[Byte], description: String) = ???

    @stub
    // Creates an ImageIcon from an image object.
    def this(image: Image) = ???

    @stub
    // Creates an ImageIcon from the image.
    def this(image: Image, description: String) = ???

    @stub
    // Creates an ImageIcon from the specified file.
    def this(filename: String) = ???

    @stub
    // Creates an ImageIcon from the specified file.
    def this(filename: String, description: String) = ???

    @stub
    // Creates an ImageIcon from the specified URL.
    def this(location: URL) = ???

    @stub
    // Gets the AccessibleContext associated with this ImageIcon.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the description of the image.
    def getDescription(): String = ???

    @stub
    // Gets the height of the icon.
    def getIconHeight(): Int = ???

    @stub
    // Gets the width of the icon.
    def getIconWidth(): Int = ???

    @stub
    // Returns this icon's Image.
    def getImage(): Image = ???

    @stub
    // Returns the status of the image loading operation.
    def getImageLoadStatus(): Int = ???

    @stub
    // Returns the image observer for the image.
    def getImageObserver(): ImageObserver = ???

    @stub
    // Loads the image, returning only when the image is loaded.
    protected def loadImage(image: Image): Unit = ???

    @stub
    // Paints the icon.
    def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???

    @stub
    // Sets the description of the image.
    def setDescription(description: String): Unit = ???

    @stub
    // Sets the image displayed by this icon.
    def setImage(image: Image): Unit = ???

    @stub
    // Sets the image observer for the image.
    def setImageObserver(observer: ImageObserver): Unit = ???
}

object ImageIcon {
    @stub
    // Deprecated. 
    //since 1.8
    //
    protected def component: Component = ???
}
