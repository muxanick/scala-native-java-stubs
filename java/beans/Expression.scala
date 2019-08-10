package java.beans

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An Expression object represents a primitive expression
 *  in which a single method is applied to a target and a set of
 *  arguments to return a result - as in "a.getFoo()".
 *  
 *  In addition to the properties of the super class, the
 *  Expression object provides a value which
 *  is the object returned when this expression is evaluated.
 *  The return value is typically not provided by the caller and
 *  is instead computed by dynamically finding the method and invoking
 *  it when the first call to getValue is made.
 */
class Expression extends Statement {

    /** Creates a new Expression object with the specified value
     *  for the specified target object to invoke the  method
     *  specified by the name and by the array of arguments.
     */
    @stub
    def this(value: Any, target: Any, methodName: String, arguments: Array[Object]) = ???

    /** Creates a new Expression object
     *  for the specified target object to invoke the method
     *  specified by the name and by the array of arguments.
     */
    @stub
    def this(target: Any, methodName: String, arguments: Array[Object]) = ???

    /** The execute method finds a method whose name is the same
     *  as the methodName property, and invokes the method on
     *  the target.
     */
    @stub
    def execute(): Unit = ???

    /** If the value property of this instance is not already set,
     *  this method dynamically finds the method with the specified
     *  methodName on this target with these arguments and calls it.
     */
    @stub
    def getValue(): Any = ???

    /** Sets the value of this expression to value. */
    @stub
    def setValue(value: Any): Unit = ???

    /** Prints the value of this expression using a Java-style syntax. */
    @stub
    def toString(): String = ???
}
