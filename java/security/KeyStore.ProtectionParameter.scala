package java.security

import scala.scalanative.annotation.stub

/** A marker interface for keystore protection parameters.
 * 
 *   The information stored in a ProtectionParameter
 *  object protects the contents of a keystore.
 *  For example, protection parameters may be used to check
 *  the integrity of keystore data, or to protect the
 *  confidentiality of sensitive keystore data
 *  (such as a PrivateKey).
 */
object trait KeyStore.ProtectionParameter {
