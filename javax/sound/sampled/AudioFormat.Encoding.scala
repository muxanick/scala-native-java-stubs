package javax.sound.sampled

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Encoding class  names the  specific type of data representation
 *  used for an audio stream.   The encoding includes aspects of the
 *  sound format other than the number of channels, sample rate, sample size,
 *  frame rate, frame size, and byte order.
 *  
 *  One ubiquitous type of audio encoding is pulse-code modulation (PCM),
 *  which is simply a linear (proportional) representation of the sound
 *  waveform.  With PCM, the number stored in each sample is proportional
 *  to the instantaneous amplitude of the sound pressure at that point in
 *  time.  The numbers may be signed or unsigned integers or floats.
 *  Besides PCM, other encodings include mu-law and a-law, which are nonlinear
 *  mappings of the sound amplitude that are often used for recording speech.
 *  
 *  You can use a predefined encoding by referring to one of the static
 *  objects created by this class, such as PCM_SIGNED or
 *  PCM_UNSIGNED.  Service providers can create new encodings, such as
 *  compressed audio formats, and make
 *  these available through the AudioSystem class.
 *  
 *  The Encoding class is static, so that all
 *  AudioFormat objects that have the same encoding will refer
 *  to the same object (rather than different instances of the same class).
 *  This allows matches to be made by checking that two format's encodings
 *  are equal.
 */
object AudioFormat.Encoding extends Object {

    /** Constructs a new encoding. */
    @stub
    def Encoding(name: String) = ???

    /** Specifies a-law encoded data. */
    @stub
    val ALAW: AudioFormat.Encoding = ???

    /** Specifies floating-point PCM data. */
    @stub
    val PCM_FLOAT: AudioFormat.Encoding = ???

    /** Specifies signed, linear PCM data. */
    @stub
    val PCM_SIGNED: AudioFormat.Encoding = ???

    /** Specifies unsigned, linear PCM data. */
    @stub
    val PCM_UNSIGNED: AudioFormat.Encoding = ???

    /** Specifies u-law encoded data. */
    @stub
    val ULAW: AudioFormat.Encoding = ???

    /** Finalizes the equals method */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Finalizes the hashCode method */
    @stub
    def hashCode(): Int = ???

    /** Provides the String representation of the encoding. */
    @stub
    def toString(): String = ???
}
