package javax.sound.sampled

import java.lang.{Object, String}
import java.util.Map

/** AudioFormat is the class that specifies a particular arrangement of data in a sound stream.
 *  By examining the information stored in the audio format, you can discover how to interpret the bits in the
 *  binary sound data.
 *  
 *  Every data line has an audio format associated with its data stream. The audio format of a source (playback) data line indicates
 *  what kind of data the data line expects to receive for output.  For a target (capture) data line, the audio format specifies the kind
 *  of the data that can be read from the line.
 *  Sound files also have audio formats, of course.  The AudioFileFormat
 *  class encapsulates an AudioFormat in addition to other,
 *  file-specific information.  Similarly, an AudioInputStream has an
 *  AudioFormat.
 *  
 *  The AudioFormat class accommodates a number of common sound-file encoding techniques, including
 *  pulse-code modulation (PCM), mu-law encoding, and a-law encoding.  These encoding techniques are predefined,
 *  but service providers can create new encoding types.
 *  The encoding that a specific format uses is named by its encoding field.
 * 
 *  In addition to the encoding, the audio format includes other properties that further specify the exact
 *  arrangement of the data.
 *  These include the number of channels, sample rate, sample size, byte order, frame rate, and frame size.
 *  Sounds may have different numbers of audio channels: one for mono, two for stereo.
 *  The sample rate measures how many "snapshots" (samples) of the sound pressure are taken per second, per channel.
 *  (If the sound is stereo rather than mono, two samples are actually measured at each instant of time: one for the left channel,
 *  and another for the right channel; however, the sample rate still measures the number per channel, so the rate is the same
 *  regardless of the number of channels.   This is the standard use of the term.)
 *  The sample size indicates how many bits are used to store each snapshot; 8 and 16 are typical values.
 *  For 16-bit samples (or any other sample size larger than a byte),
 *  byte order is important; the bytes in each sample are arranged in
 *  either the "little-endian" or "big-endian" style.
 *  For encodings like PCM, a frame consists of the set of samples for all channels at a given
 *  point in time, and so the size of a frame (in bytes) is always equal to the size of a sample (in bytes) times
 *  the number of channels.  However, with some other sorts of encodings a frame can contain
 *  a bundle of compressed data for a whole series of samples, as well as additional, non-sample
 *  data.  For such encodings, the sample rate and sample size refer to the data after it is decoded into PCM,
 *  and so they are completely different from the frame rate and frame size.
 * 
 *  An AudioFormat object can include a set of
 *  properties. A property is a pair of key and value: the key
 *  is of type String, the associated property
 *  value is an arbitrary object. Properties specify
 *  additional format specifications, like the bit rate for
 *  compressed formats. Properties are mainly used as a means
 *  to transport additional information of the audio format
 *  to and from the service providers. Therefore, properties
 *  are ignored in the matches(AudioFormat) method.
 *  However, methods which rely on the installed service
 *  providers, like (AudioFormat, AudioFormat) isConversionSupported may consider
 *  properties, depending on the respective service provider
 *  implementation.
 * 
 *  The following table lists some common properties which
 *  service providers should use, if applicable:
 * 
 *  
 *   Audio Format Properties
 *   
 *    Property key
 *    Value type
 *    Description
 *   
 *   
 *    "bitrate"
 *    Integer
 *    average bit rate in bits per second
 *   
 *   
 *    "vbr"
 *    Boolean
 *    true, if the file is encoded in variable bit
 *        rate (VBR)
 *   
 *   
 *    "quality"
 *    Integer
 *    encoding/conversion quality, 1..100
 *   
 *  
 * 
 *  Vendors of service providers (plugins) are encouraged
 *  to seek information about other already established
 *  properties in third party plugins, and follow the same
 *  conventions.
 */
class AudioFormat extends Object {

    /** Constructs an AudioFormat with the given parameters. */
    @stub
    def this(encoding: AudioFormat.Encoding, sampleRate: Float, sampleSizeInBits: Int, channels: Int, frameSize: Int, frameRate: Float, bigEndian: Boolean) = ???

    /** Constructs an AudioFormat with the given parameters. */
    @stub
    def this(encoding: AudioFormat.Encoding, sampleRate: Float, sampleSizeInBits: Int, channels: Int, frameSize: Int, frameRate: Float, bigEndian: Boolean, properties: Map[String, Object]) = ???

    /** Indicates whether the audio data is stored in big-endian or little-endian order. */
    @stub
    protected val bigEndian: Boolean = ???

    /** The number of audio channels in this format (1 for mono, 2 for stereo). */
    @stub
    protected val channels: Int = ???

    /** The audio encoding technique used by this format. */
    @stub
    protected val encoding: AudioFormat.Encoding = ???

    /** The number of frames played or recorded per second, for sounds that have this format. */
    @stub
    protected val frameRate: Float = ???

    /** The number of bytes in each frame of a sound that has this format. */
    @stub
    protected val frameSize: Int = ???

    /** The number of samples played or recorded per second, for sounds that have this format. */
    @stub
    protected val sampleRate: Float = ???

    /** Obtains the number of channels. */
    @stub
    def getChannels(): Int = ???

    /** Obtains the type of encoding for sounds in this format. */
    @stub
    def getEncoding(): AudioFormat.Encoding = ???

    /** Obtains the frame rate in frames per second. */
    @stub
    def getFrameRate(): Float = ???

    /** Obtains the frame size in bytes. */
    @stub
    def getFrameSize(): Int = ???

    /** Obtain the property value specified by the key. */
    @stub
    def getProperty(key: String): Object = ???

    /** Obtains the sample rate. */
    @stub
    def getSampleRate(): Float = ???

    /** Obtains the size of a sample. */
    @stub
    def getSampleSizeInBits(): Int = ???

    /** Indicates whether the audio data is stored in big-endian or little-endian
     *  byte order.
     */
    @stub
    def isBigEndian(): Boolean = ???

    /** Indicates whether this format matches the one specified. */
    @stub
    def matches(format: AudioFormat): Boolean = ???

    /** Obtain an unmodifiable map of properties. */
    @stub
    def properties(): Map[String, Object] = ???
}
