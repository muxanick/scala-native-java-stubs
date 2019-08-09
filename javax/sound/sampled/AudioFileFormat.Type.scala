package javax.sound.sampled

import java.lang.{Object, String}

// An instance of the Type class represents one of the
// standard types of audio file.  Static instances are provided for the
// common types.
object AudioFileFormat.Type extends Object {

    @stub
    // Specifies an AIFF-C file.
    def AIFC: AudioFileFormat.Type = ???

    @stub
    // Specifies an AIFF file.
    def AIFF: AudioFileFormat.Type = ???

    @stub
    // Specifies an AU file.
    def AU: AudioFileFormat.Type = ???

    @stub
    // Specifies a SND file.
    def SND: AudioFileFormat.Type = ???

    @stub
    // Finalizes the equals method
    def equals(obj: Object): Boolean = ???

    @stub
    // Obtains the common file name extension for this file type.
    def getExtension(): String = ???

    @stub
    // Finalizes the hashCode method
    def hashCode(): Int = ???
}
