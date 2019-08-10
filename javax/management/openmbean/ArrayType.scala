package javax.management.openmbean

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** The ArrayType class is the open type class whose instances describe
 *  all open data values which are n-dimensional arrays of open data values.
 *  
 *  Examples of valid ArrayType instances are:
 *  
 *  // 2-dimension array of java.lang.String
 *  ArrayType<String[][]> a1 = new ArrayType<String[][]>(2, SimpleType.STRING);
 * 
 *  // 1-dimension array of int
 *  ArrayType<int[]> a2 = new ArrayType<int[]>(SimpleType.INTEGER, true);
 * 
 *  // 1-dimension array of java.lang.Integer
 *  ArrayType<Integer[]> a3 = new ArrayType<Integer[]>(SimpleType.INTEGER, false);
 * 
 *  // 4-dimension array of int
 *  ArrayType<int[][][][]> a4 = new ArrayType<int[][][][]>(3, a2);
 * 
 *  // 4-dimension array of java.lang.Integer
 *  ArrayType<Integer[][][][]> a5 = new ArrayType<Integer[][][][]>(3, a3);
 * 
 *  // 1-dimension array of java.lang.String
 *  ArrayType<String[]> a6 = new ArrayType<String[]>(SimpleType.STRING, false);
 * 
 *  // 1-dimension array of long
 *  ArrayType<long[]> a7 = new ArrayType<long[]>(SimpleType.LONG, true);
 * 
 *  // 1-dimension array of java.lang.Integer
 *  ArrayType<Integer[]> a8 = ArrayType.getArrayType(SimpleType.INTEGER);
 * 
 *  // 2-dimension array of java.lang.Integer
 *  ArrayType<Integer[][]> a9 = ArrayType.getArrayType(a8);
 * 
 *  // 2-dimension array of int
 *  ArrayType<int[][]> a10 = ArrayType.getPrimitiveArrayType(int[][].class);
 * 
 *  // 3-dimension array of int
 *  ArrayType<int[][][]> a11 = ArrayType.getArrayType(a10);
 * 
 *  // 1-dimension array of float
 *  ArrayType<float[]> a12 = ArrayType.getPrimitiveArrayType(float[].class);
 * 
 *  // 2-dimension array of float
 *  ArrayType<float[][]> a13 = ArrayType.getArrayType(a12);
 * 
 *  // 1-dimension array of javax.management.ObjectName
 *  ArrayType<ObjectName[]> a14 = ArrayType.getArrayType(SimpleType.OBJECTNAME);
 * 
 *  // 2-dimension array of javax.management.ObjectName
 *  ArrayType<ObjectName[][]> a15 = ArrayType.getArrayType(a14);
 * 
 *  // 3-dimension array of java.lang.String
 *  ArrayType<String[][][]> a16 = new ArrayType<String[][][]>(3, SimpleType.STRING);
 * 
 *  // 1-dimension array of java.lang.String
 *  ArrayType<String[]> a17 = new ArrayType<String[]>(1, SimpleType.STRING);
 * 
 *  // 2-dimension array of java.lang.String
 *  ArrayType<String[][]> a18 = new ArrayType<String[][]>(1, a17);
 * 
 *  // 3-dimension array of java.lang.String
 *  ArrayType<String[][][]> a19 = new ArrayType<String[][][]>(1, a18);
 *  
 */
class ArrayType[T] extends OpenType[T] {

    /** Constructs an ArrayType instance describing open data values which are
     *  arrays with dimension dimension of elements whose open type is elementType.
     */
    @stub
    def this(dimension: Int, elementType: OpenType[_]) = ???

    /** Constructs a unidimensional ArrayType instance for the
     *  supplied SimpleType.
     */
    @stub
    def this(elementType: SimpleType[_], primitiveArray: Boolean) = ???

    /** Compares the specified obj parameter with this
     *  ArrayType instance for equality.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the dimension of arrays described by this ArrayType instance. */
    @stub
    def getDimension(): Int = ???

    /** Returns the open type of element values contained in the arrays described by this ArrayType instance. */
    @stub
    def getElementOpenType(): OpenType[_] = ???

    /** Returns the hash code value for this ArrayType instance. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the open data values this open
     *  type describes are primitive arrays, false otherwise.
     */
    @stub
    def isPrimitiveArray(): Boolean = ???

    /** Tests whether obj is a value for this ArrayType
     *  instance.
     */
    @stub
    def isValue(obj: Any): Boolean = ???

    /** Returns a string representation of this ArrayType instance. */
    @stub
    def toString(): String = ???
}

object ArrayType {
    /** Create an ArrayType instance in a type-safe manner. */
    @stub
    def getArrayType[E](elementType: OpenType[E]): ArrayType[Array[E]] = ???

    /** Create an ArrayType instance in a type-safe manner. */
    @stub
    def getPrimitiveArrayType[T](arrayClass: Class[T]): ArrayType[T] = ???
}
