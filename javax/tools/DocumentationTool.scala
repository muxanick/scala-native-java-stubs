package javax.tools

import java.nio.charset.Charset
import java.util.Locale

/** Interface to invoke Java™ programming language documentation tools from
 *  programs.
 */
trait DocumentationTool extends Tool with OptionChecker {

    /** Gets a new instance of the standard file manager implementation
     *  for this tool.
     */
    @stub
    def getStandardFileManager(diagnosticListener: DiagnosticListener[_ >: JavaFileObject], locale: Locale, charset: Charset): StandardJavaFileManager = ???
}

object DocumentationTool {
    /** Interface representing a future for a documentation task. */
    @stub
    val DocumentationTool.DocumentationTask: trait = ???
}
