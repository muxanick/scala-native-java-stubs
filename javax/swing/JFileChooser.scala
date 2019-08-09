package javax.swing

import java.awt.{Component, Container}
import java.awt.event.ActionListener
import java.io.File
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.filechooser.{FileFilter, FileSystemView, FileView}
import javax.swing.plaf.FileChooserUI

// JFileChooser provides a simple mechanism for the user to
// choose a file.
// For information about using JFileChooser, see
// How to Use File Choosers,
// a section in The Java Tutorial.
//
// 
//
// The following code pops up a file chooser for the user's home directory that
// sees only .jpg and .gif images:
// 
//    JFileChooser chooser = new JFileChooser();
//    FileNameExtensionFilter filter = new FileNameExtensionFilter(
//        "JPG & GIF Images", "jpg", "gif");
//    chooser.setFileFilter(filter);
//    int returnVal = chooser.showOpenDialog(parent);
//    if(returnVal == JFileChooser.APPROVE_OPTION) {
//       System.out.println("You chose to open this file: " +
//            chooser.getSelectedFile().getName());
//    }
// 
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
class JFileChooser extends JComponent with Accessible {

    @stub
    // Constructs a JFileChooser pointing to the user's
    // default directory.
    def this() = ???

    @stub
    // Constructs a JFileChooser using the given File
    // as the path.
    def this(currentDirectory: File) = ???

    @stub
    // Constructs a JFileChooser using the given current directory
    // and FileSystemView.
    def this(currentDirectory: File, fsv: FileSystemView) = ???

    @stub
    // Constructs a JFileChooser using the given
    // FileSystemView.
    def this(fsv: FileSystemView) = ???

    @stub
    // Constructs a JFileChooser using the given path.
    def this(currentDirectoryPath: String) = ???

    @stub
    // 
    protected def accessibleContext: AccessibleContext = ???

    @stub
    // Returns true if the file should be displayed.
    def accept(f: File): Boolean = ???

    @stub
    // Adds an ActionListener to the file chooser.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Adds a filter to the list of user choosable file filters.
    def addChoosableFileFilter(filter: FileFilter): Unit = ???

    @stub
    // Called by the UI when the user hits the Approve button
    // (labeled "Open" or "Save", by default).
    def approveSelection(): Unit = ???

    @stub
    // Called by the UI when the user chooses the Cancel button.
    def cancelSelection(): Unit = ???

    @stub
    // Changes the directory to be set to the parent of the
    // current directory.
    def changeToParentDirectory(): Unit = ???

    @stub
    // Creates and returns a new JDialog wrapping
    // this centered on the parent
    // in the parent's frame.
    protected def createDialog(parent: Component): JDialog = ???

    @stub
    // Makes sure that the specified file is viewable, and
    // not hidden.
    def ensureFileIsVisible(f: File): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireActionPerformed(command: String): Unit = ???

    @stub
    // Returns the AcceptAll file filter.
    def getAcceptAllFileFilter(): FileFilter = ???

    @stub
    // Gets the AccessibleContext associated with this JFileChooser.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the accessory component.
    def getAccessory(): JComponent = ???

    @stub
    // Returns an array of all the action listeners
    // registered on this file chooser.
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Returns the approve button's mnemonic.
    def getApproveButtonMnemonic(): Int = ???

    @stub
    // Returns the text used in the ApproveButton in the
    // FileChooserUI.
    def getApproveButtonText(): String = ???

    @stub
    // Returns the tooltip text used in the ApproveButton.
    def getApproveButtonToolTipText(): String = ???

    @stub
    // Gets the list of user choosable file filters.
    def getChoosableFileFilters(): Array[FileFilter] = ???

    @stub
    // Returns the value of the controlButtonsAreShown
    // property.
    def getControlButtonsAreShown(): Boolean = ???

    @stub
    // Returns the current directory.
    def getCurrentDirectory(): File = ???

    @stub
    // Returns the file description.
    def getDescription(f: File): String = ???

    @stub
    // Gets the string that goes in the JFileChooser's titlebar.
    def getDialogTitle(): String = ???

    @stub
    // Returns the type of this dialog.
    def getDialogType(): Int = ???

    @stub
    // Gets the value of the dragEnabled property.
    def getDragEnabled(): Boolean = ???

    @stub
    // Returns the currently selected file filter.
    def getFileFilter(): FileFilter = ???

    @stub
    // Returns the current file-selection mode.
    def getFileSelectionMode(): Int = ???

