package javax.sound.sampled

import java.lang.AutoCloseable

// The Line interface represents a mono or multi-channel
// audio feed. A line is an element of the digital audio
// "pipeline," such as a mixer, an input or output port,
// or a data path into or out of a mixer.
// 
// A line can have controls, such as gain, pan, and reverb.
// The controls themselves are instances of classes that extend the
// base Control class.
// The Line interface provides two accessor methods for
// obtaining the line's controls: getControls returns the
// entire set, and getControl returns a single control of
// specified type.
// 
// Lines exist in various states at different times.  When a line opens, it reserves system
// resources for itself, and when it closes, these resources are freed for
// other objects or applications. The isOpen() method lets
// you discover whether a line is open or closed.
// An open line need not be processing data, however.  Such processing is
// typically initiated by subinterface methods such as
// SourceDataLine.write and
// TargetDataLine.read.
//
// You can register an object to receive notifications whenever the line's
// state changes.  The object must implement the LineListener
// interface, which consists of the single method
// update.
// This method will be invoked when a line opens and closes (and, if it's a
// DataLine, when it starts and stops).
//
// An object can be registered to listen to multiple lines.  The event it
// receives in its update method will specify which line created
// the event, what type of event it was
// (OPEN, CLOSE, START, or STOP),
// and how many sample frames the line had processed at the time the event occurred.
// 
// Certain line operations, such as open and close, can generate security
// exceptions if invoked by unprivileged code when the line is a shared audio
// resource.
trait Line extends AutoCloseable {

    @stub
    // Adds a listener to this line.
    def addLineListener(listener: LineListener): Unit = ???

    @stub
    // Closes the line, indicating that any system resources
    // in use by the line can be released.
    def close(): Unit = ???

    @stub
    // Obtains a control of the specified type,
    // if there is any.
    def getControl(control: Control.Type): Control = ???

    @stub
    // Obtains the set of controls associated with this line.
    def getControls(): Array[Control] = ???

    @stub
    // Obtains the Line.Info object describing this
    // line.
    def getLineInfo(): Line.Info = ???

    @stub
    // Indicates whether the line supports a control of the specified type.
    def isControlSupported(control: Control.Type): Boolean = ???

    @stub
    // Indicates whether the line is open, meaning that it has reserved
    // system resources and is operational, although it might not currently be
    // playing or capturing sound.
    def isOpen(): Boolean = ???

    @stub
    // Opens the line, indicating that it should acquire any required
    // system resources and become operational.
    def open(): Unit = ???
}
