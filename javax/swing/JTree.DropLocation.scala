package javax.swing

import java.lang.{Object, String}
import javax.swing.tree.TreePath
import scala.scalanative.annotation.stub

/** A subclass of TransferHandler.DropLocation representing
 *  a drop location for a JTree.
 */
final object JTree_DropLocation extends TransferHandler.DropLocation {

    /** Returns the index where the dropped data should be inserted
     *  with respect to the path returned by getPath().
     */
    @stub
    def getChildIndex(): Int = ???

    /** Returns the path where dropped data should be placed in the
     *  tree.
     */
    @stub
    def getPath(): TreePath = ???

    /** Returns a string representation of this drop location. */
    @stub
    def toString(): String = ???
}
