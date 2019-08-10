package javax.sound.midi

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A MidiDevice.Info object contains assorted
 *  data about a MidiDevice, including its
 *  name, the company who created it, and descriptive text.
 */
object MidiDevice_Info extends Object {

    /** Constructs a device info object. */
    @stub
    protected def Info(name: String, vendor: String, description: String, version: String) = ???

    /** Reports whether two objects are equal. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Obtains the description of the device. */
    @stub
    def getDescription(): String = ???

    /** Obtains the name of the device. */
    @stub
    def getName(): String = ???

    /** Obtains the name of the company who supplies the device. */
    @stub
    def getVendor(): String = ???

    /** Obtains the version of the device. */
    @stub
    def getVersion(): String = ???

    /** Finalizes the hashcode method. */
    @stub
    def hashCode(): Int = ???

    /** Provides a string representation of the device information. */
    @stub
    def toString(): String = ???
}
