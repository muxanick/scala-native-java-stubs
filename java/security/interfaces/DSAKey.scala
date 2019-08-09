package java.security.interfaces

import scala.scalanative.annotation.stub

/** The interface to a DSA public or private key. DSA (Digital Signature
 *  Algorithm) is defined in NIST's FIPS-186.
 */
trait DSAKey {

    /** Returns the DSA-specific key parameters. */
    @stub
    def getParams(): DSAParams = ???
}
