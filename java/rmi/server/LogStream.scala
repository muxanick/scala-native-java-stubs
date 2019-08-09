package java.rmi.server

import java.io.{FilterOutputStream, OutputStream, PrintStream}
import java.lang.{Deprecated, Object, String}

/** LogStream provides a mechanism for logging errors that are
 *  of possible interest to those monitoring a system.
 */
@Deprecated class LogStream extends PrintStream {

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def setOutputStream(out: OutputStream): Unit = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def toString(): String = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}

object LogStream {
    /** Deprecated.  */
    @stub
    val BRIEF: Int = ???

    /** Deprecated.  */
    @stub
    val SILENT: Int = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getDefaultStream(): PrintStream = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def log(name: String): LogStream = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def parseLevel(s: String): Int = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def setDefaultStream(newDefault: PrintStream): Unit = ???
}
