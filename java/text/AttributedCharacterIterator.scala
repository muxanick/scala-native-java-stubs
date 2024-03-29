package java.text

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{Map, Set}
import scala.scalanative.annotation.stub

/** An AttributedCharacterIterator allows iteration through both text and
 *  related attribute information.
 * 
 *  
 *  An attribute is a key/value pair, identified by the key.  No two
 *  attributes on a given character can have the same key.
 * 
 *  The values for an attribute are immutable, or must not be mutated
 *  by clients or storage.  They are always passed by reference, and not
 *  cloned.
 * 
 *  A run with respect to an attribute is a maximum text range for
 *  which:
 *  
 *  the attribute is undefined or null for the entire range, or
 *  the attribute value is defined and has the same non-null value for the
 *      entire range.
 *  
 * 
 *  A run with respect to a set of attributes is a maximum text range for
 *  which this condition is met for each member attribute.
 * 
 *  When getting a run with no explicit attributes specified (i.e.,
 *  calling getRunStart() and getRunLimit()), any
 *  contiguous text segments having the same attributes (the same set
 *  of attribute/value pairs) are treated as separate runs if the
 *  attributes have been given to those text segments separately.
 * 
 *  The returned indexes are limited to the range of the iterator.
 * 
 *  The returned attribute information is limited to runs that contain
 *  the current character.
 * 
 *  
 *  Attribute keys are instances of AttributedCharacterIterator.Attribute and its
 *  subclasses, such as TextAttribute.
 */
trait AttributedCharacterIterator extends CharacterIterator {

    /** Returns the keys of all attributes defined on the
     *  iterator's text range.
     */
    @stub
    def getAllAttributeKeys(): Set[AttributedCharacterIterator.Attribute] = ???

    /** Returns the value of the named attribute for the current character. */
    @stub
    def getAttribute(attribute: AttributedCharacterIterator.Attribute): Any = ???

    /** Returns a map with the attributes defined on the current
     *  character.
     */
    @stub
    def getAttributes(): Map[AttributedCharacterIterator.Attribute, Object] = ???

    /** Returns the index of the first character following the run
     *  with respect to all attributes containing the current character.
     */
    @stub
    def getRunLimit(): Int = ???

    /** Returns the index of the first character following the run
     *  with respect to the given attribute containing the current character.
     */
    @stub
    def getRunLimit(attribute: AttributedCharacterIterator.Attribute): Int = ???

    /** Returns the index of the first character following the run
     *  with respect to the given attributes containing the current character.
     */
    @stub
    def getRunLimit(attributes: Set[_ <: AttributedCharacterIterator.Attribute]): Int = ???

    /** Returns the index of the first character of the run
     *  with respect to all attributes containing the current character.
     */
    @stub
    def getRunStart(): Int = ???

    /** Returns the index of the first character of the run
     *  with respect to the given attribute containing the current character.
     */
    @stub
    def getRunStart(attribute: AttributedCharacterIterator.Attribute): Int = ???

    /** Returns the index of the first character of the run
     *  with respect to the given attributes containing the current character.
     */
    @stub
    def getRunStart(attributes: Set[_ <: AttributedCharacterIterator.Attribute]): Int = ???
}

object AttributedCharacterIterator {
    /** Defines attribute keys that are used to identify text attributes. These
     *  keys are used in AttributedCharacterIterator and AttributedString.
     */
    object Attribute extends Object with Serializable {

        /** Constructs an Attribute with the given name. */
        @stub
        protected def apply(name: String) = ???

        /** Attribute key for input method segments. */
        @stub
        val INPUT_METHOD_SEGMENT: Attribute = ???

        /** Attribute key for the language of some text. */
        @stub
        val LANGUAGE: Attribute = ???

        /** Attribute key for the reading of some text. */
        @stub
        val READING: Attribute = ???

        /** Compares two objects for equality. */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Returns the name of the attribute. */
        @stub
        protected def getName(): String = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Resolves instances being deserialized to the predefined constants. */
        @stub
        protected def readResolve(): Any = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }

}
