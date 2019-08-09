package javax.lang.model.element

/** A visitor of program elements, in the style of the visitor design
 *  pattern.  Classes implementing this interface are used to operate
 *  on an element when the kind of element is unknown at compile time.
 *  When a visitor is passed to an element's accept method, the visitXYZ method most applicable
 *  to that element is invoked.
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
trait ElementVisitor[R, P] {

    /** A convenience method equivalent to v.visit(e, null). */
    @stub
    def visit(e: Element): R = ???

    /** Visits an element. */
    @stub
    def visit(e: Element, p: P): R = ???

    /** Visits an executable element. */
    @stub
    def visitExecutable(e: ExecutableElement, p: P): R = ???

    /** Visits a package element. */
    @stub
    def visitPackage(e: PackageElement, p: P): R = ???

    /** Visits a type element. */
    @stub
    def visitType(e: TypeElement, p: P): R = ???

    /** Visits a type parameter element. */
    @stub
    def visitTypeParameter(e: TypeParameterElement, p: P): R = ???

    /** Visits an unknown kind of element. */
    @stub
    def visitUnknown(e: Element, p: P): R = ???
}
