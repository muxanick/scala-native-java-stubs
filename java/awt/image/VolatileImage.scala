package java.awt.image

import java.awt.{Graphics, Graphics2D, Image, ImageCapabilities, Transparency}
import java.lang.Object

// VolatileImage is an image which can lose its
// contents at any time due to circumstances beyond the control of the
// application (e.g., situations caused by the operating system or by
// other applications). Because of the potential for hardware acceleration,
// a VolatileImage object can have significant performance benefits on
// some platforms.
// 
// The drawing surface of an image (the memory where the image contents
// actually reside) can be lost or invalidated, causing the contents of that
// memory to go away.  The drawing surface thus needs to be restored
// or recreated and the contents of that surface need to be
// re-rendered.  VolatileImage provides an interface for
// allowing the user to detect these problems and fix them
// when they occur.
// 
// When a VolatileImage object is created, limited system resources
// such as video memory (VRAM) may be allocated in order to support
// the image.
// When a VolatileImage object is no longer used, it may be
// garbage-collected and those system resources will be returned,
// but this process does not happen at guaranteed times.
// Applications that create many VolatileImage objects (for example,
// a resizing window may force recreation of its back buffer as the
// size changes) may run out of optimal system resources for new
// VolatileImage objects simply because the old objects have not
// yet been removed from the system.
// (New VolatileImage objects may still be created, but they
// may not perform as well as those created in accelerated
// memory).
// The flush method may be called at any time to proactively release
// the resources used by a VolatileImage so that it does not prevent
// subsequent VolatileImage objects from being accelerated.
// In this way, applications can have more control over the state
// of the resources taken up by obsolete VolatileImage objects.
// 
// This image should not be subclassed directly but should be created
// by using the Component.createVolatileImage or
// GraphicsConfiguration.createCompatibleVolatileImage(int, int) methods.
// 
// An example of using a VolatileImage object follows:
// 
// // image creation
// VolatileImage vImg = createVolatileImage(w, h);
//
//
// // rendering to the image
// void renderOffscreen() {
//      do {
//          if (vImg.validate(getGraphicsConfiguration()) ==
//              VolatileImage.IMAGE_INCOMPATIBLE)
//          {
//              // old vImg doesn't work with new GraphicsConfig; re-create it
//              vImg = createVolatileImage(w, h);
//          }
//          Graphics2D g = vImg.createGraphics();
//          //
//          // miscellaneous rendering commands...
//          //
//          g.dispose();
//      } while (vImg.contentsLost());
// }
//
//
// // copying from the image (here, gScreen is the Graphics
// // object for the onscreen window)
// do {
//      int returnCode = vImg.validate(getGraphicsConfiguration());
//      if (returnCode == VolatileImage.IMAGE_RESTORED) {
//          // Contents need to be restored
//          renderOffscreen();      // restore contents
//      } else if (returnCode == VolatileImage.IMAGE_INCOMPATIBLE) {
//          // old vImg doesn't work with new GraphicsConfig; re-create it
//          vImg = createVolatileImage(w, h);
//          renderOffscreen();
//      }
//      gScreen.drawImage(vImg, 0, 0, this);
// } while (vImg.contentsLost());
// 
// 
// Note that this class subclasses from the Image class, which
// includes methods that take an ImageObserver parameter for
// asynchronous notifications as information is received from
// a potential ImageProducer.  Since this VolatileImage
// is not loaded from an asynchronous source, the various methods that take
// an ImageObserver parameter will behave as if the data has
// already been obtained from the ImageProducer.
// Specifically, this means that the return values from such methods
// will never indicate that the information is not yet available and
// the ImageObserver used in such methods will never
// need to be recorded for an asynchronous callback notification.
abstract class VolatileImage extends Image with Transparency {

    // Returns true if rendering data was lost since last
    // validate call.
    def contentsLost(): Boolean

    // Creates a Graphics2D, which can be used to draw into
    // this VolatileImage.
    def createGraphics(): Graphics2D

    // Returns an ImageCapabilities object which can be
    // inquired as to the specific capabilities of this
    // VolatileImage.
    def getCapabilities(): ImageCapabilities

    // This method returns a Graphics2D, but is here
    // for backwards compatibility.
    def getGraphics(): Graphics

    // Returns the height of the VolatileImage.
    def getHeight(): Int

    // Returns a static snapshot image of this object.
    def getSnapshot(): BufferedImage

    // This returns an ImageProducer for this VolatileImage.
    def getSource(): ImageProducer

    // Returns the transparency.
    def getTransparency(): Int

    // Returns the width of the VolatileImage.
    def getWidth(): Int
}

object VolatileImage {
    @stub
    // Validated image is incompatible with supplied
    // GraphicsConfiguration object and should be
    // re-created as appropriate.
    def IMAGE_INCOMPATIBLE: Int = ???

    @stub
    // Validated image is ready to use as-is.
    def IMAGE_OK: Int = ???

    @stub
    // Validated image has been restored and is now ready to use.
    def IMAGE_RESTORED: Int = ???
}
