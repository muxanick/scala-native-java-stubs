package javax.lang.model.util

import java.lang.{CharSequence, Object, String}
import java.util.{List, Map}
import javax.lang.model.element.{AnnotationMirror, AnnotationValue, Element, ExecutableElement, Name, PackageElement, TypeElement}

/** Utility methods for operating on program elements.
 * 
 *  Compatibility Note: Methods may be added to this interface
 *  in future releases of the platform.
 */
trait Elements {

    /** Returns all annotations present on an element, whether
     *  directly present or present via inheritance.
     */
    @stub
    def getAllAnnotationMirrors(e: Element): List[_ <: AnnotationMirror] = ???

    /** Returns all members of a type element, whether inherited or
     *  declared directly.
     */
    @stub
    def getAllMembers(type: TypeElement): List[_ <: Element] = ???

    /** Returns the binary name of a type element. */
    @stub
    def getBinaryName(type: TypeElement): Name = ???

    /** Returns the text of a constant expression representing a
     *  primitive value or a string.
     */
    @stub
    def getConstantExpression(value: Object): String = ???

    /** Returns the text of the documentation ("Javadoc")
     *  comment of an element.
     */
    @stub
    def getDocComment(e: Element): String = ???

    /** Returns the values of an annotation's elements, including defaults. */
    @stub
    def getElementValuesWithDefaults(a: AnnotationMirror): Map[_ <: ExecutableElement, _ <: AnnotationValue] = ???

    /** Return a name with the same sequence of characters as the
     *  argument.
     */
    @stub
    def getName(cs: CharSequence): Name = ???

    /** Returns a package given its fully qualified name. */
    @stub
    def getPackageElement(name: CharSequence): PackageElement = ???

    /** Returns the package of an element. */
    @stub
    def getPackageOf(type: Element): PackageElement = ???

    /** Returns a type element given its canonical name. */
    @stub
    def getTypeElement(name: CharSequence): TypeElement = ???

    /** Tests whether one type, method, or field hides another. */
    @stub
    def hides(hider: Element, hidden: Element): Boolean = ???

    /** Returns true if the element is deprecated, false otherwise. */
    @stub
    def isDeprecated(e: Element): Boolean = ???

    /** Returns true if the type element is a functional interface, false otherwise. */
    @stub
    def isFunctionalInterface(type: TypeElement): Boolean = ???

    /** Tests whether one method, as a member of a given type,
     *  overrides another method.
     */
    @stub
    def overrides(overrider: ExecutableElement, overridden: ExecutableElement, type: TypeElement): Boolean = ???
}
