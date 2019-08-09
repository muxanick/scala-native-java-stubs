package java.rmi.server

import java.io.{DataInput, Serializable}
import java.lang.{Object, String}

/** A UID represents an identifier that is unique over time
 *  with respect to the host it is generated on, or one of 216
 *  "well-known" identifiers.
 * 
 *  The UID() constructor can be used to generate an
 *  identifier that is unique over time with respect to the host it is
 *  generated on.  The UID(short) constructor can be used to
 *  create one of 216 well-known identifiers.
 * 
 *  A UID instance contains three primitive values:
 *  
 *  unique, an int that uniquely identifies
 *  the VM that this UID was generated in, with respect to its
 *  host and at the time represented by the time value (an
 *  example implementation of the unique value would be a
 *  process identifier),
 *   or zero for a well-known UID
 *  time, a long equal to a time (as returned
 *  by System.currentTimeMillis()) at which the VM that this
 *  UID was generated in was alive,
 *  or zero for a well-known UID
 *  count, a short to distinguish
 *  UIDs generated in the same VM with the same
 *  time value
 *  
 * 
 *  An independently generated UID instance is unique
 *  over time with respect to the host it is generated on as long as
 *  the host requires more than one millisecond to reboot and its system
 *  clock is never set backward.  A globally unique identifier can be
 *  constructed by pairing a UID instance with a unique host
 *  identifier, such as an IP address.
 */
final class UID extends Object with Serializable {

    /** Generates a UID that is unique over time with
     *  respect to the host that it was generated on.
     */
    @stub
    def this() = ???

    /** Compares the specified object with this UID for
     *  equality.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the hash code value for this UID. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of this UID. */
    @stub
    def toString(): String = ???
}

object UID {
    /** Constructs and returns a new UID instance by
     *  unmarshalling a binary representation from an
     *  DataInput instance.
     */
    @stub
    def read(in: DataInput): UID = ???
}