    @stub
    // Returns the file system view.
    def getFileSystemView(): FileSystemView = ???

    @stub
    // Returns the current file view.
    def getFileView(): FileView = ???

    @stub
    // Returns the icon for this file or type of file, depending
    // on the system.
    def getIcon(f: File): Icon = ???

    @stub
    // Returns the filename.
    def getName(f: File): String = ???

    @stub
    // Returns the selected file.
    def getSelectedFile(): File = ???

    @stub
    // Returns a list of selected files if the file chooser is
    // set to allow multiple selection.
    def getSelectedFiles(): Array[File] = ???

    @stub
    // Returns the file type.
    def getTypeDescription(f: File): String = ???

    @stub
    // Gets the UI object which implements the L&F for this component.
    def getUI(): FileChooserUI = ???

    @stub
    // Returns a string that specifies the name of the L&F class
    // that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns whether the AcceptAll FileFilter is used.
    def isAcceptAllFileFilterUsed(): Boolean = ???

    @stub
    // Convenience call that determines if directories are selectable based
    // on the current file selection mode.
    def isDirectorySelectionEnabled(): Boolean = ???

    @stub
    // Returns true if hidden files are not shown in the file chooser;
    // otherwise, returns false.
    def isFileHidingEnabled(): Boolean = ???

    @stub
    // Convenience call that determines if files are selectable based on the
    // current file selection mode.
    def isFileSelectionEnabled(): Boolean = ???

    @stub
    // Returns true if multiple files can be selected.
    def isMultiSelectionEnabled(): Boolean = ???

    @stub
    // Returns true if the file (directory) can be visited.
    def isTraversable(f: File): Boolean = ???

    @stub
    // Returns a string representation of this JFileChooser.
    protected def paramString(): String = ???

    @stub
    // Removes an ActionListener from the file chooser.
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Removes a filter from the list of user choosable file filters.
    def removeChoosableFileFilter(f: FileFilter): Boolean = ???

    @stub
    // Tells the UI to rescan its files list from the current directory.
    def rescanCurrentDirectory(): Unit = ???

    @stub
    // Resets the choosable file filter list to its starting state.
    def resetChoosableFileFilters(): Unit = ???

    @stub
    // Determines whether the AcceptAll FileFilter is used
    // as an available choice in the choosable filter list.
    def setAcceptAllFileFilterUsed(b: Boolean): Unit = ???

    @stub
    // Sets the accessory component.
    def setAccessory(newAccessory: JComponent): Unit = ???

    @stub
    // Sets the approve button's mnemonic using a character.
    def setApproveButtonMnemonic(mnemonic: Char): Unit = ???

    @stub
    // Sets the approve button's mnemonic using a numeric keycode.
    def setApproveButtonMnemonic(mnemonic: Int): Unit = ???

    @stub
    // Sets the text used in the ApproveButton in the
    // FileChooserUI.
    def setApproveButtonText(approveButtonText: String): Unit = ???

    @stub
    // Sets the tooltip text used in the ApproveButton.
    def setApproveButtonToolTipText(toolTipText: String): Unit = ???

    @stub
    // Sets the property
    // that indicates whether the approve and cancel
    // buttons are shown in the file chooser.
    def setControlButtonsAreShown(b: Boolean): Unit = ???

    @stub
    // Sets the current directory.
    def setCurrentDirectory(dir: File): Unit = ???

    @stub
    // Sets the string that goes in the JFileChooser window's
    // title bar.
    def setDialogTitle(dialogTitle: String): Unit = ???

    @stub
    // Sets the type of this dialog.
    def setDialogType(dialogType: Int): Unit = ???

    @stub
    // Sets the dragEnabled property,
    // which must be true to enable
    // automatic drag handling (the first part of drag and drop)
    // on this component.
    def setDragEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the current file filter.
    def setFileFilter(filter: FileFilter): Unit = ???

    @stub
    // Sets file hiding on or off.
    def setFileHidingEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the JFileChooser to allow the user to just
    // select files, just select
    // directories, or select both files and directories.
    def setFileSelectionMode(mode: Int): Unit = ???

    @stub
    // Sets the file system view that the JFileChooser uses for
    // accessing and creating file system resources, such as finding
    // the floppy drive and getting a list of root drives.
    def setFileSystemView(fsv: FileSystemView): Unit = ???

    @stub
    // Sets the file view to used to retrieve UI information, such as
    // the icon that represents a file or the type description of a file.
    def setFileView(fileView: FileView): Unit = ???

