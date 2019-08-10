package java.awt.im.spi

import java.awt.{AWTEvent, Rectangle}
import java.lang.{Character.Subset, Object}
import java.util.Locale
import scala.scalanative.annotation.stub

/** Defines the interface for an input method that supports complex text input.
 *  Input methods traditionally support text input for languages that have
 *  more characters than can be represented on a standard-size keyboard,
 *  such as Chinese, Japanese, and Korean. However, they may also be used to
 *  support phonetic text input for English or character reordering for Thai.
 *  
 *  Subclasses of InputMethod can be loaded by the input method framework; they
 *  can then be selected either through the API
 *  (InputContext.selectInputMethod)
 *  or the user interface (the input method selection menu).
 */
trait InputMethod {

    /** Activates the input method for immediate input processing. */
    @stub
    def activate(): Unit = ???

    /** Deactivates the input method. */
    @stub
    def deactivate(isTemporary: Boolean): Unit = ???

    /** Dispatches the event to the input method. */
    @stub
    def dispatchEvent(event: AWTEvent): Unit = ???

    /** Releases the resources used by this input method. */
    @stub
    def dispose(): Unit = ???

    /** Ends any input composition that may currently be going on in this
     *  context.
     */
    @stub
    def endComposition(): Unit = ???

    /** Returns a control object from this input method, or null. */
    @stub
    def getControlObject(): Any = ???

    /** Returns the current input locale. */
    @stub
    def getLocale(): Locale = ???

    /** Closes or hides all windows opened by this input method instance or
     *  its class.
     */
    @stub
    def hideWindows(): Unit = ???

    /** Determines whether this input method is enabled. */
    @stub
    def isCompositionEnabled(): Boolean = ???

    /** Notifies this input method of changes in the client window
     *  location or state.
     */
    @stub
    def notifyClientWindowChange(bounds: Rectangle): Unit = ???

    /** Starts the reconversion operation. */
    @stub
    def reconvert(): Unit = ???

    /** Notifies the input method that a client component has been
     *  removed from its containment hierarchy, or that input method
     *  support has been disabled for the component.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Sets the subsets of the Unicode character set that this input method
     *  is allowed to input.
     */
    @stub
    def setCharacterSubsets(subsets: Array[Character.Subset]): Unit = ???

    /** Enables or disables this input method for composition,
     *  depending on the value of the parameter enable.
     */
    @stub
    def setCompositionEnabled(enable: Boolean): Unit = ???

    /** Sets the input method context, which is used to dispatch input method
     *  events to the client component and to request information from
     *  the client component.
     */
    @stub
    def setInputMethodContext(context: InputMethodContext): Unit = ???

    /** Attempts to set the input locale. */
    @stub
    def setLocale(locale: Locale): Boolean = ???
}
