package javax.lang.model.element

import scala.scalanative.annotation.stub

/** A mixin interface for an element that has a qualified name. */
trait QualifiedNameable extends Element {

    /** Returns the fully qualified name of an element. */
    @stub
    def getQualifiedName(): Name = ???
}
