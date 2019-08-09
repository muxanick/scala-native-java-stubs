package javax.sound.sampled.spi

import java.io.File
import java.lang.Object
import javax.sound.sampled.{AudioFileFormat.Type, AudioInputStream}

/** Provider for audio file writing services.  Classes providing concrete
 *  implementations can write one or more types of audio file from an audio
 *  stream.
 */
abstract class AudioFileWriter extends Object {

    /** Obtains the file types for which file writing support is provided by this
     *  audio file writer.
     */
    def getAudioFileTypes(): Array[AudioFileFormat.Type]

    /** Obtains the file types that this audio file writer can write from the
     *  audio input stream specified.
     */
    def getAudioFileTypes(stream: AudioInputStream): Array[AudioFileFormat.Type]

    /** Indicates whether file writing support for the specified file type is provided
     *  by this audio file writer.
     */
    def isFileTypeSupported(fileType: AudioFileFormat.Type): Boolean

    /** Indicates whether an audio file of the type specified can be written
     *  from the audio input stream indicated.
     */
    def isFileTypeSupported(fileType: AudioFileFormat.Type, stream: AudioInputStream): Boolean

    /** Writes a stream of bytes representing an audio file of the file format
     *  indicated to the external file provided.
     */
    def write(stream: AudioInputStream, fileType: AudioFileFormat.Type, out: File): Int
}
