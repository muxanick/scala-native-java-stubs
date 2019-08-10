package javax.swing

import java.awt.{Component, Graphics, Image, MediaTracker}
import java.awt.image.ImageObserver
import java.io.Serializable
import java.lang.{Object, String}
import java.net.URL
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** An implementation of the Icon interface that paints Icons
 *  from Images. Images that are created from a URL, filename or byte array
 *  are preloaded using MediaTracker to monitor the loaded state
 *  of the image.
 * 
 *  
 *  For further information and examples of using image icons, see
 *  How to Use Icons
 *  in The Java Tutorial.
 * 
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
class ImageIcon extends Object with Icon with Serializable with Accessible {

    /** Creates an uninitialized image icon. */
    @stub
    def this() = ???

    /** Creates an ImageIcon from an array of bytes which were
     *  read from an image file containing a supported image format,
     *  such as GIF, JPEG, or (as of 1.3) PNG.
     */
    @stub
    def this(imageData: Array[Byte]) = ???

    /** Creates an ImageIcon from an array of bytes which were
     *  read from an image file containing a supported image format,
     *  such as GIF, JPEG, or (as of 1.3) PNG.
     */
    @stub
    def this(imageData: Array[Byte], description: String) = ???

    /** Creates an ImageIcon from an image object. */
    @stub
    def this(image: Image) = ???

    /** Creates an ImageIcon from the image. */
    @stub
    def this(image: Image, description: String) = ???

    /** Creates an ImageIcon from the specified file. */
    @stub
    def this(filename: String) = ???

    /** Creates an ImageIcon from the specified file. */
    @stub
    def this(filename: String, description: String) = ???

    /** Creates an ImageIcon from the specified URL. */
    @stub
    def this(location: URL) = ???

    /** Creates an ImageIcon from the specified URL. */
    @stub
    def this(location: URL, description: String) = ???

    /** This class implements accessibility support for the
     *  ImageIcon class.
     */
    protected type AccessibleImageIcon = ImageIcon_AccessibleImageIcon

    /** Gets the AccessibleContext associated with this ImageIcon. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the description of the image. */
    @stub
    def getDescription(): String = ???

    /** Gets the height of the icon. */
    @stub
    def getIconHeight(): Int = ???

    /** Gets the width of the icon. */
    @stub
    def getIconWidth(): Int = ???

    /** Returns this icon's Image. */
    @stub
    def getImage(): Image = ???

    /** Returns the status of the image loading operation. */
    @stub
    def getImageLoadStatus(): Int = ???

    /** Returns the image observer for the image. */
    @stub
    def getImageObserver(): ImageObserver = ???

    /** Loads the image, returning only when the image is loaded. */
    @stub
    protected def loadImage(image: Image): Unit = ???

    /** Paints the icon. */
    @stub
    def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???

    /** Sets the description of the image. */
    @stub
    def setDescription(description: String): Unit = ???

    /** Sets the image displayed by this icon. */
    @stub
    def setImage(image: Image): Unit = ???

    /** Sets the image observer for the image. */
    @stub
    def setImageObserver(observer: ImageObserver): Unit = ???

    /** Returns a string representation of this image. */
    @stub
    def toString(): String = ???
}

object ImageIcon {
    /** Deprecated. 
     * since 1.8
     * 
     */
    @stub
    protected val component: Component = ???

    /** Deprecated. 
     * since 1.8
     * 
     */
    @stub
    protected val tracker: MediaTracker = ???
}
