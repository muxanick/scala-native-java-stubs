package java.lang.reflect

import scala.scalanative.annotation.stub

/** AnnotatedType represents the potentially annotated use of a type in
 *  the program currently running in this VM. The use may be of any type in the
 *  Java programming language, including an array type, a parameterized type, a
 *  type variable, or a wildcard type.
 */
trait AnnotatedType extends AnnotatedElement {

    /** Returns the underlying type that this annotated type represents. */
    @stub
    def getType(): Type = ???
}
