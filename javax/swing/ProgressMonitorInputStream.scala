package javax.swing

import java.awt.Component
import java.io.{FilterInputStream, InputStream}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Monitors the progress of reading from some InputStream. This ProgressMonitor
 *  is normally invoked in roughly this form:
 *  
 *  InputStream in = new BufferedInputStream(
 *                           new ProgressMonitorInputStream(
 *                                   parentComponent,
 *                                   "Reading " + fileName,
 *                                   new FileInputStream(fileName)));
 *  
 *  This creates a progress monitor to monitor the progress of reading
 *  the input stream.  If it's taking a while, a ProgressDialog will
 *  be popped up to inform the user.  If the user hits the Cancel button
 *  an InterruptedIOException will be thrown on the next read.
 *  All the right cleanup is done when the stream is closed.
 * 
 * 
 *  
 * 
 *  For further documentation and examples see
 *  How to Monitor Progress,
 *  a section in The Java Tutorial.
 */
class ProgressMonitorInputStream extends FilterInputStream {

    /** Constructs an object to monitor the progress of an input stream. */
    @stub
    def this(parentComponent: Component, message: Object, in: InputStream) = ???

    /** Overrides FilterInputStream.close
     *  to close the progress monitor as well as the stream.
     */
    @stub
    def close(): Unit = ???

    /** Get the ProgressMonitor object being used by this stream. */
    @stub
    def getProgressMonitor(): ProgressMonitor = ???

    /** Overrides FilterInputStream.read
     *  to update the progress monitor after the read.
     */
    @stub
    def read(): Int = ???

    /** Overrides FilterInputStream.read
     *  to update the progress monitor after the read.
     */
    @stub
    def read(b: Array[Byte]): Int = ???

    /** Overrides FilterInputStream.read
     *  to update the progress monitor after the read.
     */
    @stub
    def read(b: Array[Byte], off: Int, len: Int): Int = ???

    /** Overrides FilterInputStream.reset
     *  to reset the progress monitor as well as the stream.
     */
    @stub
    def reset(): Unit = ???

    /** Overrides FilterInputStream.skip
     *  to update the progress monitor after the skip.
     */
    @stub
    def skip(n: Long): Long = ???
}
