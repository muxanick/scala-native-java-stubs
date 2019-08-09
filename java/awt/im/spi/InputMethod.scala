package java.awt.im.spi

import java.awt.{AWTEvent, Rectangle}
import java.lang.{Character.Subset, Object}
import java.util.Locale

// Defines the interface for an input method that supports complex text input.
// Input methods traditionally support text input for languages that have
// more characters than can be represented on a standard-size keyboard,
// such as Chinese, Japanese, and Korean. However, they may also be used to
// support phonetic text input for English or character reordering for Thai.
// 
// Subclasses of InputMethod can be loaded by the input method framework; they
// can then be selected either through the API
// (InputContext.selectInputMethod)
// or the user interface (the input method selection menu).
trait InputMethod {

    @stub
    // Activates the input method for immediate input processing.
    def activate(): Unit = ???

    @stub
    // Deactivates the input method.
    def deactivate(isTemporary: Boolean): Unit = ???

    @stub
    // Dispatches the event to the input method.
    def dispatchEvent(event: AWTEvent): Unit = ???

    @stub
    // Releases the resources used by this input method.
    def dispose(): Unit = ???

    @stub
    // Ends any input composition that may currently be going on in this
    // context.
    def endComposition(): Unit = ???

    @stub
    // Returns a control object from this input method, or null.
    def getControlObject(): Object = ???

    @stub
    // Returns the current input locale.
    def getLocale(): Locale = ???

    @stub
    // Closes or hides all windows opened by this input method instance or
    // its class.
    def hideWindows(): Unit = ???

    @stub
    // Determines whether this input method is enabled.
    def isCompositionEnabled(): Boolean = ???

    @stub
    // Notifies this input method of changes in the client window
    // location or state.
    def notifyClientWindowChange(bounds: Rectangle): Unit = ???

    @stub
    // Starts the reconversion operation.
    def reconvert(): Unit = ???

    @stub
    // Notifies the input method that a client component has been
    // removed from its containment hierarchy, or that input method
    // support has been disabled for the component.
    def removeNotify(): Unit = ???

    @stub
    // Sets the subsets of the Unicode character set that this input method
    // is allowed to input.
    def setCharacterSubsets(subsets: Array[Character.Subset]): Unit = ???

    @stub
    // Enables or disables this input method for composition,
    // depending on the value of the parameter enable.
    def setCompositionEnabled(enable: Boolean): Unit = ???

    @stub
    // Sets the input method context, which is used to dispatch input method
    // events to the client component and to request information from
    // the client component.
    def setInputMethodContext(context: InputMethodContext): Unit = ???
}
