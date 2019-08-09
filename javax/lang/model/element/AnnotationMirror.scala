package javax.lang.model.element

import java.util.Map
import javax.lang.model.type.DeclaredType
import scala.scalanative.annotation.stub

/** Represents an annotation.  An annotation associates a value with
 *  each element of an annotation type.
 * 
 *   Annotations should be compared using the equals
 *  method.  There is no guarantee that any particular annotation will
 *  always be represented by the same object.
 */
trait AnnotationMirror {

    /** Returns the type of this annotation. */
    @stub
    def getAnnotationType(): DeclaredType = ???

    /** Returns the values of this annotation's elements. */
    @stub
    def getElementValues(): Map[_ <: ExecutableElement, _ <: AnnotationValue] = ???
}
