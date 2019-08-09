package javax.swing.filechooser

import java.io.File
import java.lang.{Boolean, Object, String}
import javax.swing.Icon
import scala.scalanative.annotation.stub

/** FileView defines an abstract class that can be implemented
 *  to provide the filechooser with UI information for a File.
 *  Each L&F JFileChooserUI object implements this
 *  class to pass back the correct icons and type descriptions specific to
 *  that L&F. For example, the Microsoft Windows L&F returns the
 *  generic Windows icons for directories and generic files.
 *  Additionally, you may want to provide your own FileView to
 *  JFileChooser to return different icons or additional
 *  information using JFileChooser.setFileView(javax.swing.filechooser.FileView).
 * 
 *  
 * 
 *  JFileChooser first looks to see if there is a user defined
 *  FileView, if there is, it gets type information from
 *  there first. If FileView returns null for
 *  any method, JFileChooser then uses the L&F specific
 *  view to get the information.
 *  So, for example, if you provide a FileView class that
 *  returns an Icon for JPG files, and returns null
 *  icons for all other files, the UI's FileView will provide
 *  default icons for all other files.
 * 
 *  
 * 
 *  For an example implementation of a simple file view, see
 *  yourJDK/demo/jfc/FileChooserDemo/ExampleFileView.java.
 *  For more information and examples see
 *  How to Use File Choosers,
 *  a section in The Java Tutorial.
 */
abstract class FileView extends Object {

    /**  */
    @stub
    def this() = ???

    /** A human readable description of the file. */
    def getDescription(f: File): String

    /** The icon that represents this file in the JFileChooser. */
    def getIcon(f: File): Icon

    /** The name of the file. */
    def getName(f: File): String

    /** A human readable description of the type of the file. */
    def getTypeDescription(f: File): String

    /** Whether the directory is traversable or not. */
    def isTraversable(f: File): Boolean
}
