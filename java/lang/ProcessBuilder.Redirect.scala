package java.lang

import java.io.File

// Represents a source of subprocess input or a destination of
// subprocess output.
//
// Each Redirect instance is one of the following:
//
// 
// the special value Redirect.PIPE
// the special value Redirect.INHERIT
// a redirection to read from a file, created by an invocation of
//     Redirect.from(File)
// a redirection to write to a file,  created by an invocation of
//     Redirect.to(File)
// a redirection to append to a file, created by an invocation of
//     Redirect.appendTo(File)
// 
//
// Each of the above categories has an associated unique
// Type.
object abstract ProcessBuilder.Redirect extends Object {

    @stub
    // Indicates that subprocess I/O source or destination will be the
    // same as those of the current process.
    def INHERIT: ProcessBuilder.Redirect = ???

    @stub
    // Returns a redirect to append to the specified file.
    def appendTo(file: File): ProcessBuilder.Redirect = ???

    @stub
    // Compares the specified object with this Redirect for
    // equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the File source or destination associated
    // with this redirect, or null if there is no such file.
    def file(): File = ???

    @stub
    // Returns a redirect to read from the specified file.
    def from(file: File): ProcessBuilder.Redirect = ???

    @stub
    // Returns a hash code value for this Redirect.
    def hashCode(): Int = ???

    @stub
    // Returns a redirect to write to the specified file.
    def to(file: File): ProcessBuilder.Redirect = ???
}
