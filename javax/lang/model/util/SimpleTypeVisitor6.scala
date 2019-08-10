package javax.lang.model.util

import java.lang.Object
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.type.{ArrayType, DeclaredType, ErrorType, ExecutableType, NoType, NullType, PrimitiveType, TypeMirror, TypeVariable, WildcardType}
import scala.scalanative.annotation.stub

/** A simple visitor of types with default behavior appropriate for the
 *  RELEASE_6 source version.
 * 
 *  Visit methods corresponding to RELEASE_6 language
 *  constructs call defaultAction, passing their
 *  arguments to defaultAction's corresponding parameters.
 * 
 *  For constructs introduced in RELEASE_7 and later, visitUnknown is called instead.
 * 
 *   Methods in this class may be overridden subject to their
 *  general contract.  Note that annotating methods in concrete
 *  subclasses with @Override will help
 *  ensure that methods are overridden as intended.
 * 
 *   WARNING: The TypeVisitor interface implemented
 *  by this class may have methods added to it in the future to
 *  accommodate new, currently unknown, language structures added to
 *  future versions of the Java™ programming language.
 *  Therefore, methods whose names begin with "visit" may be
 *  added to this class in the future; to avoid incompatibilities,
 *  classes which extend this class should not declare any instance
 *  methods with names beginning with "visit".
 * 
 *  When such a new visit method is added, the default
 *  implementation in this class will be to call the visitUnknown method.  A new simple type visitor
 *  class will also be introduced to correspond to the new language
 *  level; this visitor will have different default behavior for the
 *  visit method in question.  When the new visitor is introduced, all
 *  or portions of this visitor may be deprecated.
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
class SimpleTypeVisitor6[R, P] extends AbstractTypeVisitor6[R, P] {

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
    protected def defaultAction(e: TypeMirror, p: P): R = ???

    /** Visits an array type. */
    @stub
    def visitArray(t: ArrayType, p: P): R = ???

    /** Visits a declared type. */
    @stub
    def visitDeclared(t: DeclaredType, p: P): R = ???

    /** Visits an error type. */
    @stub
    def visitError(t: ErrorType, p: P): R = ???

    /** Visits an executable type. */
    @stub
    def visitExecutable(t: ExecutableType, p: P): R = ???

    /** Visits a NoType instance. */
    @stub
    def visitNoType(t: NoType, p: P): R = ???

    /** Visits the null type. */
    @stub
    def visitNull(t: NullType, p: P): R = ???

    /** Visits a primitive type. */
    @stub
    def visitPrimitive(t: PrimitiveType, p: P): R = ???

    /** Visits a type variable. */
    @stub
    def visitTypeVariable(t: TypeVariable, p: P): R = ???

    /** Visits a wildcard type. */
    @stub
    def visitWildcard(t: WildcardType, p: P): R = ???
}
