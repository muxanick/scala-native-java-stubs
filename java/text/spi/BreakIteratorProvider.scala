package java.text.spi

import java.lang.Object
import java.text.BreakIterator
import java.util.Locale
import java.util.spi.LocaleServiceProvider
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide concrete implementations of the
 *  BreakIterator class.
 */
abstract class BreakIteratorProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a new BreakIterator instance
     *  for character breaks
     *  for the given locale.
     */
    def getCharacterInstance(locale: Locale): BreakIterator

    /** Returns a new BreakIterator instance
     *  for line breaks
     *  for the given locale.
     */
    def getLineInstance(locale: Locale): BreakIterator

    /** Returns a new BreakIterator instance
     *  for sentence breaks
     *  for the given locale.
     */
    def getSentenceInstance(locale: Locale): BreakIterator

    /** Returns a new BreakIterator instance
     *  for word breaks
     *  for the given locale.
     */
    def getWordInstance(locale: Locale): BreakIterator
}
