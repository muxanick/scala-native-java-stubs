package javax.script

import java.io.Reader

/** The optional interface implemented by ScriptEngines whose methods compile scripts
 *  to a form that can be executed repeatedly without recompilation.
 */
trait Compilable {

    /** Compiles the script (source read from Reader) for
     *  later execution.
     */
    @stub
    def compile(script: Reader): CompiledScript = ???
}
