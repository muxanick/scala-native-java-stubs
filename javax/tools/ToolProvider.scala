package javax.tools

import java.lang.Object

// Provides methods for locating tool providers, for example,
// providers of compilers.  This class complements the
// functionality of ServiceLoader.
class ToolProvider extends Object {
}

object ToolProvider {
    @stub
    // Gets the Java™ programming language documentation tool provided
    // with this platform.
    def getSystemDocumentationTool(): DocumentationTool = ???

    @stub
    // Gets the Java™ programming language compiler provided
    // with this platform.
    def getSystemJavaCompiler(): JavaCompiler = ???
}
