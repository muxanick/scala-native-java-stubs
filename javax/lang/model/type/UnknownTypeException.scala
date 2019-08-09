package javax.lang.model.type

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.lang.model.UnknownEntityException
import scala.scalanative.annotation.stub

/** Indicates that an unknown kind of type was encountered.  This can
 *  occur if the language evolves and new kinds of types are added to
 *  the TypeMirror hierarchy.  May be thrown by a type visitor to indicate that the visitor was created
 *  for a prior version of the language.
 */
class UnknownTypeException extends UnknownEntityException {

    /** Creates a new UnknownTypeException.The p
     *  parameter may be used to pass in an additional argument with
     *  information about the context in which the unknown type was
     *  encountered; for example, the visit methods of TypeVisitor may pass in their additional parameter.
     */
    @stub
    def this(t: TypeMirror, p: Object) = ???

    /** Returns the additional argument. */
    @stub
    def getArgument(): Object = ???

    /** Returns the unknown type. */
    @stub
    def getUnknownType(): TypeMirror = ???
}
