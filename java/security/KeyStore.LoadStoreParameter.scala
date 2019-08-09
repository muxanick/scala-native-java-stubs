package java.security

import scala.scalanative.annotation.stub

/** A marker interface for KeyStore
 *  load
 *  and
 *  store
 *  parameters.
 */
object trait KeyStore.LoadStoreParameter {

    /** Gets the parameter used to protect keystore data. */
    @stub
    def getProtectionParameter(): KeyStore.ProtectionParameter = ???
}
