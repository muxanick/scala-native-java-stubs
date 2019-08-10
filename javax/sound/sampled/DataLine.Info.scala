package javax.sound.sampled

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** Besides the class information inherited from its superclass,
 *  DataLine.Info provides additional information specific to data lines.
 *  This information includes:
 *  
 *   the audio formats supported by the data line
 *   the minimum and maximum sizes of its internal buffer
 *  
 *  Because a Line.Info knows the class of the line its describes, a
 *  DataLine.Info object can describe DataLine
 *  subinterfaces such as SourceDataLine,
 *  TargetDataLine, and Clip.
 *  You can query a mixer for lines of any of these types, passing an appropriate
 *  instance of DataLine.Info as the argument to a method such as
 *  Mixer.getLine(Line.Info).
 */
object DataLine_Info extends Line.Info {

    /** Constructs a data line's info object from the specified information,
     *  which includes a single audio format.
     */
    @stub
    def Info(lineClass: Class[_], format: AudioFormat) = ???

    /** Constructs a data line's info object from the specified information,
     *  which includes a set of supported audio formats and a range for the buffer size.
     */
    @stub
    def Info(lineClass: Class[_], formats: Array[AudioFormat], minBufferSize: Int, maxBufferSize: Int) = ???

    /** Constructs a data line's info object from the specified information,
     *  which includes a single audio format and a desired buffer size.
     */
    @stub
    def Info(lineClass: Class[_], format: AudioFormat, bufferSize: Int) = ???

    /** Obtains a set of audio formats supported by the data line. */
    @stub
    def getFormats(): Array[AudioFormat] = ???

    /** Obtains the maximum buffer size supported by the data line. */
    @stub
    def getMaxBufferSize(): Int = ???

    /** Obtains the minimum buffer size supported by the data line. */
    @stub
    def getMinBufferSize(): Int = ???

    /** Indicates whether this data line supports a particular audio format. */
    @stub
    def isFormatSupported(format: AudioFormat): Boolean = ???

    /** Determines whether the specified info object matches this one. */
    @stub
    def matches(info: Line.Info): Boolean = ???

    /** Obtains a textual description of the data line info. */
    @stub
    def toString(): String = ???
}
