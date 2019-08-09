package javax.swing.filechooser

import java.io.File
import java.lang.{Object, String}
import javax.swing.Icon

/** FileSystemView is JFileChooser's gateway to the
 *  file system. Since the JDK1.1 File API doesn't allow
 *  access to such information as root partitions, file type
 *  information, or hidden file bits, this class is designed
 *  to intuit as much OS-specific file system information as
 *  possible.
 * 
 *  
 * 
 *  Java Licensees may want to provide a different implementation of
 *  FileSystemView to better handle a given operating system.
 */
abstract class FileSystemView extends Object {

    /** Returns a File object constructed in dir from the given filename. */
    def createFileObject(dir: File, filename: String): File

    /** Returns a File object constructed from the given path string. */
    def createFileObject(path: String): File

    /** Creates a new File object for f with correct
     *  behavior for a file system root directory.
     */
    protected def createFileSystemRoot(f: File): File

    /** Creates a new folder with a default folder name. */
    def createNewFolder(containingDir: File): File

    /**  */
    def getChild(parent: File, fileName: String): File

    /** Return the user's default starting directory for the file chooser. */
    def getDefaultDirectory(): File

    /** Gets the list of shown (i.e. */
    def getFiles(dir: File, useFileHiding: Boolean): Array[File]

    /**  */
    def getHomeDirectory(): File

    /** Returns the parent directory of dir. */
    def getParentDirectory(dir: File): File

    /** Returns all root partitions on this system. */
    def getRoots(): Array[File]

    /** Name of a file, directory, or folder as it would be displayed in
     *  a system file browser.
     */
    def getSystemDisplayName(f: File): String

    /** Icon for a file, directory, or folder as it would be displayed in
     *  a system file browser.
     */
    def getSystemIcon(f: File): Icon

    /** Type description for a file, directory, or folder as it would be displayed in
     *  a system file browser.
     */
    def getSystemTypeDescription(f: File): String

    /** Used by UI classes to decide whether to display a special icon
     *  for a computer node, e.g.
     */
    def isComputerNode(dir: File): Boolean

    /** Used by UI classes to decide whether to display a special icon
     *  for drives or partitions, e.g.
     */
    def isDrive(dir: File): Boolean

    /** Checks if f represents a real directory or file as opposed to a
     *  special folder such as "Desktop".
     */
    def isFileSystem(f: File): Boolean

    /** Is dir the root of a tree in the file system, such as a drive
     *  or partition.
     */
    def isFileSystemRoot(dir: File): Boolean

    /** Used by UI classes to decide whether to display a special icon
     *  for a floppy disk.
     */
    def isFloppyDrive(dir: File): Boolean

    /** Returns whether a file is hidden or not. */
    def isHiddenFile(f: File): Boolean

    /** On Windows, a file can appear in multiple folders, other than its
     *  parent directory in the filesystem.
     */
    def isParent(folder: File, file: File): Boolean

    /** Determines if the given file is a root in the navigable tree(s). */
    def isRoot(f: File): Boolean
}

object FileSystemView {
    /**  */
    @stub
    def getFileSystemView(): FileSystemView = ???
}
