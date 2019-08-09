package javax.sound.sampled

import java.lang.{Object, String}

/** An instance of the Type class represents one of the
 *  standard types of audio file.  Static instances are provided for the
 *  common types.
 */
object AudioFileFormat.Type extends Object {

    /** Specifies an AIFF-C file. */
    @stub
    val AIFC: AudioFileFormat.Type = ???

    /** Specifies an AIFF file. */
    @stub
    val AIFF: AudioFileFormat.Type = ???

    /** Specifies an AU file. */
    @stub
    val AU: AudioFileFormat.Type = ???

    /** Specifies a SND file. */
    @stub
    val SND: AudioFileFormat.Type = ???

    /** Finalizes the equals method */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Obtains the common file name extension for this file type. */
    @stub
    def getExtension(): String = ???

    /** Finalizes the hashCode method */
    @stub
    def hashCode(): Int = ???
}
