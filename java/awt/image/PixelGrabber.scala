package java.awt.image

import java.awt.Image
import java.lang.Object
import java.util.Hashtable

/** The PixelGrabber class implements an ImageConsumer which can be attached
 *  to an Image or ImageProducer object to retrieve a subset of the pixels
 *  in that image.  Here is an example:
 *  
 * 
 *  public void handlesinglepixel(int x, int y, int pixel) {
 *       int alpha = (pixel >> 24) & 0xff;
 *       int red   = (pixel >> 16) & 0xff;
 *       int green = (pixel >>  8) & 0xff;
 *       int blue  = (pixel      ) & 0xff;
 *       // Deal with the pixel as necessary...
 *  }
 * 
 *  public void handlepixels(Image img, int x, int y, int w, int h) {
 *       int[] pixels = new int[w * h];
 *       PixelGrabber pg = new PixelGrabber(img, x, y, w, h, pixels, 0, w);
 *       try {
 *           pg.grabPixels();
 *       } catch (InterruptedException e) {
 *           System.err.println("interrupted waiting for pixels!");
 *           return;
 *       }
 *       if ((pg.getStatus() & ImageObserver.ABORT) != 0) {
 *           System.err.println("image fetch aborted or errored");
 *           return;
 *       }
 *       for (int j = 0; j < h; j++) {
 *           for (int i = 0; i < w; i++) {
 *               handlesinglepixel(x+i, y+j, pixels[j * w + i]);
 *           }
 *       }
 *  }
 * 
 *  
 */
class PixelGrabber extends Object with ImageConsumer {

    /** Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     *  section of pixels from the specified image.
     */
    @stub
    def this(img: Image, x: Int, y: Int, w: Int, h: Int, forceRGB: Boolean) = ???

    /** Create a PixelGrabber object to grab the (x, y, w, h) rectangular
     *  section of pixels from the specified image into the given array.
     */
    @stub
    def this(img: Image, x: Int, y: Int, w: Int, h: Int, pix: Array[Int], off: Int, scansize: Int) = ???

    /** Request the PixelGrabber to abort the image fetch. */
    @stub
    def abortGrabbing(): Unit = ???

    /** Get the ColorModel for the pixels stored in the array. */
    @stub
    def getColorModel(): ColorModel = ???

    /** Get the height of the pixel buffer (after adjusting for image height). */
    @stub
    def getHeight(): Int = ???

    /** Get the pixel buffer. */
    @stub
    def getPixels(): Object = ???

    /** Return the status of the pixels. */
    @stub
    def getStatus(): Int = ???

    /** Get the width of the pixel buffer (after adjusting for image width). */
    @stub
    def getWidth(): Int = ???

    /** Request the Image or ImageProducer to start delivering pixels and
     *  wait for all of the pixels in the rectangle of interest to be
     *  delivered.
     */
    @stub
    def grabPixels(): Boolean = ???

    /** Request the Image or ImageProducer to start delivering pixels and
     *  wait for all of the pixels in the rectangle of interest to be
     *  delivered or until the specified timeout has elapsed.
     */
    @stub
    def grabPixels(ms: Long): Boolean = ???

    /** The imageComplete method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def imageComplete(status: Int): Unit = ???

    /** The setColorModel method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setColorModel(model: ColorModel): Unit = ???

    /** The setDimensions method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setDimensions(width: Int, height: Int): Unit = ???

    /** The setHints method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setHints(hints: Int): Unit = ???

    /** The setPixels method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setPixels(srcX: Int, srcY: Int, srcW: Int, srcH: Int, model: ColorModel, pixels: Array[Byte], srcOff: Int, srcScan: Int): Unit = ???

    /** The setPixels method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setPixels(srcX: Int, srcY: Int, srcW: Int, srcH: Int, model: ColorModel, pixels: Array[Int], srcOff: Int, srcScan: Int): Unit = ???

    /** The setProperties method is part of the ImageConsumer API which
     *  this class must implement to retrieve the pixels.
     */
    @stub
    def setProperties(props: Hashtable[_, _]): Unit = ???

    /** Request the PixelGrabber to start fetching the pixels. */
    @stub
    def startGrabbing(): Unit = ???
}
