package javax.sound.sampled.spi

import java.io.{File, InputStream}
import java.lang.Object
import java.net.URL
import javax.sound.sampled.{AudioFileFormat, AudioInputStream}

// Provider for audio file reading services.  Classes providing concrete
// implementations can parse the format information from one or more types of
// audio file, and can produce audio input streams from files of these types.
abstract class AudioFileReader extends Object {

    // Obtains the audio file format of the File provided.
    def getAudioFileFormat(file: File): AudioFileFormat

    // Obtains the audio file format of the input stream provided.
    def getAudioFileFormat(stream: InputStream): AudioFileFormat

    // Obtains the audio file format of the URL provided.
    def getAudioFileFormat(url: URL): AudioFileFormat

    // Obtains an audio input stream from the File provided.
    def getAudioInputStream(file: File): AudioInputStream

    // Obtains an audio input stream from the input stream provided.
    def getAudioInputStream(stream: InputStream): AudioInputStream
}
