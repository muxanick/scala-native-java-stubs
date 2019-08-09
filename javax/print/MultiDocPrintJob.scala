package javax.print

import javax.print.attribute.PrintRequestAttributeSet
import scala.scalanative.annotation.stub

/** Obtained from a MultiDocPrintService, a MultiDocPrintJob can print a
 *  specified collection of documents as a single print job with a set of
 *  job attributes.
 *  
 */
trait MultiDocPrintJob extends DocPrintJob {

    /** Print a MultiDoc with the specified job attributes. */
    @stub
    def print(multiDoc: MultiDoc, attributes: PrintRequestAttributeSet): Unit = ???
}
