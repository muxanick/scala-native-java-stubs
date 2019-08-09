package javax.script

import java.lang.{Class, Object, String}
import scala.scalanative.annotation.stub

/** The optional interface implemented by ScriptEngines whose methods allow the invocation of
 *  procedures in scripts that have previously been executed.
 */
trait Invocable {

    /** Returns an implementation of an interface using functions compiled in
     *  the interpreter.
     */
    @stub
    def getInterface[T](clasz: Class[T]): T = ???

    /** Returns an implementation of an interface using member functions of
     *  a scripting object compiled in the interpreter.
     */
    @stub
    def getInterface[T](thiz: Object, clasz: Class[T]): T = ???

    /** Used to call top-level procedures and functions defined in scripts. */
    @stub
    def invokeFunction(name: String, args: Object*): Object = ???

    /** Calls a method on a script object compiled during a previous script execution,
     *  which is retained in the state of the ScriptEngine.
     */
    @stub
    def invokeMethod(thiz: Object, name: String, args: Object*): Object = ???
}
