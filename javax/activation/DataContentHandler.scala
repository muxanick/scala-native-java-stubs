package javax.activation

import java.awt.datatransfer.DataFlavor
import java.lang.Object

/** The DataContentHandler interface is implemented by objects that can
 *  be used to extend the capabilities of the DataHandler's implementation
 *  of the Transferable interface. Through DataContentHandlers
 *  the framework can be extended to convert streams in to objects, and
 *  to write objects to streams. 
 * 
 *  Applications don't generally call the methods in DataContentHandlers
 *  directly. Instead, an application calls the equivalent methods in
 *  DataHandler. The DataHandler will attempt to find an appropriate
 *  DataContentHandler that corresponds to its MIME type using the
 *  current DataContentHandlerFactory. The DataHandler then calls
 *  through to the methods in the DataContentHandler.
 */
trait DataContentHandler {

    /** Return an object representing the data in its most preferred form. */
    @stub
    def getContent(ds: DataSource): Object = ???

    /** Returns an object which represents the data to be transferred. */
    @stub
    def getTransferData(df: DataFlavor, ds: DataSource): Object = ???

    /** Returns an array of DataFlavor objects indicating the flavors the
     *  data can be provided in.
     */
    @stub
    def getTransferDataFlavors(): Array[DataFlavor] = ???
}
