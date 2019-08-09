package javax.print

import java.io.OutputStream
import java.lang.{Object, String}

/** This class extends PrintService and represents a
 *  print service that prints data in different formats to a
 *  client-provided output stream.
 *  This is principally intended for services where
 *  the output format is a document type suitable for viewing
 *  or archiving.
 *  The output format must be declared as a mime type.
 *  This is equivalent to an output document flavor where the
 *  representation class is always "java.io.OutputStream"
 *  An instance of the StreamPrintService class is
 *  obtained from a StreamPrintServiceFactory instance.
 *  
 *  Note that a StreamPrintService is different from a
 *  PrintService, which supports a
 *  Destination
 *  attribute.  A StreamPrintService always requires an output
 *  stream, whereas a PrintService optionally accepts a
 *  Destination. A StreamPrintService
 *  has no default destination for its formatted output.
 *  Additionally a StreamPrintService is expected to generate
 * output in
 *  a format useful in other contexts.
 *  StreamPrintService's are not expected to support the Destination attribute.
 */
abstract class StreamPrintService extends Object with PrintService {

    /** Disposes this StreamPrintService. */
    def dispose(): Unit

    /** Returns the document format emitted by this print service. */
    def getOutputFormat(): String

    /** Gets the output stream. */
    def getOutputStream(): OutputStream
}
