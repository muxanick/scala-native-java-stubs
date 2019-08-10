package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer}
import java.awt.event.ActionListener
import java.io.File
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import javax.swing.filechooser.{FileFilter, FileSystemView, FileView}
import javax.swing.plaf.FileChooserUI
import scala.scalanative.annotation.stub

/** JFileChooser provides a simple mechanism for the user to
 *  choose a file.
 *  For information about using JFileChooser, see
 *  How to Use File Choosers,
 *  a section in The Java Tutorial.
 * 
 *  
 * 
 *  The following code pops up a file chooser for the user's home directory that
 *  sees only .jpg and .gif images:
 *  
 *     JFileChooser chooser = new JFileChooser();
 *     FileNameExtensionFilter filter = new FileNameExtensionFilter(
 *         "JPG & GIF Images", "jpg", "gif");
 *     chooser.setFileFilter(filter);
 *     int returnVal = chooser.showOpenDialog(parent);
 *     if(returnVal == JFileChooser.APPROVE_OPTION) {
 *        System.out.println("You chose to open this file: " +
 *             chooser.getSelectedFile().getName());
 *     }
 *  
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 */
class JFileChooser extends JComponent with Accessible {

    /** Constructs a JFileChooser pointing to the user's
     *  default directory.
     */
    @stub
    def this() = ???

    /** Constructs a JFileChooser using the given File
     *  as the path.
     */
    @stub
    def this(currentDirectory: File) = ???

    /** Constructs a JFileChooser using the given current directory
     *  and FileSystemView.
     */
    @stub
    def this(currentDirectory: File, fsv: FileSystemView) = ???

    /** Constructs a JFileChooser using the given
     *  FileSystemView.
     */
    @stub
    def this(fsv: FileSystemView) = ???

    /** Constructs a JFileChooser using the given path. */
    @stub
    def this(currentDirectoryPath: String) = ???

    /** Constructs a JFileChooser using the given current directory
     *  path and FileSystemView.
     */
    @stub
    def this(currentDirectoryPath: String, fsv: FileSystemView) = ???

