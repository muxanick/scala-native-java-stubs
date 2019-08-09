package java.awt.image

import java.lang.Object
import java.util.Hashtable

// This class is an implementation of the ImageProducer interface which
// uses an array to produce pixel values for an Image.  Here is an example
// which calculates a 100x100 image representing a fade from black to blue
// along the X axis and a fade from black to red along the Y axis:
// 
//
//      int w = 100;
//      int h = 100;
//      int pix[] = new int[w * h];
//      int index = 0;
//      for (int y = 0; y < h; y++) {
//          int red = (y * 255) / (h - 1);
//          for (int x = 0; x < w; x++) {
//              int blue = (x * 255) / (w - 1);
//              pix[index++] = (255 << 24) | (red << 16) | blue;
//          }
//      }
//      Image img = createImage(new MemoryImageSource(w, h, pix, 0, w));
//
// 
// The MemoryImageSource is also capable of managing a memory image which
// varies over time to allow animation or custom rendering.  Here is an
// example showing how to set up the animation source and signal changes
// in the data (adapted from the MemoryAnimationSourceDemo by Garth Dickie):
// 
//
//      int pixels[];
//      MemoryImageSource source;
//
//      public void init() {
//          int width = 50;
//          int height = 50;
//          int size = width * height;
//          pixels = new int[size];
//
//          int value = getBackground().getRGB();
//          for (int i = 0; i < size; i++) {
//              pixels[i] = value;
//          }
//
//          source = new MemoryImageSource(width, height, pixels, 0, width);
//          source.setAnimated(true);
//          image = createImage(source);
//      }
//
//      public void run() {
//          Thread me = Thread.currentThread( );
//          me.setPriority(Thread.MIN_PRIORITY);
//
//          while (true) {
//              try {
//                  Thread.sleep(10);
//              } catch( InterruptedException e ) {
//                  return;
//              }
//
//              // Modify the values in the pixels array at (x, y, w, h)
//
//              // Send the new data to the interested ImageConsumers
//              source.newPixels(x, y, w, h);
//          }
//      }
//
// 
class MemoryImageSource extends Object with ImageProducer {

    @stub
    // Constructs an ImageProducer object which uses an array of bytes
    // to produce data for an Image object.
    def this(w: Int, h: Int, cm: ColorModel, pix: Array[Byte], off: Int, scan: Int) = ???

    @stub
    // Constructs an ImageProducer object which uses an array of bytes
    // to produce data for an Image object.
    def this(w: Int, h: Int, cm: ColorModel, pix: Array[Byte], off: Int, scan: Int, props: Hashtable[_, _]) = ???

    @stub
    // Constructs an ImageProducer object which uses an array of integers
    // to produce data for an Image object.
    def this(w: Int, h: Int, cm: ColorModel, pix: Array[Int], off: Int, scan: Int) = ???

    @stub
    // Constructs an ImageProducer object which uses an array of integers
    // to produce data for an Image object.
    def this(w: Int, h: Int, cm: ColorModel, pix: Array[Int], off: Int, scan: Int, props: Hashtable[_, _]) = ???

    @stub
    // Constructs an ImageProducer object which uses an array of integers
    // in the default RGB ColorModel to produce data for an Image object.
    def this(w: Int, h: Int, pix: Array[Int], off: Int, scan: Int) = ???

    @stub
    // Adds an ImageConsumer to the list of consumers interested in
    // data for this image.
    def addConsumer(ic: ImageConsumer): Unit = ???

    @stub
    // Determines if an ImageConsumer is on the list of consumers currently
    // interested in data for this image.
    def isConsumer(ic: ImageConsumer): Boolean = ???

    @stub
    // Sends a whole new buffer of pixels to any ImageConsumers that
    // are currently interested in the data for this image and notify
    // them that an animation frame is complete.
    def newPixels(): Unit = ???

    @stub
    // Changes to a new byte array to hold the pixels for this image.
    def newPixels(newpix: Array[Byte], newmodel: ColorModel, offset: Int, scansize: Int): Unit = ???

    @stub
    // Changes to a new int array to hold the pixels for this image.
    def newPixels(newpix: Array[Int], newmodel: ColorModel, offset: Int, scansize: Int): Unit = ???

    @stub
    // Sends a rectangular region of the buffer of pixels to any
    // ImageConsumers that are currently interested in the data for
    // this image and notify them that an animation frame is complete.
    def newPixels(x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // Sends a rectangular region of the buffer of pixels to any
    // ImageConsumers that are currently interested in the data for
    // this image.
    def newPixels(x: Int, y: Int, w: Int, h: Int, framenotify: Boolean): Unit = ???

    @stub
    // Removes an ImageConsumer from the list of consumers interested in
    // data for this image.
    def removeConsumer(ic: ImageConsumer): Unit = ???

    @stub
    // Requests that a given ImageConsumer have the image data delivered
    // one more time in top-down, left-right order.
    def requestTopDownLeftRightResend(ic: ImageConsumer): Unit = ???

    @stub
    // Changes this memory image into a multi-frame animation or a
    // single-frame static image depending on the animated parameter.
    def setAnimated(animated: Boolean): Unit = ???

    @stub
    // Specifies whether this animated memory image should always be
    // updated by sending the complete buffer of pixels whenever
    // there is a change.
    def setFullBufferUpdates(fullbuffers: Boolean): Unit = ???
}
