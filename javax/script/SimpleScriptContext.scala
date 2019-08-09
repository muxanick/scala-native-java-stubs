package javax.script

import java.io.{Reader, Writer}
import java.lang.{Integer, Object, String}
import java.util.List

/** Simple implementation of ScriptContext. */
class SimpleScriptContext extends Object with ScriptContext {

    /** This is the engine scope bindings. */
    @stub
    protected val engineScope: Bindings = ???

    /** This is the writer to be used to output errors from scripts. */
    @stub
    protected val errorWriter: Writer = ???

    /** This is the global scope bindings. */
    @stub
    protected val globalScope: Bindings = ???

    /** This is the reader to be used for input from scripts. */
    @stub
    protected val reader: Reader = ???

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

    /** Returns the value of the engineScope field if specified scope is
     *  ENGINE_SCOPE.
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

    /** Sets a Bindings of attributes for the given scope. */
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
