package javax.tools

import java.lang.Object

/** Provides methods for locating tool providers, for example,
 *  providers of compilers.  This class complements the
 *  functionality of ServiceLoader.
 */
class ToolProvider extends Object {
}

object ToolProvider {
    /** Gets the Java™ programming language documentation tool provided
     *  with this platform.
     */
    @stub
    def getSystemDocumentationTool(): DocumentationTool = ???

    /** Gets the Java™ programming language compiler provided
     *  with this platform.
     */
    @stub
    def getSystemJavaCompiler(): JavaCompiler = ???
}
