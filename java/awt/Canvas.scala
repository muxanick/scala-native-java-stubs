package java.awt

import java.awt.image.BufferStrategy
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A Canvas component represents a blank rectangular
 *  area of the screen onto which the application can draw or from
 *  which the application can trap input events from the user.
 *  
 *  An application must subclass the Canvas class in
 *  order to get useful functionality such as creating a custom
 *  component. The paint method must be overridden
 *  in order to perform custom graphics on the canvas.
 */
class Canvas extends Component with Accessible {

    /** Constructs a new Canvas. */
    @stub
    def this() = ???

    /** Constructs a new Canvas given a GraphicsConfiguration object. */
    @stub
    def this(config: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  Canvas class.
     */
    @stub
    protected object AccessibleAWTCanvas extends Canvas.AccessibleAWTCanvas

    /** Creates the peer of the canvas. */
    @stub
    def addNotify(): Unit = ???

    /** Creates a new strategy for multi-buffering on this component. */
    @stub
    def createBufferStrategy(numBuffers: Int): Unit = ???

    /** Creates a new strategy for multi-buffering on this component with the
     *  required buffer capabilities.
     */
    @stub
    def createBufferStrategy(numBuffers: Int, caps: BufferCapabilities): Unit = ???

    /** Gets the AccessibleContext associated with this Canvas. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the BufferStrategy used by this component. */
    @stub
    def getBufferStrategy(): BufferStrategy = ???

    /** Paints this canvas. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Updates this canvas. */
    @stub
    def update(g: Graphics): Unit = ???
}
