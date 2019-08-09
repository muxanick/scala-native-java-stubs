package javax.swing.tree

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** TreePath represents an array of objects that uniquely
 *  identify the path to a node in a tree. The elements of the array
 *  are ordered with the root as the first element of the array. For
 *  example, a file on the file system is uniquely identified based on
 *  the array of parent directories and the name of the file. The path
 *  /tmp/foo/bar could be represented by a TreePath as
 *  new TreePath(new Object[] {"tmp", "foo", "bar"}).
 *  
 *  TreePath is used extensively by JTree and related classes.
 *  For example, JTree represents the selection as an array of
 *  TreePaths. When used with JTree, the elements of the
 *  path are the objects returned from the TreeModel. When JTree
 *  is paired with DefaultTreeModel, the elements of the
 *  path are TreeNodes. The following example illustrates extracting
 *  the user object from the selection of a JTree:
 *  
 *    DefaultMutableTreeNode root = ...;
 *    DefaultTreeModel model = new DefaultTreeModel(root);
 *    JTree tree = new JTree(model);
 *    ...
 *    TreePath selectedPath = tree.getSelectionPath();
 *    DefaultMutableTreeNode selectedNode =
 *        ((DefaultMutableTreeNode)selectedPath.getLastPathComponent()).
 *        getUserObject();
 *  
 *  Subclasses typically need override only getLastPathComponent, and getParentPath. As JTree
 *  internally creates TreePaths at various points, it's
 *  generally not useful to subclass TreePath and use with
 *  JTree.
 *  
 *  While TreePath is serializable, a NotSerializableException is thrown if any elements of the path are
 *  not serializable.
 *  
 *  For further information and examples of using tree paths,
 *  see How to Use Trees
 *  in The Java Tutorial.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class TreePath extends Object with Serializable {

    /** Creates an empty TreePath. */
    @stub
    protected def this() = ???

    /** Creates a TreePath containing a single element. */
    @stub
    def this(lastPathComponent: Object) = ???

    /** Creates a TreePath from an array. */
    @stub
    def this(path: Array[Object]) = ???

    /** Creates a TreePath from an array. */
    @stub
    protected def this(path: Array[Object], length: Int) = ???

    /** Creates a TreePath with the specified parent and element. */
    @stub
    protected def this(parent: TreePath, lastPathComponent: Object) = ???

    /** Compares this TreePath to the specified object. */
    @stub
    def equals(o: Object): Boolean = ???

    /** Returns the last element of this path. */
    @stub
    def getLastPathComponent(): Object = ???

    /** Returns the TreePath of the parent. */
    @stub
    def getParentPath(): TreePath = ???

    /** Returns an ordered array of the elements of this TreePath. */
    @stub
    def getPath(): Array[Object] = ???

    /** Returns the path element at the specified index. */
    @stub
    def getPathComponent(index: Int): Object = ???

    /** Returns the number of elements in the path. */
    @stub
    def getPathCount(): Int = ???

    /** Returns the hash code of this TreePath. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if aTreePath is a
     *  descendant of this
     *  TreePath.
     */
    @stub
    def isDescendant(aTreePath: TreePath): Boolean = ???

    /** Returns a new path containing all the elements of this path
     *  plus child.
     */
    @stub
    def pathByAddingChild(child: Object): TreePath = ???

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    @stub
    def toString(): String = ???
}
