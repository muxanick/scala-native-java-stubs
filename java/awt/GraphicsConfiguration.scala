package java.awt

import java.awt.geom.AffineTransform
import java.awt.image.{BufferedImage, ColorModel, VolatileImage}
import java.lang.Object
import scala.scalanative.annotation.stub

/** The GraphicsConfiguration class describes the
 *  characteristics of a graphics destination such as a printer or monitor.
 *  There can be many GraphicsConfiguration objects associated
 *  with a single graphics device, representing different drawing modes or
 *  capabilities.  The corresponding native structure will vary from platform
 *  to platform.  For example, on X11 windowing systems,
 *  each visual is a different GraphicsConfiguration.
 *  On Microsoft Windows, GraphicsConfigurations represent
 *  PixelFormats available in the current resolution and color depth.
 *  
 *  In a virtual device multi-screen environment in which the desktop
 *  area could span multiple physical screen devices, the bounds of the
 *  GraphicsConfiguration objects are relative to the
 *  virtual coordinate system.  When setting the location of a
 *  component, use getBounds to get the bounds of
 *  the desired GraphicsConfiguration and offset the location
 *  with the coordinates of the GraphicsConfiguration,
 *  as the following code sample illustrates:
 *  
 * 
 *  
 *       Frame f = new Frame(gc);  // where gc is a GraphicsConfiguration
 *       Rectangle bounds = gc.getBounds();
 *       f.setLocation(10 + bounds.x, 10 + bounds.y); 
 * 
 *  
 *  To determine if your environment is a virtual device
 *  environment, call getBounds on all of the
 *  GraphicsConfiguration objects in your system.  If
 *  any of the origins of the returned bounds is not (0, 0),
 *  your environment is a virtual device environment.
 * 
 *  
 *  You can also use getBounds to determine the bounds
 *  of the virtual device.  To do this, first call getBounds on all
 *  of the GraphicsConfiguration objects in your
 *  system.  Then calculate the union of all of the bounds returned
 *  from the calls to getBounds.  The union is the
 *  bounds of the virtual device.  The following code sample
 *  calculates the bounds of the virtual device.
 * 
 *  
 *       Rectangle virtualBounds = new Rectangle();
 *       GraphicsEnvironment ge = GraphicsEnvironment.
 *               getLocalGraphicsEnvironment();
 *       GraphicsDevice[] gs =
 *               ge.getScreenDevices();
 *       for (int j = 0; j < gs.length; j++) {
 *           GraphicsDevice gd = gs[j];
 *           GraphicsConfiguration[] gc =
 *               gd.getConfigurations();
 *           for (int i=0; i < gc.length; i++) {
 *               virtualBounds =
 *                   virtualBounds.union(gc[i].getBounds());
 *           }
 *       } 
 */
abstract class GraphicsConfiguration extends Object {

    /** This is an abstract class that cannot be instantiated directly. */
    @stub
    protected def this() = ???

    /** Returns a BufferedImage with a data layout and color model
     *  compatible with this GraphicsConfiguration.
     */
    def createCompatibleImage(width: Int, height: Int): BufferedImage

    /** Returns a BufferedImage that supports the specified
     *  transparency and has a data layout and color model
     *  compatible with this GraphicsConfiguration.
     */
    def createCompatibleImage(width: Int, height: Int, transparency: Int): BufferedImage

    /** Returns a VolatileImage with a data layout and color model
     *  compatible with this GraphicsConfiguration.
     */
    def createCompatibleVolatileImage(width: Int, height: Int): VolatileImage

    /** Returns a VolatileImage with a data layout and color model
     *  compatible with this GraphicsConfiguration, using
     *  the specified image capabilities.
     */
    def createCompatibleVolatileImage(width: Int, height: Int, caps: ImageCapabilities): VolatileImage

    /** Returns a VolatileImage with a data layout and color model
     *  compatible with this GraphicsConfiguration, using
     *  the specified image capabilities and transparency value.
     */
    def createCompatibleVolatileImage(width: Int, height: Int, caps: ImageCapabilities, transparency: Int): VolatileImage

    /** Returns a VolatileImage with a data layout and color model
     *  compatible with this GraphicsConfiguration.
     */
    def createCompatibleVolatileImage(width: Int, height: Int, transparency: Int): VolatileImage

    /** Returns the bounds of the GraphicsConfiguration
     *  in the device coordinates.
     */
    def getBounds(): Rectangle

    /** Returns the buffering capabilities of this
     *  GraphicsConfiguration.
     */
    def getBufferCapabilities(): BufferCapabilities

    /** Returns the ColorModel associated with this
     *  GraphicsConfiguration.
     */
    def getColorModel(): ColorModel

    /** Returns the ColorModel associated with this
     *  GraphicsConfiguration that supports the specified
     *  transparency.
     */
    def getColorModel(transparency: Int): ColorModel

    /** Returns the default AffineTransform for this
     *  GraphicsConfiguration.
     */
    def getDefaultTransform(): AffineTransform

    /** Returns the GraphicsDevice associated with this
     *  GraphicsConfiguration.
     */
    def getDevice(): GraphicsDevice

    /** Returns the image capabilities of this
     *  GraphicsConfiguration.
     */
    def getImageCapabilities(): ImageCapabilities

    /** Returns a AffineTransform that can be concatenated
     *  with the default AffineTransform
     *  of a GraphicsConfiguration so that 72 units in user
     *  space equals 1 inch in device space.
     */
    def getNormalizingTransform(): AffineTransform

    /** Returns whether this GraphicsConfiguration supports
     *  the PERPIXEL_TRANSLUCENT kind of translucency.
     */
    def isTranslucencyCapable(): Boolean
}
