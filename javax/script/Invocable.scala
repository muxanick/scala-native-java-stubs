package javax.script

import java.lang.{Class, Object, String}

// The optional interface implemented by ScriptEngines whose methods allow the invocation of
// procedures in scripts that have previously been executed.
trait Invocable {

    @stub
    // Returns an implementation of an interface using functions compiled in
    // the interpreter.
    def T: [T] = ???

    @stub
    // Returns an implementation of an interface using member functions of
    // a scripting object compiled in the interpreter.
    def T: [T] = ???

    @stub
    // Used to call top-level procedures and functions defined in scripts.
    def invokeFunction(name: String, args: Object*): Object = ???
}
