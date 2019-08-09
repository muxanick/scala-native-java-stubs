package java.awt.print

import java.lang.{Exception, Object, Throwable}

// The PrinterIOException class is a subclass of
// PrinterException and is used to indicate that an IO error
// of some sort has occurred while printing.
//
// As of release 1.4, this exception has been retrofitted to conform to
// the general purpose exception-chaining mechanism.  The
// "IOException that terminated the print job"
// that is provided at construction time and accessed via the
// getIOException() method is now known as the cause,
// and may be accessed via the Throwable.getCause() method,
// as well as the aforementioned "legacy method."
class PrinterIOException extends PrinterException {

    @stub
    // Returns the the cause of this exception (the IOException
    // that terminated the print job).
    def getCause(): Throwable = ???
}
