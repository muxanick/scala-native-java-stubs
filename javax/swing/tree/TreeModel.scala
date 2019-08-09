package javax.swing.tree

import java.lang.Object
import javax.swing.event.TreeModelListener
import scala.scalanative.annotation.stub

/** The model used by JTree.
 *  
 *  JTree and its related classes make extensive use of
 *  TreePaths for identifying nodes in the TreeModel.
 *  If a TreeModel returns the same object, as compared by
 *  equals, at two different indices under the same parent
 *  than the resulting TreePath objects will be considered equal
 *  as well. Some implementations may assume that if two
 *  TreePaths are equal, they identify the same node. If this
 *  condition is not met, painting problems and other oddities may result.
 *  In other words, if getChild for a given parent returns
 *  the same Object (as determined by equals) problems may
 *  result, and it is recommended you avoid doing this.
 *  
 *  Similarly JTree and its related classes place
 *  TreePaths in Maps.  As such if
 *  a node is requested twice, the return values must be equal
 *  (using the equals method) and have the same
 *  hashCode.
 *  
 *  For further information on tree models,
 *  including an example of a custom implementation,
 *  see How to Use Trees
 *  in The Java Tutorial.
 */
trait TreeModel {

    /** Adds a listener for the TreeModelEvent
     *  posted after the tree changes.
     */
    @stub
    def addTreeModelListener(l: TreeModelListener): Unit = ???

    /** Returns the child of parent at index index
     *  in the parent's
     *  child array.
     */
    @stub
    def getChild(parent: Object, index: Int): Object = ???

    /** Returns the number of children of parent. */
    @stub
    def getChildCount(parent: Object): Int = ???

    /** Returns the index of child in parent. */
    @stub
    def getIndexOfChild(parent: Object, child: Object): Int = ???

    /** Returns the root of the tree. */
    @stub
    def getRoot(): Object = ???

    /** Returns true if node is a leaf. */
    @stub
    def isLeaf(node: Object): Boolean = ???

    /** Removes a listener previously added with
     *  addTreeModelListener.
     */
    @stub
    def removeTreeModelListener(l: TreeModelListener): Unit = ???

    /** Messaged when the user has altered the value for the item identified
     *  by path to newValue.
     */
    @stub
    def valueForPathChanged(path: TreePath, newValue: Object): Unit = ???
}
