package javax.tools

import java.lang.Object
import javax.lang.model.element.{Modifier, NestingKind}

/** Forwards calls to a given file object.  Subclasses of this class
 *  might override some of these methods and might also provide
 *  additional fields and methods.
 */
class ForwardingJavaFileObject[F <: JavaFileObject] extends ForwardingFileObject[F] with JavaFileObject {

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
}
