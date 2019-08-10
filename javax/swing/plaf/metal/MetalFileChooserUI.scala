package javax.swing.plaf.metal

import java.awt.Dimension
import java.beans.PropertyChangeListener
import java.io.File
import java.lang.{Object, String}
import javax.swing.{ActionMap, JButton, JComponent, JFileChooser, JPanel}
import javax.swing.event.{ListSelectionEvent, ListSelectionListener}
import javax.swing.plaf.{ComponentUI, FileChooserUI}
import javax.swing.plaf.basic.BasicFileChooserUI
import scala.scalanative.annotation.stub

/** Metal L&F implementation of a FileChooser. */
class MetalFileChooserUI extends BasicFileChooserUI {

    /**  */
    @stub
    def this(filechooser: JFileChooser) = ???

    /** Acts when DirectoryComboBox has changed the selected item. */
    protected type DirectoryComboBoxAction = MetalFileChooserUI_DirectoryComboBoxAction

    /** Data model for a type-face selection combo-box. */
    protected type DirectoryComboBoxModel = MetalFileChooserUI_DirectoryComboBoxModel

    /**  */
    protected type FileRenderer = MetalFileChooserUI_FileRenderer

    /** Data model for a type-face selection combo-box. */
    protected type FilterComboBoxModel = MetalFileChooserUI_FilterComboBoxModel

    /** Render different type sizes and styles. */
    type FilterComboBoxRenderer = MetalFileChooserUI_FilterComboBoxRenderer

    /**  */
    protected type SingleClickListener = MetalFileChooserUI_SingleClickListener

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
