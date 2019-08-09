package javax.script

import java.lang.Object
import scala.scalanative.annotation.stub

/** Extended by classes that store results of compilations.  State
 *  might be stored in the form of Java classes, Java class files or scripting
 *  language opcodes.  The script may be executed repeatedly
 *  without reparsing.
 *  
 *  Each CompiledScript is associated with a ScriptEngine -- A call to an  eval
 *  method of the CompiledScript causes the execution of the script by the
 *  ScriptEngine.  Changes in the state of the ScriptEngine caused by execution
 *  of the CompiledScript  may visible during subsequent executions of scripts by the engine.
 */
abstract class CompiledScript extends Object {

    /**  */
    @stub
    def this() = ???

    /** Executes the program stored in the CompiledScript object. */
    def eval(): Object

    /** Executes the program stored in the CompiledScript object using
     *  the supplied Bindings of attributes as the ENGINE_SCOPE of the
     *  associated ScriptEngine during script execution.
     */
    def eval(bindings: Bindings): Object

    /** Executes the program stored in this CompiledScript object. */
    def eval(context: ScriptContext): Object

    /** Returns the ScriptEngine whose compile method created this CompiledScript. */
    def getEngine(): ScriptEngine
}