    /** This class implements accessibility support for the
     *  JFileChooser class.  It provides an implementation of the
     *  Java Accessibility API appropriate to file chooser user-interface
     *  elements.
     */
    protected class AccessibleJFileChooser extends JComponent.AccessibleJComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Gets the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???
    }


    /**  */
    @stub
    protected val accessibleContext: AccessibleContext = ???

    /** Returns true if the file should be displayed. */
    @stub
    def accept(f: File): Boolean = ???

    /** Adds an ActionListener to the file chooser. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Adds a filter to the list of user choosable file filters. */
    @stub
    def addChoosableFileFilter(filter: FileFilter): Unit = ???

    /** Called by the UI when the user hits the Approve button
     *  (labeled "Open" or "Save", by default).
     */
    @stub
    def approveSelection(): Unit = ???

    /** Called by the UI when the user chooses the Cancel button. */
    @stub
    def cancelSelection(): Unit = ???

    /** Changes the directory to be set to the parent of the
     *  current directory.
     */
    @stub
    def changeToParentDirectory(): Unit = ???

    /** Creates and returns a new JDialog wrapping
     *  this centered on the parent
     *  in the parent's frame.
     */
    @stub
    protected def createDialog(parent: Component): JDialog = ???

    /** Makes sure that the specified file is viewable, and
     *  not hidden.
     */
    @stub
    def ensureFileIsVisible(f: File): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireActionPerformed(command: String): Unit = ???

    /** Returns the AcceptAll file filter. */
    @stub
    def getAcceptAllFileFilter(): FileFilter = ???

    /** Gets the AccessibleContext associated with this JFileChooser. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the accessory component. */
    @stub
    def getAccessory(): JComponent = ???

    /** Returns an array of all the action listeners
     *  registered on this file chooser.
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Returns the approve button's mnemonic. */
    @stub
    def getApproveButtonMnemonic(): Int = ???

    /** Returns the text used in the ApproveButton in the
     *  FileChooserUI.
     */
    @stub
    def getApproveButtonText(): String = ???

    /** Returns the tooltip text used in the ApproveButton. */
    @stub
    def getApproveButtonToolTipText(): String = ???

    /** Gets the list of user choosable file filters. */
    @stub
    def getChoosableFileFilters(): Array[FileFilter] = ???

    /** Returns the value of the controlButtonsAreShown
     *  property.
     */
    @stub
    def getControlButtonsAreShown(): Boolean = ???

    /** Returns the current directory. */
    @stub
    def getCurrentDirectory(): File = ???

    /** Returns the file description. */
    @stub
    def getDescription(f: File): String = ???

    /** Gets the string that goes in the JFileChooser's titlebar. */
    @stub
    def getDialogTitle(): String = ???

    /** Returns the type of this dialog. */
    @stub
    def getDialogType(): Int = ???

    /** Gets the value of the dragEnabled property. */
    @stub
    def getDragEnabled(): Boolean = ???

    /** Returns the currently selected file filter. */
    @stub
    def getFileFilter(): FileFilter = ???

    /** Returns the current file-selection mode. */
    @stub
    def getFileSelectionMode(): Int = ???

    /** Returns the file system view. */
    @stub
    def getFileSystemView(): FileSystemView = ???

    /** Returns the current file view. */
    @stub
    def getFileView(): FileView = ???

    /** Returns the icon for this file or type of file, depending
     *  on the system.
     */
    @stub
    def getIcon(f: File): Icon = ???

    /** Returns the filename. */
    @stub
    def getName(f: File): String = ???

    /** Returns the selected file. */
    @stub
    def getSelectedFile(): File = ???

    /** Returns a list of selected files if the file chooser is
     *  set to allow multiple selection.
     */
    @stub
    def getSelectedFiles(): Array[File] = ???

    /** Returns the file type. */
    @stub
    def getTypeDescription(f: File): String = ???

    /** Gets the UI object which implements the L&F for this component. */
    @stub
    def getUI(): FileChooserUI = ???

    /** Returns a string that specifies the name of the L&F class
     *  that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns whether the AcceptAll FileFilter is used. */
    @stub
    def isAcceptAllFileFilterUsed(): Boolean = ???

    /** Convenience call that determines if directories are selectable based
     *  on the current file selection mode.
     */
    @stub
    def isDirectorySelectionEnabled(): Boolean = ???

    /** Returns true if hidden files are not shown in the file chooser;
     *  otherwise, returns false.
     */
    @stub
    def isFileHidingEnabled(): Boolean = ???

    /** Convenience call that determines if files are selectable based on the
     *  current file selection mode.
     */
    @stub
    def isFileSelectionEnabled(): Boolean = ???

    /** Returns true if multiple files can be selected. */
    @stub
    def isMultiSelectionEnabled(): Boolean = ???

    /** Returns true if the file (directory) can be visited. */
    @stub
    def isTraversable(f: File): Boolean = ???

    /** Returns a string representation of this JFileChooser. */
    @stub
    protected def paramString(): String = ???

    /** Removes an ActionListener from the file chooser. */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Removes a filter from the list of user choosable file filters. */
    @stub
    def removeChoosableFileFilter(f: FileFilter): Boolean = ???

    /** Tells the UI to rescan its files list from the current directory. */
    @stub
    def rescanCurrentDirectory(): Unit = ???

    /** Resets the choosable file filter list to its starting state. */
    @stub
    def resetChoosableFileFilters(): Unit = ???

    /** Determines whether the AcceptAll FileFilter is used
     *  as an available choice in the choosable filter list.
     */
    @stub
    def setAcceptAllFileFilterUsed(b: Boolean): Unit = ???

    /** Sets the accessory component. */
    @stub
    def setAccessory(newAccessory: JComponent): Unit = ???

    /** Sets the approve button's mnemonic using a character. */
    @stub
    def setApproveButtonMnemonic(mnemonic: Char): Unit = ???

    /** Sets the approve button's mnemonic using a numeric keycode. */
    @stub
    def setApproveButtonMnemonic(mnemonic: Int): Unit = ???

    /** Sets the text used in the ApproveButton in the
     *  FileChooserUI.
     */
    @stub
    def setApproveButtonText(approveButtonText: String): Unit = ???

    /** Sets the tooltip text used in the ApproveButton. */
    @stub
    def setApproveButtonToolTipText(toolTipText: String): Unit = ???

    /** Sets the property
     *  that indicates whether the approve and cancel
     *  buttons are shown in the file chooser.
     */
    @stub
    def setControlButtonsAreShown(b: Boolean): Unit = ???

    /** Sets the current directory. */
    @stub
    def setCurrentDirectory(dir: File): Unit = ???

    /** Sets the string that goes in the JFileChooser window's
     *  title bar.
     */
    @stub
    def setDialogTitle(dialogTitle: String): Unit = ???

    /** Sets the type of this dialog. */
    @stub
    def setDialogType(dialogType: Int): Unit = ???

    /** Sets the dragEnabled property,
     *  which must be true to enable
     *  automatic drag handling (the first part of drag and drop)
     *  on this component.
     */
    @stub
    def setDragEnabled(b: Boolean): Unit = ???

    /** Sets the current file filter. */
    @stub
    def setFileFilter(filter: FileFilter): Unit = ???

    /** Sets file hiding on or off. */
    @stub
    def setFileHidingEnabled(b: Boolean): Unit = ???

    /** Sets the JFileChooser to allow the user to just
     *  select files, just select
     *  directories, or select both files and directories.
     */
    @stub
    def setFileSelectionMode(mode: Int): Unit = ???

    /** Sets the file system view that the JFileChooser uses for
     *  accessing and creating file system resources, such as finding
     *  the floppy drive and getting a list of root drives.
     */
    @stub
    def setFileSystemView(fsv: FileSystemView): Unit = ???

    /** Sets the file view to used to retrieve UI information, such as
     *  the icon that represents a file or the type description of a file.
     */
    @stub
    def setFileView(fileView: FileView): Unit = ???

    /** Sets the file chooser to allow multiple file selections. */
    @stub
    def setMultiSelectionEnabled(b: Boolean): Unit = ???

    /** Sets the selected file. */
    @stub
    def setSelectedFile(file: File): Unit = ???

    /** Sets the list of selected files if the file chooser is
     *  set to allow multiple selection.
     */
    @stub
    def setSelectedFiles(selectedFiles: Array[File]): Unit = ???

    /** Performs common constructor initialization and setup. */
    @stub
    protected def setup(view: FileSystemView): Unit = ???

    /** Pops a custom file chooser dialog with a custom approve button. */
    @stub
    def showDialog(parent: Component, approveButtonText: String): Int = ???

    /** Pops up an "Open File" file chooser dialog. */
    @stub
    def showOpenDialog(parent: Component): Int = ???

    /** Pops up a "Save File" file chooser dialog. */
    @stub
    def showSaveDialog(parent: Component): Int = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}

