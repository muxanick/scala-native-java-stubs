package javax.lang.model.element

import java.util.List
import scala.scalanative.annotation.stub

/** Represents a package program element.  Provides access to information
 *  about the package and its members.
 */
trait PackageElement extends Element with QualifiedNameable {

    /** Returns the top-level
     *  classes and interfaces within this package.
     */
    @stub
    def getEnclosedElements(): List[_ <: Element] = ???

    /** Returns null since a package is not enclosed by another
     *  element.
     */
    @stub
    def getEnclosingElement(): Element = ???

    /** Returns the fully qualified name of this package. */
    @stub
    def getQualifiedName(): Name = ???

    /** Returns the simple name of this package. */
    @stub
    def getSimpleName(): Name = ???

    /** Returns true is this is an unnamed package and false otherwise. */
    @stub
    def isUnnamed(): Boolean = ???
}
