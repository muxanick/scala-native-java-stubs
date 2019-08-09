package javax.swing

import java.beans.PropertyChangeListener
import java.lang.Object
import javax.swing.event.TreeSelectionListener
import javax.swing.tree.{DefaultTreeSelectionModel, RowMapper, TreePath}

// EmptySelectionModel is a TreeSelectionModel
// that does not allow anything to be selected.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object protected JTree.EmptySelectionModel extends DefaultTreeSelectionModel {

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def addTreeSelectionListener(listener: TreeSelectionListener): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def removeTreeSelectionListener(listener: TreeSelectionListener): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def setRowMapper(mapper: RowMapper): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def setSelectionMode(mode: Int): Unit = ???

    @stub
    // This is overriden to do nothing; EmptySelectionModel
    // does not allow a selection.
    def setSelectionPaths(paths: Array[TreePath]): Unit = ???
}