object JFileChooser {
    /** Identifies whether a the AcceptAllFileFilter is used or not. */
    @stub
    val ACCEPT_ALL_FILE_FILTER_USED_CHANGED_PROPERTY: String = ???

    /** Says that a different accessory component is in use
     *  (for example, to preview files).
     */
    @stub
    val ACCESSORY_CHANGED_PROPERTY: String = ???

    /** Identifies change in the mnemonic for the approve (yes, ok) button. */
    @stub
    val APPROVE_BUTTON_MNEMONIC_CHANGED_PROPERTY: String = ???

    /** Identifies change in the text on the approve (yes, ok) button. */
    @stub
    val APPROVE_BUTTON_TEXT_CHANGED_PROPERTY: String = ???

    /** Identifies change in the tooltip text for the approve (yes, ok)
     *  button.
     */
    @stub
    val APPROVE_BUTTON_TOOL_TIP_TEXT_CHANGED_PROPERTY: String = ???

    /** Return value if approve (yes, ok) is chosen. */
    @stub
    val APPROVE_OPTION: Int = ???

    /** Instruction to approve the current selection
     *  (same as pressing yes or ok).
     */
    @stub
    val APPROVE_SELECTION: String = ???

    /** Return value if cancel is chosen. */
    @stub
    val CANCEL_OPTION: Int = ???

    /** Instruction to cancel the current selection. */
    @stub
    val CANCEL_SELECTION: String = ???

    /** Identifies a change in the list of predefined file filters
     *  the user can choose from.
     */
    @stub
    val CHOOSABLE_FILE_FILTER_CHANGED_PROPERTY: String = ???

    /** Instruction to display the control buttons. */
    @stub
    val CONTROL_BUTTONS_ARE_SHOWN_CHANGED_PROPERTY: String = ???

    /** Type value indicating that the JFileChooser supports a
     *  developer-specified file operation.
     */
    @stub
    val CUSTOM_DIALOG: Int = ???

    /** Identifies a change in the dialog title. */
    @stub
    val DIALOG_TITLE_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the type of files displayed (files only,
     *  directories only, or both files and directories).
     */
    @stub
    val DIALOG_TYPE_CHANGED_PROPERTY: String = ???

    /** Instruction to display only directories. */
    @stub
    val DIRECTORIES_ONLY: Int = ???

    /** Identifies user's directory change. */
    @stub
    val DIRECTORY_CHANGED_PROPERTY: String = ???

    /** Return value if an error occurred. */
    @stub
    val ERROR_OPTION: Int = ???

    /** User changed the kind of files to display. */
    @stub
    val FILE_FILTER_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the display-hidden-files property. */
    @stub
    val FILE_HIDING_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the kind of selection (single,
     *  multiple, etc.).
     */
    @stub
    val FILE_SELECTION_MODE_CHANGED_PROPERTY: String = ???

    /** Says that a different object is being used to find available drives
     *  on the system.
     */
    @stub
    val FILE_SYSTEM_VIEW_CHANGED_PROPERTY: String = ???

    /** Says that a different object is being used to retrieve file
     *  information.
     */
    @stub
    val FILE_VIEW_CHANGED_PROPERTY: String = ???

    /** Instruction to display both files and directories. */
    @stub
    val FILES_AND_DIRECTORIES: Int = ???

    /** Instruction to display only files. */
    @stub
    val FILES_ONLY: Int = ???

    /** Enables multiple-file selections. */
    @stub
    val MULTI_SELECTION_ENABLED_CHANGED_PROPERTY: String = ???

    /** Type value indicating that the JFileChooser supports an
     *  "Open" file operation.
     */
    @stub
    val OPEN_DIALOG: Int = ???

    /** Type value indicating that the JFileChooser supports a
     *  "Save" file operation.
     */
    @stub
    val SAVE_DIALOG: Int = ???

    /** Identifies change in user's single-file selection. */
    @stub
    val SELECTED_FILE_CHANGED_PROPERTY: String = ???

    /** Identifies change in user's multiple-file selection. */
    @stub
    val SELECTED_FILES_CHANGED_PROPERTY: String = ???
}
