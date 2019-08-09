package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.io.File
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.AbstractListModel
import javax.swing.event.ListDataEvent

// Basic implementation of a file list.
class BasicDirectoryModel extends AbstractListModel[Object] with PropertyChangeListener {

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // 
    def contains(o: Object): Boolean = ???

    @stub
    // 
    def fireContentsChanged(): Unit = ???

    @stub
    // Support for reporting bound property changes for boolean properties.
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    @stub
    // 
    def getDirectories(): Vector[File] = ???

    @stub
    // Returns the value at the specified index.
    def getElementAt(index: Int): Object = ???

    @stub
    // 
    def getFiles(): Vector[File] = ???

    @stub
    // Returns an array of all the property change listeners
    // registered on this component.
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    @stub
    // Returns the length of the list.
    def getSize(): Int = ???

    @stub
    // 
    def indexOf(o: Object): Int = ???

    @stub
    // Obsolete - not used.
    def intervalAdded(e: ListDataEvent): Unit = ???

    @stub
    // Obsolete - not used.
    def intervalRemoved(e: ListDataEvent): Unit = ???

    @stub
    // This method is used to interrupt file loading thread.
    def invalidateFileCache(): Unit = ???

    @stub
    // 
    protected def lt(a: File, b: File): Boolean = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Renames a file in the underlying file system.
    def renameFile(oldFile: File, newFile: File): Boolean = ???

    @stub
    // 
    protected def sort(v: Vector[_ <: File]): Unit = ???
}
