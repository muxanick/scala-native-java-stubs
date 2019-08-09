package javax.security.auth.callback

import java.io.Serializable
import java.lang.{Object, String}

/**  Underlying security services instantiate and pass a
 *  ChoiceCallback to the handle
 *  method of a CallbackHandler to display a list of choices
 *  and to retrieve the selected choice(s).
 */
class ChoiceCallback extends Object with Callback with Serializable {

    /** Get the boolean determining whether multiple selections from
     *  the choices list are allowed.
     */
    @stub
    def allowMultipleSelections(): Boolean = ???

    /** Get the list of choices. */
    @stub
    def getChoices(): Array[String] = ???

    /** Get the defaultChoice. */
    @stub
    def getDefaultChoice(): Int = ???

    /** Get the prompt. */
    @stub
    def getPrompt(): String = ???

    /** Get the selected choices. */
    @stub
    def getSelectedIndexes(): Array[Int] = ???

    /** Set the selected choice. */
    @stub
    def setSelectedIndex(selection: Int): Unit = ???
}
