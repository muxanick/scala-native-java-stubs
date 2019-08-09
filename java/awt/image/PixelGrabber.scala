package java.awt.image

import java.awt.Image
import java.lang.Object
import java.util.Hashtable

// The PixelGrabber class implements an ImageConsumer which can be attached
// to an Image or ImageProducer object to retrieve a subset of the pixels
// in that image.  Here is an example:
// 
//
// public void handlesinglepixel(int x, int y, int pixel) {
//      int alpha = (pixel >> 24) & 0xff;
//      int red   = (pixel >> 16) & 0xff;
//      int green = (pixel >>  8) & 0xff;
//      int blue  = (pixel      ) & 0xff;
//      // Deal with the pixel as necessary...
// }
//
// public void handlepixels(Image img, int x, int y, int w, int h) {
//      int[] pixels = new int[w * h];
//      PixelGrabber pg = new PixelGrabber(img, x, y, w, h, pixels, 0, w);
//      try {
//          pg.grabPixels();
//      } catch (InterruptedException e) {
//          System.err.println("interrupted waiting for pixels!");
//          return;
//      }
//      if ((pg.getStatus() & ImageObserver.ABORT) != 0) {
//          System.err.println("image fetch aborted or errored");
//          return;
//      }
//      for (int j = 0; j < h; j++) {
//          for (int i = 0; i < w; i++) {
//              handlesinglepixel(x+i, y+j, pixels[j * w + i]);
//          }
//      }
// }
//
// 
class PixelGrabber extends Object with ImageConsumer {

    @stub
    // Create a PixelGrabber object to grab the (x, y, w, h) rectangular
    // section of pixels from the specified image.
    def this(img: Image, x: Int, y: Int, w: Int, h: Int, forceRGB: Boolean) = ???

    @stub
    // Create a PixelGrabber object to grab the (x, y, w, h) rectangular
    // section of pixels from the specified image into the given array.
    def this(img: Image, x: Int, y: Int, w: Int, h: Int, pix: Array[Int], off: Int, scansize: Int) = ???

    @stub
    // Request the PixelGrabber to abort the image fetch.
    def abortGrabbing(): Unit = ???

    @stub
    // Get the ColorModel for the pixels stored in the array.
    def getColorModel(): ColorModel = ???

    @stub
    // Get the height of the pixel buffer (after adjusting for image height).
    def getHeight(): Int = ???

    @stub
    // Get the pixel buffer.
    def getPixels(): Object = ???

    @stub
    // Return the status of the pixels.
    def getStatus(): Int = ???

    @stub
    // Get the width of the pixel buffer (after adjusting for image width).
    def getWidth(): Int = ???

    @stub
    // Request the Image or ImageProducer to start delivering pixels and
    // wait for all of the pixels in the rectangle of interest to be
    // delivered.
    def grabPixels(): Boolean = ???

    @stub
    // Request the Image or ImageProducer to start delivering pixels and
    // wait for all of the pixels in the rectangle of interest to be
    // delivered or until the specified timeout has elapsed.
    def grabPixels(ms: Long): Boolean = ???

    @stub
    // The imageComplete method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def imageComplete(status: Int): Unit = ???

    @stub
    // The setColorModel method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setColorModel(model: ColorModel): Unit = ???

    @stub
    // The setDimensions method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setDimensions(width: Int, height: Int): Unit = ???

    @stub
    // The setHints method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setHints(hints: Int): Unit = ???

    @stub
    // The setPixels method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setPixels(srcX: Int, srcY: Int, srcW: Int, srcH: Int, model: ColorModel, pixels: Array[Byte], srcOff: Int, srcScan: Int): Unit = ???

    @stub
    // The setPixels method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setPixels(srcX: Int, srcY: Int, srcW: Int, srcH: Int, model: ColorModel, pixels: Array[Int], srcOff: Int, srcScan: Int): Unit = ???

    @stub
    // The setProperties method is part of the ImageConsumer API which
    // this class must implement to retrieve the pixels.
    def setProperties(props: Hashtable[_, _]): Unit = ???

    @stub
    // Request the PixelGrabber to start fetching the pixels.
    def startGrabbing(): Unit = ???
}
