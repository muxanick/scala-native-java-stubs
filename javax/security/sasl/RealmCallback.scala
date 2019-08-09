package javax.security.sasl

import java.lang.{Object, String}
import javax.security.auth.callback.TextInputCallback
import scala.scalanative.annotation.stub

/** This callback is used by SaslClient and SaslServer
 *  to retrieve realm information.
 */
class RealmCallback extends TextInputCallback {

    /** Constructs a RealmCallback with a prompt. */
    @stub
    def this(prompt: String) = ???

    /** Constructs a RealmCallback with a prompt and default
     *  realm information.
     */
    @stub
    def this(prompt: String, defaultRealmInfo: String) = ???
}
