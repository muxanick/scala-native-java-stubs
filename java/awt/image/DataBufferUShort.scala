package java.awt.image

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class extends DataBuffer and stores data internally as
 *  shorts.  Values stored in the short array(s) of this DataBuffer
 *  are treated as unsigned values.
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
final class DataBufferUShort extends DataBuffer {

    /** Constructs an unsigned-short based DataBuffer with a single bank and the
     *  specified size.
     */
    @stub
    def this(size: Int) = ???

    /** Constructs an unsigned-short based DataBuffer with the specified number of
     *  banks, all of which are the specified size.
     */
    @stub
    def this(size: Int, numBanks: Int) = ???

    /** Constructs an unsigned-short based DataBuffer with the specified arrays. */
    @stub
    def this(dataArray: Array[Array[Short]], size: Int) = ???

    /** Constructs an unsigned-short based DataBuffer with specified arrays,
     *  size, and offsets.
     */
    @stub
    def this(dataArray: Array[Array[Short]], size: Int, offsets: Array[Int]) = ???

    /** Constructs an unsigned-short based DataBuffer with a single bank
     *  using the specified array.
     */
    @stub
    def this(dataArray: Array[Short], size: Int) = ???

    /** Constructs an unsigned-short based DataBuffer with a single bank
     *  using the specified array, size, and offset.
     */
    @stub
    def this(dataArray: Array[Short], size: Int, offset: Int) = ???

    /** Returns the data arrays for all banks. */
    @stub
    def getBankData(): Array[Array[Short]] = ???

    /** Returns the default (first) unsigned-short data array. */
    @stub
    def getData(): Array[Short] = ???

    /** Returns the data array for the specified bank. */
    @stub
    def getData(bank: Int): Array[Short] = ???

    /** Returns the requested data array element from the first (default) bank. */
    @stub
    def getElem(i: Int): Int = ???

    /** Returns the requested data array element from the specified bank. */
    @stub
    def getElem(bank: Int, i: Int): Int = ???

    /** Sets the requested data array element in the first (default) bank
     *  to the specified value.
     */
    @stub
    def setElem(i: Int, val: Int): Unit = ???

    /** Sets the requested data array element in the specified bank
     *  from the given integer.
     */
    @stub
    def setElem(bank: Int, i: Int, val: Int): Unit = ???
}
