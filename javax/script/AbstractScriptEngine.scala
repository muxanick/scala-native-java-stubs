package javax.script

import java.io.Reader
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Provides a standard implementation for several of the variants of the eval
 *  method.
 *  
 *  eval(Reader)eval(String)
 *  eval(String, Bindings)eval(Reader, Bindings)
 *   are implemented using the abstract methods
 *  
 *  eval(Reader,ScriptContext) or
 *  eval(String, ScriptContext)
 *  
 *  with a SimpleScriptContext.
 *  
 *  A SimpleScriptContext is used as the default ScriptContext
 *  of the AbstractScriptEngine..
 */
abstract class AbstractScriptEngine extends Object with ScriptEngine {

    /** Creates a new instance of AbstractScriptEngine using a SimpleScriptContext
     *  as its default ScriptContext.
     */
    @stub
    def this() = ???

    /** Creates a new instance using the specified Bindings as the
     *  ENGINE_SCOPE Bindings in the protected context field.
     */
    @stub
    def this(n: Bindings) = ???

    /** The default ScriptContext of this AbstractScriptEngine. */
    protected val context: ScriptContext

    /** eval(Reader) calls the abstract
     *  eval(Reader, ScriptContext) passing the value of the context
     *  field.
     */
    def eval(reader: Reader): Any

    /** eval(Reader, Bindings) calls the abstract
     *  eval(Reader, ScriptContext) method, passing it a ScriptContext
     *  whose Reader, Writers and Bindings for scopes other that ENGINE_SCOPE
     *  are identical to those members of the protected context field.
     */
    def eval(reader: Reader, bindings: Bindings): Any

    /** Same as eval(Reader) except that the abstract
     *  eval(String, ScriptContext) is used.
     */
    def eval(script: String): Any

    /** Same as eval(Reader, Bindings) except that the abstract
     *  eval(String, ScriptContext) is used.
     */
    def eval(script: String, bindings: Bindings): Any

    /** Gets the value for the specified key in the ENGINE_SCOPE of the
     *  protected context field.
     */
    def get(key: String): Any

    /** Returns the Bindings with the specified scope value in
     *  the protected context field.
     */
    def getBindings(scope: Int): Bindings

    /** Returns the value of the protected context field. */
    def getContext(): ScriptContext

    /** Returns a SimpleScriptContext. */
    protected def getScriptContext(nn: Bindings): ScriptContext

    /** Sets the specified value with the specified key in the ENGINE_SCOPE
     *  Bindings of the protected context field.
     */
    def put(key: String, value: Any): Unit

    /** Sets the Bindings with the corresponding scope value in the
     *  context field.
     */
    def setBindings(bindings: Bindings, scope: Int): Unit

    /** Sets the value of the protected context field to the specified
     *  ScriptContext.
     */
    def setContext(ctxt: ScriptContext): Unit
}
