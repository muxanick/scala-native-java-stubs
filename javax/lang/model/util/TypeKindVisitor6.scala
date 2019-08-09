package javax.lang.model.util

import java.lang.Object
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.type.{NoType, PrimitiveType}

/** A visitor of types based on their kind with
 *  default behavior appropriate for the RELEASE_6 source version.  For types XYZ that may have more than one
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
 *  implementation in this class will be to call the visitUnknown method.  A new type kind visitor class
 *  will also be introduced to correspond to the new language level;
 *  this visitor will have different default behavior for the visit
 *  method in question.  When the new visitor is introduced, all or
 *  portions of this visitor may be deprecated.
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
@SupportedSourceVersion ( value = RELEASE_6 ) class TypeKindVisitor6[R, P] extends SimpleTypeVisitor6[R, P] {

    /** Constructor for concrete subclasses to call; uses null
     *  for the default value.
     */
    @stub
    protected def this() = ???

    /** Visits a NoType instance, dispatching to the visit method for
     *  the specific kind of pseudo-type:
     *  VOID, PACKAGE, or NONE.
     */
    @stub
    def visitNoType(t: NoType, p: P): R = ???

    /** Visits a NONE pseudo-type by calling
     *  defaultAction.
     */
    @stub
    def visitNoTypeAsNone(t: NoType, p: P): R = ???

    /** Visits a PACKAGE pseudo-type by calling
     *  defaultAction.
     */
    @stub
    def visitNoTypeAsPackage(t: NoType, p: P): R = ???

    /** Visits a VOID pseudo-type by calling
     *  defaultAction.
     */
    @stub
    def visitNoTypeAsVoid(t: NoType, p: P): R = ???

    /** Visits a primitive type, dispatching to the visit method for
     *  the specific kind of primitive type:
     *  BOOLEAN, BYTE, etc.
     */
    @stub
    def visitPrimitive(t: PrimitiveType, p: P): R = ???

    /** Visits a BOOLEAN primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsBoolean(t: PrimitiveType, p: P): R = ???

    /** Visits a BYTE primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsByte(t: PrimitiveType, p: P): R = ???

    /** Visits a CHAR primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsChar(t: PrimitiveType, p: P): R = ???

    /** Visits a DOUBLE primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsDouble(t: PrimitiveType, p: P): R = ???

    /** Visits a FLOAT primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsFloat(t: PrimitiveType, p: P): R = ???

    /** Visits an INT primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsInt(t: PrimitiveType, p: P): R = ???

    /** Visits a LONG primitive type by calling
     *  defaultAction.
     */
    @stub
    def visitPrimitiveAsLong(t: PrimitiveType, p: P): R = ???
}
