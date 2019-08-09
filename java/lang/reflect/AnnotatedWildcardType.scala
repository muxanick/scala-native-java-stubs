package java.lang.reflect

import scala.scalanative.annotation.stub

/** AnnotatedWildcardType represents the potentially annotated use of a
 *  wildcard type argument, whose upper or lower bounds may themselves represent
 *  annotated uses of types.
 */
trait AnnotatedWildcardType extends AnnotatedType {

    /** Returns the potentially annotated lower bounds of this wildcard type. */
    @stub
    def getAnnotatedLowerBounds(): Array[AnnotatedType] = ???

    /** Returns the potentially annotated upper bounds of this wildcard type. */
    @stub
    def getAnnotatedUpperBounds(): Array[AnnotatedType] = ???
}
