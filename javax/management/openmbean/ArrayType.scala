package javax.management.openmbean

import java.lang.{Class, Object}

// The ArrayType class is the open type class whose instances describe
// all open data values which are n-dimensional arrays of open data values.
// 
// Examples of valid ArrayType instances are:
// 
// // 2-dimension array of java.lang.String
// ArrayType<String[][]> a1 = new ArrayType<String[][]>(2, SimpleType.STRING);
//
// // 1-dimension array of int
// ArrayType<int[]> a2 = new ArrayType<int[]>(SimpleType.INTEGER, true);
//
// // 1-dimension array of java.lang.Integer
// ArrayType<Integer[]> a3 = new ArrayType<Integer[]>(SimpleType.INTEGER, false);
//
// // 4-dimension array of int
// ArrayType<int[][][][]> a4 = new ArrayType<int[][][][]>(3, a2);
//
// // 4-dimension array of java.lang.Integer
// ArrayType<Integer[][][][]> a5 = new ArrayType<Integer[][][][]>(3, a3);
//
// // 1-dimension array of java.lang.String
// ArrayType<String[]> a6 = new ArrayType<String[]>(SimpleType.STRING, false);
//
// // 1-dimension array of long
// ArrayType<long[]> a7 = new ArrayType<long[]>(SimpleType.LONG, true);
//
// // 1-dimension array of java.lang.Integer
// ArrayType<Integer[]> a8 = ArrayType.getArrayType(SimpleType.INTEGER);
//
// // 2-dimension array of java.lang.Integer
// ArrayType<Integer[][]> a9 = ArrayType.getArrayType(a8);
//
// // 2-dimension array of int
// ArrayType<int[][]> a10 = ArrayType.getPrimitiveArrayType(int[][].class);
//
// // 3-dimension array of int
// ArrayType<int[][][]> a11 = ArrayType.getArrayType(a10);
//
// // 1-dimension array of float
// ArrayType<float[]> a12 = ArrayType.getPrimitiveArrayType(float[].class);
//
// // 2-dimension array of float
// ArrayType<float[][]> a13 = ArrayType.getArrayType(a12);
//
// // 1-dimension array of javax.management.ObjectName
// ArrayType<ObjectName[]> a14 = ArrayType.getArrayType(SimpleType.OBJECTNAME);
//
// // 2-dimension array of javax.management.ObjectName
// ArrayType<ObjectName[][]> a15 = ArrayType.getArrayType(a14);
//
// // 3-dimension array of java.lang.String
// ArrayType<String[][][]> a16 = new ArrayType<String[][][]>(3, SimpleType.STRING);
//
// // 1-dimension array of java.lang.String
// ArrayType<String[]> a17 = new ArrayType<String[]>(1, SimpleType.STRING);
//
// // 2-dimension array of java.lang.String
// ArrayType<String[][]> a18 = new ArrayType<String[][]>(1, a17);
//
// // 3-dimension array of java.lang.String
// ArrayType<String[][][]> a19 = new ArrayType<String[][][]>(1, a18);
// 
class ArrayType[T] extends OpenType[T] {

    @stub
    // Constructs an ArrayType instance describing open data values which are
    // arrays with dimension dimension of elements whose open type is elementType.
    def this(dimension: Int, elementType: OpenType[_]) = ???

    @stub
    // Compares the specified obj parameter with this
    // ArrayType instance for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the dimension of arrays described by this ArrayType instance.
    def getDimension(): Int = ???

    @stub
    // Returns the open type of element values contained in the arrays described by this ArrayType instance.
    def getElementOpenType(): OpenType[_] = ???

    @stub
    // Returns the hash code value for this ArrayType instance.
    def hashCode(): Int = ???

    @stub
    // Returns true if the open data values this open
    // type describes are primitive arrays, false otherwise.
    def isPrimitiveArray(): Boolean = ???

    @stub
    // Tests whether obj is a value for this ArrayType
    // instance.
    def isValue(obj: Object): Boolean = ???
}

object ArrayType {
    @stub
    // Create an ArrayType instance in a type-safe manner.
    def ArrayType[Array[E]]: [E] = ???

    @stub
    // Create an ArrayType instance in a type-safe manner.
    def ArrayType[T]: [T] = ???
}
