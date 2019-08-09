package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

//  Underlying security services instantiate and pass a
// ChoiceCallback to the handle
// method of a CallbackHandler to display a list of choices
// and to retrieve the selected choice(s).
class ChoiceCallback extends Object with Callback, with Serializable {

    @stub
    // Get the boolean determining whether multiple selections from
    // the choices list are allowed.
    def allowMultipleSelections(): Boolean = ???

    @stub
    // Get the list of choices.
    def getChoices(): Array[String] = ???

    @stub
    // Get the defaultChoice.
    def getDefaultChoice(): Int = ???

    @stub
    // Get the prompt.
    def getPrompt(): String = ???

    @stub
    // Get the selected choices.
    def getSelectedIndexes(): Array[Int] = ???

    @stub
    // Set the selected choice.
    def setSelectedIndex(selection: Int): Unit = ???
}
