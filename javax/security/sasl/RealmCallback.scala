package javax.security.sasl

import java.lang.{Object, String}
import javax.security.auth.callback.TextInputCallback

/** This callback is used by SaslClient and SaslServer
 *  to retrieve realm information.
 */
class RealmCallback extends TextInputCallback {

    /** Constructs a RealmCallback with a prompt. */
    @stub
    def this(prompt: String) = ???
}
