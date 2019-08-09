package java.awt.im.spi

import java.awt.Image
import java.lang.String
import java.util.Locale

/** Defines methods that provide sufficient information about an input method
 *  to enable selection and loading of that input method.
 *  The input method itself is only loaded when it is actually used.
 */
trait InputMethodDescriptor {

    /** Creates a new instance of the corresponding input method. */
    @stub
    def createInputMethod(): InputMethod = ???

    /** Returns the locales supported by the corresponding input method. */
    @stub
    def getAvailableLocales(): Array[Locale] = ???

    /** Returns the user-visible name of the corresponding
     *  input method for the given input locale in the language in which
     *  the name will be displayed.
     */
    @stub
    def getInputMethodDisplayName(inputLocale: Locale, displayLanguage: Locale): String = ???

    /** Returns an icon for the corresponding input method. */
    @stub
    def getInputMethodIcon(inputLocale: Locale): Image = ???
}
