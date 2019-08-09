package java.awt.im

import java.awt.{AWTEvent, Component}
import java.lang.{Character.Subset, Object}
import java.util.Locale
import scala.scalanative.annotation.stub

/** Provides methods to control text input facilities such as input
 *  methods and keyboard layouts.
 *  Two methods handle both input methods and keyboard layouts: selectInputMethod
 *  lets a client component select an input method or keyboard layout by locale,
 *  getLocale lets a client component obtain the locale of the current input method
 *  or keyboard layout.
 *  The other methods more specifically support interaction with input methods:
 *  They let client components control the behavior of input methods, and
 *  dispatch events from the client component to the input method.
 * 
 *  
 *  By default, one InputContext instance is created per Window instance,
 *  and this input context is shared by all components within the window's
 *  container hierarchy. However, this means that only one text input
 *  operation is possible at any one time within a window, and that the
 *  text needs to be committed when moving the focus from one text component
 *  to another. If this is not desired, text components can create their
 *  own input context instances.
 * 
 *  
 *  The Java Platform supports input methods that have been developed in the Java
 *  programming language, using the interfaces in the java.awt.im.spi package,
 *  and installed into a Java SE Runtime Environment as extensions. Implementations
 *  may also support using the native input methods of the platforms they run on;
 *  however, not all platforms and locales provide input methods. Keyboard layouts
 *  are provided by the host platform.
 * 
 *  
 *  Input methods are unavailable if (a) no input method written
 *  in the Java programming language has been installed and (b) the Java Platform implementation
 *  or the underlying platform does not support native input methods. In this case,
 *  input contexts can still be created and used; their behavior is specified with
 *  the individual methods below.
 */
class InputContext extends Object {

    /** Constructs an InputContext. */
    @stub
    protected def this() = ???

    /** Dispatches an event to the active input method. */
    @stub
    def dispatchEvent(event: AWTEvent): Unit = ???

    /** Releases the resources used by this input context. */
    @stub
    def dispose(): Unit = ???

    /** Ends any input composition that may currently be going on in this
     *  context.
     */
    @stub
    def endComposition(): Unit = ???

    /** Returns a control object from the current input method, or null. */
    @stub
    def getInputMethodControlObject(): Object = ???

    /** Returns the current locale of the current input method or keyboard
     *  layout.
     */
    @stub
    def getLocale(): Locale = ???

    /** Determines whether the current input method is enabled for composition. */
    @stub
    def isCompositionEnabled(): Boolean = ???

    /** Asks the current input method to reconvert text from the
     *  current client component.
     */
    @stub
    def reconvert(): Unit = ???

    /** Notifies the input context that a client component has been
     *  removed from its containment hierarchy, or that input method
     *  support has been disabled for the component.
     */
    @stub
    def removeNotify(client: Component): Unit = ???

    /** Attempts to select an input method or keyboard layout that
     *  supports the given locale, and returns a value indicating whether such
     *  an input method or keyboard layout has been successfully selected.
     */
    @stub
    def selectInputMethod(locale: Locale): Boolean = ???

    /** Sets the subsets of the Unicode character set that input methods of this input
     *  context should be allowed to input.
     */
    @stub
    def setCharacterSubsets(subsets: Array[Character.Subset]): Unit = ???

    /** Enables or disables the current input method for composition,
     *  depending on the value of the parameter enable.
     */
    @stub
    def setCompositionEnabled(enable: Boolean): Unit = ???
}

object InputContext {
    /** Returns a new InputContext instance. */
    @stub
    def getInstance(): InputContext = ???
}
