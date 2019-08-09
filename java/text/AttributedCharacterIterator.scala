package java.text

import java.lang.Object
import java.util.{Map, Set}

// An AttributedCharacterIterator allows iteration through both text and
// related attribute information.
//
// 
// An attribute is a key/value pair, identified by the key.  No two
// attributes on a given character can have the same key.
//
// The values for an attribute are immutable, or must not be mutated
// by clients or storage.  They are always passed by reference, and not
// cloned.
//
// A run with respect to an attribute is a maximum text range for
// which:
// 
// the attribute is undefined or null for the entire range, or
// the attribute value is defined and has the same non-null value for the
//     entire range.
// 
//
// A run with respect to a set of attributes is a maximum text range for
// which this condition is met for each member attribute.
//
// When getting a run with no explicit attributes specified (i.e.,
// calling getRunStart() and getRunLimit()), any
// contiguous text segments having the same attributes (the same set
// of attribute/value pairs) are treated as separate runs if the
// attributes have been given to those text segments separately.
//
// The returned indexes are limited to the range of the iterator.
//
// The returned attribute information is limited to runs that contain
// the current character.
//
// 
// Attribute keys are instances of AttributedCharacterIterator.Attribute and its
// subclasses, such as TextAttribute.
trait AttributedCharacterIterator extends CharacterIterator {

    @stub
    // Returns the keys of all attributes defined on the
    // iterator's text range.
    def getAllAttributeKeys(): Set[AttributedCharacterIterator.Attribute] = ???

    @stub
    // Returns the value of the named attribute for the current character.
    def getAttribute(attribute: AttributedCharacterIterator.Attribute): Object = ???

    @stub
    // Returns a map with the attributes defined on the current
    // character.
    def getAttributes(): Map[AttributedCharacterIterator.Attribute, Object] = ???

    @stub
    // Returns the index of the first character following the run
    // with respect to all attributes containing the current character.
    def getRunLimit(): Int = ???

    @stub
    // Returns the index of the first character following the run
    // with respect to the given attribute containing the current character.
    def getRunLimit(attribute: AttributedCharacterIterator.Attribute): Int = ???

    @stub
    // Returns the index of the first character following the run
    // with respect to the given attributes containing the current character.
    def getRunLimit(attributes: Set[_ <: AttributedCharacterIterator.Attribute]): Int = ???

    @stub
    // Returns the index of the first character of the run
    // with respect to all attributes containing the current character.
    def getRunStart(): Int = ???

    @stub
    // Returns the index of the first character of the run
    // with respect to the given attribute containing the current character.
    def getRunStart(attribute: AttributedCharacterIterator.Attribute): Int = ???
}
