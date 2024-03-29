package java.awt.print

import java.io.IOException
import java.lang.{Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** The PrinterIOException class is a subclass of
 *  PrinterException and is used to indicate that an IO error
 *  of some sort has occurred while printing.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The
 *  "IOException that terminated the print job"
 *  that is provided at construction time and accessed via the
 *  getIOException() method is now known as the cause,
 *  and may be accessed via the Throwable.getCause() method,
 *  as well as the aforementioned "legacy method."
 */
class PrinterIOException extends PrinterException {

    /** Constructs a new PrinterIOException
     *  with the string representation of the specified
     *  IOException.
     */
    @stub
    def this(exception: IOException) = ???

    /** Returns the the cause of this exception (the IOException
     *  that terminated the print job).
     */
    @stub
    def getCause(): Throwable = ???

    /** Returns the IOException that terminated
     *  the print job.
     */
    @stub
    def getIOException(): IOException = ???
}
