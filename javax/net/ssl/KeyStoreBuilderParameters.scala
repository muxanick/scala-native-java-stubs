package javax.net.ssl

import java.lang.Object
import java.security.KeyStore.Builder
import java.util.List
import scala.scalanative.annotation.stub

/** A parameters object for X509KeyManagers that encapsulates a List
 *  of KeyStore.Builders.
 */
class KeyStoreBuilderParameters extends Object with ManagerFactoryParameters {

    /** Construct new KeyStoreBuilderParameters from the specified
     *  KeyStore.Builder.
     */
    @stub
    def this(builder: KeyStore.Builder) = ???

    /** Construct new KeyStoreBuilderParameters from a List
     *  of KeyStore.Builders.
     */
    @stub
    def this(parameters: List[KeyStore.Builder]) = ???

    /** Return the unmodifiable List of the
     *  KeyStore.Builders
     *  encapsulated by this object.
     */
    @stub
    def getParameters(): List[KeyStore.Builder] = ???
}
