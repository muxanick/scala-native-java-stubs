package java.text.spi

import java.lang.Object
import java.text.Collator
import java.util.Locale
import java.util.spi.LocaleServiceProvider
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide concrete implementations of the
 *  Collator class.
 */
abstract class CollatorProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a new Collator instance for the specified locale. */
    def getInstance(locale: Locale): Collator
}
