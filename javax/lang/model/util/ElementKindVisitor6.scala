package javax.lang.model.util

import java.lang.Object
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.{ExecutableElement, PackageElement, TypeElement, TypeParameterElement, VariableElement}

// A visitor of program elements based on their kind with default behavior appropriate for the RELEASE_6 source version.  For elements XYZ that may have more than one
// kind, the visitXYZ methods in this class delegate
// to the visitXYZKind method corresponding to the
// first argument's kind.  The visitXYZKind methods
// call defaultAction, passing their arguments
// to defaultAction's corresponding parameters.
//
//  Methods in this class may be overridden subject to their
// general contract.  Note that annotating methods in concrete
// subclasses with @Override will help
// ensure that methods are overridden as intended.
//
//  WARNING: The ElementVisitor interface
// implemented by this class may have methods added to it or the
// ElementKind enum used in this case may have
// constants added to it in the future to accommodate new, currently
// unknown, language structures added to future versions of the
// Java™ programming language.  Therefore, methods whose names
// begin with "visit" may be added to this class in the
// future; to avoid incompatibilities, classes which extend this class
// should not declare any instance methods with names beginning with
// "visit".
//
// When such a new visit method is added, the default
// implementation in this class will be to call the visitUnknown method.  A new abstract element kind
// visitor class will also be introduced to correspond to the new
// language level; this visitor will have different default behavior
// for the visit method in question.  When the new visitor is
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
@SupportedSourceVersion ( value = RELEASE_6 ) class ElementKindVisitor6[R, P] extends SimpleElementVisitor6[R, P] {

    @stub
    // Constructor for concrete subclasses; uses null for the
    // default value.
    protected def this() = ???

    @stub
    // Visits an executable element, dispatching to the visit method
    // for the specific kind of executable,
    // CONSTRUCTOR, INSTANCE_INIT, METHOD, or
    // STATIC_INIT.
    def visitExecutable(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits a CONSTRUCTOR executable element by calling
    // defaultAction.
    def visitExecutableAsConstructor(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits an INSTANCE_INIT executable element by calling
    // defaultAction.
    def visitExecutableAsInstanceInit(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits a METHOD executable element by calling
    // defaultAction.
    def visitExecutableAsMethod(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits a STATIC_INIT executable element by calling
    // defaultAction.
    def visitExecutableAsStaticInit(e: ExecutableElement, p: P): R = ???

    @stub
    // Visits a package element.
    def visitPackage(e: PackageElement, p: P): R = ???

    @stub
    // Visits a type element, dispatching to the visit method for the
    // specific kind of type, ANNOTATION_TYPE, CLASS, ENUM, or INTERFACE.
    def visitType(e: TypeElement, p: P): R = ???

    @stub
    // Visits an ANNOTATION_TYPE type element by calling
    // defaultAction.
    def visitTypeAsAnnotationType(e: TypeElement, p: P): R = ???

    @stub
    // Visits a CLASS type element by calling defaultAction.
    def visitTypeAsClass(e: TypeElement, p: P): R = ???

    @stub
    // Visits an ENUM type element by calling defaultAction.
    def visitTypeAsEnum(e: TypeElement, p: P): R = ???

    @stub
    // Visits an INTERFACE type element by calling defaultAction.
    def visitTypeAsInterface(e: TypeElement, p: P): R = ???

    @stub
    // Visits a type parameter element.
    def visitTypeParameter(e: TypeParameterElement, p: P): R = ???

    @stub
    // Visits a variable element, dispatching to the visit method for
    // the specific kind of variable, ENUM_CONSTANT, EXCEPTION_PARAMETER, FIELD,
    // LOCAL_VARIABLE, PARAMETER, or RESOURCE_VARIABLE.
    def visitVariable(e: VariableElement, p: P): R = ???

    @stub
    // Visits an ENUM_CONSTANT variable element by calling
    // defaultAction.
    def visitVariableAsEnumConstant(e: VariableElement, p: P): R = ???

    @stub
    // Visits an EXCEPTION_PARAMETER variable element by calling
    // defaultAction.
    def visitVariableAsExceptionParameter(e: VariableElement, p: P): R = ???

    @stub
    // Visits a FIELD variable element by calling
    // defaultAction.
    def visitVariableAsField(e: VariableElement, p: P): R = ???

    @stub
    // Visits a LOCAL_VARIABLE variable element by calling
    // defaultAction.
    def visitVariableAsLocalVariable(e: VariableElement, p: P): R = ???

    @stub
    // Visits a PARAMETER variable element by calling
    // defaultAction.
    def visitVariableAsParameter(e: VariableElement, p: P): R = ???
}
