package javax.lang.model.util

import java.lang.{CharSequence, Object, String}
import java.util.{List, Map}
import javax.lang.model.element.{AnnotationMirror, AnnotationValue, Element, ExecutableElement, Name, PackageElement, TypeElement}

// Utility methods for operating on program elements.
//
// Compatibility Note: Methods may be added to this interface
// in future releases of the platform.
trait Elements {

    @stub
    // Returns all annotations present on an element, whether
    // directly present or present via inheritance.
    def getAllAnnotationMirrors(e: Element): List[_ <: AnnotationMirror] = ???

    @stub
    // Returns all members of a type element, whether inherited or
    // declared directly.
    def getAllMembers(type: TypeElement): List[_ <: Element] = ???

    @stub
    // Returns the binary name of a type element.
    def getBinaryName(type: TypeElement): Name = ???

    @stub
    // Returns the text of a constant expression representing a
    // primitive value or a string.
    def getConstantExpression(value: Object): String = ???

    @stub
    // Returns the text of the documentation ("Javadoc")
    // comment of an element.
    def getDocComment(e: Element): String = ???

    @stub
    // Returns the values of an annotation's elements, including defaults.
    def getElementValuesWithDefaults(a: AnnotationMirror): Map[_ <: ExecutableElement, _ <: AnnotationValue] = ???

    @stub
    // Return a name with the same sequence of characters as the
    // argument.
    def getName(cs: CharSequence): Name = ???

    @stub
    // Returns a package given its fully qualified name.
    def getPackageElement(name: CharSequence): PackageElement = ???

    @stub
    // Returns the package of an element.
    def getPackageOf(type: Element): PackageElement = ???

    @stub
    // Returns a type element given its canonical name.
    def getTypeElement(name: CharSequence): TypeElement = ???

    @stub
    // Tests whether one type, method, or field hides another.
    def hides(hider: Element, hidden: Element): Boolean = ???

    @stub
    // Returns true if the element is deprecated, false otherwise.
    def isDeprecated(e: Element): Boolean = ???

    @stub
    // Returns true if the type element is a functional interface, false otherwise.
    def isFunctionalInterface(type: TypeElement): Boolean = ???

    @stub
    // Tests whether one method, as a member of a given type,
    // overrides another method.
    def overrides(overrider: ExecutableElement, overridden: ExecutableElement, type: TypeElement): Boolean = ???
}
