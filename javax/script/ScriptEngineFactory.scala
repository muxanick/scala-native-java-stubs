package javax.script

import java.lang.{Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** ScriptEngineFactory is used to describe and instantiate
 *  ScriptEngines.
 *  
 *  Each class implementing ScriptEngine has a corresponding factory
 *  that exposes metadata describing the engine class.
 *  The ScriptEngineManager
 *  uses the service provider mechanism described in the Jar File Specification to obtain
 *  instances of all ScriptEngineFactories available in
 *  the current ClassLoader.
 */
trait ScriptEngineFactory {

    /** Returns the full  name of the ScriptEngine. */
    @stub
    def getEngineName(): String = ???

    /** Returns the version of the ScriptEngine. */
    @stub
    def getEngineVersion(): String = ???

    /** Returns an immutable list of filename extensions, which generally identify scripts
     *  written in the language supported by this ScriptEngine.
     */
    @stub
    def getExtensions(): List[String] = ???

    /** Returns the name of the scripting language supported by this
     *  ScriptEngine.
     */
    @stub
    def getLanguageName(): String = ???

    /** Returns the version of the scripting language supported by this
     *  ScriptEngine.
     */
    @stub
    def getLanguageVersion(): String = ???

    /** Returns a String which can be used to invoke a method of a  Java object using the syntax
     *  of the supported scripting language.
     */
    @stub
    def getMethodCallSyntax(obj: String, m: String, args: String*): String = ???

    /** Returns an immutable list of mimetypes, associated with scripts that
     *  can be executed by the engine.
     */
    @stub
    def getMimeTypes(): List[String] = ???

    /** Returns an immutable list of  short names for the ScriptEngine, which may be used to
     *  identify the ScriptEngine by the ScriptEngineManager.
     */
    @stub
    def getNames(): List[String] = ???

    /** Returns a String that can be used as a statement to display the specified String  using
     *  the syntax of the supported scripting language.
     */
    @stub
    def getOutputStatement(toDisplay: String): String = ???

    /** Returns the value of an attribute whose meaning may be implementation-specific. */
    @stub
    def getParameter(key: String): Object = ???

    /** Returns a valid scripting language executable program with given statements. */
    @stub
    def getProgram(statements: String*): String = ???

    /** Returns an instance of the ScriptEngine associated with this
     *  ScriptEngineFactory.
     */
    @stub
    def getScriptEngine(): ScriptEngine = ???
}
