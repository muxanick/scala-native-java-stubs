package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

//  Underlying security services instantiate and pass a
// ConfirmationCallback to the handle
// method of a CallbackHandler to ask for YES/NO,
// OK/CANCEL, YES/NO/CANCEL or other similar confirmations.
class ConfirmationCallback extends Object with Callback, with Serializable {

    @stub
    // Construct a ConfirmationCallback with a
    // message type, an option type and a default option.
    def this(messageType: Int, optionType: Int, defaultOption: Int) = ???

    @stub
    // Construct a ConfirmationCallback with a
    // message type, a list of options and a default option.
    def this(messageType: Int, options: Array[String], defaultOption: Int) = ???

    @stub
    // Construct a ConfirmationCallback with a prompt,
    // message type, an option type and a default option.
    def this(prompt: String, messageType: Int, optionType: Int, defaultOption: Int) = ???

    @stub
    // Get the default option.
    def getDefaultOption(): Int = ???

    @stub
    // Get the message type.
    def getMessageType(): Int = ???

    @stub
    // Get the confirmation options.
    def getOptions(): Array[String] = ???

    @stub
    // Get the option type.
    def getOptionType(): Int = ???

    @stub
    // Get the prompt.
    def getPrompt(): String = ???

    @stub
    // Get the selected confirmation option.
    def getSelectedIndex(): Int = ???
}

object ConfirmationCallback {
    @stub
    // CANCEL option.
    def CANCEL: Int = ???

    @stub
    // ERROR message type.
    def ERROR: Int = ???

    @stub
    // INFORMATION message type.
    def INFORMATION: Int = ???

    @stub
    // NO option.
    def NO: Int = ???

    @stub
    // OK option.
    def OK: Int = ???

    @stub
    // OK/CANCEL confirmation confirmation option.
    def OK_CANCEL_OPTION: Int = ???

    @stub
    // Unspecified option type.
    def UNSPECIFIED_OPTION: Int = ???

    @stub
    // WARNING message type.
    def WARNING: Int = ???

    @stub
    // YES option.
    def YES: Int = ???

    @stub
    // YES/NO/CANCEL confirmation confirmation option.
    def YES_NO_CANCEL_OPTION: Int = ???
}
