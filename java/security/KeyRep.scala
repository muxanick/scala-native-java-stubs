package java.security

import java.io.Serializable
import java.lang.Object

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
}
