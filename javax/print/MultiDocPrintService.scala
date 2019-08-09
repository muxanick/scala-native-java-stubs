package javax.print

import scala.scalanative.annotation.stub

/** Interface MultiPrintService is the factory for a MultiDocPrintJob.
 *  A MultiPrintService
 *  describes the capabilities of a Printer and can be queried regarding
 *  a printer's supported attributes.
 */
trait MultiDocPrintService extends PrintService {

    /** Create a job which can print a multiDoc. */
    @stub
    def createMultiDocPrintJob(): MultiDocPrintJob = ???
}
