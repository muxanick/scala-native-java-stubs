package java.security

import java.lang.{Class, ClassLoader, Object, String}
import java.nio.ByteBuffer

/** This class extends ClassLoader with additional support for defining
 *  classes with an associated code source and permissions which are
 *  retrieved by the system policy by default.
 */
class SecureClassLoader extends ClassLoader {

    /** Creates a new SecureClassLoader using the default parent class
     *  loader for delegation.
     */
    @stub
    protected def this() = ???

    /** Converts an array of bytes into an instance of class Class,
     *  with an optional CodeSource.
     */
    @stub
    protected def defineClass(name: String, b: Array[Byte], off: Int, len: Int, cs: CodeSource): Class[_] = ???

    /** Converts a ByteBuffer
     *  into an instance of class Class, with an optional CodeSource.
     */
    @stub
    protected def defineClass(name: String, b: ByteBuffer, cs: CodeSource): Class[_] = ???
}
