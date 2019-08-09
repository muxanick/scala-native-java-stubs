package javax.sound.sampled

import java.io.{File, InputStream, OutputStream}
import java.lang.Object
import java.net.URL
import scala.scalanative.annotation.stub

/** The AudioSystem class acts as the entry point to the
 *  sampled-audio system resources. This class lets you query and
 *  access the mixers that are installed on the system.
 *  AudioSystem includes a number of
 *  methods for converting audio data between different formats, and for
 *  translating between audio files and streams. It also provides a method
 *  for obtaining a Line directly from the
 *  AudioSystem without dealing explicitly
 *  with mixers.
 * 
 *  Properties can be used to specify the default mixer
 *  for specific line types.
 *  Both system properties and a properties file are considered.
 *  The sound.properties properties file is read from
 *  an implementation-specific location (typically it is the lib
 *  directory in the Java installation directory).
 *  If a property exists both as a system property and in the
 *  properties file, the system property takes precedence. If none is
 *  specified, a suitable default is chosen among the available devices.
 *  The syntax of the properties file is specified in
 *  Properties.load. The
 *  following table lists the available property keys and which methods
 *  consider them:
 * 
 *  
 *   Audio System Property Keys
 *   
 *    Property Key
 *    Interface
 *    Affected Method(s)
 *   
 *   
 *    javax.sound.sampled.Clip
 *    Clip
 *    getLine(javax.sound.sampled.Line.Info), getClip()
 *   
 *   
 *    javax.sound.sampled.Port
 *    Port
 *    getLine(javax.sound.sampled.Line.Info)
 *   
 *   
 *    javax.sound.sampled.SourceDataLine
 *    SourceDataLine
 *    getLine(javax.sound.sampled.Line.Info), getSourceDataLine(javax.sound.sampled.AudioFormat)
 *   
 *   
 *    javax.sound.sampled.TargetDataLine
 *    TargetDataLine
 *    getLine(javax.sound.sampled.Line.Info), getTargetDataLine(javax.sound.sampled.AudioFormat)
 *   
 *  
 * 
 *  The property value consists of the provider class name
 *  and the mixer name, separated by the hash mark ("#").
 *  The provider class name is the fully-qualified
 *  name of a concrete mixer provider class. The mixer name is matched against
 *  the String returned by the getName
 *  method of Mixer.Info.
 *  Either the class name, or the mixer name may be omitted.
 *  If only the class name is specified, the trailing hash mark
 *  is optional.
 * 
 *  If the provider class is specified, and it can be
 *  successfully retrieved from the installed providers, the list of
 *  Mixer.Info objects is retrieved
 *  from the provider. Otherwise, or when these mixers
 *  do not provide a subsequent match, the list is retrieved
 *  from getMixerInfo() to contain
 *  all available Mixer.Info objects.
 * 
 *  If a mixer name is specified, the resulting list of
 *  Mixer.Info objects is searched:
 *  the first one with a matching name, and whose
 *  Mixer provides the
 *  respective line interface, will be returned.
 *  If no matching Mixer.Info object
 *  is found, or the mixer name is not specified,
 *  the first mixer from the resulting
 *  list, which provides the respective line
 *  interface, will be returned.
 * 
 *  For example, the property javax.sound.sampled.Clip
 *  with a value
 *  "com.sun.media.sound.MixerProvider#SunClip"
 *  will have the following consequences when
 *  getLine is called requesting a Clip
 *  instance:
 *  if the class com.sun.media.sound.MixerProvider exists
 *  in the list of installed mixer providers,
 *  the first Clip from the first mixer with name
 *  "SunClip" will be returned. If it cannot
 *  be found, the first Clip from the first mixer
 *  of the specified provider will be returned, regardless of name.
 *  If there is none, the first Clip from the first
 *  Mixer with name
 *  "SunClip" in the list of all mixers
 *  (as returned by getMixerInfo) will be returned,
 *  or, if not found, the first Clip of the first
 *  Mixerthat can be found in the list of all
 *  mixers is returned.
 *  If that fails, too, an IllegalArgumentException
 *  is thrown.
 */
class AudioSystem extends Object {
}

object AudioSystem {
    /** An integer that stands for an unknown numeric value. */
    @stub
    val NOT_SPECIFIED: Int = ???

    /** Obtains the audio file format of the specified File. */
    @stub
    def getAudioFileFormat(file: File): AudioFileFormat = ???

    /** Obtains the audio file format of the provided input stream. */
    @stub
    def getAudioFileFormat(stream: InputStream): AudioFileFormat = ???

    /** Obtains the audio file format of the specified URL. */
    @stub
    def getAudioFileFormat(url: URL): AudioFileFormat = ???

    /** Obtains the file types for which file writing support is provided by the system. */
    @stub
    def getAudioFileTypes(): Array[AudioFileFormat.Type] = ???

    /** Obtains the file types that the system can write from the
     *  audio input stream specified.
     */
    @stub
    def getAudioFileTypes(stream: AudioInputStream): Array[AudioFileFormat.Type] = ???

    /** Obtains an audio input stream of the indicated encoding, by converting the
     *  provided audio input stream.
     */
    @stub
    def getAudioInputStream(targetEncoding: AudioFormat.Encoding, sourceStream: AudioInputStream): AudioInputStream = ???

