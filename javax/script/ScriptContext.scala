package javax.script

import java.io.{Reader, Writer}
import java.lang.{Integer, Object, String}
import java.util.List

// The interface whose implementing classes are used to connect Script Engines
// with objects, such as scoped Bindings, in hosting applications.  Each scope is a set
// of named attributes whose values can be set and retrieved using the
// ScriptContext methods. ScriptContexts also expose Readers and Writers
// that can be used by the ScriptEngines for input and output.
trait ScriptContext {

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
    // Gets the Bindings  associated with the given scope in this
    // ScriptContext.
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
    // Associates a Bindings instance with a particular scope in this
    // ScriptContext.
    def setBindings(bindings: Bindings, scope: Int): Unit = ???

    @stub
    // Sets the Writer used to display error output.
    def setErrorWriter(writer: Writer): Unit = ???

    @stub
    // Sets the Reader for scripts to read input
    // .
    def setReader(reader: Reader): Unit = ???
}

object ScriptContext {
    @stub
    // EngineScope attributes are visible during the lifetime of a single
    // ScriptEngine and a set of attributes is maintained for each
    // engine.
    def ENGINE_SCOPE: Int = ???
}
