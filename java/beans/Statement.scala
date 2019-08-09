package java.beans

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A Statement object represents a primitive statement
 *  in which a single method is applied to a target and
 *  a set of arguments - as in "a.setFoo(b)".
 *  Note that where this example uses names
 *  to denote the target and its argument, a statement
 *  object does not require a name space and is constructed with
 *  the values themselves.
 *  The statement object associates the named method
 *  with its environment as a simple set of values:
 *  the target and an array of argument values.
 */
class Statement extends Object {

    /** Creates a new Statement object
     *  for the specified target object to invoke the method
     *  specified by the name and by the array of arguments.
     */
    @stub
    def this(target: Object, methodName: String, arguments: Array[Object]) = ???

    /** The execute method finds a method whose name is the same
     *  as the methodName property, and invokes the method on
     *  the target.
     */
    @stub
    def execute(): Unit = ???

    /** Returns the arguments for the method to invoke. */
    @stub
    def getArguments(): Array[Object] = ???

    /** Returns the name of the method to invoke. */
    @stub
    def getMethodName(): String = ???

    /** Returns the target object of this statement. */
    @stub
    def getTarget(): Object = ???

    /** Prints the value of this statement using a Java-style syntax. */
    @stub
    def toString(): String = ???
}
