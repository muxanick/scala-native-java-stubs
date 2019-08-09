package java.lang.reflect

import java.lang.{Class, Object, String}
import java.lang.annotation.Annotation

/** A Field provides information about, and dynamic access to, a
 *  single field of a class or an interface.  The reflected field may
 *  be a class (static) field or an instance field.
 * 
 *  A Field permits widening conversions to occur during a get or
 *  set access operation, but throws an IllegalArgumentException if a
 *  narrowing conversion would occur.
 */
final class Field extends AccessibleObject with Member {

    /** Compares this Field against the specified object. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the value of the field represented by this Field, on
     *  the specified object.
     */
    @stub
    def get(obj: Object): Object = ???

    /** Returns an AnnotatedType object that represents the use of a type to specify
     *  the declared type of the field represented by this Field.
     */
    @stub
    def getAnnotatedType(): AnnotatedType = ???

    /** Returns this element's annotation for the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[T <: Annotation](annotationClass: Class[T]): T = ???

    /** Returns annotations that are associated with this element. */
    @stub
    def getAnnotationsByType[T <: Annotation](annotationClass: Class[T]): Array[T] = ???

    /** Gets the value of a static or instance boolean field. */
    @stub
    def getBoolean(obj: Object): Boolean = ???

    /** Gets the value of a static or instance byte field. */
    @stub
    def getByte(obj: Object): Byte = ???

    /** Gets the value of a static or instance field of type
     *  char or of another primitive type convertible to
     *  type char via a widening conversion.
     */
    @stub
    def getChar(obj: Object): Char = ???

    /** Returns annotations that are directly present on this element. */
    @stub
    def getDeclaredAnnotations(): Array[Annotation] = ???

    /** Returns the Class object representing the class or interface
     *  that declares the field represented by this Field object.
     */
    @stub
    def getDeclaringClass(): Class[_] = ???

    /** Gets the value of a static or instance field of type
     *  double or of another primitive type convertible to
     *  type double via a widening conversion.
     */
    @stub
    def getDouble(obj: Object): Double = ???

    /** Gets the value of a static or instance field of type
     *  float or of another primitive type convertible to
     *  type float via a widening conversion.
     */
    @stub
    def getFloat(obj: Object): Float = ???

    /** Returns a Type object that represents the declared type for
     *  the field represented by this Field object.
     */
    @stub
    def getGenericType(): Type = ???

    /** Gets the value of a static or instance field of type
     *  int or of another primitive type convertible to
     *  type int via a widening conversion.
     */
    @stub
    def getInt(obj: Object): Int = ???

    /** Gets the value of a static or instance field of type
     *  long or of another primitive type convertible to
     *  type long via a widening conversion.
     */
    @stub
    def getLong(obj: Object): Long = ???

    /** Returns the Java language modifiers for the field represented
     *  by this Field object, as an integer.
     */
    @stub
    def getModifiers(): Int = ???

    /** Returns the name of the field represented by this Field object. */
    @stub
    def getName(): String = ???

    /** Gets the value of a static or instance field of type
     *  short or of another primitive type convertible to
     *  type short via a widening conversion.
     */
    @stub
    def getShort(obj: Object): Short = ???

    /** Returns a Class object that identifies the
     *  declared type for the field represented by this
     *  Field object.
     */
    @stub
    def getType(): Class[_] = ???

    /** Returns a hashcode for this Field. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this field represents an element of
     *  an enumerated type; returns false otherwise.
     */
    @stub
    def isEnumConstant(): Boolean = ???

    /** Returns true if this field is a synthetic
     *  field; returns false otherwise.
     */
    @stub
    def isSynthetic(): Boolean = ???

    /** Sets the field represented by this Field object on the
     *  specified object argument to the specified new value.
     */
    @stub
    def set(obj: Object, value: Object): Unit = ???

    /** Sets the value of a field as a boolean on the specified object. */
    @stub
    def setBoolean(obj: Object, z: Boolean): Unit = ???

    /** Sets the value of a field as a byte on the specified object. */
    @stub
    def setByte(obj: Object, b: Byte): Unit = ???

    /** Sets the value of a field as a char on the specified object. */
    @stub
    def setChar(obj: Object, c: Char): Unit = ???

    /** Sets the value of a field as a double on the specified object. */
    @stub
    def setDouble(obj: Object, d: Double): Unit = ???

    /** Sets the value of a field as a float on the specified object. */
    @stub
    def setFloat(obj: Object, f: Float): Unit = ???

    /** Sets the value of a field as an int on the specified object. */
    @stub
    def setInt(obj: Object, i: Int): Unit = ???

    /** Sets the value of a field as a long on the specified object. */
    @stub
    def setLong(obj: Object, l: Long): Unit = ???

    /** Sets the value of a field as a short on the specified object. */
    @stub
    def setShort(obj: Object, s: Short): Unit = ???

    /** Returns a string describing this Field, including
     *  its generic type.
     */
    @stub
    def toGenericString(): String = ???
}
