package javax.security.sasl

import java.lang.Object
import javax.security.auth.callback.ChoiceCallback

/** This callback is used by SaslClient and SaslServer
 *  to obtain a realm given a list of realm choices.
 */
class RealmChoiceCallback extends ChoiceCallback {
}
