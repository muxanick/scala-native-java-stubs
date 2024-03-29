package javax.lang.model.element

import java.util.List
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** Represents a formal type parameter of a generic class, interface, method,
 *  or constructor element.
 *  A type parameter declares a TypeVariable.
 */
trait TypeParameterElement extends Element {

    /** Returns the bounds of this type parameter. */
    @stub
    def getBounds(): List[_ <: TypeMirror] = ???

    /** Returns the generic element of this type parameter. */
    @stub
    def getEnclosingElement(): Element = ???

    /** Returns the generic class, interface, method, or constructor that is
     *  parameterized by this type parameter.
     */
    @stub
    def getGenericElement(): Element = ???
}
