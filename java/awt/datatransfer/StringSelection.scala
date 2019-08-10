package java.awt.datatransfer

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

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

    /** Creates a Transferable capable of transferring
     *  the specified String.
     */
    @stub
    def this(data: String) = ???

    /** Returns the Transferable's data in the requested
     *  DataFlavor if possible.
     */
    @stub
    def getTransferData(flavor: DataFlavor): Any = ???

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

    /** Notifies this object that it is no longer the clipboard owner. */
    @stub
    def lostOwnership(clipboard: Clipboard, contents: Transferable): Unit = ???
}
