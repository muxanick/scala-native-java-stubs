package javax.sound.sampled

import java.lang.{AutoCloseable, Class, Object, String}
import scala.scalanative.annotation.stub

/** The Line interface represents a mono or multi-channel
 *  audio feed. A line is an element of the digital audio
 *  "pipeline," such as a mixer, an input or output port,
 *  or a data path into or out of a mixer.
 *  
 *  A line can have controls, such as gain, pan, and reverb.
 *  The controls themselves are instances of classes that extend the
 *  base Control class.
 *  The Line interface provides two accessor methods for
 *  obtaining the line's controls: getControls returns the
 *  entire set, and getControl returns a single control of
 *  specified type.
 *  
 *  Lines exist in various states at different times.  When a line opens, it reserves system
 *  resources for itself, and when it closes, these resources are freed for
 *  other objects or applications. The isOpen() method lets
 *  you discover whether a line is open or closed.
 *  An open line need not be processing data, however.  Such processing is
 *  typically initiated by subinterface methods such as
 *  SourceDataLine.write and
 *  TargetDataLine.read.
 * 
 *  You can register an object to receive notifications whenever the line's
 *  state changes.  The object must implement the LineListener
 *  interface, which consists of the single method
 *  update.
 *  This method will be invoked when a line opens and closes (and, if it's a
 *  DataLine, when it starts and stops).
 * 
 *  An object can be registered to listen to multiple lines.  The event it
 *  receives in its update method will specify which line created
 *  the event, what type of event it was
 *  (OPEN, CLOSE, START, or STOP),
 *  and how many sample frames the line had processed at the time the event occurred.
 *  
 *  Certain line operations, such as open and close, can generate security
 *  exceptions if invoked by unprivileged code when the line is a shared audio
 *  resource.
 */
trait Line extends AutoCloseable {

    /** Adds a listener to this line. */
    @stub
    def addLineListener(listener: LineListener): Unit = ???

    /** Closes the line, indicating that any system resources
     *  in use by the line can be released.
     */
    @stub
    def close(): Unit = ???

    /** Obtains a control of the specified type,
     *  if there is any.
     */
    @stub
    def getControl(control: Control.Type): Control = ???

    /** Obtains the set of controls associated with this line. */
    @stub
    def getControls(): Array[Control] = ???

    /** Obtains the Line.Info object describing this
     *  line.
     */
    @stub
    def getLineInfo(): Line.Info = ???

    /** Indicates whether the line supports a control of the specified type. */
    @stub
    def isControlSupported(control: Control.Type): Boolean = ???

    /** Indicates whether the line is open, meaning that it has reserved
     *  system resources and is operational, although it might not currently be
     *  playing or capturing sound.
     */
    @stub
    def isOpen(): Boolean = ???

    /** Opens the line, indicating that it should acquire any required
     *  system resources and become operational.
     */
    @stub
    def open(): Unit = ???

    /** Removes the specified listener from this line's list of listeners. */
    @stub
    def removeLineListener(listener: LineListener): Unit = ???
}

object Line {
    /** A Line.Info object contains information about a line.
     *  The only information provided by Line.Info itself
     *  is the Java class of the line.
     *  A subclass of Line.Info adds other kinds of information
     *  about the line.  This additional information depends on which Line
     *  subinterface is implemented by the kind of line that the Line.Info
     *  subclass describes.
     *  
     *  A Line.Info can be retrieved using various methods of
     *  the Line, Mixer, and AudioSystem
     *  interfaces.  Other such methods let you pass a Line.Info as
     *  an argument, to learn whether lines matching the specified configuration
     *  are available and to obtain them.
     */
    object Info extends Object {

        /** Constructs an info object that describes a line of the specified class. */
        @stub
        def apply(lineClass: Class[_]) = ???

        /** Obtains the class of the line that this Line.Info object describes. */
        @stub
        def getLineClass(): Class[_] = ???

        /** Indicates whether the specified info object matches this one. */
        @stub
        def matches(info: Line.Info): Boolean = ???

        /** Obtains a textual description of the line info. */
        @stub
        def toString(): String = ???
    }

}
