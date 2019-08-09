package javax.tools

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{CharSequence, Object, String}
import javax.lang.model.element.{Modifier, NestingKind}

// Provides simple implementations for most methods in JavaFileObject.
// This class is designed to be subclassed and used as a basis for
// JavaFileObject implementations.  Subclasses can override the
// implementation and specification of any method of this class as
// long as the general contract of JavaFileObject is obeyed.
class SimpleJavaFileObject extends Object with JavaFileObject {

    @stub
    // The kind of this file object.
    protected def kind: JavaFileObject.Kind = ???

    @stub
    // This implementation does nothing.
    def delete(): Boolean = ???

    @stub
    // This implementation returns null.
    def getAccessLevel(): Modifier = ???

    @stub
    // This implementation always throws UnsupportedOperationException.
    def getCharContent(ignoreEncodingErrors: Boolean): CharSequence = ???

    @stub
    // Gets the kind of this file object.
    def getKind(): JavaFileObject.Kind = ???

    @stub
    // This implementation returns 0L.
    def getLastModified(): Long = ???

    @stub
    // Gets a user-friendly name for this file object.
    def getName(): String = ???

    @stub
    // This implementation returns null.
    def getNestingKind(): NestingKind = ???

    @stub
    // This implementation compares the path of its URI to the given
    // simple name.
    def isNameCompatible(simpleName: String, kind: JavaFileObject.Kind): Boolean = ???

    @stub
    // This implementation always throws UnsupportedOperationException.
    def openInputStream(): InputStream = ???

    @stub
    // This implementation always throws UnsupportedOperationException.
    def openOutputStream(): OutputStream = ???

    @stub
    // Wraps the result of getCharContent(boolean) in a Reader.
    def openReader(ignoreEncodingErrors: Boolean): Reader = ???

    @stub
    // Wraps the result of openOutputStream in a Writer.
    def openWriter(): Writer = ???

    @stub
    // Returns a string representation of the object.
    def toString(): String = ???
}
