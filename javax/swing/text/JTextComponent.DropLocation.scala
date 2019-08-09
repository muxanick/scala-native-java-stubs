package javax.swing.text

import java.lang.Object
import javax.swing.TransferHandler.DropLocation

// Represents a drop location for JTextComponents.
object final JTextComponent.DropLocation extends TransferHandler.DropLocation {

    @stub
    // Returns the bias for the drop index.
    def getBias(): Position.Bias = ???

    @stub
    // Returns the index where dropped data should be inserted into the
    // associated component.
    def getIndex(): Int = ???
}
