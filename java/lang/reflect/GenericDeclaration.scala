package java.lang.reflect

import scala.scalanative.annotation.stub

/** A common interface for all entities that declare type variables. */
trait GenericDeclaration extends AnnotatedElement {

    /** Returns an array of TypeVariable objects that
     *  represent the type variables declared by the generic
     *  declaration represented by this GenericDeclaration
     *  object, in declaration order.
     */
    @stub
    def getTypeParameters(): Array[TypeVariable[_]] = ???
}
