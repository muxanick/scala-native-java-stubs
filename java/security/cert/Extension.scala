package java.security.cert

import java.io.OutputStream
import java.lang.String
import scala.scalanative.annotation.stub

/** This interface represents an X.509 extension.
 * 
 *  
 *  Extensions provide a means of associating additional attributes with users
 *  or public keys and for managing a certification hierarchy.  The extension
 *  format also allows communities to define private extensions to carry
 *  information unique to those communities.
 * 
 *  
 *  Each extension contains an object identifier, a criticality setting
 *  indicating whether it is a critical or a non-critical extension, and
 *  and an ASN.1 DER-encoded value. Its ASN.1 definition is:
 * 
 *  
 * 
 *      Extension ::= SEQUENCE {
 *          extnId        OBJECT IDENTIFIER,
 *          critical      BOOLEAN DEFAULT FALSE,
 *          extnValue     OCTET STRING
 *                  -- contains a DER encoding of a value
 *                  -- of the type registered for use with
 *                  -- the extnId object identifier value
 *      }
 * 
 *  
 * 
 *  
 *  This interface is designed to provide access to a single extension,
 *  unlike X509Extension which is more suitable
 *  for accessing a set of extensions.
 */
trait Extension {

    /** Generates the extension's DER encoding and writes it to the output
     *  stream.
     */
    @stub
    def encode(out: OutputStream): Unit = ???

    /** Gets the extensions's object identifier. */
    @stub
    def getId(): String = ???

    /** Gets the extensions's DER-encoded value. */
    @stub
    def getValue(): Array[Byte] = ???

    /** Gets the extension's criticality setting. */
    @stub
    def isCritical(): Boolean = ???
}
