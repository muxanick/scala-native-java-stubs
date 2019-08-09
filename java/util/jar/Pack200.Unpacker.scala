package java.util.jar

import java.beans.PropertyChangeListener
import java.io.{File, InputStream}
import java.lang.String
import java.util.SortedMap
import scala.scalanative.annotation.stub

/** The unpacker engine converts the packed stream to a JAR file.
 *  An instance of the engine can be obtained
 *  using Pack200.newUnpacker().
 *  
 *  Every JAR file produced by this engine will include the string
 *  "PACK200" as a zip file comment.
 *  This allows a deployer to detect if a JAR archive was packed and unpacked.
 *  
 *  Note: Unless otherwise noted, passing a null argument to a
 *  constructor or method in this class will cause a NullPointerException
 *  to be thrown.
 *  
 *  This version of the unpacker is compatible with all previous versions.
 */
object trait Pack200.Unpacker {

    /** Property indicating that the unpacker should
     *  ignore all transmitted values for DEFLATE_HINT,
     *  replacing them by the given value, TRUE or FALSE.
     */
    @stub
    val DEFLATE_HINT: String = ???

    /** The string "false", a possible value for certain properties. */
    @stub
    val FALSE: String = ???

    /** The string "keep", a possible value for certain properties. */
    @stub
    val KEEP: String = ???

    /** The unpacker's progress as a percentage, as periodically
     *  updated by the unpacker.
     */
    @stub
    val PROGRESS: String = ???

    /** The string "true", a possible value for certain properties. */
    @stub
    val TRUE: String = ???

    /** Deprecated. 
     * The dependency on PropertyChangeListener creates
     *              a significant impediment to future modularization of the
     *              Java platform. This method will be removed in a future
     *              release.
     *              Applications that need to monitor progress of the
     *              unpacker can poll the value of the PROGRESS property instead.
     * 
     */
    @stub
    val Unit: default = ???

    /** Get the set of this engine's properties. */
    @stub
    def properties(): SortedMap[String, String] = ???

    /** Deprecated. 
     * The dependency on PropertyChangeListener creates
     *              a significant impediment to future modularization of the
     *              Java platform. This method will be removed in a future
     *              release.
     * 
     */
    @stub
    val Unit: default = ???

    /** Read a Pack200 archive, and write the encoded JAR to
     *  a JarOutputStream.
     */
    @stub
    def unpack(in: File, out: JarOutputStream): Unit = ???

    /** Read a Pack200 archive, and write the encoded JAR to
     *  a JarOutputStream.
     */
    @stub
    def unpack(in: InputStream, out: JarOutputStream): Unit = ???
}
