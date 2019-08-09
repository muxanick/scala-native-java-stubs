package javax.swing.plaf.basic

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.io.File
import java.lang.{Object, String}
import java.util.Vector
import javax.swing.{AbstractListModel, JFileChooser}
import javax.swing.event.ListDataEvent
import scala.scalanative.annotation.stub

/** Basic implementation of a file list. */
class BasicDirectoryModel extends AbstractListModel[Object] with PropertyChangeListener {

    /**  */
    @stub
    def this(filechooser: JFileChooser) = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /**  */
    @stub
    def contains(o: Object): Boolean = ???

    /**  */
    @stub
    def fireContentsChanged(): Unit = ???

    /** Support for reporting bound property changes for boolean properties. */
    @stub
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit = ???

    /**  */
    @stub
    def getDirectories(): Vector[File] = ???

    /** Returns the value at the specified index. */
    @stub
    def getElementAt(index: Int): Object = ???

    /**  */
    @stub
    def getFiles(): Vector[File] = ???

    /** Returns an array of all the property change listeners
     *  registered on this component.
     */
    @stub
    def getPropertyChangeListeners(): Array[PropertyChangeListener] = ???

    /** Returns the length of the list. */
    @stub
    def getSize(): Int = ???

    /**  */
    @stub
    def indexOf(o: Object): Int = ???

    /** Obsolete - not used. */
    @stub
    def intervalAdded(e: ListDataEvent): Unit = ???

    /** Obsolete - not used. */
    @stub
    def intervalRemoved(e: ListDataEvent): Unit = ???

    /** This method is used to interrupt file loading thread. */
    @stub
    def invalidateFileCache(): Unit = ???

    /**  */
    @stub
    protected def lt(a: File, b: File): Boolean = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Removes a PropertyChangeListener from the listener list. */
    @stub
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Renames a file in the underlying file system. */
    @stub
    def renameFile(oldFile: File, newFile: File): Boolean = ???

    /**  */
    @stub
    protected def sort(v: Vector[_ <: File]): Unit = ???

    /**  */
    @stub
    def validateFileCache(): Unit = ???
}
