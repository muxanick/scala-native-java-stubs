package javax.lang.model.element

import java.util.List
import scala.scalanative.annotation.stub

/** A mixin interface for an element that has type parameters. */
trait Parameterizable extends Element {

    /** Returns the formal type parameters of the type element in
     *  declaration order.
     */
    @stub
    def getTypeParameters(): List[_ <: TypeParameterElement] = ???
}
