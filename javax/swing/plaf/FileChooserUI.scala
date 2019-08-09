package javax.swing.plaf

import java.io.File
import java.lang.{Object, String}
import javax.swing.{JButton, JFileChooser}
import javax.swing.filechooser.{FileFilter, FileView}

// Pluggable look and feel interface for JFileChooser.
abstract class FileChooserUI extends ComponentUI {

    // 
    def ensureFileIsVisible(fc: JFileChooser, f: File): Unit

    // 
    def getAcceptAllFileFilter(fc: JFileChooser): FileFilter

    // 
    def getApproveButtonText(fc: JFileChooser): String

    // Returns default button for current LookAndFeel.
    def getDefaultButton(fc: JFileChooser): JButton

    // 
    def getDialogTitle(fc: JFileChooser): String

    // 
    def getFileView(fc: JFileChooser): FileView
}
