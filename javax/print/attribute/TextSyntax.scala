package javax.print.attribute

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** Class TextSyntax is an abstract base class providing the common
 *  implementation of all attributes whose value is a string. The text attribute
 *  includes a locale to indicate the natural language. Thus, a text attribute
 *  always represents a localized string. Once constructed, a text attribute's
 *  value is immutable.
 *  
 */
abstract class TextSyntax extends Object with Serializable with Cloneable {

    /** Constructs a TextAttribute with the specified string and locale. */
    @stub
    protected def this(value: String, locale: Locale) = ???

    /** Returns whether this text attribute is equivalent to the passed in
     *  object.
     */
    def equals(object: Any): Boolean

    /** Returns this text attribute's text string's natural language (locale). */
    def getLocale(): Locale

    /** Returns this text attribute's text string. */
    def getValue(): String

    /** Returns a hashcode for this text attribute. */
    def hashCode(): Int

    /** Returns a String identifying this text attribute. */
    def toString(): String
}
