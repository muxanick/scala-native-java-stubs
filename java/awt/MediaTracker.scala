package java.awt

import java.io.Serializable
import java.lang.Object

// The MediaTracker class is a utility class to track
// the status of a number of media objects. Media objects could
// include audio clips as well as images, though currently only
// images are supported.
// 
// To use a media tracker, create an instance of
// MediaTracker and call its addImage
// method for each image to be tracked. In addition, each image can
// be assigned a unique identifier. This identifier controls the
// priority order in which the images are fetched. It can also be used
// to identify unique subsets of the images that can be waited on
// independently. Images with a lower ID are loaded in preference to
// those with a higher ID number.
//
// 
//
// Tracking an animated image
// might not always be useful
// due to the multi-part nature of animated image
// loading and painting,
// but it is supported.
// MediaTracker treats an animated image
// as completely loaded
// when the first frame is completely loaded.
// At that point, the MediaTracker
// signals any waiters
// that the image is completely loaded.
// If no ImageObservers are observing the image
// when the first frame has finished loading,
// the image might flush itself
// to conserve resources
// (see Image.flush()).
//
// 
// Here is an example of using MediaTracker:
// 
// 
// import java.applet.Applet;
// import java.awt.Color;
// import java.awt.Image;
// import java.awt.Graphics;
// import java.awt.MediaTracker;
//
// public class ImageBlaster extends Applet implements Runnable {
//      MediaTracker tracker;
//      Image bg;
//      Image anim[] = new Image[5];
//      int index;
//      Thread animator;
//
//      // Get the images for the background (id == 0)
//      // and the animation frames (id == 1)
//      // and add them to the MediaTracker
//      public void init() {
//          tracker = new MediaTracker(this);
//          bg = getImage(getDocumentBase(),
//                  "images/background.gif");
//          tracker.addImage(bg, 0);
//          for (int i = 0; i < 5; i++) {
//              anim[i] = getImage(getDocumentBase(),
//                      "images/anim"+i+".gif");
//              tracker.addImage(anim[i], 1);
//          }
//      }
//
//      // Start the animation thread.
//      public void start() {
//          animator = new Thread(this);
//          animator.start();
//      }
//
//      // Stop the animation thread.
//      public void stop() {
//          animator = null;
//      }
//
//      // Run the animation thread.
//      // First wait for the background image to fully load
//      // and paint.  Then wait for all of the animation
//      // frames to finish loading. Finally, loop and
//      // increment the animation frame index.
//      public void run() {
//          try {
//              tracker.waitForID(0);
//              tracker.waitForID(1);
//          } catch (InterruptedException e) {
//              return;
//          }
//          Thread me = Thread.currentThread();
//          while (animator == me) {
//              try {
//                  Thread.sleep(100);
//              } catch (InterruptedException e) {
//                  break;
//              }
//              synchronized (this) {
//                  index++;
//                  if (index >= anim.length) {
//                      index = 0;
//                  }
//              }
//              repaint();
//          }
//      }
//
//      // The background image fills the frame so we
//      // don't need to clear the applet on repaints.
//      // Just call the paint method.
//      public void update(Graphics g) {
//          paint(g);
//      }
//
//      // Paint a large red rectangle if there are any errors
//      // loading the images.  Otherwise always paint the
//      // background so that it appears incrementally as it
//      // is loading.  Finally, only paint the current animation
//      // frame if all of the frames (id == 1) are done loading,
//      // so that we don't get partial animations.
//      public void paint(Graphics g) {
//          if ((tracker.statusAll(false) & MediaTracker.ERRORED) != 0) {
//              g.setColor(Color.red);
//              g.fillRect(0, 0, size().width, size().height);
//              return;
//          }
//          g.drawImage(bg, 0, 0, this);
//          if (tracker.statusID(1, false) == MediaTracker.COMPLETE) {
//              g.drawImage(anim[index], 10, 10, this);
//          }
//      }
// }
//  
class MediaTracker extends Object with Serializable {

    @stub
    // Adds an image to the list of images being tracked by this media
    // tracker.
    def addImage(image: Image, id: Int): Unit = ???

    @stub
    // Adds a scaled image to the list of images being tracked
    // by this media tracker.
    def addImage(image: Image, id: Int, w: Int, h: Int): Unit = ???

    @stub
    // Checks to see if all images being tracked by this media tracker
    // have finished loading.
    def checkAll(): Boolean = ???

    @stub
    // Checks to see if all images being tracked by this media tracker
    // have finished loading.
    def checkAll(load: Boolean): Boolean = ???

    @stub
    // Checks to see if all images tracked by this media tracker that
    // are tagged with the specified identifier have finished loading.
    def checkID(id: Int): Boolean = ???

    @stub
    // Checks to see if all images tracked by this media tracker that
    // are tagged with the specified identifier have finished loading.
    def checkID(id: Int, load: Boolean): Boolean = ???

    @stub
    // Returns a list of all media that have encountered an error.
    def getErrorsAny(): Array[Object] = ???

    @stub
    // Returns a list of media with the specified ID that
    // have encountered an error.
    def getErrorsID(id: Int): Array[Object] = ???

    @stub
    // Checks the error status of all of the images.
    def isErrorAny(): Boolean = ???

    @stub
    // Checks the error status of all of the images tracked by this
    // media tracker with the specified identifier.
    def isErrorID(id: Int): Boolean = ???

    @stub
    // Removes the specified image from this media tracker.
    def removeImage(image: Image): Unit = ???

    @stub
    // Removes the specified image from the specified tracking
    // ID of this media tracker.
    def removeImage(image: Image, id: Int): Unit = ???

    @stub
    // Removes the specified image with the specified
    // width, height, and ID from this media tracker.
    def removeImage(image: Image, id: Int, width: Int, height: Int): Unit = ???

    @stub
    // Calculates and returns the bitwise inclusive OR of the
    // status of all media that are tracked by this media tracker.
    def statusAll(load: Boolean): Int = ???

    @stub
    // Calculates and returns the bitwise inclusive OR of the
    // status of all media with the specified identifier that are
    // tracked by this media tracker.
    def statusID(id: Int, load: Boolean): Int = ???

    @stub
    // Starts loading all images tracked by this media tracker.
    def waitForAll(): Unit = ???

    @stub
    // Starts loading all images tracked by this media tracker.
    def waitForAll(ms: Long): Boolean = ???

    @stub
    // Starts loading all images tracked by this media tracker with the
    // specified identifier.
    def waitForID(id: Int): Unit = ???
}

object MediaTracker {
    @stub
    // Flag indicating that the downloading of media was aborted.
    def ABORTED: Int = ???

    @stub
    // Flag indicating that the downloading of media was completed
    // successfully.
    def COMPLETE: Int = ???

    @stub
    // Flag indicating that the downloading of media encountered
    // an error.
    def ERRORED: Int = ???
}
