package javax.security.sasl

import java.lang.{Object, String}
import javax.security.auth.callback.TextInputCallback

// This callback is used by SaslClient and SaslServer
// to retrieve realm information.
class RealmCallback extends TextInputCallback {

    @stub
    // Constructs a RealmCallback with a prompt.
    def this(prompt: String) = ???
}
