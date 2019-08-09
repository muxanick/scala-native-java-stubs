package javax.sound.midi

import java.lang.{Object, String}

// A MidiFileFormat object encapsulates a MIDI file's
// type, as well as its length and timing information.
//
// A MidiFileFormat object can
// include a set of properties. A property is a pair of key and value:
// the key is of type String, the associated property
// value is an arbitrary object.
// Properties specify additional informational
// meta data (like a author, or copyright).
// Properties are optional information, and file reader and file
// writer implementations are not required to provide or
// recognize properties.
//
// The following table lists some common properties that should
// be used in implementations:
//
// 
//    MIDI File Format Properties
//  
//   Property key
//   Value type
//   Description
//  
//  
//   "author"
//   String
//   name of the author of this file
//  
//  
//   "title"
//   String
//   title of this file
//  
//  
//   "copyright"
//   String
//   copyright message
//  
//  
//   "date"
//   Date
//   date of the recording or release
//  
//  
//   "comment"
//   String
//   an arbitrary text
//  
// 
class MidiFileFormat extends Object {

    @stub
    // Constructs a MidiFileFormat.
    def this(type: Int, divisionType: float, resolution: Int, bytes: Int, microseconds: Long) = ???

    @stub
    // The length of the MIDI file in bytes.
    protected def byteLength: Int = ???

    @stub
    // The division type of the MIDI file.
    protected def divisionType: float = ???

    @stub
    // The duration of the MIDI file in microseconds.
    protected def microsecondLength: Long = ???

    @stub
    // The timing resolution of the MIDI file.
    protected def resolution: Int = ???

    @stub
    // The type of MIDI file.
    protected def type: Int = ???

    @stub
    // Obtains the length of the MIDI file, expressed in 8-bit bytes.
    def getByteLength(): Int = ???

    @stub
    // Obtains the timing division type for the MIDI file.
    def getDivisionType(): float = ???

    @stub
    // Obtains the length of the MIDI file, expressed in microseconds.
    def getMicrosecondLength(): Long = ???

    @stub
    // Obtain the property value specified by the key.
    def getProperty(key: String): Object = ???

    @stub
    // Obtains the timing resolution for the MIDI file.
    def getResolution(): Int = ???

    @stub
    // Obtains the MIDI file type.
    def getType(): Int = ???
}
