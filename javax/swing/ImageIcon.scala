package javax.swing

import java.awt.{Component, Graphics, Image, MediaTracker}
import java.awt.image.ImageObserver
import java.io.Serializable
import java.lang.{Object, String}
import java.net.URL
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleContext, AccessibleIcon, AccessibleRole, AccessibleStateSet}
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
     *  ImageIcon class.  It provides an implementation of the
     *  Java Accessibility API appropriate to image icon user-interface
     *  elements.
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
    protected class AccessibleImageIcon extends AccessibleContext with AccessibleIcon with Serializable {

        /**  */
        @stub
        protected def this() = ???

        /** Returns the nth Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children in the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Gets the description of the icon. */
        @stub
        def getAccessibleIconDescription(): String = ???

        /** Gets the height of the icon. */
        @stub
        def getAccessibleIconHeight(): Int = ???

        /** Gets the width of the icon. */
        @stub
        def getAccessibleIconWidth(): Int = ???

        /** Gets the index of this object in its accessible parent. */
        @stub
        def getAccessibleIndexInParent(): Int = ???

        /** Gets the Accessible parent of this object. */
        @stub
        def getAccessibleParent(): Accessible = ???

        /** Gets the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Gets the state of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Returns the locale of this object. */
        @stub
        def getLocale(): Locale = ???

        /** Sets the description of the icon. */
        @stub
        def setAccessibleIconDescription(description: String): Unit = ???
    }


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
