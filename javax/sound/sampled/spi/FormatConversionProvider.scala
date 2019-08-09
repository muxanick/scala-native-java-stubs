package javax.sound.sampled.spi

import java.lang.Object
import javax.sound.sampled.{AudioFormat, AudioFormat.Encoding, AudioInputStream}

/** A format conversion provider provides format conversion services
 *  from one or more input formats to one or more output formats.
 *  Converters include codecs, which encode and/or decode audio data,
 *  as well as transcoders, etc.  Format converters provide methods for
 *  determining what conversions are supported and for obtaining an audio
 *  stream from which converted data can be read.
 *  
 *  The source format represents the format of the incoming
 *  audio data, which will be converted.
 *  
 *  The target format represents the format of the processed, converted
 *  audio data.  This is the format of the data that can be read from
 *  the stream returned by one of the getAudioInputStream methods.
 */
abstract class FormatConversionProvider extends Object {

    /** Obtains an audio input stream with the specified encoding from the given audio
     *  input stream.
     */
    def getAudioInputStream(targetEncoding: AudioFormat.Encoding, sourceStream: AudioInputStream): AudioInputStream

    /** Obtains an audio input stream with the specified format from the given audio
     *  input stream.
     */
    def getAudioInputStream(targetFormat: AudioFormat, sourceStream: AudioInputStream): AudioInputStream

    /** Obtains the set of source format encodings from which format
     *  conversion services are provided by this provider.
     */
    def getSourceEncodings(): Array[AudioFormat.Encoding]

    /** Obtains the set of target format encodings to which format
     *  conversion services are provided by this provider.
     */
    def getTargetEncodings(): Array[AudioFormat.Encoding]

    /** Obtains the set of target format encodings supported by the format converter
     *  given a particular source format.
     */
    def getTargetEncodings(sourceFormat: AudioFormat): Array[AudioFormat.Encoding]

    /** Obtains the set of target formats with the encoding specified
     *  supported by the format converter
     *  If no target formats with the specified encoding are supported
     *  for this source format, an array of length 0 is returned.
     */
    def getTargetFormats(targetEncoding: AudioFormat.Encoding, sourceFormat: AudioFormat): Array[AudioFormat]

    /** Indicates whether the format converter supports conversion to a particular encoding
     *  from a particular format.
     */
    def isConversionSupported(targetEncoding: AudioFormat.Encoding, sourceFormat: AudioFormat): Boolean

    /** Indicates whether the format converter supports conversion to one
     *  particular format from another.
     */
    def isConversionSupported(targetFormat: AudioFormat, sourceFormat: AudioFormat): Boolean

    /** Indicates whether the format converter supports conversion from the
     *  specified source format encoding.
     */
    def isSourceEncodingSupported(sourceEncoding: AudioFormat.Encoding): Boolean
}
