package java.lang.reflect

import java.lang.{Class, Object}

// The Array class provides static methods to dynamically create and
// access Java arrays.
//
// Array permits widening conversions to occur during a get or set
// operation, but throws an IllegalArgumentException if a narrowing
// conversion would occur.
final class Array extends Object {
}

object Array {
    @stub
    // Returns the value of the indexed component in the specified
    // array object.
    def get(array: Object, index: Int): Object = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a boolean.
    def getBoolean(array: Object, index: Int): Boolean = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a byte.
    def getByte(array: Object, index: Int): Byte = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a char.
    def getChar(array: Object, index: Int): Char = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a double.
    def getDouble(array: Object, index: Int): double = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a float.
    def getFloat(array: Object, index: Int): float = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as an int.
    def getInt(array: Object, index: Int): Int = ???

    @stub
    // Returns the length of the specified array object, as an int.
    def getLength(array: Object): Int = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a long.
    def getLong(array: Object, index: Int): Long = ???

    @stub
    // Returns the value of the indexed component in the specified
    // array object, as a short.
    def getShort(array: Object, index: Int): Short = ???

    @stub
    // Creates a new array
    // with the specified component type and dimensions.
    def newInstance(componentType: Class[_], dimensions: int...): Object = ???

    @stub
    // Creates a new array with the specified component type and
    // length.
    def newInstance(componentType: Class[_], length: Int): Object = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified new value.
    def set(array: Object, index: Int, value: Object): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified boolean value.
    def setBoolean(array: Object, index: Int, z: Boolean): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified byte value.
    def setByte(array: Object, index: Int, b: Byte): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified char value.
    def setChar(array: Object, index: Int, c: Char): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified double value.
    def setDouble(array: Object, index: Int, d: double): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified float value.
    def setFloat(array: Object, index: Int, f: float): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified int value.
    def setInt(array: Object, index: Int, i: Int): Unit = ???

    @stub
    // Sets the value of the indexed component of the specified array
    // object to the specified long value.
    def setLong(array: Object, index: Int, l: Long): Unit = ???
}
