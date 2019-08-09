package javax.tools

import java.lang.{Object, String}
import javax.lang.model.element.{Modifier, NestingKind}
import scala.scalanative.annotation.stub

/** Forwards calls to a given file object.  Subclasses of this class
 *  might override some of these methods and might also provide
 *  additional fields and methods.
 */
class ForwardingJavaFileObject[F <: JavaFileObject] extends ForwardingFileObject[F] with JavaFileObject {

    /** Creates a new instance of ForwardingJavaFileObject. */
    @stub
    protected def this(fileObject: F) = ???

    /** Provides a hint about the access level of the class represented
     *  by this file object.
     */
    @stub
    def getAccessLevel(): Modifier = ???

    /** Gets the kind of this file object. */
    @stub
    def getKind(): JavaFileObject.Kind = ???

    /** Provides a hint about the nesting level of the class
     *  represented by this file object.
     */
    @stub
    def getNestingKind(): NestingKind = ???

    /** Checks if this file object is compatible with the specified
     *  simple name and kind.
     */
    @stub
    def isNameCompatible(simpleName: String, kind: JavaFileObject.Kind): Boolean = ???
}
