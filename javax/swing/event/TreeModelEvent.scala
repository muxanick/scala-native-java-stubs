package javax.swing.event

import java.lang.Object
import java.util.EventObject
import javax.swing.tree.TreePath

// Encapsulates information describing changes to a tree model, and
// used to notify tree model listeners of the change.
// For more information and examples see
// How to Write a Tree Model Listener,
// a section in The Java Tutorial.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class TreeModelEvent extends EventObject {

    @stub
    // Used to create an event when the node structure has changed in some way,
    // identifying the path to the root of a modified subtree as an array of
    // Objects.
    def this(source: Object, path: Array[Object]) = ???

    @stub
    // Used to create an event when nodes have been changed, inserted, or
    // removed, identifying the path to the parent of the modified items as
    // an array of Objects.
    def this(source: Object, path: Array[Object], childIndices: Array[Int], children: Array[Object]) = ???

    @stub
    // Used to create an event when the node structure has changed in some way,
    // identifying the path to the root of the modified subtree as a TreePath
    // object.
    def this(source: Object, path: TreePath) = ???

    @stub
    // Indices identifying the position of where the children were.
    protected def childIndices: Array[Int] = ???

    @stub
    // Children that have been removed.
    protected def children: Array[Object] = ???

    @stub
    // Returns the values of the child indexes.
    def getChildIndices(): Array[Int] = ???

    @stub
    // Returns the objects that are children of the node identified by
    // getPath at the locations specified by
    // getChildIndices.
    def getChildren(): Array[Object] = ???

    @stub
    // Convenience method to get the array of objects from the TreePath
    // instance that this event wraps.
    def getPath(): Array[Object] = ???

    @stub
    // For all events, except treeStructureChanged,
    // returns the parent of the changed nodes.
    def getTreePath(): TreePath = ???
}
