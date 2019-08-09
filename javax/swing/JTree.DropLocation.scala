package javax.swing

import java.lang.Object
import javax.swing.tree.TreePath

// A subclass of TransferHandler.DropLocation representing
// a drop location for a JTree.
object final JTree.DropLocation extends TransferHandler.DropLocation {

    @stub
    // Returns the index where the dropped data should be inserted
    // with respect to the path returned by getPath().
    def getChildIndex(): Int = ???

    @stub
    // Returns the path where dropped data should be placed in the
    // tree.
    def getPath(): TreePath = ???
}
