package java.awt.datatransfer

import java.lang.Object

// Defines the interface for classes that can be used to provide data
// for a transfer operation.
// 
// For information on using data transfer with Swing, see
// 
// How to Use Drag and Drop and Data Transfer,
// a section in The Java Tutorial, for more information.
trait Transferable {

    @stub
    // Returns an object which represents the data to be transferred.
    def getTransferData(flavor: DataFlavor): Object = ???

    @stub
    // Returns an array of DataFlavor objects indicating the flavors the data
    // can be provided in.
    def getTransferDataFlavors(): Array[DataFlavor] = ???
}
