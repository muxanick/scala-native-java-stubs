package javax.script

import java.io.{Reader, Writer}
import java.lang.{Integer, Object, String}
import java.util.List

// Simple implementation of ScriptContext.
class SimpleScriptContext extends Object with ScriptContext {

    @stub
    // This is the engine scope bindings.
    protected def engineScope: Bindings = ???

    @stub
    // This is the writer to be used to output errors from scripts.
    protected def errorWriter: Writer = ???

    @stub
    // This is the global scope bindings.
    protected def globalScope: Bindings = ???

    @stub
    // This is the reader to be used for input from scripts.
    protected def reader: Reader = ???

    @stub
    // Retrieves the value of the attribute with the given name in
    // the scope occurring earliest in the search order.
    def getAttribute(name: String): Object = ???

    @stub
    // Gets the value of an attribute in a given scope.
    def getAttribute(name: String, scope: Int): Object = ???

    @stub
    // Get the lowest scope in which an attribute is defined.
    def getAttributesScope(name: String): Int = ???

    @stub
    // Returns the value of the engineScope field if specified scope is
    // ENGINE_SCOPE.
    def getBindings(scope: Int): Bindings = ???

    @stub
    // Returns the Writer used to display error output.
    def getErrorWriter(): Writer = ???

    @stub
    // Returns a Reader to be used by the script to read
    // input.
    def getReader(): Reader = ???

    @stub
    // Returns immutable List of all the valid values for
    // scope in the ScriptContext.
    def getScopes(): List[Integer] = ???

    @stub
    // Returns the Writer for scripts to use when displaying output.
    def getWriter(): Writer = ???

    @stub
    // Remove an attribute in a given scope.
    def removeAttribute(name: String, scope: Int): Object = ???

    @stub
    // Sets the value of an attribute in a given scope.
    def setAttribute(name: String, value: Object, scope: Int): Unit = ???

    @stub
    // Sets a Bindings of attributes for the given scope.
    def setBindings(bindings: Bindings, scope: Int): Unit = ???

    @stub
    // Sets the Writer used to display error output.
    def setErrorWriter(writer: Writer): Unit = ???

    @stub
    // Sets the Reader for scripts to read input
    // .
    def setReader(reader: Reader): Unit = ???
}
