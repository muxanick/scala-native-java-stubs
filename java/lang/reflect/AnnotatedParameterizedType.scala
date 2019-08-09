package java.lang.reflect

import scala.scalanative.annotation.stub

/** AnnotatedParameterizedType represents the potentially annotated use
 *  of a parameterized type, whose type arguments may themselves represent
 *  annotated uses of types.
 */
trait AnnotatedParameterizedType extends AnnotatedType {

    /** Returns the potentially annotated actual type arguments of this parameterized type. */
    @stub
    def getAnnotatedActualTypeArguments(): Array[AnnotatedType] = ???
}
