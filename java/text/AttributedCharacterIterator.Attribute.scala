package java.text

import java.io.Serializable
import java.lang.{Object, String}

// Defines attribute keys that are used to identify text attributes. These
// keys are used in AttributedCharacterIterator and AttributedString.
object AttributedCharacterIterator.Attribute extends Object with Serializable {

    @stub
    // Attribute key for input method segments.
    def INPUT_METHOD_SEGMENT: AttributedCharacterIterator.Attribute = ???

    @stub
    // Attribute key for the language of some text.
    def LANGUAGE: AttributedCharacterIterator.Attribute = ???

    @stub
    // Compares two objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the name of the attribute.
    protected def getName(): String = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???

    @stub
    // Resolves instances being deserialized to the predefined constants.
    protected def readResolve(): Object = ???
}
