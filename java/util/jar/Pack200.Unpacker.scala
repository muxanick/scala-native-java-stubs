package java.util.jar

import java.beans.PropertyChangeListener
import java.io.File
import java.lang.String
import java.util.SortedMap

// The unpacker engine converts the packed stream to a JAR file.
// An instance of the engine can be obtained
// using Pack200.newUnpacker().
// 
// Every JAR file produced by this engine will include the string
// "PACK200" as a zip file comment.
// This allows a deployer to detect if a JAR archive was packed and unpacked.
// 
// Note: Unless otherwise noted, passing a null argument to a
// constructor or method in this class will cause a NullPointerException
// to be thrown.
// 
// This version of the unpacker is compatible with all previous versions.
object trait Pack200.Unpacker {

    @stub
    // Property indicating that the unpacker should
    // ignore all transmitted values for DEFLATE_HINT,
    // replacing them by the given value, TRUE or FALSE.
    def DEFLATE_HINT: String = ???

    @stub
    // The string "false", a possible value for certain properties.
    def FALSE: String = ???

    @stub
    // The string "keep", a possible value for certain properties.
    def KEEP: String = ???

    @stub
    // The unpacker's progress as a percentage, as periodically
    // updated by the unpacker.
    def PROGRESS: String = ???

    @stub
    // Deprecated. 
    //The dependency on PropertyChangeListener creates
    //             a significant impediment to future modularization of the
    //             Java platform. This method will be removed in a future
    //             release.
    //             Applications that need to monitor progress of the
    //             unpacker can poll the value of the PROGRESS property instead.
    //
    def Unit: default = ???

    @stub
    // Get the set of this engine's properties.
    def properties(): SortedMap[String, String] = ???

    @stub
    // Deprecated. 
    //The dependency on PropertyChangeListener creates
    //             a significant impediment to future modularization of the
    //             Java platform. This method will be removed in a future
    //             release.
    //
    def Unit: default = ???

    @stub
    // Read a Pack200 archive, and write the encoded JAR to
    // a JarOutputStream.
    def unpack(in: File, out: JarOutputStream): Unit = ???
}
