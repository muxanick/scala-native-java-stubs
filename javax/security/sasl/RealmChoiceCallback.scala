package javax.security.sasl

import java.lang.{Object, String}
import javax.security.auth.callback.ChoiceCallback
import scala.scalanative.annotation.stub

/** This callback is used by SaslClient and SaslServer
 *  to obtain a realm given a list of realm choices.
 */
class RealmChoiceCallback extends ChoiceCallback {

    /** Constructs a RealmChoiceCallback with a prompt, a list of
     *  choices and a default choice.
     */
    @stub
    def this(prompt: String, choices: Array[String], defaultChoice: Int, multiple: Boolean) = ???
}
