package javax.tools

import java.io.Writer
import java.lang.{Boolean, Class, Enum, Iterable, Object, String}
import java.nio.charset.Charset
import java.util.Locale
import java.util.concurrent.Callable
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
    /** Interface representing a future for a documentation task.  The
     *  task has not yet started.  To start the task, call
     *  the call method.
     * 
     *  Before calling the call method, additional aspects of the
     *  task can be configured, for example, by calling the
     *  setLocale method.
     */
    trait DocumentationTask extends Callable[Boolean] {

        /** Performs this documentation task. */
        @stub
        def call(): Boolean = ???

        /** Set the locale to be applied when formatting diagnostics and
         *  other localized data.
         */
        @stub
        def setLocale(locale: Locale): Unit = ???
    }


    /** Locations specific to DocumentationTool. */
    class Location private (name: String, ordinal: Int) extends Enum[Location](name, ordinal) with JavaFileManager.Location {
    }

    object Location {
        /** Location to search for doclets. */
        final val DOCLET_PATH: Location = new Location("DOCLET_PATH", 0)

        /** Location of new documentation files. */
        final val DOCUMENTATION_OUTPUT: Location = new Location("DOCUMENTATION_OUTPUT", 1)

        /** Location to search for taglets. */
        final val TAGLET_PATH: Location = new Location("TAGLET_PATH", 2)

        /** Gets the name of this location. */
        @stub
        def getName(): String = ???

        /** Determines if this is an output location. */
        @stub
        def isOutputLocation(): Boolean = ???

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Location = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Location] = ???
    }

}
