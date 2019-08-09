package java.security

import java.io.Serializable
import java.lang.{Object, String}
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
    protected def readResolve(): Object = ???
}

object KeyRep {
    /** Key type. */
    @stub
    object Type extends KeyRep.Type
}
