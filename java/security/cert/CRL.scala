package java.security.cert

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class is an abstraction of certificate revocation lists (CRLs) that
 *  have different formats but important common uses. For example, all CRLs
 *  share the functionality of listing revoked certificates, and can be queried
 *  on whether or not they list a given certificate.
 *  
 *  Specialized CRL types can be defined by subclassing off of this abstract
 *  class.
 */
abstract class CRL extends Object {

    /** Creates a CRL of the specified type. */
    @stub
    protected def this(type: String) = ???

    /** Returns the type of this CRL. */
    def getType(): String

    /** Checks whether the given certificate is on this CRL. */
    def isRevoked(cert: Certificate): Boolean

    /** Returns a string representation of this CRL. */
    def toString(): String
}
