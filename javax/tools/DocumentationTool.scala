package javax.tools

import java.io.Writer
import java.lang.{Class, Iterable, String}
import java.nio.charset.Charset
import java.util.Locale
import scala.scalanative.annotation.stub

/** Interface to invoke Java™ programming language documentation tools from
 *  programs.
 */
trait DocumentationTool extends Tool with OptionChecker {

    /** Gets a new instance of the standard file manager implementation
     *  for this tool.
     */
    @stub
    def getStandardFileManager(diagnosticListener: DiagnosticListener[_ >: JavaFileObject], locale: Locale, charset: Charset): StandardJavaFileManager = ???

    /** Creates a future for a documentation task with the given
     *  components and arguments.
     */
    @stub
    def getTask(out: Writer, fileManager: JavaFileManager, diagnosticListener: DiagnosticListener[_ >: JavaFileObject], docletClass: Class[_], options: Iterable[String], compilationUnits: Iterable[_ <: JavaFileObject]): DocumentationTool.DocumentationTask = ???
}

object DocumentationTool {
    /** Interface representing a future for a documentation task. */
    type DocumentationTask = DocumentationTool_DocumentationTask

    /** Locations specific to DocumentationTool. */
    type Location = DocumentationTool_Location
}
