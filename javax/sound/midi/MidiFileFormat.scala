package javax.sound.midi

import java.lang.{Object, String}

/** A MidiFileFormat object encapsulates a MIDI file's
 *  type, as well as its length and timing information.
 * 
 *  A MidiFileFormat object can
 *  include a set of properties. A property is a pair of key and value:
 *  the key is of type String, the associated property
 *  value is an arbitrary object.
 *  Properties specify additional informational
 *  meta data (like a author, or copyright).
 *  Properties are optional information, and file reader and file
 *  writer implementations are not required to provide or
 *  recognize properties.
 * 
 *  The following table lists some common properties that should
 *  be used in implementations:
 * 
 *  
 *     MIDI File Format Properties
 *   
 *    Property key
 *    Value type
 *    Description
 *   
 *   
 *    "author"
 *    String
 *    name of the author of this file
 *   
 *   
 *    "title"
 *    String
 *    title of this file
 *   
 *   
 *    "copyright"
 *    String
 *    copyright message
 *   
 *   
 *    "date"
 *    Date
 *    date of the recording or release
 *   
 *   
 *    "comment"
 *    String
 *    an arbitrary text
 *   
 *  
 */
class MidiFileFormat extends Object {

    /** Constructs a MidiFileFormat. */
    @stub
    def this(type: Int, divisionType: Float, resolution: Int, bytes: Int, microseconds: Long) = ???

    /** The length of the MIDI file in bytes. */
    @stub
    protected val byteLength: Int = ???

    /** The division type of the MIDI file. */
    @stub
    protected val divisionType: Float = ???

    /** The duration of the MIDI file in microseconds. */
    @stub
    protected val microsecondLength: Long = ???

    /** The timing resolution of the MIDI file. */
    @stub
    protected val resolution: Int = ???

    /** The type of MIDI file. */
    @stub
    protected val type: Int = ???

    /** Obtains the length of the MIDI file, expressed in 8-bit bytes. */
    @stub
    def getByteLength(): Int = ???

    /** Obtains the timing division type for the MIDI file. */
    @stub
    def getDivisionType(): Float = ???

    /** Obtains the length of the MIDI file, expressed in microseconds. */
    @stub
    def getMicrosecondLength(): Long = ???

    /** Obtain the property value specified by the key. */
    @stub
    def getProperty(key: String): Object = ???

    /** Obtains the timing resolution for the MIDI file. */
    @stub
    def getResolution(): Int = ???

    /** Obtains the MIDI file type. */
    @stub
    def getType(): Int = ???
}
