package java.security.cert

import java.lang.Cloneable

/** A specification of the result of a certification path validator algorithm.
 *  
 *  The purpose of this interface is to group (and provide type safety
 *  for) all certification path validator results. All results returned
 *  by the CertPathValidator.validate
 *  method must implement this interface.
 */
trait CertPathValidatorResult extends Cloneable {
}
