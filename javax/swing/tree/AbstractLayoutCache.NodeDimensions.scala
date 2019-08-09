package javax.swing.tree

import java.awt.Rectangle
import java.lang.Object
import scala.scalanative.annotation.stub

/** Used by AbstractLayoutCache to determine the size
 *  and x origin of a particular node.
 */
object abstract AbstractLayoutCache.NodeDimensions extends Object {

    /**  */
    @stub
    def NodeDimensions() = ???

    /** Returns, by reference in bounds, the size and x origin to
     *  place value at.
     */
    @stub
    def getNodeDimensions(value: Object, row: Int, depth: Int, expanded: Boolean, bounds: Rectangle): Rectangle
}
