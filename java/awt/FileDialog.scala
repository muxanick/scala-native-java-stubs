package java.awt

import java.io.{File, FilenameFilter}
import java.lang.{Object, String}

// The FileDialog class displays a dialog window
// from which the user can select a file.
// 
// Since it is a modal dialog, when the application calls
// its show method to display the dialog,
// it blocks the rest of the application until the user has
// chosen a file.
class FileDialog extends Dialog {

    @stub
    // Creates a file dialog for loading a file.
    def this(parent: Dialog) = ???

    @stub
    // Creates a file dialog window with the specified title for loading
    // a file.
    def this(parent: Dialog, title: String) = ???

    @stub
    // Creates a file dialog window with the specified title for loading
    // or saving a file.
    def this(parent: Dialog, title: String, mode: Int) = ???

    @stub
    // Creates a file dialog for loading a file.
    def this(parent: Frame) = ???

    @stub
    // Creates a file dialog window with the specified title for loading
    // a file.
    def this(parent: Frame, title: String) = ???

    @stub
    // Creates the file dialog's peer.
    def addNotify(): Unit = ???

    @stub
    // Gets the directory of this file dialog.
    def getDirectory(): String = ???

    @stub
    // Gets the selected file of this file dialog.
    def getFile(): String = ???

    @stub
    // Determines this file dialog's filename filter.
    def getFilenameFilter(): FilenameFilter = ???

    @stub
    // Returns files that the user selects.
    def getFiles(): Array[File] = ???

    @stub
    // Indicates whether this file dialog box is for loading from a file
    // or for saving to a file.
    def getMode(): Int = ???

    @stub
    // Returns whether the file dialog allows the multiple file selection.
    def isMultipleMode(): Boolean = ???

    @stub
    // Returns a string representing the state of this FileDialog
    // window.
    protected def paramString(): String = ???

    @stub
    // Sets the directory of this file dialog window to be the
    // specified directory.
    def setDirectory(dir: String): Unit = ???

    @stub
    // Sets the selected file for this file dialog window to be the
    // specified file.
    def setFile(file: String): Unit = ???

    @stub
    // Sets the filename filter for this file dialog window to the
    // specified filter.
    def setFilenameFilter(filter: FilenameFilter): Unit = ???

    @stub
    // Sets the mode of the file dialog.
    def setMode(mode: Int): Unit = ???
}

object FileDialog {
    @stub
    // This constant value indicates that the purpose of the file
    // dialog window is to locate a file from which to read.
    def LOAD: Int = ???
}
