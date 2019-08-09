package javax.swing.plaf.basic

import java.io.File
import java.lang.Object
import javax.swing.filechooser.FileFilter

// 
protected class BasicFileChooserUI.AcceptAllFileFilter extends FileFilter {

    @stub
    // Whether the given file is accepted by this filter.
    def accept(f: File): Boolean = ???
}
