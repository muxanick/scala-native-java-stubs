package javax.lang.model.element

import java.util.List

// Represents a package program element.  Provides access to information
// about the package and its members.
trait PackageElement extends Element , QualifiedNameable {

    @stub
    // Returns the top-level
    // classes and interfaces within this package.
    def getEnclosedElements(): List[_ <: Element] = ???

    @stub
    // Returns null since a package is not enclosed by another
    // element.
    def getEnclosingElement(): Element = ???

    @stub
    // Returns the fully qualified name of this package.
    def getQualifiedName(): Name = ???

    @stub
    // Returns the simple name of this package.
    def getSimpleName(): Name = ???
}
