package java.security.cert

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** A specification of certification path algorithm parameters.
 *  The purpose of this interface is to group (and provide type safety for)
 *  all CertPath parameter specifications. All
 *  CertPath parameter specifications must implement this
 *  interface.
 */
trait CertPathParameters extends Cloneable {

    /** Makes a copy of this CertPathParameters. */
    @stub
    def clone(): Any = ???
}
