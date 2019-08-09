package java.lang.reflect

import scala.scalanative.annotation.stub

/** AnnotatedTypeVariable represents the potentially annotated use of a
 *  type variable, whose declaration may have bounds which themselves represent
 *  annotated uses of types.
 */
trait AnnotatedTypeVariable extends AnnotatedType {

    /** Returns the potentially annotated bounds of this type variable. */
    @stub
    def getAnnotatedBounds(): Array[AnnotatedType] = ???
}
