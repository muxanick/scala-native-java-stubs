package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The GraphicsDevice class describes the graphics devices
 *  that might be available in a particular graphics environment.  These
 *  include screen and printer devices. Note that there can be many screens
 *  and many printers in an instance of GraphicsEnvironment. Each
 *  graphics device has one or more GraphicsConfiguration objects
 *  associated with it.  These objects specify the different configurations
 *  in which the GraphicsDevice can be used.
 *  
 *  In a multi-screen environment, the GraphicsConfiguration
 *  objects can be used to render components on multiple screens.  The
 *  following code sample demonstrates how to create a JFrame
 *  object for each GraphicsConfiguration on each screen
 *  device in the GraphicsEnvironment:
 *  
 *    GraphicsEnvironment ge = GraphicsEnvironment.
 *    getLocalGraphicsEnvironment();
 *    GraphicsDevice[] gs = ge.getScreenDevices();
 *    for (int j = 0; j < gs.length; j++) {
 *       GraphicsDevice gd = gs[j];
 *       GraphicsConfiguration[] gc =
 *       gd.getConfigurations();
 *       for (int i=0; i < gc.length; i++) {
 *          JFrame f = new
 *          JFrame(gs[j].getDefaultConfiguration());
 *          Canvas c = new Canvas(gc[i]);
 *          Rectangle gcBounds = gc[i].getBounds();
 *          int xoffs = gcBounds.x;
 *          int yoffs = gcBounds.y;
 *          f.getContentPane().add(c);
 *          f.setLocation((i*50)+xoffs, (i*60)+yoffs);
 *          f.show();
 *       }
 *    }
 *  
 *  
 *  For more information on full-screen exclusive mode API, see the
 *  
 *  Full-Screen Exclusive Mode API Tutorial.
 */
abstract class GraphicsDevice extends Object {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** This method returns the number of bytes available in
     *  accelerated memory on this device.
     */
    def getAvailableAcceleratedMemory(): Int

    /** Returns the "best" configuration possible that passes the
     *  criteria defined in the GraphicsConfigTemplate.
     */
    def getBestConfiguration(gct: GraphicsConfigTemplate): GraphicsConfiguration

    /** Returns all of the GraphicsConfiguration
     *  objects associated with this GraphicsDevice.
     */
    def getConfigurations(): Array[GraphicsConfiguration]

    /** Returns the default GraphicsConfiguration
     *  associated with this GraphicsDevice.
     */
    def getDefaultConfiguration(): GraphicsConfiguration

    /** Returns the current display mode of this
     *  GraphicsDevice.
     */
    def getDisplayMode(): DisplayMode

    /** Returns all display modes available for this
     *  GraphicsDevice.
     */
    def getDisplayModes(): Array[DisplayMode]

    /** Returns the Window object representing the
     *  full-screen window if the device is in full-screen mode.
     */
    def getFullScreenWindow(): Window

    /** Returns the identification string associated with this
     *  GraphicsDevice.
     */
    def getIDstring(): String

    /** Returns the type of this GraphicsDevice. */
    def getType(): Int

    /** Returns true if this GraphicsDevice
     *  supports low-level display changes.
     */
    def isDisplayChangeSupported(): Boolean

    /** Returns true if this GraphicsDevice
     *  supports full-screen exclusive mode.
     */
    def isFullScreenSupported(): Boolean

    /** Returns whether the given level of translucency is supported by
     *  this graphics device.
     */
    def isWindowTranslucencySupported(translucencyKind: GraphicsDevice.WindowTranslucency): Boolean

    /** Sets the display mode of this graphics device. */
    def setDisplayMode(dm: DisplayMode): Unit

    /** Enter full-screen mode, or return to windowed mode. */
    def setFullScreenWindow(w: Window): Unit
}

object GraphicsDevice {
    /** Kinds of translucency supported by the underlying system. */
    class WindowTranslucency private (name: String, ordinal: Int) extends Enum[WindowTranslucency](name, ordinal) {
    }

    object WindowTranslucency {
        /** Represents support in the underlying system for windows that
         *  contain or might contain pixels with arbitrary alpha values
         *  between and including 0.0 and 1.0.
         */
        final val PERPIXEL_TRANSLUCENT: WindowTranslucency = new WindowTranslucency("PERPIXEL_TRANSLUCENT", 0)

        /** Represents support in the underlying system for windows each pixel
         *  of which is guaranteed to be either completely opaque, with
         *  an alpha value of 1.0, or completely transparent, with an alpha
         *  value of 0.0.
         */
        final val PERPIXEL_TRANSPARENT: WindowTranslucency = new WindowTranslucency("PERPIXEL_TRANSPARENT", 1)

        /** Represents support in the underlying system for windows all of
         *  the pixels of which have the same alpha value between or including
         *  0.0 and 1.0.
         */
        final val TRANSLUCENT: WindowTranslucency = new WindowTranslucency("TRANSLUCENT", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): WindowTranslucency = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[WindowTranslucency] = ???
    }


    /** Device is an image buffer. */
    @stub
    val TYPE_IMAGE_BUFFER: Int = ???

    /** Device is a printer. */
    @stub
    val TYPE_PRINTER: Int = ???

    /** Device is a raster screen. */
    @stub
    val TYPE_RASTER_SCREEN: Int = ???
}
