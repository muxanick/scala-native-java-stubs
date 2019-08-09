package java.awt.image

import java.awt.{BufferCapabilities, Graphics}
import java.lang.Object
import scala.scalanative.annotation.stub

/** The BufferStrategy class represents the mechanism with which
 *  to organize complex memory on a particular Canvas or
 *  Window.  Hardware and software limitations determine whether and
 *  how a particular buffer strategy can be implemented.  These limitations
 *  are detectable through the capabilities of the
 *  GraphicsConfiguration used when creating the
 *  Canvas or Window.
 *  
 *  It is worth noting that the terms buffer and surface are meant
 *  to be synonymous: an area of contiguous memory, either in video device
 *  memory or in system memory.
 *  
 *  There are several types of complex buffer strategies, including
 *  sequential ring buffering and blit buffering.
 *  Sequential ring buffering (i.e., double or triple
 *  buffering) is the most common; an application draws to a single back
 *  buffer and then moves the contents to the front (display) in a single
 *  step, either by copying the data or moving the video pointer.
 *  Moving the video pointer exchanges the buffers so that the first buffer
 *  drawn becomes the front buffer, or what is currently displayed on the
 *  device; this is called page flipping.
 *  
 *  Alternatively, the contents of the back buffer can be copied, or
 *  blitted forward in a chain instead of moving the video pointer.
 *  
 *  Double buffering:
 * 
 *                     ***********         ***********
 *                     *         * ------> *         *
 *  [To display] <---- * Front B *   Show  * Back B. * <---- Rendering
 *                     *         * <------ *         *
 *                     ***********         ***********
 * 
 *  Triple buffering:
 * 
 *  [To      ***********         ***********        ***********
 *  display] *         * --------+---------+------> *         *
 *     <---- * Front B *   Show  * Mid. B. *        * Back B. * <---- Rendering
 *           *         * <------ *         * <----- *         *
 *           ***********         ***********        ***********
 * 
 *  
 *  
 *  Here is an example of how buffer strategies can be created and used:
 *  
 * 
 *  // Check the capabilities of the GraphicsConfiguration
 *  ...
 * 
 *  // Create our component
 *  Window w = new Window(gc);
 * 
 *  // Show our window
 *  w.setVisible(true);
 * 
 *  // Create a general double-buffering strategy
 *  w.createBufferStrategy(2);
 *  BufferStrategy strategy = w.getBufferStrategy();
 * 
 *  // Main loop
 *  while (!done) {
 *      // Prepare for rendering the next frame
 *      // ...
 * 
 *      // Render single frame
 *      do {
 *          // The following loop ensures that the contents of the drawing buffer
 *          // are consistent in case the underlying surface was recreated
 *          do {
 *              // Get a new graphics context every time through the loop
 *              // to make sure the strategy is validated
 *              Graphics graphics = strategy.getDrawGraphics();
 * 
 *              // Render to graphics
 *              // ...
 * 
 *              // Dispose the graphics
 *              graphics.dispose();
 * 
 *              // Repeat the rendering if the drawing buffer contents
 *              // were restored
 *          } while (strategy.contentsRestored());
 * 
 *          // Display the buffer
 *          strategy.show();
 * 
 *          // Repeat the rendering if the drawing buffer was lost
 *      } while (strategy.contentsLost());
 *  }
 * 
 *  // Dispose the window
 *  w.setVisible(false);
 *  w.dispose();
 *  
 */
abstract class BufferStrategy extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns whether the drawing buffer was lost since the last call to
     *  getDrawGraphics.
     */
    def contentsLost(): Boolean

    /** Returns whether the drawing buffer was recently restored from a lost
     *  state and reinitialized to the default background color (white).
     */
    def contentsRestored(): Boolean

    /** Releases system resources currently consumed by this
     *  BufferStrategy and
     *  removes it from the associated Component.
     */
    def dispose(): Unit

    /** Returns the BufferCapabilities for this
     *  BufferStrategy.
     */
    def getCapabilities(): BufferCapabilities

    /** Creates a graphics context for the drawing buffer. */
    def getDrawGraphics(): Graphics

    /** Makes the next available buffer visible by either copying the memory
     *  (blitting) or changing the display pointer (flipping).
     */
    def show(): Unit
}
