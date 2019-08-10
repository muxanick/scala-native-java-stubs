package javax.lang.model.element

import java.lang.{Class, Object}
import java.lang.annotation.Annotation
import java.util.{List, Set}
import javax.lang.model.AnnotatedConstruct
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** Represents a program element such as a package, class, or method.
 *  Each element represents a static, language-level construct
 *  (and not, for example, a runtime construct of the virtual machine).
 * 
 *   Elements should be compared using the equals(Object)
 *  method.  There is no guarantee that any particular element will
 *  always be represented by the same object.
 * 
 *   To implement operations based on the class of an Element object, either use a visitor or
 *  use the result of the getKind() method.  Using instanceof is not necessarily a reliable idiom for
 *  determining the effective class of an object in this modeling
 *  hierarchy since an implementation may choose to have a single object
 *  implement multiple Element subinterfaces.
 */
trait Element extends AnnotatedConstruct {

    /** Applies a visitor to this element. */
    @stub
    def accept[R, P](v: ElementVisitor[R, P], p: P): R = ???

    /** Returns the type defined by this element. */
    @stub
    def asType(): TypeMirror = ???

    /** Returns true if the argument represents the same
     *  element as this, or false otherwise.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns this construct's annotation of the specified type if
     *  such an annotation is present, else null.
     */
    @stub
    def getAnnotation[A <: Annotation](annotationType: Class[A]): A = ???

    /** Returns the annotations that are directly present on
     *  this construct.
     */
    @stub
    def getAnnotationMirrors(): List[_ <: AnnotationMirror] = ???

    /** Returns the elements that are, loosely speaking, directly
     *  enclosed by this element.
     */
    @stub
    def getEnclosedElements(): List[_ <: Element] = ???

    /** Returns the innermost element
     *  within which this element is, loosely speaking, enclosed.
     */
    @stub
    def getEnclosingElement(): Element = ???

    /** Returns the kind of this element. */
    @stub
    def getKind(): ElementKind = ???

    /** Returns the modifiers of this element, excluding annotations. */
    @stub
    def getModifiers(): Set[Modifier] = ???

    /** Returns the simple (unqualified) name of this element. */
    @stub
    def getSimpleName(): Name = ???

    /** Obeys the general contract of Object.hashCode. */
    @stub
    def hashCode(): Int = ???
}
