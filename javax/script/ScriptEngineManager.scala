package javax.script

import java.lang.{ClassLoader, Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** The ScriptEngineManager implements a discovery and instantiation
 *  mechanism for ScriptEngine classes and also maintains a
 *  collection of key/value pairs storing state shared by all engines created
 *  by the Manager. This class uses the service provider mechanism to enumerate all the
 *  implementations of ScriptEngineFactory. 
 *  The ScriptEngineManager provides a method to return a list of all these factories
 *  as well as utility methods which look up factories on the basis of language name, file extension
 *  and mime type.
 *  
 *  The Bindings of key/value pairs, referred to as the "Global Scope"  maintained
 *  by the manager is available to all instances of ScriptEngine created
 *  by the ScriptEngineManager.  The values in the Bindings are
 *  generally exposed in all scripts.
 */
class ScriptEngineManager extends Object {

    /** The effect of calling this constructor is the same as calling
     *  ScriptEngineManager(Thread.currentThread().getContextClassLoader()).
     */
    @stub
    def this() = ???

    /** This constructor loads the implementations of
     *  ScriptEngineFactory visible to the given
     *  ClassLoader using the service provider mechanism.
     *  If loader is null, the script engine factories that are
     *  bundled with the platform and that are in the usual extension
     *  directories (installed extensions) are loaded.
     */
    @stub
    def this(loader: ClassLoader) = ???

    /** Gets the value for the specified key in the Global Scope */
    @stub
    def get(key: String): Object = ???

    /** getBindings returns the value of the globalScope field. */
    @stub
    def getBindings(): Bindings = ???

    /** Look up and create a ScriptEngine for a given extension. */
    @stub
    def getEngineByExtension(extension: String): ScriptEngine = ???

    /** Look up and create a ScriptEngine for a given mime type. */
    @stub
    def getEngineByMimeType(mimeType: String): ScriptEngine = ???

    /** Looks up and creates a ScriptEngine for a given  name. */
    @stub
    def getEngineByName(shortName: String): ScriptEngine = ???

    /** Returns a list whose elements are instances of all the ScriptEngineFactory classes
     *  found by the discovery mechanism.
     */
    @stub
    def getEngineFactories(): List[ScriptEngineFactory] = ???

    /** Sets the specified key/value pair in the Global Scope. */
    @stub
    def put(key: String, value: Object): Unit = ???

    /** Registers a ScriptEngineFactory to handle an extension. */
    @stub
    def registerEngineExtension(extension: String, factory: ScriptEngineFactory): Unit = ???

    /** Registers a ScriptEngineFactory to handle a mime type. */
    @stub
    def registerEngineMimeType(type: String, factory: ScriptEngineFactory): Unit = ???

    /** Registers a ScriptEngineFactory to handle a language
     *  name.
     */
    @stub
    def registerEngineName(name: String, factory: ScriptEngineFactory): Unit = ???

    /** setBindings stores the specified Bindings
     *  in the globalScope field.
     */
    @stub
    def setBindings(bindings: Bindings): Unit = ???
}