    /** Obtains an audio input stream of the indicated format, by converting the
     *  provided audio input stream.
     */
    @stub
    def getAudioInputStream(targetFormat: AudioFormat, sourceStream: AudioInputStream): AudioInputStream = ???

    /** Obtains an audio input stream from the provided File. */
    @stub
    def getAudioInputStream(file: File): AudioInputStream = ???

    /** Obtains an audio input stream from the provided input stream. */
    @stub
    def getAudioInputStream(stream: InputStream): AudioInputStream = ???

    /** Obtains an audio input stream from the URL provided. */
    @stub
    def getAudioInputStream(url: URL): AudioInputStream = ???

    /** Obtains a clip that can be used for playing back
     *  an audio file or an audio stream.
     */
    @stub
    def getClip(): Clip = ???

    /** Obtains a clip from the specified mixer that can be
     *  used for playing back an audio file or an audio stream.
     */
    @stub
    def getClip(mixerInfo: Mixer.Info): Clip = ???

    /** Obtains a line that matches the description in the specified
     *  Line.Info object.
     */
    @stub
    def getLine(info: Line.Info): Line = ???

    /** Obtains the requested audio mixer. */
    @stub
    def getMixer(info: Mixer.Info): Mixer = ???

    /** Obtains an array of mixer info objects that represents
     *  the set of audio mixers that are currently installed on the system.
     */
    @stub
    def getMixerInfo(): Array[Mixer.Info] = ???

    /** Obtains a source data line that can be used for playing back
     *  audio data in the format specified by the
     *  AudioFormat object.
     */
    @stub
    def getSourceDataLine(format: AudioFormat): SourceDataLine = ???

    /** Obtains a source data line that can be used for playing back
     *  audio data in the format specified by the
     *  AudioFormat object, provided by the mixer
     *  specified by the Mixer.Info object.
     */
    @stub
    def getSourceDataLine(format: AudioFormat, mixerinfo: Mixer.Info): SourceDataLine = ???

    /** Obtains information about all source lines of a particular type that are supported
     *  by the installed mixers.
     */
    @stub
    def getSourceLineInfo(info: Line.Info): Array[Line.Info] = ???

    /** Obtains a target data line that can be used for recording
     *  audio data in the format specified by the
     *  AudioFormat object.
     */
    @stub
    def getTargetDataLine(format: AudioFormat): TargetDataLine = ???

    /** Obtains a target data line that can be used for recording
     *  audio data in the format specified by the
     *  AudioFormat object, provided by the mixer
     *  specified by the Mixer.Info object.
     */
    @stub
    def getTargetDataLine(format: AudioFormat, mixerinfo: Mixer.Info): TargetDataLine = ???

    /** Obtains the encodings that the system can obtain from an
     *  audio input stream with the specified encoding using the set
     *  of installed format converters.
     */
    @stub
    def getTargetEncodings(sourceEncoding: AudioFormat.Encoding): Array[AudioFormat.Encoding] = ???

    /** Obtains the encodings that the system can obtain from an
     *  audio input stream with the specified format using the set
     *  of installed format converters.
     */
    @stub
    def getTargetEncodings(sourceFormat: AudioFormat): Array[AudioFormat.Encoding] = ???

    /** Obtains the formats that have a particular encoding and that the system can
     *  obtain from a stream of the specified format using the set of
     *  installed format converters.
     */
    @stub
    def getTargetFormats(targetEncoding: AudioFormat.Encoding, sourceFormat: AudioFormat): Array[AudioFormat] = ???

    /** Obtains information about all target lines of a particular type that are supported
     *  by the installed mixers.
     */
    @stub
    def getTargetLineInfo(info: Line.Info): Array[Line.Info] = ???

    /** Indicates whether an audio input stream of the specified encoding
     *  can be obtained from an audio input stream that has the specified
     *  format.
     */
    @stub
    def isConversionSupported(targetEncoding: AudioFormat.Encoding, sourceFormat: AudioFormat): Boolean = ???

    /** Indicates whether an audio input stream of a specified format
     *  can be obtained from an audio input stream of another specified format.
     */
    @stub
    def isConversionSupported(targetFormat: AudioFormat, sourceFormat: AudioFormat): Boolean = ???

    /** Indicates whether file writing support for the specified file type is provided
     *  by the system.
     */
    @stub
    def isFileTypeSupported(fileType: AudioFileFormat.Type): Boolean = ???

    /** Indicates whether an audio file of the specified file type can be written
     *  from the indicated audio input stream.
     */
    @stub
    def isFileTypeSupported(fileType: AudioFileFormat.Type, stream: AudioInputStream): Boolean = ???

    /** Indicates whether the system supports any lines that match
     *  the specified Line.Info object.
     */
    @stub
    def isLineSupported(info: Line.Info): Boolean = ???

    /** Writes a stream of bytes representing an audio file of the specified file type
     *  to the external file provided.
     */
    @stub
    def write(stream: AudioInputStream, fileType: AudioFileFormat.Type, out: File): Int = ???

    /** Writes a stream of bytes representing an audio file of the specified file type
     *  to the output stream provided.
     */
    @stub
    def write(stream: AudioInputStream, fileType: AudioFileFormat.Type, out: OutputStream): Int = ???
}
