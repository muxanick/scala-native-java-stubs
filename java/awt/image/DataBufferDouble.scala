package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class extends DataBuffer and stores data internally
 *  in double form.
 *  
 *  
 *  Note that some implementations may function more efficiently
 *  if they can maintain control over how the data for an image is
 *  stored.
 *  For example, optimizations such as caching an image in video
 *  memory require that the implementation track all modifications
 *  to that data.
 *  Other implementations may operate better if they can store the
 *  data in locations other than a Java array.
 *  To maintain optimum compatibility with various optimizations
 *  it is best to avoid constructors and methods which expose the
 *  underlying storage as a Java array as noted below in the
 *  documentation for those methods.
 *  
 */
final class DataBufferDouble extends DataBuffer {

    /** Constructs a double-based DataBuffer
     *  with the specified data arrays.
     */
    @stub
    def this(dataArray: Array[Array[Double]], size: Int) = ???

    /** Constructs a double-based DataBuffer
     *  with the specified data arrays, size, and per-bank offsets.
     */
    @stub
    def this(dataArray: Array[Array[Double]], size: Int, offsets: Array[Int]) = ???

    /** Constructs a double-based DataBuffer
     *  with the specified data array.
     */
    @stub
    def this(dataArray: Array[Double], size: Int) = ???

    /** Constructs a double-based DataBuffer
     *  with the specified data array.
     */
    @stub
    def this(dataArray: Array[Double], size: Int, offset: Int) = ???

    /** Constructs a double-based DataBuffer
     *  with a specified size.
     */
    @stub
    def this(size: Int) = ???

    /** Constructs a double-based DataBuffer
     *  with a specified number of banks, all of which are of a
     *  specified size.
     */
    @stub
    def this(size: Int, numBanks: Int) = ???

    /** Returns the data array for all banks. */
    @stub
    def getBankData(): Array[Array[Double]] = ???

    /** Returns the default (first) double data array. */
    @stub
    def getData(): Array[Double] = ???

    /** Returns the data array for the specified bank. */
    @stub
    def getData(bank: Int): Array[Double] = ???

    /** Returns the requested data array element from the first
     *  (default) bank as an int.
     */
    @stub
    def getElem(i: Int): Int = ???

    /** Returns the requested data array element from the specified
     *  bank as an int.
     */
    @stub
    def getElem(bank: Int, i: Int): Int = ???

    /** Returns the requested data array element from the first
     *  (default) bank as a double.
     */
    @stub
    def getElemDouble(i: Int): Double = ???

    /** Returns the requested data array element from the specified
     *  bank as a double.
     */
    @stub
    def getElemDouble(bank: Int, i: Int): Double = ???

    /** Returns the requested data array element from the first
     *  (default) bank as a float.
     */
    @stub
    def getElemFloat(i: Int): Float = ???

    /** Returns the requested data array element from the specified
     *  bank as a float.
     */
    @stub
    def getElemFloat(bank: Int, i: Int): Float = ???

    /** Sets the requested data array element in the first (default)
     *  bank to the given int.
     */
    @stub
    def setElem(i: Int, val: Int): Unit = ???

    /** Sets the requested data array element in the specified bank
     *  to the given int.
     */
    @stub
    def setElem(bank: Int, i: Int, val: Int): Unit = ???

    /** Sets the requested data array element in the first (default)
     *  bank to the given double.
     */
    @stub
    def setElemDouble(i: Int, val: Double): Unit = ???

    /** Sets the requested data array element in the specified bank to
     *  the given double.
     */
    @stub
    def setElemDouble(bank: Int, i: Int, val: Double): Unit = ???

    /** Sets the requested data array element in the first (default)
     *  bank to the given float.
     */
    @stub
    def setElemFloat(i: Int, val: Float): Unit = ???

    /** Sets the requested data array element in the specified bank to
     *  the given float.
     */
    @stub
    def setElemFloat(bank: Int, i: Int, val: Float): Unit = ???
}
