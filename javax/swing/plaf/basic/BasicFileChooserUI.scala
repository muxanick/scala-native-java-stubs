package javax.swing.plaf.basic

import java.awt.event.MouseListener
import java.beans.PropertyChangeListener
import java.io.File
import java.lang.{Object, String}
import javax.swing.{Action, Icon, JButton, JComponent, JFileChooser, JList, JPanel}
import javax.swing.event.ListSelectionListener
import javax.swing.filechooser.{FileFilter, FileView}
import javax.swing.plaf.{ComponentUI, FileChooserUI}
import scala.scalanative.annotation.stub

/** Basic L&F implementation of a FileChooser. */
class BasicFileChooserUI extends FileChooserUI {

    /**  */
    @stub
    def this(b: JFileChooser) = ???

    /**  */
    protected type AcceptAllFileFilter = BasicFileChooserUI_AcceptAllFileFilter

    /** Responds to an Open or Save request */
    protected type ApproveSelectionAction = BasicFileChooserUI_ApproveSelectionAction

    /**  */
    protected type BasicFileView = BasicFileChooserUI_BasicFileView

    /** Responds to a cancel request. */
    protected type CancelSelectionAction = BasicFileChooserUI_CancelSelectionAction

    /**  */
    protected type ChangeToParentDirectoryAction = BasicFileChooserUI_ChangeToParentDirectoryAction

    /**  */
    protected type DoubleClickListener = BasicFileChooserUI_DoubleClickListener

    /** Acts on the "home" key event or equivalent event. */
    protected type GoHomeAction = BasicFileChooserUI_GoHomeAction

    /** Creates a new folder. */
    protected type NewFolderAction = BasicFileChooserUI_NewFolderAction

    /**  */
    protected type SelectionListener = BasicFileChooserUI_SelectionListener

    /** Rescans the files in the current directory */
    protected type UpdateAction = BasicFileChooserUI_UpdateAction

    /**  */
    @stub
    protected val cancelButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val cancelButtonText: String = ???

    /**  */
    @stub
    protected val cancelButtonToolTipText: String = ???

    /**  */
    @stub
    protected val computerIcon: Icon = ???

    /**  */
    @stub
    protected val detailsViewIcon: Icon = ???

    /**  */
    @stub
    protected val directoryIcon: Icon = ???

    /** The mnemonic keycode used for the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonMnemonic: Int = ???

    /** The label text displayed on the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonText: String = ???

    /** The tooltip text displayed on the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonToolTipText: String = ???

    /**  */
    @stub
    protected val fileIcon: Icon = ???

    /**  */
    @stub
    protected val floppyDriveIcon: Icon = ???

    /**  */
    @stub
    protected val hardDriveIcon: Icon = ???

    /**  */
    @stub
    protected val helpButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val helpButtonText: String = ???

    /**  */
    @stub
    protected val helpButtonToolTipText: String = ???

    /**  */
    @stub
    protected val homeFolderIcon: Icon = ???

    /**  */
    @stub
    protected val listViewIcon: Icon = ???

    /**  */
    @stub
    protected val newFolderIcon: Icon = ???

    /**  */
    @stub
    protected val openButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val openButtonText: String = ???

    /**  */
    @stub
    protected val openButtonToolTipText: String = ???

    /**  */
    @stub
    protected val saveButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val saveButtonText: String = ???

    /**  */
    @stub
    protected val saveButtonToolTipText: String = ???

    /**  */
    @stub
    protected val updateButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val updateButtonText: String = ???

    /**  */
    @stub
    protected val updateButtonToolTipText: String = ???

    /**  */
    @stub
    protected val upFolderIcon: Icon = ???

    /**  */
    @stub
    protected val viewMenuIcon: Icon = ???

    /**  */
    @stub
    def clearIconCache(): Unit = ???

    /**  */
    @stub
    protected def createDoubleClickListener(fc: JFileChooser, list: JList): MouseListener = ???

    /**  */
    @stub
    def createListSelectionListener(fc: JFileChooser): ListSelectionListener = ???

    /**  */
    @stub
    protected def createModel(): Unit = ???

    /**  */
    @stub
    def createPropertyChangeListener(fc: JFileChooser): PropertyChangeListener = ???

    /**  */
    @stub
    def ensureFileIsVisible(fc: JFileChooser, f: File): Unit = ???

    /** Returns the default accept all file filter */
    @stub
    def getAcceptAllFileFilter(fc: JFileChooser): FileFilter = ???

    /**  */
    @stub
    def getAccessoryPanel(): JPanel = ???

    /**  */
    @stub
    protected def getApproveButton(fc: JFileChooser): JButton = ???

    /**  */
    @stub
    def getApproveButtonMnemonic(fc: JFileChooser): Int = ???

    /**  */
    @stub
    def getApproveButtonText(fc: JFileChooser): String = ???

    /**  */
    @stub
    def getApproveButtonToolTipText(fc: JFileChooser): String = ???

    /**  */
    @stub
    def getApproveSelectionAction(): Action = ???

    /**  */
    @stub
    def getCancelSelectionAction(): Action = ???

    /**  */
    @stub
    def getChangeToParentDirectoryAction(): Action = ???

    /** Returns default button for current LookAndFeel. */
    @stub
    def getDefaultButton(fc: JFileChooser): JButton = ???

    /** Returns the title of this dialog */
    @stub
    def getDialogTitle(fc: JFileChooser): String = ???

    /** Property to remember the directory that is currently selected in the UI. */
    @stub
    protected def getDirectory(): File = ???

    /**  */
    @stub
    def getDirectoryName(): String = ???

    /**  */
    @stub
    def getFileChooser(): JFileChooser = ???

    /**  */
    @stub
    def getFileName(): String = ???

    /**  */
    @stub
    def getFileView(fc: JFileChooser): FileView = ???

    /**  */
    @stub
    def getGoHomeAction(): Action = ???

    /**  */
    @stub
    def getModel(): BasicDirectoryModel = ???

    /**  */
    @stub
    def getNewFolderAction(): Action = ???

    /**  */
    @stub
    def getUpdateAction(): Action = ???

    /**  */
    @stub
    def installComponents(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installDefaults(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installIcons(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installListeners(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installStrings(fc: JFileChooser): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Property to remember whether a directory is currently selected in the UI. */
    @stub
    protected def isDirectorySelected(): Boolean = ???

    /**  */
    @stub
    def rescanCurrentDirectory(fc: JFileChooser): Unit = ???

    /** Property to remember the directory that is currently selected in the UI. */
    @stub
    protected def setDirectory(f: File): Unit = ???

    /**  */
    @stub
    def setDirectoryName(dirname: String): Unit = ???

    /** Property to remember whether a directory is currently selected in the UI. */
    @stub
    protected def setDirectorySelected(b: Boolean): Unit = ???

    /**  */
    @stub
    def setFileName(filename: String): Unit = ???

    /**  */
    @stub
    def uninstallComponents(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallIcons(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallStrings(fc: JFileChooser): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicFileChooserUI {
    /** Creates a BasicFileChooserUI implementation
     *  for the specified component.
     */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
