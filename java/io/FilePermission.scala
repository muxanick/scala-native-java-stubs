package java.io

import java.lang.{Object, String}
import java.security.Permission

/** This class represents access to a file or directory.  A FilePermission consists
 *  of a pathname and a set of actions valid for that pathname.
 *  
 *  Pathname is the pathname of the file or directory granted the specified
 *  actions. A pathname that ends in "/*" (where "/" is
 *  the file separator character, File.separatorChar) indicates
 *  all the files and directories contained in that directory. A pathname
 *  that ends with "/-" indicates (recursively) all files
 *  and subdirectories contained in that directory. A pathname consisting of
 *  the special token "<<ALL FILES>>" matches any file.
 *  
 *  Note: A pathname consisting of a single "*" indicates all the files
 *  in the current directory, while a pathname consisting of a single "-"
 *  indicates all the files in the current directory and
 *  (recursively) all files and subdirectories contained in the current
 *  directory.
 *  
 *  The actions to be granted are passed to the constructor in a string containing
 *  a list of one or more comma-separated keywords. The possible keywords are
 *  "read", "write", "execute", "delete", and "readlink". Their meaning is
 *  defined as follows:
 * 
 *  
 *      read  read permission
 *      write  write permission
 *      execute
 *      execute permission. Allows Runtime.exec to
 *          be called. Corresponds to SecurityManager.checkExec.
 *      delete
 *      delete permission. Allows File.delete to
 *          be called. Corresponds to SecurityManager.checkDelete.
 *      readlink
 *      read link permission. Allows the target of a
 *          symbolic link
 *          to be read by invoking the readSymbolicLink  method.
 *  
 *  
 *  The actions string is converted to lowercase before processing.
 *  
 *  Be careful when granting FilePermissions. Think about the implications
 *  of granting read and especially write access to various files and
 *  directories. The "<<ALL FILES>>" permission with write action is
 *  especially dangerous. This grants permission to write to the entire
 *  file system. One thing this effectively allows is replacement of the
 *  system binary, including the JVM runtime environment.
 * 
 *  Please note: Code can always read a file from the same
 *  directory it's in (or a subdirectory of that directory); it does not
 *  need explicit permission to do so.
 */
final class FilePermission extends Permission with Serializable {

    /** Checks two FilePermission objects for equality. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the "canonical string representation" of the actions. */
    @stub
    def getActions(): String = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Checks if this FilePermission object "implies" the specified permission. */
    @stub
    def implies(p: Permission): Boolean = ???
}
