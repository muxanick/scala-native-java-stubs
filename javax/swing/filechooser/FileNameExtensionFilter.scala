package javax.swing.filechooser

import java.io.File
import java.lang.{Object, String}

// An implementation of FileFilter that filters using a
// specified set of extensions. The extension for a file is the
// portion of the file name after the last ".". Files whose name does
// not contain a "." have no file name extension. File name extension
// comparisons are case insensitive.
// 
// The following example creates a
// FileNameExtensionFilter that will show jpg files:
// 
// FileFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
// JFileChooser fileChooser = ...;
// fileChooser.addChoosableFileFilter(filter);
// 
final class FileNameExtensionFilter extends FileFilter {

    @stub
    // Tests the specified file, returning true if the file is
    // accepted, false otherwise.
    def accept(f: File): Boolean = ???

    @stub
    // The description of this filter.
    def getDescription(): String = ???

    @stub
    // Returns the set of file name extensions files are tested against.
    def getExtensions(): Array[String] = ???
}
