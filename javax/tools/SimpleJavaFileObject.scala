package javax.tools

import java.io.{InputStream, OutputStream, Reader, Writer}
import java.lang.{CharSequence, Object, String}
import java.net.URI
import javax.lang.model.element.{Modifier, NestingKind}
import scala.scalanative.annotation.stub

/** Provides simple implementations for most methods in JavaFileObject.
 *  This class is designed to be subclassed and used as a basis for
 *  JavaFileObject implementations.  Subclasses can override the
 *  implementation and specification of any method of this class as
 *  long as the general contract of JavaFileObject is obeyed.
 */
class SimpleJavaFileObject extends Object with JavaFileObject {

    /** Construct a SimpleJavaFileObject of the given kind and with the
     *  given URI.
     */
    @stub
    protected def this(uri: URI, kind: JavaFileObject.Kind) = ???

    /** The kind of this file object. */
    @stub
    protected val kind: JavaFileObject.Kind = ???

    /** A URI for this file object. */
    @stub
    protected val uri: URI = ???

    /** This implementation does nothing. */
    @stub
    def delete(): Boolean = ???

    /** This implementation returns null. */
    @stub
    def getAccessLevel(): Modifier = ???

    /** This implementation always throws UnsupportedOperationException. */
    @stub
    def getCharContent(ignoreEncodingErrors: Boolean): CharSequence = ???

    /** Gets the kind of this file object. */
    @stub
    def getKind(): JavaFileObject.Kind = ???

    /** This implementation returns 0L. */
    @stub
    def getLastModified(): Long = ???

    /** Gets a user-friendly name for this file object. */
    @stub
    def getName(): String = ???

    /** This implementation returns null. */
    @stub
    def getNestingKind(): NestingKind = ???

    /** This implementation compares the path of its URI to the given
     *  simple name.
     */
    @stub
    def isNameCompatible(simpleName: String, kind: JavaFileObject.Kind): Boolean = ???

    /** This implementation always throws UnsupportedOperationException. */
    @stub
    def openInputStream(): InputStream = ???

    /** This implementation always throws UnsupportedOperationException. */
    @stub
    def openOutputStream(): OutputStream = ???

    /** Wraps the result of getCharContent(boolean) in a Reader. */
    @stub
    def openReader(ignoreEncodingErrors: Boolean): Reader = ???

    /** Wraps the result of openOutputStream in a Writer. */
    @stub
    def openWriter(): Writer = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???

    /** Returns a URI identifying this file object. */
    @stub
    def toUri(): URI = ???
}
