package java.awt.dnd

import java.awt.datatransfer.{DataFlavor, Transferable}
import java.lang.Object
import scala.scalanative.annotation.stub

/** TransferableProxy is a helper inner class that implements
 *  Transferable interface and serves as a proxy for another
 *  Transferable object which represents data transfer for
 *  a particular drag-n-drop operation.
 *  
 *  The proxy forwards all requests to the encapsulated transferable
 *  and automatically performs additional conversion on the data
 *  returned by the encapsulated transferable in case of local transfer.
 */
protected class DropTargetContext.TransferableProxy extends Object with Transferable {

    /** A boolean indicating if the encapsulated
     *  Transferable object represents the result
     *  of local drag-n-drop operation (within the same JVM).
     */
    @stub
    protected val isLocal: Boolean = ???

    /** The encapsulated Transferable object. */
    @stub
    protected val transferable: Transferable = ???

    /** Returns an object which represents the data provided by
     *  the encapsulated transferable for the requested data flavor.
     */
    @stub
    def getTransferData(df: DataFlavor): Object = ???

    /** Returns an array of DataFlavor objects indicating the flavors
     *  the data can be provided in by the encapsulated transferable.
     */
    @stub
    def getTransferDataFlavors(): Array[DataFlavor] = ???

    /** Returns whether or not the specified data flavor is supported by
     *  the encapsulated transferable.
     */
    @stub
    def isDataFlavorSupported(flavor: DataFlavor): Boolean = ???
}
