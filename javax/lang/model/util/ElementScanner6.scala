package javax.lang.model.util

import java.lang.{Iterable, Object}
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.{Element, ExecutableElement, PackageElement, TypeElement, TypeParameterElement}

// A scanning visitor of program elements with default behavior
// appropriate for the RELEASE_6
// source version.  The visitXYZ methods in this
// class scan their component elements by calling scan on
// their enclosed elements,
// parameters, etc., as
// indicated in the individual method specifications.  A subclass can
// control the order elements are visited by overriding the
// visitXYZ methods.  Note that clients of a scanner
// may get the desired behavior be invoking v.scan(e, p) rather
// than v.visit(e, p) on the root objects of interest.
//
// When a subclass overrides a visitXYZ method, the
// new method can cause the enclosed elements to be scanned in the
// default way by calling super.visitXYZ.  In this
// fashion, the concrete visitor can control the ordering of traversal
// over the component elements with respect to the additional
// processing; for example, consistently calling
// super.visitXYZ at the start of the overridden
// methods will yield a preorder traversal, etc.  If the component
// elements should be traversed in some other order, instead of
// calling super.visitXYZ, an overriding visit method
// should call scan with the elements in the desired order.
//
//  Methods in this class may be overridden subject to their
// general contract.  Note that annotating methods in concrete
// subclasses with @Override will help
// ensure that methods are overridden as intended.
//
//  WARNING: The ElementVisitor interface
// implemented by this class may have methods added to it in the
// future to accommodate new, currently unknown, language structures
// added to future versions of the Java™ programming language.
// Therefore, methods whose names begin with "visit" may be
// added to this class in the future; to avoid incompatibilities,
// classes which extend this class should not declare any instance
// methods with names beginning with "visit".
//
// When such a new visit method is added, the default
// implementation in this class will be to call the visitUnknown method.  A new element scanner visitor
// class will also be introduced to correspond to the new language
// level; this visitor will have different default behavior for the
// visit method in question.  When the new visitor is introduced, all
// or portions of this visitor may be deprecated.
@SupportedSourceVersion ( value = RELEASE_6 ) class ElementScanner6[R, P] extends AbstractElementVisitor6[R, P] {

    @stub
    // Constructor for concrete subclasses; uses null for the
    // default value.
    protected def this() = ???

    @stub
    // Convenience method equivalent to v.scan(e, null).
    def scan(e: Element): R = ???

    @stub
    // Processes an element by calling e.accept(this, p);
    // this method may be overridden by subclasses.
    def scan(e: Element, p: P): R = ???

    @stub
    // Iterates over the given elements and calls scan(Element, P) on each one.
    def scan(iterable: Iterable[_ <: Element], p: P): R = ???

    @stub
    // Visits an executable element.
    def visitExecutable(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits a package element.
    def visitPackage(e: PackageElement, p: P): R = ???

    @stub
    // Visits a type element.
    def visitType(e: TypeElement, p: P): R = ???

    @stub
    // Visits a type parameter element.
    def visitTypeParameter(e: TypeParameterElement, p: P): R = ???
}