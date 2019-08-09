package javax.tools

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{CharSequence, String}

// File abstraction for tools.  In this context, file means
// an abstraction of regular files and other sources of data.  For
// example, a file object can be used to represent regular files,
// memory cache, or data in databases.
//
// All methods in this interface might throw a SecurityException if
// a security exception occurs.
//
// Unless explicitly allowed, all methods in this interface might
// throw a NullPointerException if given a null argument.
trait FileObject {

    @stub
    // Deletes this file object.
    def delete(): Boolean = ???

    @stub
    // Gets the character content of this file object, if available.
    def getCharContent(ignoreEncodingErrors: Boolean): CharSequence = ???

    @stub
    // Gets the time this file object was last modified.
    def getLastModified(): Long = ???

    @stub
    // Gets a user-friendly name for this file object.
    def getName(): String = ???

    @stub
    // Gets an InputStream for this file object.
    def openInputStream(): InputStream = ???

    @stub
    // Gets an OutputStream for this file object.
    def openOutputStream(): OutputStream = ???

    @stub
    // Gets a reader for this object.
    def openReader(ignoreEncodingErrors: Boolean): Reader = ???

    @stub
    // Gets a Writer for this file object.
    def openWriter(): Writer = ???
}
