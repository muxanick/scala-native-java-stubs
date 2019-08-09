package java.lang.reflect

import scala.scalanative.annotation.stub

/** AnnotatedArrayType represents the potentially annotated use of an
 *  array type, whose component type may itself represent the annotated use of a
 *  type.
 */
trait AnnotatedArrayType extends AnnotatedType {

    /** Returns the potentially annotated generic component type of this array type. */
    @stub
    def getAnnotatedGenericComponentType(): AnnotatedType = ???
}
