package javax.swing.tree

import java.lang.Object
import javax.swing.event.TreeModelListener

// The model used by JTree.
// 
// JTree and its related classes make extensive use of
// TreePaths for identifying nodes in the TreeModel.
// If a TreeModel returns the same object, as compared by
// equals, at two different indices under the same parent
// than the resulting TreePath objects will be considered equal
// as well. Some implementations may assume that if two
// TreePaths are equal, they identify the same node. If this
// condition is not met, painting problems and other oddities may result.
// In other words, if getChild for a given parent returns
// the same Object (as determined by equals) problems may
// result, and it is recommended you avoid doing this.
// 
// Similarly JTree and its related classes place
// TreePaths in Maps.  As such if
// a node is requested twice, the return values must be equal
// (using the equals method) and have the same
// hashCode.
// 
// For further information on tree models,
// including an example of a custom implementation,
// see How to Use Trees
// in The Java Tutorial.
trait TreeModel {

    @stub
    // Adds a listener for the TreeModelEvent
    // posted after the tree changes.
    def addTreeModelListener(l: TreeModelListener): Unit = ???

    @stub
    // Returns the child of parent at index index
    // in the parent's
    // child array.
    def getChild(parent: Object, index: Int): Object = ???

    @stub
    // Returns the number of children of parent.
    def getChildCount(parent: Object): Int = ???

    @stub
    // Returns the index of child in parent.
    def getIndexOfChild(parent: Object, child: Object): Int = ???

    @stub
    // Returns the root of the tree.
    def getRoot(): Object = ???

    @stub
    // Returns true if node is a leaf.
    def isLeaf(node: Object): Boolean = ???

    @stub
    // Removes a listener previously added with
    // addTreeModelListener.
    def removeTreeModelListener(l: TreeModelListener): Unit = ???
}
