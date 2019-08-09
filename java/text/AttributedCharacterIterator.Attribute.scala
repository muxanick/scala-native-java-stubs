package java.text

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Defines attribute keys that are used to identify text attributes. These
 *  keys are used in AttributedCharacterIterator and AttributedString.
 */
object AttributedCharacterIterator.Attribute extends Object with Serializable {

    /** Constructs an Attribute with the given name. */
    @stub
    protected def Attribute(name: String) = ???

    /** Attribute key for input method segments. */
    @stub
    val INPUT_METHOD_SEGMENT: AttributedCharacterIterator.Attribute = ???

    /** Attribute key for the language of some text. */
    @stub
    val LANGUAGE: AttributedCharacterIterator.Attribute = ???

    /** Attribute key for the reading of some text. */
    @stub
    val READING: AttributedCharacterIterator.Attribute = ???

    /** Compares two objects for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the name of the attribute. */
    @stub
    protected def getName(): String = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Resolves instances being deserialized to the predefined constants. */
    @stub
    protected def readResolve(): Object = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
