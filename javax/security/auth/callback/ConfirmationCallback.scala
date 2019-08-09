package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/**  Underlying security services instantiate and pass a
 *  ConfirmationCallback to the handle
 *  method of a CallbackHandler to ask for YES/NO,
 *  OK/CANCEL, YES/NO/CANCEL or other similar confirmations.
 */
class ConfirmationCallback extends Object with Callback with Serializable {

    /** Construct a ConfirmationCallback with a
     *  message type, an option type and a default option.
     */
    @stub
    def this(messageType: Int, optionType: Int, defaultOption: Int) = ???

    /** Construct a ConfirmationCallback with a
     *  message type, a list of options and a default option.
     */
    @stub
    def this(messageType: Int, options: Array[String], defaultOption: Int) = ???

    /** Construct a ConfirmationCallback with a prompt,
     *  message type, an option type and a default option.
     */
    @stub
    def this(prompt: String, messageType: Int, optionType: Int, defaultOption: Int) = ???

    /** Construct a ConfirmationCallback with a prompt,
     *  message type, a list of options and a default option.
     */
    @stub
    def this(prompt: String, messageType: Int, options: Array[String], defaultOption: Int) = ???

    /** Get the default option. */
    @stub
    def getDefaultOption(): Int = ???

    /** Get the message type. */
    @stub
    def getMessageType(): Int = ???

    /** Get the confirmation options. */
    @stub
    def getOptions(): Array[String] = ???

    /** Get the option type. */
    @stub
    def getOptionType(): Int = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???

    /** Get the selected confirmation option. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Set the selected confirmation option. */
    @stub
    def setSelectedIndex(selection: Int): Unit = ???
}

object ConfirmationCallback {
    /** CANCEL option. */
    @stub
    val CANCEL: Int = ???

    /** ERROR message type. */
    @stub
    val ERROR: Int = ???

    /** INFORMATION message type. */
    @stub
    val INFORMATION: Int = ???

    /** NO option. */
    @stub
    val NO: Int = ???

    /** OK option. */
    @stub
    val OK: Int = ???

    /** OK/CANCEL confirmation confirmation option. */
    @stub
    val OK_CANCEL_OPTION: Int = ???

    /** Unspecified option type. */
    @stub
    val UNSPECIFIED_OPTION: Int = ???

    /** WARNING message type. */
    @stub
    val WARNING: Int = ???

    /** YES option. */
    @stub
    val YES: Int = ???

    /** YES/NO/CANCEL confirmation confirmation option. */
    @stub
    val YES_NO_CANCEL_OPTION: Int = ???

    /** YES/NO confirmation option. */
    @stub
    val YES_NO_OPTION: Int = ???
}
