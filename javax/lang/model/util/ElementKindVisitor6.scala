package javax.lang.model.util

import java.lang.Object
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.{ExecutableElement, PackageElement, TypeElement, TypeParameterElement, VariableElement}
import scala.scalanative.annotation.stub

/** A visitor of program elements based on their kind with default behavior appropriate for the RELEASE_6 source version.  For elements XYZ that may have more than one
 *  kind, the visitXYZ methods in this class delegate
 *  to the visitXYZKind method corresponding to the
 *  first argument's kind.  The visitXYZKind methods
 *  call defaultAction, passing their arguments
 *  to defaultAction's corresponding parameters.
 * 
 *   Methods in this class may be overridden subject to their
 *  general contract.  Note that annotating methods in concrete
 *  subclasses with @Override will help
 *  ensure that methods are overridden as intended.
 * 
 *   WARNING: The ElementVisitor interface
 *  implemented by this class may have methods added to it or the
 *  ElementKind enum used in this case may have
 *  constants added to it in the future to accommodate new, currently
 *  unknown, language structures added to future versions of the
 *  Java™ programming language.  Therefore, methods whose names
 *  begin with "visit" may be added to this class in the
 *  future; to avoid incompatibilities, classes which extend this class
 *  should not declare any instance methods with names beginning with
 *  "visit".
 * 
 *  When such a new visit method is added, the default
 *  implementation in this class will be to call the visitUnknown method.  A new abstract element kind
 *  visitor class will also be introduced to correspond to the new
 *  language level; this visitor will have different default behavior
 *  for the visit method in question.  When the new visitor is
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
class ElementKindVisitor6[R, P] extends SimpleElementVisitor6[R, P] {

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

    /** Visits an executable element, dispatching to the visit method
     *  for the specific kind of executable,
     *  CONSTRUCTOR, INSTANCE_INIT, METHOD, or
     *  STATIC_INIT.
     */
    @stub
    def visitExecutable(e: ExecutableElement, p: P): R = ???

    /** Visits a CONSTRUCTOR executable element by calling
     *  defaultAction.
     */
    @stub
    def visitExecutableAsConstructor(e: ExecutableElement, p: P): R = ???

    /** Visits an INSTANCE_INIT executable element by calling
     *  defaultAction.
     */
    @stub
    def visitExecutableAsInstanceInit(e: ExecutableElement, p: P): R = ???

    /** Visits a METHOD executable element by calling
     *  defaultAction.
     */
    @stub
    def visitExecutableAsMethod(e: ExecutableElement, p: P): R = ???

    /** Visits a STATIC_INIT executable element by calling
     *  defaultAction.
     */
    @stub
    def visitExecutableAsStaticInit(e: ExecutableElement, p: P): R = ???

    /** Visits a package element. */
    @stub
    def visitPackage(e: PackageElement, p: P): R = ???

    /** Visits a type element, dispatching to the visit method for the
     *  specific kind of type, ANNOTATION_TYPE, CLASS, ENUM, or INTERFACE.
     */
    @stub
    def visitType(e: TypeElement, p: P): R = ???

    /** Visits an ANNOTATION_TYPE type element by calling
     *  defaultAction.
     */
    @stub
    def visitTypeAsAnnotationType(e: TypeElement, p: P): R = ???

    /** Visits a CLASS type element by calling defaultAction. */
    @stub
    def visitTypeAsClass(e: TypeElement, p: P): R = ???

    /** Visits an ENUM type element by calling defaultAction. */
    @stub
    def visitTypeAsEnum(e: TypeElement, p: P): R = ???

    /** Visits an INTERFACE type element by calling defaultAction. */
    @stub
    def visitTypeAsInterface(e: TypeElement, p: P): R = ???

    /** Visits a type parameter element. */
    @stub
    def visitTypeParameter(e: TypeParameterElement, p: P): R = ???

    /** Visits a variable element, dispatching to the visit method for
     *  the specific kind of variable, ENUM_CONSTANT, EXCEPTION_PARAMETER, FIELD,
     *  LOCAL_VARIABLE, PARAMETER, or RESOURCE_VARIABLE.
     */
    @stub
    def visitVariable(e: VariableElement, p: P): R = ???

    /** Visits an ENUM_CONSTANT variable element by calling
     *  defaultAction.
     */
    @stub
    def visitVariableAsEnumConstant(e: VariableElement, p: P): R = ???

    /** Visits an EXCEPTION_PARAMETER variable element by calling
     *  defaultAction.
     */
    @stub
    def visitVariableAsExceptionParameter(e: VariableElement, p: P): R = ???

    /** Visits a FIELD variable element by calling
     *  defaultAction.
     */
    @stub
    def visitVariableAsField(e: VariableElement, p: P): R = ???

    /** Visits a LOCAL_VARIABLE variable element by calling
     *  defaultAction.
     */
    @stub
    def visitVariableAsLocalVariable(e: VariableElement, p: P): R = ???

    /** Visits a PARAMETER variable element by calling
     *  defaultAction.
     */
    @stub
    def visitVariableAsParameter(e: VariableElement, p: P): R = ???

    /** Visits a RESOURCE_VARIABLE variable element by calling
     *  visitUnknown.
     */
    @stub
    def visitVariableAsResourceVariable(e: VariableElement, p: P): R = ???
}
