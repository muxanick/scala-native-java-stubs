package javax.swing.text

import java.lang.{Object, String}
import javax.swing.TransferHandler.DropLocation
import scala.scalanative.annotation.stub

/** Represents a drop location for JTextComponents. */
final object JTextComponent.DropLocation extends TransferHandler.DropLocation {

    /** Returns the bias for the drop index. */
    @stub
    def getBias(): Position.Bias = ???

    /** Returns the index where dropped data should be inserted into the
     *  associated component.
     */
    @stub
    def getIndex(): Int = ???

    /** Returns a string representation of this drop location. */
    @stub
    def toString(): String = ???
}
