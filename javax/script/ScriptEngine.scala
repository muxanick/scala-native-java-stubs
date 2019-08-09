package javax.script

import java.io.Reader
import java.lang.{Object, String}

// ScriptEngine is the fundamental interface whose methods must be
// fully functional in every implementation of this specification.
// 
// These methods provide basic scripting functionality.  Applications written to this
// simple interface are expected to work with minimal modifications in every implementation.
// It includes methods that execute scripts, and ones that set and get values.
// 
// The values are key/value pairs of two types.  The first type of pairs consists of
// those whose keys are reserved and defined in this specification or  by individual
// implementations.  The values in the pairs with reserved keys have specified meanings.
// 
// The other type of pairs consists of those that create Java language Bindings, the values are
// usually represented in scripts by the corresponding keys or by decorated forms of them.
trait ScriptEngine {

    @stub
    // Returns an uninitialized Bindings.
    def createBindings(): Bindings = ???

    @stub
    // Same as eval(String) except that the source of the script is
    // provided as a Reader
    def eval(reader: Reader): Object = ???

    @stub
    // Same as eval(String, Bindings) except that the source of the script
    // is provided as a Reader.
    def eval(reader: Reader, n: Bindings): Object = ???

    @stub
    // Same as eval(String, ScriptContext) where the source of the script
    // is read from a Reader.
    def eval(reader: Reader, context: ScriptContext): Object = ???

    @stub
    // Executes the specified script.
    def eval(script: String): Object = ???

    @stub
    // Executes the script using the Bindings argument as the ENGINE_SCOPE
    // Bindings of the ScriptEngine during the script execution.
    def eval(script: String, n: Bindings): Object = ???

    @stub
    // Causes the immediate execution of the script whose source is the String
    // passed as the first argument.
    def eval(script: String, context: ScriptContext): Object = ???

    @stub
    // Retrieves a value set in the state of this engine.
    def get(key: String): Object = ???

    @stub
    // Returns a scope of named values.
    def getBindings(scope: Int): Bindings = ???

    @stub
    // Returns the default ScriptContext of the ScriptEngine whose Bindings, Reader
    // and Writers are used for script executions when no ScriptContext is specified.
    def getContext(): ScriptContext = ???

    @stub
    // Returns a ScriptEngineFactory for the class to which this ScriptEngine belongs.
    def getFactory(): ScriptEngineFactory = ???

    @stub
    // Sets a key/value pair in the state of the ScriptEngine that may either create
    // a Java Language Binding to be used in the execution of scripts or be used in some
    // other way, depending on whether the key is reserved.
    def put(key: String, value: Object): Unit = ???

    @stub
    // Sets a scope of named values to be used by scripts.
    def setBindings(bindings: Bindings, scope: Int): Unit = ???
}

object ScriptEngine {
    @stub
    // Reserved key for a named value that passes
    // an array of positional arguments to a script.
    def ARGV: String = ???

    @stub
    // Reserved key for a named value that is
    // the name of the ScriptEngine implementation.
    def ENGINE: String = ???

    @stub
    // Reserved key for a named value that identifies
    // the version of the ScriptEngine implementation.
    def ENGINE_VERSION: String = ???

    @stub
    // Reserved key for a named value that is
    // the name of the file being executed.
    def FILENAME: String = ???

    @stub
    // Reserved key for a named value that is
    // the full name of Scripting Language supported by the implementation.
    def LANGUAGE: String = ???

    @stub
    // Reserved key for the named value that identifies
    // the version of the scripting language supported by the implementation.
    def LANGUAGE_VERSION: String = ???
}
