package javax.swing.filechooser

import java.io.File
import java.lang.Object

/** FileFilter is an abstract class used by JFileChooser
 *  for filtering the set of files shown to the user. See
 *  FileNameExtensionFilter for an implementation that filters using
 *  the file name extension.
 *  
 *  A FileFilter
 *  can be set on a JFileChooser to
 *  keep unwanted files from appearing in the directory listing.
 *  For an example implementation of a simple file filter, see
 *  yourJDK/demo/jfc/FileChooserDemo/ExampleFileFilter.java.
 *  For more information and examples see
 *  How to Use File Choosers,
 *  a section in The Java Tutorial.
 */
abstract class FileFilter extends Object {

    /** Whether the given file is accepted by this filter. */
    def accept(f: File): Boolean
}
