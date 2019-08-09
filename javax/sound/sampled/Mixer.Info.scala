package javax.sound.sampled

import java.lang.{Object, String}

// The Mixer.Info class represents information about an audio mixer,
// including the product's name, version, and vendor, along with a textual
// description.  This information may be retrieved through the
// getMixerInfo
// method of the Mixer interface.
object Mixer.Info extends Object {

    @stub
    // Indicates whether two info objects are equal, returning true if
    // they are identical.
    def equals(obj: Object): Boolean = ???

    @stub
    // Obtains the description of the mixer.
    def getDescription(): String = ???

    @stub
    // Obtains the name of the mixer.
    def getName(): String = ???

    @stub
    // Obtains the vendor of the mixer.
    def getVendor(): String = ???

    @stub
    // Obtains the version of the mixer.
    def getVersion(): String = ???

    @stub
    // Finalizes the hashcode method.
    def hashCode(): Int = ???
}
