package javax.lang.model.util

import java.lang.{Object, String}
import java.util.List
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.{AnnotationMirror, AnnotationValue, VariableElement}

// A simple visitor for annotation values with default behavior
// appropriate for the RELEASE_6
// source version.  Visit methods call defaultAction(java.lang.Object, P) passing their arguments to defaultAction's
// corresponding parameters.
//
//  Methods in this class may be overridden subject to their
// general contract.  Note that annotating methods in concrete
// subclasses with @Override will help
// ensure that methods are overridden as intended.
//
//  WARNING: The AnnotationValueVisitor interface
// implemented by this class may have methods added to it in the
// future to accommodate new, currently unknown, language structures
// added to future versions of the Java™ programming language.
// Therefore, methods whose names begin with "visit" may be
// added to this class in the future; to avoid incompatibilities,
// classes which extend this class should not declare any instance
// methods with names beginning with "visit".
//
// When such a new visit method is added, the default
// implementation in this class will be to call the visitUnknown method.  A new simple annotation
// value visitor class will also be introduced to correspond to the
// new language level; this visitor will have different default
// behavior for the visit method in question.  When the new visitor is
// introduced, all or portions of this visitor may be deprecated.
//
// Note that adding a default implementation of a new visit method
// in a visitor class will occur instead of adding a default
// method directly in the visitor interface since a Java SE 8
// language feature cannot be used to this version of the API since
// this version is required to be runnable on Java SE 7
// implementations.  Future versions of the API that are only required
// to run on Java SE 8 and later may take advantage of default methods
// in this situation.
@SupportedSourceVersion ( value = RELEASE_6 ) class SimpleAnnotationValueVisitor6[R, P] extends AbstractAnnotationValueVisitor6[R, P] {

    @stub
    // Constructor for concrete subclasses; uses null for the
    // default value.
    protected def this() = ???

    @stub
    // The default action for visit methods.
    protected def defaultAction(o: Object, p: P): R = ???

    @stub
    // Visits an annotation value in an annotation.
    def visitAnnotation(a: AnnotationMirror, p: P): R = ???

    @stub
    // Visits an array value in an annotation.
    def visitArray(vals: List[_ <: AnnotationValue], p: P): R = ???

    @stub
    // Visits a boolean value in an annotation.
    def visitBoolean(b: Boolean, p: P): R = ???

    @stub
    // Visits a byte value in an annotation.
    def visitByte(b: Byte, p: P): R = ???

    @stub
    // Visits a char value in an annotation.
    def visitChar(c: Char, p: P): R = ???

    @stub
    // Visits a double value in an annotation.
    def visitDouble(d: double, p: P): R = ???

    @stub
    // Visits an enum value in an annotation.
    def visitEnumConstant(c: VariableElement, p: P): R = ???

    @stub
    // Visits a float value in an annotation.
    def visitFloat(f: float, p: P): R = ???

    @stub
    // Visits an int value in an annotation.
    def visitInt(i: Int, p: P): R = ???

    @stub
    // Visits a long value in an annotation.
    def visitLong(i: Long, p: P): R = ???

    @stub
    // Visits a short value in an annotation.
    def visitShort(s: Short, p: P): R = ???

    @stub
    // Visits a string value in an annotation.
    def visitString(s: String, p: P): R = ???
}
