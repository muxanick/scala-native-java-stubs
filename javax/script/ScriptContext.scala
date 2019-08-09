package javax.script

import java.io.{Reader, Writer}
import java.lang.{Integer, Object, String}
import java.util.List

/** The interface whose implementing classes are used to connect Script Engines
 *  with objects, such as scoped Bindings, in hosting applications.  Each scope is a set
 *  of named attributes whose values can be set and retrieved using the
 *  ScriptContext methods. ScriptContexts also expose Readers and Writers
 *  that can be used by the ScriptEngines for input and output.
 */
trait ScriptContext {

    /** Retrieves the value of the attribute with the given name in
     *  the scope occurring earliest in the search order.
     */
    @stub
    def getAttribute(name: String): Object = ???

    /** Gets the value of an attribute in a given scope. */
    @stub
    def getAttribute(name: String, scope: Int): Object = ???

    /** Get the lowest scope in which an attribute is defined. */
    @stub
    def getAttributesScope(name: String): Int = ???

    /** Gets the Bindings  associated with the given scope in this
     *  ScriptContext.
     */
    @stub
    def getBindings(scope: Int): Bindings = ???

    /** Returns the Writer used to display error output. */
    @stub
    def getErrorWriter(): Writer = ???

    /** Returns a Reader to be used by the script to read
     *  input.
     */
    @stub
    def getReader(): Reader = ???

    /** Returns immutable List of all the valid values for
     *  scope in the ScriptContext.
     */
    @stub
    def getScopes(): List[Integer] = ???

    /** Returns the Writer for scripts to use when displaying output. */
    @stub
    def getWriter(): Writer = ???

    /** Remove an attribute in a given scope. */
    @stub
    def removeAttribute(name: String, scope: Int): Object = ???

    /** Sets the value of an attribute in a given scope. */
    @stub
    def setAttribute(name: String, value: Object, scope: Int): Unit = ???

    /** Associates a Bindings instance with a particular scope in this
     *  ScriptContext.
     */
    @stub
    def setBindings(bindings: Bindings, scope: Int): Unit = ???

    /** Sets the Writer used to display error output. */
    @stub
    def setErrorWriter(writer: Writer): Unit = ???

    /** Sets the Reader for scripts to read input
     *  .
     */
    @stub
    def setReader(reader: Reader): Unit = ???
}

object ScriptContext {
    /** EngineScope attributes are visible during the lifetime of a single
     *  ScriptEngine and a set of attributes is maintained for each
     *  engine.
     */
    @stub
    val ENGINE_SCOPE: Int = ???
}
