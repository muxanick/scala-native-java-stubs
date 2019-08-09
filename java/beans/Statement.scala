package java.beans

import java.lang.{Object, String}

// A Statement object represents a primitive statement
// in which a single method is applied to a target and
// a set of arguments - as in "a.setFoo(b)".
// Note that where this example uses names
// to denote the target and its argument, a statement
// object does not require a name space and is constructed with
// the values themselves.
// The statement object associates the named method
// with its environment as a simple set of values:
// the target and an array of argument values.
class Statement extends Object {

    @stub
    // The execute method finds a method whose name is the same
    // as the methodName property, and invokes the method on
    // the target.
    def execute(): Unit = ???

    @stub
    // Returns the arguments for the method to invoke.
    def getArguments(): Array[Object] = ???

    @stub
    // Returns the name of the method to invoke.
    def getMethodName(): String = ???

    @stub
    // Returns the target object of this statement.
    def getTarget(): Object = ???
}
