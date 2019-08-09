package javax.imageio.stream

import java.lang.Object
import scala.scalanative.annotation.stub

/** A class representing a mutable reference to an array of bytes and
 *  an offset and length within that array.  IIOByteBuffer
 *  is used by ImageInputStream to supply a sequence of bytes
 *  to the caller, possibly with fewer copies than using the conventional
 *  read methods that take a user-supplied byte array.
 * 
 *   The byte array referenced by an IIOByteBuffer will
 *  generally be part of an internal data structure belonging to an
 *  ImageReader implementation; its contents should be
 *  considered read-only and must not be modified.
 */
class IIOByteBuffer extends Object {

    /** Constructs an IIOByteBuffer that references a
     *  given byte array, offset, and length.
     */
    @stub
    def this(data: Array[Byte], offset: Int, length: Int) = ???

    /** Returns a reference to the byte array. */
    @stub
    def getData(): Array[Byte] = ???

    /** Returns the length of the data of interest within the byte
     *  array returned by getData.
     */
    @stub
    def getLength(): Int = ???

    /** Returns the offset within the byte array returned by
     *  getData at which the data of interest start.
     */
    @stub
    def getOffset(): Int = ???

    /** Updates the array reference that will be returned by subsequent calls
     *  to the getData method.
     */
    @stub
    def setData(data: Array[Byte]): Unit = ???

    /** Updates the value that will be returned by subsequent calls
     *  to the getLength method.
     */
    @stub
    def setLength(length: Int): Unit = ???

    /** Updates the value that will be returned by subsequent calls
     *  to the getOffset method.
     */
    @stub
    def setOffset(offset: Int): Unit = ???
}
