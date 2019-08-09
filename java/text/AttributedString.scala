package java.text

import java.lang.{Object, String}
import java.util.Map

// An AttributedString holds text and related attribute information. It
// may be used as the actual data storage in some cases where a text
// reader wants to access attributed text through the AttributedCharacterIterator
// interface.
//
// 
// An attribute is a key/value pair, identified by the key.  No two
// attributes on a given character can have the same key.
//
// The values for an attribute are immutable, or must not be mutated
// by clients or storage.  They are always passed by reference, and not
// cloned.
class AttributedString extends Object {

    @stub
    // Constructs an AttributedString instance with the given attributed
    // text represented by AttributedCharacterIterator.
    def this(text: AttributedCharacterIterator) = ???

    @stub
    // Constructs an AttributedString instance with the subrange of
    // the given attributed text represented by
    // AttributedCharacterIterator.
    def this(text: AttributedCharacterIterator, beginIndex: Int, endIndex: Int) = ???

    @stub
    // Constructs an AttributedString instance with the subrange of
    // the given attributed text represented by
    // AttributedCharacterIterator.
    def this(text: AttributedCharacterIterator, beginIndex: Int, endIndex: Int, attributes: Array[AttributedCharacterIterator.Attribute]) = ???

    @stub
    // Constructs an AttributedString instance with the given text.
    def this(text: String) = ???

    @stub
    // Adds an attribute to the entire string.
    def addAttribute(attribute: AttributedCharacterIterator.Attribute, value: Object): Unit = ???

    @stub
    // Adds an attribute to a subrange of the string.
    def addAttribute(attribute: AttributedCharacterIterator.Attribute, value: Object, beginIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Adds a set of attributes to a subrange of the string.
    def addAttributes(attributes: Map[_ <: AttributedCharacterIterator.Attribute, _], beginIndex: Int, endIndex: Int): Unit = ???

    @stub
    // Creates an AttributedCharacterIterator instance that provides access to the entire contents of
    // this string.
    def getIterator(): AttributedCharacterIterator = ???

    @stub
    // Creates an AttributedCharacterIterator instance that provides access to
    // selected contents of this string.
    def getIterator(attributes: Array[AttributedCharacterIterator.Attribute]): AttributedCharacterIterator = ???
}
