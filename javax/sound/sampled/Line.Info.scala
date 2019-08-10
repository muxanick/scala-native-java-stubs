package javax.sound.sampled

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

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
object Line_Info extends Object {

    /** Constructs an info object that describes a line of the specified class. */
    @stub
    def Info(lineClass: Class[_]) = ???

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
