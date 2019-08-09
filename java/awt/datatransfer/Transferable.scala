package java.awt.datatransfer

import java.lang.Object

/** Defines the interface for classes that can be used to provide data
 *  for a transfer operation.
 *  
 *  For information on using data transfer with Swing, see
 *  
 *  How to Use Drag and Drop and Data Transfer,
 *  a section in The Java Tutorial, for more information.
 */
trait Transferable {

    /** Returns an object which represents the data to be transferred. */
    @stub
    def getTransferData(flavor: DataFlavor): Object = ???

    /** Returns an array of DataFlavor objects indicating the flavors the data
     *  can be provided in.
     */
    @stub
    def getTransferDataFlavors(): Array[DataFlavor] = ???
}
