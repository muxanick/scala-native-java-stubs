package javax.script

import java.lang.{Object, String}
import java.util.List

// ScriptEngineFactory is used to describe and instantiate
// ScriptEngines.
// 
// Each class implementing ScriptEngine has a corresponding factory
// that exposes metadata describing the engine class.
// The ScriptEngineManager
// uses the service provider mechanism described in the Jar File Specification to obtain
// instances of all ScriptEngineFactories available in
// the current ClassLoader.
trait ScriptEngineFactory {

    @stub
    // Returns the full  name of the ScriptEngine.
    def getEngineName(): String = ???

    @stub
    // Returns the version of the ScriptEngine.
    def getEngineVersion(): String = ???

    @stub
    // Returns an immutable list of filename extensions, which generally identify scripts
    // written in the language supported by this ScriptEngine.
    def getExtensions(): List[String] = ???

    @stub
    // Returns the name of the scripting language supported by this
    // ScriptEngine.
    def getLanguageName(): String = ???

    @stub
    // Returns the version of the scripting language supported by this
    // ScriptEngine.
    def getLanguageVersion(): String = ???

    @stub
    // Returns a String which can be used to invoke a method of a  Java object using the syntax
    // of the supported scripting language.
    def getMethodCallSyntax(obj: String, m: String, args: String*): String = ???

    @stub
    // Returns an immutable list of mimetypes, associated with scripts that
    // can be executed by the engine.
    def getMimeTypes(): List[String] = ???

    @stub
    // Returns an immutable list of  short names for the ScriptEngine, which may be used to
    // identify the ScriptEngine by the ScriptEngineManager.
    def getNames(): List[String] = ???

    @stub
    // Returns a String that can be used as a statement to display the specified String  using
    // the syntax of the supported scripting language.
    def getOutputStatement(toDisplay: String): String = ???

    @stub
    // Returns the value of an attribute whose meaning may be implementation-specific.
    def getParameter(key: String): Object = ???

    @stub
    // Returns a valid scripting language executable program with given statements.
    def getProgram(statements: String*): String = ???
}
