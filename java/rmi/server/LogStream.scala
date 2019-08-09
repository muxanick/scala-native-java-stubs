package java.rmi.server

import java.io.{FilterOutputStream, OutputStream, PrintStream}
import java.lang.{Deprecated, Object, String}

// LogStream provides a mechanism for logging errors that are
// of possible interest to those monitoring a system.
@Deprecated class LogStream extends PrintStream {

    @stub
    // Deprecated. 
    //no replacement
    //
    def getOutputStream(): OutputStream = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def setOutputStream(out: OutputStream): Unit = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def toString(): String = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def write(b: Array[Byte], off: Int, len: Int): Unit = ???
}

object LogStream {
    @stub
    // Deprecated. 
    def BRIEF: Int = ???

    @stub
    // Deprecated. 
    def SILENT: Int = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def getDefaultStream(): PrintStream = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def log(name: String): LogStream = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def parseLevel(s: String): Int = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def setDefaultStream(newDefault: PrintStream): Unit = ???
}
