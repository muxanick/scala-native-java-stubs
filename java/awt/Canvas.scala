package java.awt

import java.awt.image.BufferStrategy
import java.lang.Object
import javax.accessibility.{Accessible, AccessibleContext}

// A Canvas component represents a blank rectangular
// area of the screen onto which the application can draw or from
// which the application can trap input events from the user.
// 
// An application must subclass the Canvas class in
// order to get useful functionality such as creating a custom
// component. The paint method must be overridden
// in order to perform custom graphics on the canvas.
class Canvas extends Component with Accessible {

    @stub
    // Constructs a new Canvas.
    def this() = ???

    @stub
    // Creates the peer of the canvas.
    def addNotify(): Unit = ???

    @stub
    // Creates a new strategy for multi-buffering on this component.
    def createBufferStrategy(numBuffers: Int): Unit = ???

    @stub
    // Creates a new strategy for multi-buffering on this component with the
    // required buffer capabilities.
    def createBufferStrategy(numBuffers: Int, caps: BufferCapabilities): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Canvas.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the BufferStrategy used by this component.
    def getBufferStrategy(): BufferStrategy = ???

    @stub
    // Paints this canvas.
    def paint(g: Graphics): Unit = ???
}
