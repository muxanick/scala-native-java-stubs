package java.io

import java.lang.{Exception, Object, Throwable}

// Exception indicating the failure of an object read operation due to
// unread primitive data, or the end of data belonging to a serialized
// object in the stream.  This exception may be thrown in two cases:
//
// 
//   An attempt was made to read an object when the next element in the
//       stream is primitive data.  In this case, the OptionalDataException's
//       length field is set to the number of bytes of primitive data
//       immediately readable from the stream, and the eof field is set to
//       false.
//
//   An attempt was made to read past the end of data consumable by a
//       class-defined readObject or readExternal method.  In this case, the
//       OptionalDataException's eof field is set to true, and the length field
//       is set to 0.
// 
class OptionalDataException extends ObjectStreamException {

    @stub
    // True if there is no more data in the buffered part of the stream.
    def eof: Boolean = ???
}
