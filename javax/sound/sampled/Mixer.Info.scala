package javax.sound.sampled

import java.lang.{Object, String}

/** The Mixer.Info class represents information about an audio mixer,
 *  including the product's name, version, and vendor, along with a textual
 *  description.  This information may be retrieved through the
 *  getMixerInfo
 *  method of the Mixer interface.
 */
object Mixer.Info extends Object {

    /** Indicates whether two info objects are equal, returning true if
     *  they are identical.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Obtains the description of the mixer. */
    @stub
    def getDescription(): String = ???

    /** Obtains the name of the mixer. */
    @stub
    def getName(): String = ???

    /** Obtains the vendor of the mixer. */
    @stub
    def getVendor(): String = ???

    /** Obtains the version of the mixer. */
    @stub
    def getVersion(): String = ???

    /** Finalizes the hashcode method. */
    @stub
    def hashCode(): Int = ???
}
