package java.awt

import java.io.{File, FilenameFilter}
import java.lang.{Object, String}

/** The FileDialog class displays a dialog window
 *  from which the user can select a file.
 *  
 *  Since it is a modal dialog, when the application calls
 *  its show method to display the dialog,
 *  it blocks the rest of the application until the user has
 *  chosen a file.
 */
class FileDialog extends Dialog {

    /** Creates a file dialog for loading a file. */
    @stub
    def this(parent: Dialog) = ???

    /** Creates a file dialog window with the specified title for loading
     *  a file.
     */
    @stub
    def this(parent: Dialog, title: String) = ???

    /** Creates a file dialog window with the specified title for loading
     *  or saving a file.
     */
    @stub
    def this(parent: Dialog, title: String, mode: Int) = ???

    /** Creates a file dialog for loading a file. */
    @stub
    def this(parent: Frame) = ???

    /** Creates a file dialog window with the specified title for loading
     *  a file.
     */
    @stub
    def this(parent: Frame, title: String) = ???

    /** Creates the file dialog's peer. */
    @stub
    def addNotify(): Unit = ???

    /** Gets the directory of this file dialog. */
    @stub
    def getDirectory(): String = ???

    /** Gets the selected file of this file dialog. */
    @stub
    def getFile(): String = ???

    /** Determines this file dialog's filename filter. */
    @stub
    def getFilenameFilter(): FilenameFilter = ???

    /** Returns files that the user selects. */
    @stub
    def getFiles(): Array[File] = ???

    /** Indicates whether this file dialog box is for loading from a file
     *  or for saving to a file.
     */
    @stub
    def getMode(): Int = ???

    /** Returns whether the file dialog allows the multiple file selection. */
    @stub
    def isMultipleMode(): Boolean = ???

    /** Returns a string representing the state of this FileDialog
     *  window.
     */
    @stub
    protected def paramString(): String = ???

    /** Sets the directory of this file dialog window to be the
     *  specified directory.
     */
    @stub
    def setDirectory(dir: String): Unit = ???

    /** Sets the selected file for this file dialog window to be the
     *  specified file.
     */
    @stub
    def setFile(file: String): Unit = ???

    /** Sets the filename filter for this file dialog window to the
     *  specified filter.
     */
    @stub
    def setFilenameFilter(filter: FilenameFilter): Unit = ???

    /** Sets the mode of the file dialog. */
    @stub
    def setMode(mode: Int): Unit = ???
}

object FileDialog {
    /** This constant value indicates that the purpose of the file
     *  dialog window is to locate a file from which to read.
     */
    @stub
    val LOAD: Int = ???
}
