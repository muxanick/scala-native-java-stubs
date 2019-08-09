package javax.swing.plaf.basic

import java.awt.event.MouseListener
import java.beans.PropertyChangeListener
import java.io.File
import java.lang.{Object, String}
import javax.swing.{Action, Icon, JButton, JComponent, JFileChooser, JList, JPanel}
import javax.swing.event.ListSelectionListener
import javax.swing.filechooser.{FileFilter, FileView}
import javax.swing.plaf.{ComponentUI, FileChooserUI}

// Basic L&F implementation of a FileChooser.
class BasicFileChooserUI extends FileChooserUI {

    @stub
    // 
    protected def BasicFileChooserUI.AcceptAllFileFilter: class = ???

    @stub
    // Responds to an Open or Save request
    protected def BasicFileChooserUI.ApproveSelectionAction: class = ???

    @stub
    // 
    protected def BasicFileChooserUI.BasicFileView: class = ???

    @stub
    // Responds to a cancel request.
    protected def BasicFileChooserUI.CancelSelectionAction: class = ???

    @stub
    // 
    protected def BasicFileChooserUI.ChangeToParentDirectoryAction: class = ???

    @stub
    // 
    protected def BasicFileChooserUI.DoubleClickListener: class = ???

    @stub
    // Acts on the "home" key event or equivalent event.
    protected def BasicFileChooserUI.GoHomeAction: class = ???

    @stub
    // Creates a new folder.
    protected def BasicFileChooserUI.NewFolderAction: class = ???

    @stub
    // 
    protected def BasicFileChooserUI.SelectionListener: class = ???

    @stub
    // 
    protected def cancelButtonMnemonic: Int = ???

    @stub
    // 
    protected def cancelButtonText: String = ???

    @stub
    // 
    protected def cancelButtonToolTipText: String = ???

    @stub
    // 
    protected def computerIcon: Icon = ???

    @stub
    // 
    protected def detailsViewIcon: Icon = ???

    @stub
    // 
    protected def directoryIcon: Icon = ???

    @stub
    // The mnemonic keycode used for the approve button when a directory
    // is selected and the current selection mode is FILES_ONLY.
    protected def directoryOpenButtonMnemonic: Int = ???

    @stub
    // The label text displayed on the approve button when a directory
    // is selected and the current selection mode is FILES_ONLY.
    protected def directoryOpenButtonText: String = ???

    @stub
    // The tooltip text displayed on the approve button when a directory
    // is selected and the current selection mode is FILES_ONLY.
    protected def directoryOpenButtonToolTipText: String = ???

    @stub
    // 
    protected def fileIcon: Icon = ???

    @stub
    // 
    protected def floppyDriveIcon: Icon = ???

    @stub
    // 
    protected def hardDriveIcon: Icon = ???

    @stub
    // 
    protected def helpButtonMnemonic: Int = ???

    @stub
    // 
    protected def helpButtonText: String = ???

    @stub
    // 
    protected def helpButtonToolTipText: String = ???

    @stub
    // 
    protected def homeFolderIcon: Icon = ???

    @stub
    // 
    protected def listViewIcon: Icon = ???

    @stub
    // 
    protected def newFolderIcon: Icon = ???

    @stub
    // 
    protected def openButtonMnemonic: Int = ???

    @stub
    // 
    protected def openButtonText: String = ???

    @stub
    // 
    protected def openButtonToolTipText: String = ???

    @stub
    // 
    protected def saveButtonMnemonic: Int = ???

    @stub
    // 
    protected def saveButtonText: String = ???

    @stub
    // 
    protected def saveButtonToolTipText: String = ???

    @stub
    // 
    protected def updateButtonMnemonic: Int = ???

    @stub
    // 
    protected def updateButtonText: String = ???

    @stub
    // 
    protected def updateButtonToolTipText: String = ???

    @stub
    // 
    protected def upFolderIcon: Icon = ???

    @stub
    // 
    def clearIconCache(): Unit = ???

    @stub
    // 
    protected def createDoubleClickListener(fc: JFileChooser, list: JList): MouseListener = ???

    @stub
    // 
    def createListSelectionListener(fc: JFileChooser): ListSelectionListener = ???

    @stub
    // 
    protected def createModel(): Unit = ???

    @stub
    // 
    def createPropertyChangeListener(fc: JFileChooser): PropertyChangeListener = ???

    @stub
    // 
    def ensureFileIsVisible(fc: JFileChooser, f: File): Unit = ???

    @stub
    // Returns the default accept all file filter
    def getAcceptAllFileFilter(fc: JFileChooser): FileFilter = ???

    @stub
    // 
    def getAccessoryPanel(): JPanel = ???

    @stub
    // 
    protected def getApproveButton(fc: JFileChooser): JButton = ???

    @stub
    // 
    def getApproveButtonMnemonic(fc: JFileChooser): Int = ???

    @stub
    // 
    def getApproveButtonText(fc: JFileChooser): String = ???

    @stub
    // 
    def getApproveButtonToolTipText(fc: JFileChooser): String = ???

    @stub
    // 
    def getApproveSelectionAction(): Action = ???

    @stub
    // 
    def getCancelSelectionAction(): Action = ???

    @stub
    // 
    def getChangeToParentDirectoryAction(): Action = ???

    @stub
    // Returns default button for current LookAndFeel.
    def getDefaultButton(fc: JFileChooser): JButton = ???

    @stub
    // Returns the title of this dialog
    def getDialogTitle(fc: JFileChooser): String = ???

    @stub
    // Property to remember the directory that is currently selected in the UI.
    protected def getDirectory(): File = ???

    @stub
    // 
    def getDirectoryName(): String = ???

    @stub
    // 
    def getFileChooser(): JFileChooser = ???

    @stub
    // 
    def getFileName(): String = ???

    @stub
    // 
    def getFileView(fc: JFileChooser): FileView = ???

    @stub
    // 
    def getGoHomeAction(): Action = ???

    @stub
    // 
    def getModel(): BasicDirectoryModel = ???

    @stub
    // 
    def getNewFolderAction(): Action = ???

    @stub
    // 
    def getUpdateAction(): Action = ???

    @stub
    // 
    def installComponents(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def installDefaults(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def installIcons(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def installListeners(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def installStrings(fc: JFileChooser): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Property to remember whether a directory is currently selected in the UI.
    protected def isDirectorySelected(): Boolean = ???

    @stub
    // 
    def rescanCurrentDirectory(fc: JFileChooser): Unit = ???

    @stub
    // Property to remember the directory that is currently selected in the UI.
    protected def setDirectory(f: File): Unit = ???

    @stub
    // 
    def setDirectoryName(dirname: String): Unit = ???

    @stub
    // Property to remember whether a directory is currently selected in the UI.
    protected def setDirectorySelected(b: Boolean): Unit = ???

    @stub
    // 
    def setFileName(filename: String): Unit = ???

    @stub
    // 
    def uninstallComponents(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def uninstallIcons(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def uninstallListeners(fc: JFileChooser): Unit = ???

    @stub
    // 
    protected def uninstallStrings(fc: JFileChooser): Unit = ???
}

object BasicFileChooserUI {
    @stub
    // Creates a BasicFileChooserUI implementation
    // for the specified component.
    def createUI(c: JComponent): ComponentUI = ???
}
