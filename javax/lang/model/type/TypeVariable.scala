package javax.lang.model.type

import javax.lang.model.element.Element
import scala.scalanative.annotation.stub

/** Represents a type variable.
 *  A type variable may be explicitly declared by a
 *  type parameter of a
 *  type, method, or constructor.
 *  A type variable may also be declared implicitly, as by
 *  the capture conversion of a wildcard type argument
 *  (see chapter 5 of
 *  The Java™ Language Specification).
 */
trait TypeVariable extends ReferenceType {

    /** Returns the element corresponding to this type variable. */
    @stub
    def asElement(): Element = ???

    /** Returns the lower bound of this type variable. */
    @stub
    def getLowerBound(): TypeMirror = ???

    /** Returns the upper bound of this type variable. */
    @stub
    def getUpperBound(): TypeMirror = ???
}
