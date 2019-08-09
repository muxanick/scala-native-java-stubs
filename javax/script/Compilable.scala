package javax.script

import java.io.Reader
import java.lang.String
import scala.scalanative.annotation.stub

/** The optional interface implemented by ScriptEngines whose methods compile scripts
 *  to a form that can be executed repeatedly without recompilation.
 */
trait Compilable {

    /** Compiles the script (source read from Reader) for
     *  later execution.
     */
    @stub
    def compile(script: Reader): CompiledScript = ???

    /** Compiles the script (source represented as a String) for
     *  later execution.
     */
    @stub
    def compile(script: String): CompiledScript = ???
}
