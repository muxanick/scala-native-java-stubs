package java.awt

import java.awt.image.BufferedImage
import java.lang.{Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** The GraphicsEnvironment class describes the collection
 *  of GraphicsDevice objects and Font objects
 *  available to a Java(tm) application on a particular platform.
 *  The resources in this GraphicsEnvironment might be local
 *  or on a remote machine.  GraphicsDevice objects can be
 *  screens, printers or image buffers and are the destination of
 *  Graphics2D drawing methods.  Each GraphicsDevice
 *  has a number of GraphicsConfiguration objects associated with
 *  it.  These objects specify the different configurations in which the
 *  GraphicsDevice can be used.
 */
abstract class GraphicsEnvironment extends Object {

    /** This is an abstract class and cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Returns a Graphics2D object for rendering into the
     *  specified BufferedImage.
     */
    def createGraphics(img: BufferedImage): Graphics2D

    /** Returns an array containing a one-point size instance of all fonts
     *  available in this GraphicsEnvironment.
     */
    def getAllFonts(): Array[Font]

    /** Returns an array containing the names of all font families in this
     *  GraphicsEnvironment localized for the default locale,
     *  as returned by Locale.getDefault().
     */
    def getAvailableFontFamilyNames(): Array[String]

    /** Returns an array containing the names of all font families in this
     *  GraphicsEnvironment localized for the specified locale.
     */
    def getAvailableFontFamilyNames(l: Locale): Array[String]

    /** Returns the Point where Windows should be centered. */
    def getCenterPoint(): Point

    /** Returns the default screen GraphicsDevice. */
    def getDefaultScreenDevice(): GraphicsDevice

    /** Returns the maximum bounds for centered Windows. */
    def getMaximumWindowBounds(): Rectangle

    /** Returns an array of all of the screen GraphicsDevice
     *  objects.
     */
    def getScreenDevices(): Array[GraphicsDevice]

    /** Returns whether or not a display, keyboard, and mouse can be
     *  supported in this graphics environment.
     */
    def isHeadlessInstance(): Boolean

    /** Indicates a preference for locale-specific fonts in the mapping of
     *  logical fonts to physical fonts.
     */
    def preferLocaleFonts(): Unit

    /** Indicates a preference for proportional over non-proportional (e.g. */
    def preferProportionalFonts(): Unit

    /** Registers a created Fontin this
     *  GraphicsEnvironment.
     */
    def registerFont(font: Font): Boolean
}

object GraphicsEnvironment {
    /** Returns the local GraphicsEnvironment. */
    @stub
    def getLocalGraphicsEnvironment(): GraphicsEnvironment = ???

    /** Tests whether or not a display, keyboard, and mouse can be
     *  supported in this environment.
     */
    @stub
    def isHeadless(): Boolean = ???
}
