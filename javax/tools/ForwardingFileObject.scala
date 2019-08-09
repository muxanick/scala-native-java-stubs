package javax.tools

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{CharSequence, Object, String}

// Forwards calls to a given file object.  Subclasses of this class
// might override some of these methods and might also provide
// additional fields and methods.
class ForwardingFileObject[F <: FileObject] extends Object with FileObject {

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
