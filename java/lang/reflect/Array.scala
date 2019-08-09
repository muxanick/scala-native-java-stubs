package java.lang.reflect

import java.lang.{Class, Object}
import scala.scalanative.annotation.stub

/** The Array class provides static methods to dynamically create and
 *  access Java arrays.
 * 
 *  Array permits widening conversions to occur during a get or set
 *  operation, but throws an IllegalArgumentException if a narrowing
 *  conversion would occur.
 */
final class Array extends Object {
}

object Array {
    /** Returns the value of the indexed component in the specified
     *  array object.
     */
    @stub
    def get(array: Object, index: Int): Object = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a boolean.
     */
    @stub
    def getBoolean(array: Object, index: Int): Boolean = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a byte.
     */
    @stub
    def getByte(array: Object, index: Int): Byte = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a char.
     */
    @stub
    def getChar(array: Object, index: Int): Char = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a double.
     */
    @stub
    def getDouble(array: Object, index: Int): Double = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a float.
     */
    @stub
    def getFloat(array: Object, index: Int): Float = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as an int.
     */
    @stub
    def getInt(array: Object, index: Int): Int = ???

    /** Returns the length of the specified array object, as an int. */
    @stub
    def getLength(array: Object): Int = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a long.
     */
    @stub
    def getLong(array: Object, index: Int): Long = ???

    /** Returns the value of the indexed component in the specified
     *  array object, as a short.
     */
    @stub
    def getShort(array: Object, index: Int): Short = ???

    /** Creates a new array
     *  with the specified component type and dimensions.
     */
    @stub
    def newInstance(componentType: Class[_], dimensions: int*): Object = ???

    /** Creates a new array with the specified component type and
     *  length.
     */
    @stub
    def newInstance(componentType: Class[_], length: Int): Object = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified new value.
     */
    @stub
    def set(array: Object, index: Int, value: Object): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified boolean value.
     */
    @stub
    def setBoolean(array: Object, index: Int, z: Boolean): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified byte value.
     */
    @stub
    def setByte(array: Object, index: Int, b: Byte): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified char value.
     */
    @stub
    def setChar(array: Object, index: Int, c: Char): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified double value.
     */
    @stub
    def setDouble(array: Object, index: Int, d: Double): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified float value.
     */
    @stub
    def setFloat(array: Object, index: Int, f: Float): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified int value.
     */
    @stub
    def setInt(array: Object, index: Int, i: Int): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified long value.
     */
    @stub
    def setLong(array: Object, index: Int, l: Long): Unit = ???

    /** Sets the value of the indexed component of the specified array
     *  object to the specified short value.
     */
    @stub
    def setShort(array: Object, index: Int, s: Short): Unit = ???
}
