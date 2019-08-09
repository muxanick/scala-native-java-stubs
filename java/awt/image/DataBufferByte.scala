package java.awt.image

import java.lang.Object

// This class extends DataBuffer and stores data internally as bytes.
// Values stored in the byte array(s) of this DataBuffer are treated as
// unsigned values.
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
// underlying storage as a Java array, as noted below in the
// documentation for those methods.
// 
final class DataBufferByte extends DataBuffer {

    @stub
    // Constructs a byte-based DataBuffer with the specified arrays.
    def this(dataArray: Array[Array[Byte]], size: Int) = ???

    @stub
    // Constructs a byte-based DataBuffer with the specified arrays, size,
    // and offsets.
    def this(dataArray: Array[Array[Byte]], size: Int, offsets: Array[Int]) = ???

    @stub
    // Constructs a byte-based DataBuffer with a single bank using the
    // specified array.
    def this(dataArray: Array[Byte], size: Int) = ???

    @stub
    // Constructs a byte-based DataBuffer with a single bank using the
    // specified array, size, and offset.
    def this(dataArray: Array[Byte], size: Int, offset: Int) = ???

    @stub
    // Constructs a byte-based DataBuffer with a single bank and the
    // specified size.
    def this(size: Int) = ???

    @stub
    // Returns the data arrays for all banks.
    def getBankData(): Array[Array[Byte]] = ???

    @stub
    // Returns the default (first) byte data array.
    def getData(): Array[Byte] = ???

    @stub
    // Returns the data array for the specified bank.
    def getData(bank: Int): Array[Byte] = ???

    @stub
    // Returns the requested data array element from the first (default) bank.
    def getElem(i: Int): Int = ???

    @stub
    // Returns the requested data array element from the specified bank.
    def getElem(bank: Int, i: Int): Int = ???

    @stub
    // Sets the requested data array element in the first (default) bank
    // to the specified value.
    def setElem(i: Int, val: Int): Unit = ???
}
