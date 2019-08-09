package javax.lang.model.element

import java.lang.{Class, Object}
import java.lang.annotation.Annotation
import java.util.{List, Set}
import javax.lang.model.AnnotatedConstruct
import javax.lang.model.type.TypeMirror

// Represents a program element such as a package, class, or method.
// Each element represents a static, language-level construct
// (and not, for example, a runtime construct of the virtual machine).
//
//  Elements should be compared using the equals(Object)
// method.  There is no guarantee that any particular element will
// always be represented by the same object.
//
//  To implement operations based on the class of an Element object, either use a visitor or
// use the result of the getKind() method.  Using instanceof is not necessarily a reliable idiom for
// determining the effective class of an object in this modeling
// hierarchy since an implementation may choose to have a single object
// implement multiple Element subinterfaces.
trait Element extends AnnotatedConstruct {

    @stub
    // Applies a visitor to this element.
    def R: [R, P] = ???

    @stub
    // Returns the type defined by this element.
    def asType(): TypeMirror = ???

    @stub
    // Returns true if the argument represents the same
    // element as this, or false otherwise.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns this construct's annotation of the specified type if
    // such an annotation is present, else null.
    def A: [A <: Annotation] = ???

    @stub
    // Returns the annotations that are directly present on
    // this construct.
    def getAnnotationMirrors(): List[_ <: AnnotationMirror] = ???

    @stub
    // Returns the elements that are, loosely speaking, directly
    // enclosed by this element.
    def getEnclosedElements(): List[_ <: Element] = ???

    @stub
    // Returns the innermost element
    // within which this element is, loosely speaking, enclosed.
    def getEnclosingElement(): Element = ???

    @stub
    // Returns the kind of this element.
    def getKind(): ElementKind = ???

    @stub
    // Returns the modifiers of this element, excluding annotations.
    def getModifiers(): Set[Modifier] = ???

    @stub
    // Returns the simple (unqualified) name of this element.
    def getSimpleName(): Name = ???
}
