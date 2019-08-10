package javax.swing.plaf.metal

import java.awt.{Component, Container, Dimension}
import java.awt.event.{ActionEvent, MouseAdapter}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.io.File
import java.lang.{Object, String}
import javax.swing.{AbstractAction, AbstractListModel, ActionMap, ComboBoxModel, DefaultListCellRenderer, JButton, JComponent, JFileChooser, JLabel, JList, JPanel}
import javax.swing.event.{ListSelectionEvent, ListSelectionListener}
import javax.swing.filechooser.FileFilter
import javax.swing.plaf.{ComponentUI, FileChooserUI}
import javax.swing.plaf.basic.BasicFileChooserUI
import scala.scalanative.annotation.stub

/** Metal L&F implementation of a FileChooser. */
class MetalFileChooserUI extends BasicFileChooserUI {

    /**  */
    @stub
    def this(filechooser: JFileChooser) = ???

    /** Acts when DirectoryComboBox has changed the selected item. */
    protected class DirectoryComboBoxAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Data model for a type-face selection combo-box. */
    protected class DirectoryComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object] {

        /**  */
        @stub
        def this() = ???

        /**  */
        @stub
        def getDepth(i: Int): Int = ???

        /** Returns the value at the specified index. */
        @stub
        def getElementAt(index: Int): Any = ???

        /** Returns the selected item */
        @stub
        def getSelectedItem(): Any = ???

        /** Returns the length of the list. */
        @stub
        def getSize(): Int = ???

        /** Set the selected item. */
        @stub
        def setSelectedItem(selectedDirectory: Any): Unit = ???
    }


    /**  */
    protected class FileRenderer extends DefaultListCellRenderer {

        /**  */
        @stub
        protected def this() = ???
    }


    /** Data model for a type-face selection combo-box. */
    protected class FilterComboBoxModel extends AbstractListModel[Object] with ComboBoxModel[Object] with PropertyChangeListener {

        /**  */
        @stub
        protected def this() = ???

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


    /** Render different type sizes and styles. */
    class FilterComboBoxRenderer extends DefaultListCellRenderer {

        /**  */
        @stub
        def this() = ???

        /** Return a component that has been configured to display the specified
         *  value.
         */
        @stub
        def getListCellRendererComponent(list: JList, value: Any, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???
    }


    /**  */
    protected class SingleClickListener extends MouseAdapter {

        /**  */
        @stub
        def this(list: JList) = ???
    }


    /**  */
    @stub
    protected def addControlButtons(): Unit = ???

    /**  */
    @stub
    protected def createActionMap(): ActionMap = ???

    /**  */
    @stub
    protected def createDetailsView(fc: JFileChooser): JPanel = ???

    /**  */
    @stub
    protected def createDirectoryComboBoxModel(fc: JFileChooser): MetalFileChooserUI.DirectoryComboBoxModel = ???

    /**  */
    @stub
    protected def createDirectoryComboBoxRenderer(fc: JFileChooser): javax.swing.plaf.metal.MetalFileChooserUI.DirectoryComboBoxRenderer = ???

    /**  */
    @stub
    protected def createFilterComboBoxModel(): MetalFileChooserUI.FilterComboBoxModel = ???

    /**  */
    @stub
    protected def createFilterComboBoxRenderer(): MetalFileChooserUI.FilterComboBoxRenderer = ???

    /**  */
    @stub
    protected def createList(fc: JFileChooser): JPanel = ???

    /** Creates a selection listener for the list of files and directories. */
    @stub
    def createListSelectionListener(fc: JFileChooser): ListSelectionListener = ???

    /**  */
    @stub
    def createPropertyChangeListener(fc: JFileChooser): PropertyChangeListener = ???

    /**  */
    @stub
    def ensureFileIsVisible(fc: JFileChooser, f: File): Unit = ???

    /**  */
    @stub
    protected def getActionMap(): ActionMap = ???

    /**  */
    @stub
    protected def getApproveButton(fc: JFileChooser): JButton = ???

    /**  */
    @stub
    protected def getBottomPanel(): JPanel = ???

    /**  */
    @stub
    protected def getButtonPanel(): JPanel = ???

    /**  */
    @stub
    def getDirectoryName(): String = ???

    /**  */
    @stub
    def getFileName(): String = ???

    /** Returns the maximum size of the JFileChooser. */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the minimum size of the JFileChooser. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /** Returns the preferred size of the specified
     *  JFileChooser.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    def installComponents(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installListeners(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installStrings(fc: JFileChooser): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    protected def removeControlButtons(): Unit = ???

    /**  */
    @stub
    def rescanCurrentDirectory(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    def setDirectoryName(dirname: String): Unit = ???

    /** Property to remember whether a directory is currently selected in the UI. */
    @stub
    protected def setDirectorySelected(directorySelected: Boolean): Unit = ???

    /**  */
    @stub
    def setFileName(filename: String): Unit = ???

    /**  */
    @stub
    def uninstallComponents(fc: JFileChooser): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /**  */
    @stub
    def valueChanged(e: ListSelectionEvent): Unit = ???
}

object MetalFileChooserUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
