package javax.imageio.stream

import java.lang.Object

// A class representing a mutable reference to an array of bytes and
// an offset and length within that array.  IIOByteBuffer
// is used by ImageInputStream to supply a sequence of bytes
// to the caller, possibly with fewer copies than using the conventional
// read methods that take a user-supplied byte array.
//
//  The byte array referenced by an IIOByteBuffer will
// generally be part of an internal data structure belonging to an
// ImageReader implementation; its contents should be
// considered read-only and must not be modified.
class IIOByteBuffer extends Object {

    @stub
    // Returns a reference to the byte array.
    def getData(): Array[Byte] = ???

    @stub
    // Returns the length of the data of interest within the byte
    // array returned by getData.
    def getLength(): Int = ???

    @stub
    // Returns the offset within the byte array returned by
    // getData at which the data of interest start.
    def getOffset(): Int = ???

    @stub
    // Updates the array reference that will be returned by subsequent calls
    // to the getData method.
    def setData(data: Array[Byte]): Unit = ???

    @stub
    // Updates the value that will be returned by subsequent calls
    // to the getLength method.
    def setLength(length: Int): Unit = ???
}
