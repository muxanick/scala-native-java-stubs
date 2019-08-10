package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A mixer is an audio device with one or more lines.  It need not be
 *  designed for mixing audio signals.  A mixer that actually mixes audio
 *  has multiple input (source) lines and at least one output (target) line.
 *  The former are often instances of classes that implement
 *  SourceDataLine,
 *  and the latter, TargetDataLine.  Port
 *  objects, too, are either source lines or target lines.
 *  A mixer can accept prerecorded, loopable sound as input, by having
 *  some of its source lines be instances of objects that implement the
 *  Clip interface.
 *  
 *  Through methods of the Line interface, which Mixer extends,
 *  a mixer might provide a set of controls that are global to the mixer.  For example,
 *  the mixer can have a master gain control.  These global controls are distinct
 *  from the controls belonging to each of the mixer's individual lines.
 *  
 *  Some mixers, especially
 *  those with internal digital mixing capabilities, may provide
 *  additional capabilities by implementing the DataLine interface.
 *  
 *  A mixer can support synchronization of its lines.  When one line in
 *  a synchronized group is started or stopped, the other lines in the group
 *  automatically start or stop simultaneously with the explicitly affected one.
 */
trait Mixer extends Line {

    /** Obtains a line that is available for use and that matches the description
     *  in the specified Line.Info object.
     */
    @stub
    def getLine(info: Line.Info): Line = ???

    /** Obtains the approximate maximum number of lines of the requested type that can be open
     *  simultaneously on the mixer.
     */
    @stub
    def getMaxLines(info: Line.Info): Int = ???

    /** Obtains information about this mixer, including the product's name,
     *  version, vendor, etc.
     */
    @stub
    def getMixerInfo(): Mixer.Info = ???

    /** Obtains information about the set of source lines supported
     *  by this mixer.
     */
    @stub
    def getSourceLineInfo(): Array[Line.Info] = ???

    /** Obtains information about source lines of a particular type supported
     *  by the mixer.
     */
    @stub
    def getSourceLineInfo(info: Line.Info): Array[Line.Info] = ???

    /** Obtains the set of all source lines currently open to this mixer. */
    @stub
    def getSourceLines(): Array[Line] = ???

    /** Obtains information about the set of target lines supported
     *  by this mixer.
     */
    @stub
    def getTargetLineInfo(): Array[Line.Info] = ???

    /** Obtains information about target lines of a particular type supported
     *  by the mixer.
     */
    @stub
    def getTargetLineInfo(info: Line.Info): Array[Line.Info] = ???

    /** Obtains the set of all target lines currently open from this mixer. */
    @stub
    def getTargetLines(): Array[Line] = ???

    /** Indicates whether the mixer supports a line (or lines) that match
     *  the specified Line.Info object.
     */
    @stub
    def isLineSupported(info: Line.Info): Boolean = ???

    /** Reports whether this mixer supports synchronization of the specified set of lines. */
    @stub
    def isSynchronizationSupported(lines: Array[Line], maintainSync: Boolean): Boolean = ???

    /** Synchronizes two or more lines. */
    @stub
    def synchronize(lines: Array[Line], maintainSync: Boolean): Unit = ???

    /** Releases synchronization for the specified lines. */
    @stub
    def unsynchronize(lines: Array[Line]): Unit = ???
}

object Mixer {
    /** The Mixer.Info class represents information about an audio mixer,
     *  including the product's name, version, and vendor, along with a textual
     *  description.  This information may be retrieved through the
     *  getMixerInfo
     *  method of the Mixer interface.
     */
    object Info extends Object {

        /** Constructs a mixer's info object, passing it the given
         *  textual information.
         */
        @stub
        protected def apply(name: String, vendor: String, description: String, version: String) = ???

        /** Indicates whether two info objects are equal, returning true if
         *  they are identical.
         */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Obtains the description of the mixer. */
        @stub
        def getDescription(): String = ???

        /** Obtains the name of the mixer. */
        @stub
        def getName(): String = ???

        /** Obtains the vendor of the mixer. */
        @stub
        def getVendor(): String = ???

        /** Obtains the version of the mixer. */
        @stub
        def getVersion(): String = ???

        /** Finalizes the hashcode method. */
        @stub
        def hashCode(): Int = ???

        /** Provides a string representation of the mixer info. */
        @stub
        def toString(): String = ???
    }

}
