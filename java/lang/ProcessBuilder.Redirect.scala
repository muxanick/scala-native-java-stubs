package java.lang

import java.io.File

/** Represents a source of subprocess input or a destination of
 *  subprocess output.
 * 
 *  Each Redirect instance is one of the following:
 * 
 *  
 *  the special value Redirect.PIPE
 *  the special value Redirect.INHERIT
 *  a redirection to read from a file, created by an invocation of
 *      Redirect.from(File)
 *  a redirection to write to a file,  created by an invocation of
 *      Redirect.to(File)
 *  a redirection to append to a file, created by an invocation of
 *      Redirect.appendTo(File)
 *  
 * 
 *  Each of the above categories has an associated unique
 *  Type.
 */
object abstract ProcessBuilder.Redirect extends Object {

    /** Indicates that subprocess I/O source or destination will be the
     *  same as those of the current process.
     */
    @stub
    val INHERIT: ProcessBuilder.Redirect = ???

    /** Returns a redirect to append to the specified file. */
    @stub
    def appendTo(file: File): ProcessBuilder.Redirect = ???

    /** Compares the specified object with this Redirect for
     *  equality.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the File source or destination associated
     *  with this redirect, or null if there is no such file.
     */
    @stub
    def file(): File = ???

    /** Returns a redirect to read from the specified file. */
    @stub
    def from(file: File): ProcessBuilder.Redirect = ???

    /** Returns a hash code value for this Redirect. */
    @stub
    def hashCode(): Int = ???

    /** Returns a redirect to write to the specified file. */
    @stub
    def to(file: File): ProcessBuilder.Redirect = ???
}
