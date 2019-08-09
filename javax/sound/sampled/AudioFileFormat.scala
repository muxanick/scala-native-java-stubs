package javax.sound.sampled

import java.lang.{Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

/** An instance of the AudioFileFormat class describes
 *  an audio file, including the file type, the file's length in bytes,
 *  the length in sample frames of the audio data contained in the file,
 *  and the format of the audio data.
 *  
 *  The AudioSystem class includes methods for determining the format
 *  of an audio file, obtaining an audio input stream from an audio file, and
 *  writing an audio file from an audio input stream.
 * 
 *  An AudioFileFormat object can
 *  include a set of properties. A property is a pair of key and value:
 *  the key is of type String, the associated property
 *  value is an arbitrary object.
 *  Properties specify additional informational
 *  meta data (like a author, copyright, or file duration).
 *  Properties are optional information, and file reader and file
 *  writer implementations are not required to provide or
 *  recognize properties.
 * 
 *  The following table lists some common properties that should
 *  be used in implementations:
 * 
 *  
 *   Audio File Format Properties
 *   
 *    Property key
 *    Value type
 *    Description
 *   
 *   
 *    "duration"
 *    Long
 *    playback duration of the file in microseconds
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
class AudioFileFormat extends Object {

    /** Constructs an audio file format object. */
    @stub
    def this(type: AudioFileFormat.Type, format: AudioFormat, frameLength: Int) = ???

    /** Construct an audio file format object with a set of
     *  defined properties.
     */
    @stub
    def this(type: AudioFileFormat.Type, format: AudioFormat, frameLength: Int, properties: Map[String, Object]) = ???

    /** Constructs an audio file format object. */
    @stub
    protected def this(type: AudioFileFormat.Type, byteLength: Int, format: AudioFormat, frameLength: Int) = ???

    /** Obtains the size in bytes of the entire audio file (not just its audio data). */
    @stub
    def getByteLength(): Int = ???

    /** Obtains the format of the audio data contained in the audio file. */
    @stub
    def getFormat(): AudioFormat = ???

    /** Obtains the length of the audio data contained in the file, expressed in sample frames. */
    @stub
    def getFrameLength(): Int = ???

    /** Obtain the property value specified by the key. */
    @stub
    def getProperty(key: String): Object = ???

    /** Obtains the audio file type, such as WAVE or AU. */
    @stub
    def getType(): AudioFileFormat.Type = ???

    /** Obtain an unmodifiable map of properties. */
    @stub
    def properties(): Map[String, Object] = ???

    /** Provides a string representation of the file format. */
    @stub
    def toString(): String = ???
}

object AudioFileFormat {
    /** An instance of the Type class represents one of the
     *  standard types of audio file.
     */
    @stub
    object Type extends AudioFileFormat.Type
}
