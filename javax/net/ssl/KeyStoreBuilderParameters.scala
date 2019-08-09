package javax.net.ssl

import java.lang.Object
import java.security.KeyStore.Builder

// A parameters object for X509KeyManagers that encapsulates a List
// of KeyStore.Builders.
class KeyStoreBuilderParameters extends Object with ManagerFactoryParameters {

    @stub
    // Construct new KeyStoreBuilderParameters from the specified
    // KeyStore.Builder.
    def this(builder: KeyStore.Builder) = ???
}
