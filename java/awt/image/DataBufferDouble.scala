package java.awt.image

import java.lang.Object

// This class extends DataBuffer and stores data internally
// in double form.
// 
// 
// Note that some implementations may function more efficiently
// if they can maintain control over how the data for an image is
// stored.
// For example, optimizations such as caching an image in video
// memory require that the implementation track all modifications
// to that data.
// Other implementations may operate better if they can store the
// data in locations other than a Java array.
// To maintain optimum compatibility with various optimizations
// it is best to avoid constructors and methods which expose the
// underlying storage as a Java array as noted below in the
// documentation for those methods.
// 
final class DataBufferDouble extends DataBuffer {

    @stub
    // Constructs a double-based DataBuffer
    // with the specified data arrays.
    def this(dataArray: Array[Array[double]], size: Int) = ???

    @stub
    // Constructs a double-based DataBuffer
    // with the specified data arrays, size, and per-bank offsets.
    def this(dataArray: Array[Array[double]], size: Int, offsets: Array[Int]) = ???

    @stub
    // Constructs a double-based DataBuffer
    // with the specified data array.
    def this(dataArray: Array[double], size: Int) = ???

    @stub
    // Constructs a double-based DataBuffer
    // with the specified data array.
    def this(dataArray: Array[double], size: Int, offset: Int) = ???

    @stub
    // Constructs a double-based DataBuffer
    // with a specified size.
    def this(size: Int) = ???

    @stub
    // Returns the data array for all banks.
    def getBankData(): Array[Array[double]] = ???

    @stub
    // Returns the default (first) double data array.
    def getData(): Array[double] = ???

    @stub
    // Returns the data array for the specified bank.
    def getData(bank: Int): Array[double] = ???

    @stub
    // Returns the requested data array element from the first
    // (default) bank as an int.
    def getElem(i: Int): Int = ???

    @stub
    // Returns the requested data array element from the specified
    // bank as an int.
    def getElem(bank: Int, i: Int): Int = ???

    @stub
    // Returns the requested data array element from the first
    // (default) bank as a double.
    def getElemDouble(i: Int): double = ???

    @stub
    // Returns the requested data array element from the specified
    // bank as a double.
    def getElemDouble(bank: Int, i: Int): double = ???

    @stub
    // Returns the requested data array element from the first
    // (default) bank as a float.
    def getElemFloat(i: Int): float = ???

    @stub
    // Returns the requested data array element from the specified
    // bank as a float.
    def getElemFloat(bank: Int, i: Int): float = ???

    @stub
    // Sets the requested data array element in the first (default)
    // bank to the given int.
    def setElem(i: Int, val: Int): Unit = ???

    @stub
    // Sets the requested data array element in the specified bank
    // to the given int.
    def setElem(bank: Int, i: Int, val: Int): Unit = ???

    @stub
    // Sets the requested data array element in the first (default)
    // bank to the given double.
    def setElemDouble(i: Int, val: double): Unit = ???

    @stub
    // Sets the requested data array element in the specified bank to
    // the given double.
    def setElemDouble(bank: Int, i: Int, val: double): Unit = ???

    @stub
    // Sets the requested data array element in the first (default)
    // bank to the given float.
    def setElemFloat(i: Int, val: float): Unit = ???
}
