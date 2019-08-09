package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class exists to wrap one or more data arrays.  Each data array in
 *  the DataBuffer is referred to as a bank.  Accessor methods for getting
 *  and setting elements of the DataBuffer's banks exist with and without
 *  a bank specifier.  The methods without a bank specifier use the default 0th
 *  bank.  The DataBuffer can optionally take an offset per bank, so that
 *  data in an existing array can be used even if the interesting data
 *  doesn't start at array location zero.  Getting or setting the 0th
 *  element of a bank, uses the (0+offset)th element of the array.  The
 *  size field specifies how much of the data array is available for
 *  use.  Size + offset for a given bank should never be greater
 *  than the length of the associated data array.  The data type of
 *  a data buffer indicates the type of the data array(s) and may also
 *  indicate additional semantics, e.g. storing unsigned 8-bit data
 *  in elements of a byte array.  The data type may be TYPE_UNDEFINED
 *  or one of the types defined below.  Other types may be added in
 *  the future.  Generally, an object of class DataBuffer will be cast down
 *  to one of its data type specific subclasses to access data type specific
 *  methods for improved performance.  Currently, the Java 2D(tm) API
 *  image classes use TYPE_BYTE, TYPE_USHORT, TYPE_INT, TYPE_SHORT,
 *  TYPE_FLOAT, and TYPE_DOUBLE DataBuffers to store image data.
 */
abstract class DataBuffer extends Object {

    /** Constructs a DataBuffer containing one bank of the specified
     *   data type and size.
     */
    @stub
    protected def this(dataType: Int, size: Int) = ???

    /** Constructs a DataBuffer containing the specified number of
     *   banks.
     */
    @stub
    protected def this(dataType: Int, size: Int, numBanks: Int) = ???

    /** Constructs a DataBuffer that contains the specified number
     *   of banks.
     */
    @stub
    protected def this(dataType: Int, size: Int, numBanks: Int, offset: Int) = ???

    /** Constructs a DataBuffer which contains the specified number
     *   of banks.
     */
    @stub
    protected def this(dataType: Int, size: Int, numBanks: Int, offsets: Array[Int]) = ???

    /** The number of banks in this DataBuffer. */
    protected val banks: Int

    /** The data type of this DataBuffer. */
    protected val dataType: Int

    /** Offset into default (first) bank from which to get the first element. */
    protected val offset: Int

    /** Offsets into all banks. */
    protected val offsets: Array[Int]

    /** Usable size of all banks. */
    protected val size: Int

    /** Returns the data type of this DataBuffer. */
    def getDataType(): Int

    /** Returns the requested data array element from the first (default) bank
     *  as an integer.
     */
    def getElem(i: Int): Int

    /** Returns the requested data array element from the specified bank
     *  as an integer.
     */
    def getElem(bank: Int, i: Int): Int

    /** Returns the requested data array element from the first (default) bank
     *  as a double.
     */
    def getElemDouble(i: Int): Double

    /** Returns the requested data array element from the specified bank as
     *  a double.
     */
    def getElemDouble(bank: Int, i: Int): Double

    /** Returns the requested data array element from the first (default) bank
     *  as a float.
     */
    def getElemFloat(i: Int): Float

    /** Returns the requested data array element from the specified bank
     *  as a float.
     */
    def getElemFloat(bank: Int, i: Int): Float

    /** Returns the number of banks in this DataBuffer. */
    def getNumBanks(): Int

    /** Returns the offset of the default bank in array elements. */
    def getOffset(): Int

    /** Returns the offsets (in array elements) of all the banks. */
    def getOffsets(): Array[Int]

    /** Returns the size (in array elements) of all banks. */
    def getSize(): Int

    /** Sets the requested data array element in the first (default) bank
     *  from the given integer.
     */
    def setElem(i: Int, val: Int): Unit

    /** Sets the requested data array element in the specified bank
     *  from the given integer.
     */
    def setElem(bank: Int, i: Int, val: Int): Unit

    /** Sets the requested data array element in the first (default) bank
     *  from the given double.
     */
    def setElemDouble(i: Int, val: Double): Unit

    /** Sets the requested data array element in the specified bank
     *  from the given double.
     */
    def setElemDouble(bank: Int, i: Int, val: Double): Unit

    /** Sets the requested data array element in the first (default) bank
     *  from the given float.
     */
    def setElemFloat(i: Int, val: Float): Unit

    /** Sets the requested data array element in the specified bank
     *  from the given float.
     */
    def setElemFloat(bank: Int, i: Int, val: Float): Unit
}

object DataBuffer {
    /** Tag for unsigned byte data. */
    @stub
    val TYPE_BYTE: Int = ???

    /** Tag for double data. */
    @stub
    val TYPE_DOUBLE: Int = ???

    /** Tag for float data. */
    @stub
    val TYPE_FLOAT: Int = ???

    /** Tag for int data. */
    @stub
    val TYPE_INT: Int = ???

    /** Tag for signed short data. */
    @stub
    val TYPE_SHORT: Int = ???

    /** Tag for undefined data. */
    @stub
    val TYPE_UNDEFINED: Int = ???

    /** Tag for unsigned short data. */
    @stub
    val TYPE_USHORT: Int = ???

    /** Returns the size (in bits) of the data type, given a datatype tag. */
    @stub
    def getDataTypeSize(type: Int): Int = ???
}
