package javax.lang.model.element

import java.lang.String
import java.util.List
import javax.lang.model.type.TypeMirror
import scala.scalanative.annotation.stub

/** A visitor of the values of annotation type elements, using a
 *  variant of the visitor design pattern.  Unlike a standard visitor
 *  which dispatches based on the concrete type of a member of a type
 *  hierarchy, this visitor dispatches based on the type of data
 *  stored; there are no distinct subclasses for storing, for example,
 *  boolean values versus int values.  Classes
 *  implementing this interface are used to operate on a value when the
 *  type of that value is unknown at compile time.  When a visitor is
 *  passed to a value's accept method,
 *  the visitXYZ method applicable to that value is
 *  invoked.
 * 
 *   Classes implementing this interface may or may not throw a
 *  NullPointerException if the additional parameter p
 *  is null; see documentation of the implementing class for
 *  details.
 * 
 *   WARNING: It is possible that methods will be added to
 *  this interface to accommodate new, currently unknown, language
 *  structures added to future versions of the Java™ programming
 *  language.  Therefore, visitor classes directly implementing this
 *  interface may be source incompatible with future versions of the
 *  platform.  To avoid this source incompatibility, visitor
 *  implementations are encouraged to instead extend the appropriate
 *  abstract visitor class that implements this interface.  However, an
 *  API should generally use this visitor interface as the type for
 *  parameters, return type, etc. rather than one of the abstract
 *  classes.
 * 
 *  Note that methods to accommodate new language constructs could
 *  be added in a source compatible way if they were added as
 *  default methods.  However, default methods are only
 *  available on Java SE 8 and higher releases and the javax.lang.model.* packages bundled in Java SE 8 are required to
 *  also be runnable on Java SE 7.  Therefore, default methods
 *  cannot be used when extending javax.lang.model.*
 *  to cover Java SE 8 language features.  However, default methods may
 *  be used in subsequent revisions of the javax.lang.model.*
 *  packages that are only required to run on Java SE 8 and higher
 *  platform versions.
 */
trait AnnotationValueVisitor[R, P] {

    /** A convenience method equivalent to v.visit(av, null). */
    @stub
    def visit(av: AnnotationValue): R = ???

    /** Visits an annotation value. */
    @stub
    def visit(av: AnnotationValue, p: P): R = ???

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

    /** Visits an unknown kind of annotation value. */
    @stub
    def visitUnknown(av: AnnotationValue, p: P): R = ???
}
