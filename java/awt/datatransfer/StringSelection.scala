package java.awt.datatransfer

import java.lang.Object

/** A Transferable which implements the capability required
 *  to transfer a String.
 * 
 *  This Transferable properly supports
 *  DataFlavor.stringFlavor
 *  and all equivalent flavors. Support for
 *  DataFlavor.plainTextFlavor
 *  and all equivalent flavors is deprecated. No other
 *  DataFlavors are supported.
 */
class StringSelection extends Object with Transferable with ClipboardOwner {

    /** Returns the Transferable's data in the requested
     *  DataFlavor if possible.
     */
    @stub
    def getTransferData(flavor: DataFlavor): Object = ???

    /** Returns an array of flavors in which this Transferable
     *  can provide the data.
     */
    @stub
    def getTransferDataFlavors(): Array[DataFlavor] = ???

    /** Returns whether the requested flavor is supported by this
     *  Transferable.
     */
    @stub
    def isDataFlavorSupported(flavor: DataFlavor): Boolean = ???
}
