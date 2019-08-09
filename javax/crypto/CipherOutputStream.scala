package javax.crypto

import java.io.{FilterOutputStream, OutputStream}
import java.lang.Object

// A CipherOutputStream is composed of an OutputStream and a Cipher so
// that write() methods first process the data before writing them out
// to the underlying OutputStream.  The cipher must be fully
// initialized before being used by a CipherOutputStream.
//
//  For example, if the cipher is initialized for encryption, the
// CipherOutputStream will attempt to encrypt data before writing out the
// encrypted data.
//
//  This class adheres strictly to the semantics, especially the
// failure semantics, of its ancestor classes
// java.io.OutputStream and java.io.FilterOutputStream.  This class
// has exactly those methods specified in its ancestor classes, and
// overrides them all.  Moreover, this class catches all exceptions
// that are not thrown by its ancestor classes. In particular, this
// class catches BadPaddingException and other exceptions thrown by
// failed integrity checks during decryption. These exceptions are not
// re-thrown, so the client will not be informed that integrity checks
// failed. Because of this behavior, this class may not be suitable
// for use with decryption in an authenticated mode of operation (e.g. GCM)
// if the application requires explicit notification when authentication
// fails. Such an application can use the Cipher API directly as an
// alternative to using this class.
//
//  It is crucial for a programmer using this class not to use
// methods that are not defined or overriden in this class (such as a
// new method or constructor that is later added to one of the super
// classes), because the design and implementation of those methods
// are unlikely to have considered security impact with regard to
// CipherOutputStream.
class CipherOutputStream extends FilterOutputStream {

    @stub
    // Constructs a CipherOutputStream from an OutputStream without
    // specifying a Cipher.
    protected def this(os: OutputStream) = ???

    @stub
    // Closes this output stream and releases any system resources
    // associated with this stream.
    def close(): Unit = ???

    @stub
    // Flushes this output stream by forcing any buffered output bytes
    // that have already been processed by the encapsulated cipher object
    // to be written out.
    def flush(): Unit = ???

    @stub
    // Writes b.length bytes from the specified byte array
    // to this output stream.
    def write(b: Array[Byte]): Unit = ???

    @stub
    // Writes len bytes from the specified byte array
    // starting at offset off to this output stream.
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}
