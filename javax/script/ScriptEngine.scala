package javax.script

import java.io.Reader
import java.lang.{Object, String}

/** ScriptEngine is the fundamental interface whose methods must be
 *  fully functional in every implementation of this specification.
 *  
 *  These methods provide basic scripting functionality.  Applications written to this
 *  simple interface are expected to work with minimal modifications in every implementation.
 *  It includes methods that execute scripts, and ones that set and get values.
 *  
 *  The values are key/value pairs of two types.  The first type of pairs consists of
 *  those whose keys are reserved and defined in this specification or  by individual
 *  implementations.  The values in the pairs with reserved keys have specified meanings.
 *  
 *  The other type of pairs consists of those that create Java language Bindings, the values are
 *  usually represented in scripts by the corresponding keys or by decorated forms of them.
 */
trait ScriptEngine {

    /** Returns an uninitialized Bindings. */
    @stub
    def createBindings(): Bindings = ???

    /** Same as eval(String) except that the source of the script is
     *  provided as a Reader
     */
    @stub
    def eval(reader: Reader): Object = ???

    /** Same as eval(String, Bindings) except that the source of the script
     *  is provided as a Reader.
     */
    @stub
    def eval(reader: Reader, n: Bindings): Object = ???

    /** Same as eval(String, ScriptContext) where the source of the script
     *  is read from a Reader.
     */
    @stub
    def eval(reader: Reader, context: ScriptContext): Object = ???

    /** Executes the specified script. */
    @stub
    def eval(script: String): Object = ???

    /** Executes the script using the Bindings argument as the ENGINE_SCOPE
     *  Bindings of the ScriptEngine during the script execution.
     */
    @stub
    def eval(script: String, n: Bindings): Object = ???

    /** Causes the immediate execution of the script whose source is the String
     *  passed as the first argument.
     */
    @stub
    def eval(script: String, context: ScriptContext): Object = ???

    /** Retrieves a value set in the state of this engine. */
    @stub
    def get(key: String): Object = ???

    /** Returns a scope of named values. */
    @stub
    def getBindings(scope: Int): Bindings = ???

    /** Returns the default ScriptContext of the ScriptEngine whose Bindings, Reader
     *  and Writers are used for script executions when no ScriptContext is specified.
     */
    @stub
    def getContext(): ScriptContext = ???

    /** Returns a ScriptEngineFactory for the class to which this ScriptEngine belongs. */
    @stub
    def getFactory(): ScriptEngineFactory = ???

    /** Sets a key/value pair in the state of the ScriptEngine that may either create
     *  a Java Language Binding to be used in the execution of scripts or be used in some
     *  other way, depending on whether the key is reserved.
     */
    @stub
    def put(key: String, value: Object): Unit = ???

    /** Sets a scope of named values to be used by scripts. */
    @stub
    def setBindings(bindings: Bindings, scope: Int): Unit = ???
}

object ScriptEngine {
    /** Reserved key for a named value that passes
     *  an array of positional arguments to a script.
     */
    @stub
    val ARGV: String = ???

    /** Reserved key for a named value that is
     *  the name of the ScriptEngine implementation.
     */
    @stub
    val ENGINE: String = ???

    /** Reserved key for a named value that identifies
     *  the version of the ScriptEngine implementation.
     */
    @stub
    val ENGINE_VERSION: String = ???

    /** Reserved key for a named value that is
     *  the name of the file being executed.
     */
    @stub
    val FILENAME: String = ???

    /** Reserved key for a named value that is
     *  the full name of Scripting Language supported by the implementation.
     */
    @stub
    val LANGUAGE: String = ???

    /** Reserved key for the named value that identifies
     *  the version of the scripting language supported by the implementation.
     */
    @stub
    val LANGUAGE_VERSION: String = ???
}
