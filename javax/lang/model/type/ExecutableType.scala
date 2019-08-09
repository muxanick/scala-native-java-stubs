package javax.lang.model.type

import java.util.List
import scala.scalanative.annotation.stub

/** Represents the type of an executable.  An executable
 *  is a method, constructor, or initializer.
 * 
 *   The executable is
 *  represented as when viewed as a method (or constructor or
 *  initializer) of some reference type.
 *  If that reference type is parameterized, then its actual
 *  type arguments are substituted into any types returned by the methods of
 *  this interface.
 */
trait ExecutableType extends TypeMirror {

    /** Returns the types of this executable's formal parameters. */
    @stub
    def getParameterTypes(): List[_ <: TypeMirror] = ???

    /** Returns the receiver type of this executable,
     *  or NoType with
     *  kind NONE
     *  if the executable has no receiver type.
     */
    @stub
    def getReceiverType(): TypeMirror = ???

    /** Returns the return type of this executable. */
    @stub
    def getReturnType(): TypeMirror = ???

    /** Returns the exceptions and other throwables listed in this
     *  executable's throws clause.
     */
    @stub
    def getThrownTypes(): List[_ <: TypeMirror] = ???

    /** Returns the type variables declared by the formal type parameters
     *  of this executable.
     */
    @stub
    def getTypeVariables(): List[_ <: TypeVariable] = ???
}
