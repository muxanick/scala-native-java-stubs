package javax.print

import java.io.OutputStream
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A StreamPrintServiceFactory is the factory for
 *  StreamPrintService instances,
 *  which can print to an output stream in a particular
 *  document format described as a mime type.
 *  A typical output document format may be Postscript(TM).
 *  
 *  This class is implemented by a service and located by the
 *  implementation using the
 *  
 *  SPI JAR File specification.
 *  
 *  Applications locate instances of this class by calling the
 *  lookupStreamPrintServiceFactories(DocFlavor, String) method.
 *  
 *  Applications can use a StreamPrintService obtained from a
 *  factory in place of a PrintService which represents a
 *  physical printer device.
 */
abstract class StreamPrintServiceFactory extends Object {

    /**  */
    @stub
    def this() = ???

    /** Queries the factory for the document format that is emitted
     *  by printers obtained from this factory.
     */
    def getOutputFormat(): String

    /** Returns a StreamPrintService that can print to
     *  the specified output stream.
     */
    def getPrintService(out: OutputStream): StreamPrintService

    /** Queries the factory for the document flavors that can be accepted
     *  by printers obtained from this factory.
     */
    def getSupportedDocFlavors(): Array[DocFlavor]
}

object StreamPrintServiceFactory {
    /** Locates factories for print services that can be used with
     *  a print job to output a stream of data in the
     *  format specified by outputMimeType.
     */
    @stub
    def lookupStreamPrintServiceFactories(flavor: DocFlavor, outputMimeType: String): Array[StreamPrintServiceFactory] = ???
}
