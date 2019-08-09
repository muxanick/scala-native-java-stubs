package javax.tools

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{CharSequence, Object, String}

/** Forwards calls to a given file object.  Subclasses of this class
 *  might override some of these methods and might also provide
 *  additional fields and methods.
 */
class ForwardingFileObject[F <: FileObject] extends Object with FileObject {

    /** Deletes this file object. */
    @stub
    def delete(): Boolean = ???

    /** Gets the character content of this file object, if available. */
    @stub
    def getCharContent(ignoreEncodingErrors: Boolean): CharSequence = ???

    /** Gets the time this file object was last modified. */
    @stub
    def getLastModified(): Long = ???

    /** Gets a user-friendly name for this file object. */
    @stub
    def getName(): String = ???

    /** Gets an InputStream for this file object. */
    @stub
    def openInputStream(): InputStream = ???

    /** Gets an OutputStream for this file object. */
    @stub
    def openOutputStream(): OutputStream = ???

    /** Gets a reader for this object. */
    @stub
    def openReader(ignoreEncodingErrors: Boolean): Reader = ???

    /** Gets a Writer for this file object. */
    @stub
    def openWriter(): Writer = ???
}
