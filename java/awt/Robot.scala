package java.awt

import java.awt.image.BufferedImage
import java.lang.{Object, String}

/** This class is used to generate native system input events
 *  for the purposes of test automation, self-running demos, and
 *  other applications where control of the mouse and keyboard
 *  is needed. The primary purpose of Robot is to facilitate
 *  automated testing of Java platform implementations.
 *  
 *  Using the class to generate input events differs from posting
 *  events to the AWT event queue or AWT components in that the
 *  events are generated in the platform's native input
 *  queue. For example, Robot.mouseMove will actually move
 *  the mouse cursor instead of just generating mouse move events.
 *  
 *  Note that some platforms require special privileges or extensions
 *  to access low-level input control. If the current platform configuration
 *  does not allow input control, an AWTException will be thrown
 *  when trying to construct Robot objects. For example, X-Window systems
 *  will throw the exception if the XTEST 2.2 standard extension is not supported
 *  (or not enabled) by the X server.
 *  
 *  Applications that use Robot for purposes other than self-testing should
 *  handle these error conditions gracefully.
 */
class Robot extends Object {

    /** Constructs a Robot object in the coordinate system of the primary screen. */
    @stub
    def this() = ???

    /** Creates an image containing pixels read from the screen. */
    @stub
    def createScreenCapture(screenRect: Rectangle): BufferedImage = ???

    /** Sleeps for the specified time. */
    @stub
    def delay(ms: Int): Unit = ???

    /** Returns the number of milliseconds this Robot sleeps after generating an event. */
    @stub
    def getAutoDelay(): Int = ???

    /** Returns the color of a pixel at the given screen coordinates. */
    @stub
    def getPixelColor(x: Int, y: Int): Color = ???

    /** Returns whether this Robot automatically invokes waitForIdle
     *  after generating an event.
     */
    @stub
    def isAutoWaitForIdle(): Boolean = ???

    /** Presses a given key. */
    @stub
    def keyPress(keycode: Int): Unit = ???

    /** Releases a given key. */
    @stub
    def keyRelease(keycode: Int): Unit = ???

    /** Moves mouse pointer to given screen coordinates. */
    @stub
    def mouseMove(x: Int, y: Int): Unit = ???

    /** Presses one or more mouse buttons. */
    @stub
    def mousePress(buttons: Int): Unit = ???

    /** Releases one or more mouse buttons. */
    @stub
    def mouseRelease(buttons: Int): Unit = ???

    /** Rotates the scroll wheel on wheel-equipped mice. */
    @stub
    def mouseWheel(wheelAmt: Int): Unit = ???

    /** Sets the number of milliseconds this Robot sleeps after generating an event. */
    @stub
    def setAutoDelay(ms: Int): Unit = ???

    /** Sets whether this Robot automatically invokes waitForIdle
     *  after generating an event.
     */
    @stub
    def setAutoWaitForIdle(isOn: Boolean): Unit = ???

    /** Returns a string representation of this Robot. */
    @stub
    def toString(): String = ???
}
