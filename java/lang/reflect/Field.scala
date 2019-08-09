package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

// A Field provides information about, and dynamic access to, a
// single field of a class or an interface.  The reflected field may
// be a class (static) field or an instance field.
//
// A Field permits widening conversions to occur during a get or
// set access operation, but throws an IllegalArgumentException if a
// narrowing conversion would occur.
final class Field extends AccessibleObject with Member {

    @stub
    // Compares this Field against the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the value of the field represented by this Field, on
    // the specified object.
    def get(obj: Object): Object = ???

    @stub
    // Returns an AnnotatedType object that represents the use of a type to specify
    // the declared type of the field represented by this Field.
    def getAnnotatedType(): AnnotatedType = ???

    @stub
    // Returns this element's annotation for the specified type if
    // such an annotation is present, else null.
    def T: [T <: Annotation] = ???

    @stub
    // Returns annotations that are associated with this element.
    def Array[T]: [T <: Annotation] = ???

    @stub
    // Gets the value of a static or instance boolean field.
    def getBoolean(obj: Object): Boolean = ???

    @stub
    // Gets the value of a static or instance byte field.
    def getByte(obj: Object): Byte = ???

    @stub
    // Gets the value of a static or instance field of type
    // char or of another primitive type convertible to
    // type char via a widening conversion.
    def getChar(obj: Object): Char = ???

    @stub
    // Returns annotations that are directly present on this element.
    def getDeclaredAnnotations(): Array[Annotation] = ???

    @stub
    // Returns the Class object representing the class or interface
    // that declares the field represented by this Field object.
    def getDeclaringClass(): Class[_] = ???

    @stub
    // Gets the value of a static or instance field of type
    // double or of another primitive type convertible to
    // type double via a widening conversion.
    def getDouble(obj: Object): double = ???

    @stub
    // Gets the value of a static or instance field of type
    // float or of another primitive type convertible to
    // type float via a widening conversion.
    def getFloat(obj: Object): float = ???

    @stub
    // Returns a Type object that represents the declared type for
    // the field represented by this Field object.
    def getGenericType(): Type = ???

    @stub
    // Gets the value of a static or instance field of type
    // int or of another primitive type convertible to
    // type int via a widening conversion.
    def getInt(obj: Object): Int = ???

    @stub
    // Gets the value of a static or instance field of type
    // long or of another primitive type convertible to
    // type long via a widening conversion.
    def getLong(obj: Object): Long = ???

    @stub
    // Returns the Java language modifiers for the field represented
    // by this Field object, as an integer.
    def getModifiers(): Int = ???

    @stub
    // Returns the name of the field represented by this Field object.
    def getName(): String = ???

    @stub
    // Gets the value of a static or instance field of type
    // short or of another primitive type convertible to
    // type short via a widening conversion.
    def getShort(obj: Object): Short = ???

    @stub
    // Returns a Class object that identifies the
    // declared type for the field represented by this
    // Field object.
    def getType(): Class[_] = ???

    @stub
    // Returns a hashcode for this Field.
    def hashCode(): Int = ???

    @stub
    // Returns true if this field represents an element of
    // an enumerated type; returns false otherwise.
    def isEnumConstant(): Boolean = ???

    @stub
    // Returns true if this field is a synthetic
    // field; returns false otherwise.
    def isSynthetic(): Boolean = ???

    @stub
    // Sets the field represented by this Field object on the
    // specified object argument to the specified new value.
    def set(obj: Object, value: Object): Unit = ???

    @stub
    // Sets the value of a field as a boolean on the specified object.
    def setBoolean(obj: Object, z: Boolean): Unit = ???

    @stub
    // Sets the value of a field as a byte on the specified object.
    def setByte(obj: Object, b: Byte): Unit = ???

    @stub
    // Sets the value of a field as a char on the specified object.
    def setChar(obj: Object, c: Char): Unit = ???

    @stub
    // Sets the value of a field as a double on the specified object.
    def setDouble(obj: Object, d: double): Unit = ???

    @stub
    // Sets the value of a field as a float on the specified object.
    def setFloat(obj: Object, f: float): Unit = ???

    @stub
    // Sets the value of a field as an int on the specified object.
    def setInt(obj: Object, i: Int): Unit = ???

    @stub
    // Sets the value of a field as a long on the specified object.
    def setLong(obj: Object, l: Long): Unit = ???

    @stub
    // Sets the value of a field as a short on the specified object.
    def setShort(obj: Object, s: Short): Unit = ???

    @stub
    // Returns a string describing this Field, including
    // its generic type.
    def toGenericString(): String = ???
}
