package javax.crypto

import java.io.{FilterInputStream, InputStream}
import java.lang.Object

/** A CipherInputStream is composed of an InputStream and a Cipher so
 *  that read() methods return data that are read in from the
 *  underlying InputStream but have been additionally processed by the
 *  Cipher.  The Cipher must be fully initialized before being used by
 *  a CipherInputStream.
 * 
 *   For example, if the Cipher is initialized for decryption, the
 *  CipherInputStream will attempt to read in data and decrypt them,
 *  before returning the decrypted data.
 * 
 *   This class adheres strictly to the semantics, especially the
 *  failure semantics, of its ancestor classes
 *  java.io.FilterInputStream and java.io.InputStream.  This class has
 *  exactly those methods specified in its ancestor classes, and
 *  overrides them all.  Moreover, this class catches all exceptions
 *  that are not thrown by its ancestor classes.  In particular, the
 *  skip method skips, and the available
 *  method counts only data that have been processed by the encapsulated Cipher.
 *  This class may catch BadPaddingException and other exceptions thrown by
 *  failed integrity checks during decryption. These exceptions are not
 *  re-thrown, so the client may not be informed that integrity checks
 *  failed. Because of this behavior, this class may not be suitable
 *  for use with decryption in an authenticated mode of operation (e.g. GCM).
 *  Applications that require authenticated encryption can use the Cipher API
 *  directly as an alternative to using this class.
 * 
 *   It is crucial for a programmer using this class not to use
 *  methods that are not defined or overriden in this class (such as a
 *  new method or constructor that is later added to one of the super
 *  classes), because the design and implementation of those methods
 *  are unlikely to have considered security impact with regard to
 *  CipherInputStream.
 */
class CipherInputStream extends FilterInputStream {

    /** Constructs a CipherInputStream from an InputStream without
     *  specifying a Cipher.
     */
    @stub
    protected def this(is: InputStream) = ???

    /** Returns the number of bytes that can be read from this input
     *  stream without blocking.
     */
    @stub
    def available(): Int = ???

    /** Closes this input stream and releases any system resources
     *  associated with the stream.
     */
    @stub
    def close(): Unit = ???

    /** Tests if this input stream supports the mark
     *  and reset methods, which it does not.
     */
    @stub
    def markSupported(): Boolean = ???

    /** Reads the next byte of data from this input stream. */
    @stub
    def read(): Int = ???

    /** Reads up to b.length bytes of data from this input
     *  stream into an array of bytes.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Reads up to len bytes of data from this input stream
     *  into an array of bytes.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???
}
