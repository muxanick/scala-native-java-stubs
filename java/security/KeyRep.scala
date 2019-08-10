package java.security

import java.io.Serializable
import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Standardized representation for serialized Key objects.
 * 
 *  
 * 
 *  Note that a serialized Key may contain sensitive information
 *  which should not be exposed in untrusted environments.  See the
 *  
 *  Security Appendix
 *  of the Serialization Specification for more information.
 */
class KeyRep extends Object with Serializable {

    /** Construct the alternate Key class. */
    @stub
    def this(type: KeyRep.Type, algorithm: String, format: String, encoded: Array[Byte]) = ???

    /** Resolve the Key object. */
    @stub
    protected def readResolve(): Any = ???
}

object KeyRep {
    /** Key type. */
    class Type private (name: String, ordinal: Int) extends Enum[Type](name, ordinal) {
    }

    object Type {
        /** Type for private keys. */
        final val PRIVATE: Type = new Type("PRIVATE", 0)

        /** Type for public keys. */
        final val PUBLIC: Type = new Type("PUBLIC", 1)

        /** Type for secret keys. */
        final val SECRET: Type = new Type("SECRET", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Type = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Type] = ???
    }

}
