package javax.lang.model.type

import java.lang.{Exception, Object, RuntimeException, Throwable}
import java.util.List
import scala.scalanative.annotation.stub

/** Thrown when an application attempts to access a sequence of Class objects each corresponding to a TypeMirror. */
class MirroredTypesException extends RuntimeException {

    /** Constructs a new MirroredTypesException for the specified types. */
    @stub
    def this(types: List[_ <: TypeMirror]) = ???

    /** Returns the type mirrors corresponding to the types being accessed. */
    @stub
    def getTypeMirrors(): List[_ <: TypeMirror] = ???
}
