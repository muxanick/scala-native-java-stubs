package javax.script

import java.lang.{Object, String}
import java.util.List

// The ScriptEngineManager implements a discovery and instantiation
// mechanism for ScriptEngine classes and also maintains a
// collection of key/value pairs storing state shared by all engines created
// by the Manager. This class uses the service provider mechanism to enumerate all the
// implementations of ScriptEngineFactory. 
// The ScriptEngineManager provides a method to return a list of all these factories
// as well as utility methods which look up factories on the basis of language name, file extension
// and mime type.
// 
// The Bindings of key/value pairs, referred to as the "Global Scope"  maintained
// by the manager is available to all instances of ScriptEngine created
// by the ScriptEngineManager.  The values in the Bindings are
// generally exposed in all scripts.
class ScriptEngineManager extends Object {

    @stub
    // The effect of calling this constructor is the same as calling
    // ScriptEngineManager(Thread.currentThread().getContextClassLoader()).
    def this() = ???

    @stub
    // Gets the value for the specified key in the Global Scope
    def get(key: String): Object = ???

    @stub
    // getBindings returns the value of the globalScope field.
    def getBindings(): Bindings = ???

    @stub
    // Look up and create a ScriptEngine for a given extension.
    def getEngineByExtension(extension: String): ScriptEngine = ???

    @stub
    // Look up and create a ScriptEngine for a given mime type.
    def getEngineByMimeType(mimeType: String): ScriptEngine = ???

    @stub
    // Looks up and creates a ScriptEngine for a given  name.
    def getEngineByName(shortName: String): ScriptEngine = ???

    @stub
    // Returns a list whose elements are instances of all the ScriptEngineFactory classes
    // found by the discovery mechanism.
    def getEngineFactories(): List[ScriptEngineFactory] = ???

    @stub
    // Sets the specified key/value pair in the Global Scope.
    def put(key: String, value: Object): Unit = ???

    @stub
    // Registers a ScriptEngineFactory to handle an extension.
    def registerEngineExtension(extension: String, factory: ScriptEngineFactory): Unit = ???

    @stub
    // Registers a ScriptEngineFactory to handle a mime type.
    def registerEngineMimeType(type: String, factory: ScriptEngineFactory): Unit = ???

    @stub
    // Registers a ScriptEngineFactory to handle a language
    // name.
    def registerEngineName(name: String, factory: ScriptEngineFactory): Unit = ???
}
