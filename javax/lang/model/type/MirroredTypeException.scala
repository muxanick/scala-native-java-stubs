package javax.lang.model.type

import java.lang.{Exception, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an application attempts to access the Class object
 *  corresponding to a TypeMirror.
 */
class MirroredTypeException extends MirroredTypesException {

    /** Constructs a new MirroredTypeException for the specified type. */
    @stub
    def this(type: TypeMirror) = ???

    /** Returns the type mirror corresponding to the type being accessed. */
    @stub
    def getTypeMirror(): TypeMirror = ???
}
