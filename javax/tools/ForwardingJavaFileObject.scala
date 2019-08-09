package javax.tools

import java.lang.Object
import javax.lang.model.element.{Modifier, NestingKind}

// Forwards calls to a given file object.  Subclasses of this class
// might override some of these methods and might also provide
// additional fields and methods.
class ForwardingJavaFileObject[F <: JavaFileObject] extends ForwardingFileObject[F] with JavaFileObject {

    @stub
    // Provides a hint about the access level of the class represented
    // by this file object.
    def getAccessLevel(): Modifier = ???

    @stub
    // Gets the kind of this file object.
    def getKind(): JavaFileObject.Kind = ???

    @stub
    // Provides a hint about the nesting level of the class
    // represented by this file object.
    def getNestingKind(): NestingKind = ???
}
