package javax.swing.plaf.metal

import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractListModel, ComboBoxModel}
import javax.swing.filechooser.FileFilter
import scala.scalanative.annotation.stub

/** Data model for a type-face selection combo-box. */
protected class MetalFileChooserUI_FilterComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object] with PropertyChangeListener {

    /**  */
    @stub
    protected def FilterComboBoxModel() = ???

    /**  */
    @stub
    protected val filters: Array[FileFilter] = ???

    /** Returns the value at the specified index. */
    @stub
    def getElementAt(index: Int): Any = ???

    /** Returns the selected item */
    @stub
    def getSelectedItem(): Any = ???

    /** Returns the length of the list. */
    @stub
    def getSize(): Int = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Set the selected item. */
    @stub
    def setSelectedItem(filter: Any): Unit = ???
}
