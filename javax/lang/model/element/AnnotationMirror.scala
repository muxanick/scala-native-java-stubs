package javax.lang.model.element

import javax.lang.model.type.DeclaredType

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
}
