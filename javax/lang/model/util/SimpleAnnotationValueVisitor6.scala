package javax.lang.model.util

import java.lang.{Object, String}
import java.util.List
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.{AnnotationMirror, AnnotationValue, VariableElement}
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** A simple visitor for annotation values with default behavior
 *  appropriate for the RELEASE_6
 *  source version.  Visit methods call defaultAction(java.lang.Object, P) passing their arguments to defaultAction's
 *  corresponding parameters.
 * 
 *   Methods in this class may be overridden subject to their
 *  general contract.  Note that annotating methods in concrete
 *  subclasses with @Override will help
 *  ensure that methods are overridden as intended.
 * 
 *   WARNING: The AnnotationValueVisitor interface
 *  implemented by this class may have methods added to it in the
 *  future to accommodate new, currently unknown, language structures
 *  added to future versions of the Java™ programming language.
 *  Therefore, methods whose names begin with "visit" may be
 *  added to this class in the future; to avoid incompatibilities,
 *  classes which extend this class should not declare any instance
 *  methods with names beginning with "visit".
 * 
 *  When such a new visit method is added, the default
 *  implementation in this class will be to call the visitUnknown method.  A new simple annotation
 *  value visitor class will also be introduced to correspond to the
 *  new language level; this visitor will have different default
 *  behavior for the visit method in question.  When the new visitor is
 *  introduced, all or portions of this visitor may be deprecated.
 * 
 *  Note that adding a default implementation of a new visit method
 *  in a visitor class will occur instead of adding a default
 *  method directly in the visitor interface since a Java SE 8
 *  language feature cannot be used to this version of the API since
 *  this version is required to be runnable on Java SE 7
 *  implementations.  Future versions of the API that are only required
 *  to run on Java SE 8 and later may take advantage of default methods
 *  in this situation.
 */
@SupportedSourceVersion(value=RELEASE_6)
class SimpleAnnotationValueVisitor6[R, P] extends AbstractAnnotationValueVisitor6[R, P] {

    /** Constructor for concrete subclasses; uses null for the
     *  default value.
     */
    @stub
    protected def this() = ???

    /** Constructor for concrete subclasses; uses the argument for the
     *  default value.
     */
    @stub
    protected def this(defaultValue: R) = ???

    /** Default value to be returned; defaultAction returns this value unless the method is
     *  overridden.
     */
    @stub
    protected val DEFAULT_VALUE: R = ???

    /** The default action for visit methods. */
    @stub
    protected def defaultAction(o: Any, p: P): R = ???

    /** Visits an annotation value in an annotation. */
    @stub
    def visitAnnotation(a: AnnotationMirror, p: P): R = ???

    /** Visits an array value in an annotation. */
    @stub
    def visitArray(vals: List[_ <: AnnotationValue], p: P): R = ???

    /** Visits a boolean value in an annotation. */
    @stub
    def visitBoolean(b: Boolean, p: P): R = ???

    /** Visits a byte value in an annotation. */
    @stub
    def visitByte(b: Byte, p: P): R = ???

    /** Visits a char value in an annotation. */
    @stub
    def visitChar(c: Char, p: P): R = ???

    /** Visits a double value in an annotation. */
    @stub
    def visitDouble(d: Double, p: P): R = ???

    /** Visits an enum value in an annotation. */
    @stub
    def visitEnumConstant(c: VariableElement, p: P): R = ???

    /** Visits a float value in an annotation. */
    @stub
    def visitFloat(f: Float, p: P): R = ???

    /** Visits an int value in an annotation. */
    @stub
    def visitInt(i: Int, p: P): R = ???

    /** Visits a long value in an annotation. */
    @stub
    def visitLong(i: Long, p: P): R = ???

    /** Visits a short value in an annotation. */
    @stub
    def visitShort(s: Short, p: P): R = ???

    /** Visits a string value in an annotation. */
    @stub
    def visitString(s: String, p: P): R = ???

    /** Visits a type value in an annotation. */
    @stub
    def visitType(t: TypeMirror, p: P): R = ???
}
