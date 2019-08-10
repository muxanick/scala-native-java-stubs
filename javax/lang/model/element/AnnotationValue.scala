package javax.lang.model.element

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Represents a value of an annotation type element.
 *  A value is of one of the following types:
 *   a wrapper class (such as Integer) for a primitive type
 *       String
 *       TypeMirror
 *       VariableElement (representing an enum constant)
 *       AnnotationMirror
 *       List<? extends AnnotationValue>
 *               (representing the elements, in declared order, if the value is an array)
 *  
 */
trait AnnotationValue {

    /** Applies a visitor to this value. */
    @stub
    def accept[R, P](v: AnnotationValueVisitor[R, P], p: P): R = ???

    /** Returns the value. */
    @stub
    def getValue(): Any = ???

    /** Returns a string representation of this value. */
    @stub
    def toString(): String = ???
}