    @stub
    // Sets the file chooser to allow multiple file selections.
    def setMultiSelectionEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the selected file.
    def setSelectedFile(file: File): Unit = ???

    @stub
    // Sets the list of selected files if the file chooser is
    // set to allow multiple selection.
    def setSelectedFiles(selectedFiles: Array[File]): Unit = ???

    @stub
    // Performs common constructor initialization and setup.
    protected def setup(view: FileSystemView): Unit = ???

    @stub
    // Pops a custom file chooser dialog with a custom approve button.
    def showDialog(parent: Component, approveButtonText: String): Int = ???

    @stub
    // Pops up an "Open File" file chooser dialog.
    def showOpenDialog(parent: Component): Int = ???

    @stub
    // Pops up a "Save File" file chooser dialog.
    def showSaveDialog(parent: Component): Int = ???
}

object JFileChooser {
    @stub
    // Identifies whether a the AcceptAllFileFilter is used or not.
    def ACCEPT_ALL_FILE_FILTER_USED_CHANGED_PROPERTY: String = ???

    @stub
    // Says that a different accessory component is in use
    // (for example, to preview files).
    def ACCESSORY_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies change in the mnemonic for the approve (yes, ok) button.
    def APPROVE_BUTTON_MNEMONIC_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies change in the text on the approve (yes, ok) button.
    def APPROVE_BUTTON_TEXT_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies change in the tooltip text for the approve (yes, ok)
    // button.
    def APPROVE_BUTTON_TOOL_TIP_TEXT_CHANGED_PROPERTY: String = ???

    @stub
    // Return value if approve (yes, ok) is chosen.
    def APPROVE_OPTION: Int = ???

    @stub
    // Instruction to approve the current selection
    // (same as pressing yes or ok).
    def APPROVE_SELECTION: String = ???

    @stub
    // Return value if cancel is chosen.
    def CANCEL_OPTION: Int = ???

    @stub
    // Instruction to cancel the current selection.
    def CANCEL_SELECTION: String = ???

    @stub
    // Identifies a change in the list of predefined file filters
    // the user can choose from.
    def CHOOSABLE_FILE_FILTER_CHANGED_PROPERTY: String = ???

    @stub
    // Instruction to display the control buttons.
    def CONTROL_BUTTONS_ARE_SHOWN_CHANGED_PROPERTY: String = ???

    @stub
    // Type value indicating that the JFileChooser supports a
    // developer-specified file operation.
    def CUSTOM_DIALOG: Int = ???

    @stub
    // Identifies a change in the dialog title.
    def DIALOG_TITLE_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies a change in the type of files displayed (files only,
    // directories only, or both files and directories).
    def DIALOG_TYPE_CHANGED_PROPERTY: String = ???

    @stub
    // Instruction to display only directories.
    def DIRECTORIES_ONLY: Int = ???

    @stub
    // Identifies user's directory change.
    def DIRECTORY_CHANGED_PROPERTY: String = ???

    @stub
    // Return value if an error occurred.
    def ERROR_OPTION: Int = ???

    @stub
    // User changed the kind of files to display.
    def FILE_FILTER_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies a change in the display-hidden-files property.
    def FILE_HIDING_CHANGED_PROPERTY: String = ???

    @stub
    // Identifies a change in the kind of selection (single,
    // multiple, etc.).
    def FILE_SELECTION_MODE_CHANGED_PROPERTY: String = ???

    @stub
    // Says that a different object is being used to find available drives
    // on the system.
    def FILE_SYSTEM_VIEW_CHANGED_PROPERTY: String = ???

    @stub
    // Says that a different object is being used to retrieve file
    // information.
    def FILE_VIEW_CHANGED_PROPERTY: String = ???

    @stub
    // Instruction to display both files and directories.
    def FILES_AND_DIRECTORIES: Int = ???

    @stub
    // Instruction to display only files.
    def FILES_ONLY: Int = ???

    @stub
    // Enables multiple-file selections.
    def MULTI_SELECTION_ENABLED_CHANGED_PROPERTY: String = ???

    @stub
    // Type value indicating that the JFileChooser supports an
    // "Open" file operation.
    def OPEN_DIALOG: Int = ???

    @stub
    // Type value indicating that the JFileChooser supports a
    // "Save" file operation.
    def SAVE_DIALOG: Int = ???

    @stub
    // Identifies change in user's single-file selection.
    def SELECTED_FILE_CHANGED_PROPERTY: String = ???
}
