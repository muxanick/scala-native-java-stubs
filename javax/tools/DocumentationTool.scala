package javax.tools

import java.nio.charset.Charset
import java.util.Locale

// Interface to invoke Java™ programming language documentation tools from
// programs.
trait DocumentationTool extends Tool , OptionChecker {

    @stub
    // Gets a new instance of the standard file manager implementation
    // for this tool.
    def getStandardFileManager(diagnosticListener: DiagnosticListener[_ >: JavaFileObject], locale: Locale, charset: Charset): StandardJavaFileManager = ???
}

object DocumentationTool {
    @stub
    // Interface representing a future for a documentation task.
    def DocumentationTool.DocumentationTask: trait = ???
}
