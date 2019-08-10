package javax.tools

import java.io.Writer
import java.lang.{Boolean, Iterable, String}
import java.nio.charset.Charset
import java.util.Locale
import java.util.concurrent.Callable
import javax.annotation.processing.Processor
import scala.scalanative.annotation.stub

/** Interface to invoke Java™ programming language compilers from
 *  programs.
 * 
 *  The compiler might generate diagnostics during compilation (for
 *  example, error messages).  If a diagnostic listener is provided,
 *  the diagnostics will be supplied to the listener.  If no listener
 *  is provided, the diagnostics will be formatted in an unspecified
 *  format and written to the default output, which is System.err unless otherwise specified.  Even if a diagnostic
 *  listener is supplied, some diagnostics might not fit in a Diagnostic and will be written to the default output.
 * 
 *  A compiler tool has an associated standard file manager, which
 *  is the file manager that is native to the tool (or built-in).  The
 *  standard file manager can be obtained by calling getStandardFileManager.
 * 
 *  A compiler tool must function with any file manager as long as
 *  any additional requirements as detailed in the methods below are
 *  met.  If no file manager is provided, the compiler tool will use a
 *  standard file manager such as the one returned by getStandardFileManager.
 * 
 *  An instance implementing this interface must conform to
 *  The Java™ Language Specification
 *  and generate class files conforming to
 *  The Java™ Virtual Machine Specification.
 *  The versions of these
 *  specifications are defined in the Tool interface.
 * 
 *  Additionally, an instance of this interface supporting SourceVersion.RELEASE_6
 *  or higher must also support annotation processing.
 * 
 *  The compiler relies on two services: diagnostic listener and file manager.  Although most classes and
 *  interfaces in this package defines an API for compilers (and
 *  tools in general) the interfaces DiagnosticListener,
 *  JavaFileManager, FileObject, and
 *  JavaFileObject are not intended to be used in
 *  applications.  Instead these interfaces are intended to be
 *  implemented and used to provide customized services for a
 *  compiler and thus defines an SPI for compilers.
 * 
 *  There are a number of classes and interfaces in this package
 *  which are designed to ease the implementation of the SPI to
 *  customize the behavior of a compiler:
 * 
 *  
 *    StandardJavaFileManager
 *    
 * 
 *      Every compiler which implements this interface provides a
 *      standard file manager for operating on regular files.  The StandardJavaFileManager interface
 *      defines additional methods for creating file objects from
 *      regular files.
 * 
 *      The standard file manager serves two purposes:
 * 
 *      
 *        basic building block for customizing how a compiler reads
 *        and writes files
 *        sharing between multiple compilation tasks
 *      
 * 
 *      Reusing a file manager can potentially reduce overhead of
 *      scanning the file system and reading jar files.  Although there
 *      might be no reduction in overhead, a standard file manager must
 *      work with multiple sequential compilations making the following
 *      example a recommended coding pattern:
 * 
 *      
 *        File[] files1 = ... ; // input for first compilation task
 *        File[] files2 = ... ; // input for second compilation task
 * 
 *        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
 *        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
 * 
 *         Iterable<? extends JavaFileObject> compilationUnits1 =
 *            fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files1));
 *        compiler.getTask(null, fileManager, null, null, null, compilationUnits1).call();
 * 
 *         Iterable<? extends JavaFileObject> compilationUnits2 =
 *            fileManager.getJavaFileObjects(files2); // use alternative method
 *        // reuse the same file manager to allow caching of jar files
 *        compiler.getTask(null, fileManager, null, null, null, compilationUnits2).call();
 * 
 *        fileManager.close();
 * 
 *    
 * 
 *    DiagnosticCollector
 *    
 *      Used to collect diagnostics in a list, for example:
 *      
 *         Iterable<? extends JavaFileObject> compilationUnits = ...;
 *        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
 *         DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
 *        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
 *        compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits).call();
 * 
 *        for ( Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics())
 *            System.out.format("Error on line %d in %s%n",
 *                              diagnostic.getLineNumber(),
 *                              diagnostic.getSource().toUri());
 * 
 *        fileManager.close();
 *    
 * 
 *    
 *      ForwardingJavaFileManager, ForwardingFileObject, and
 *      ForwardingJavaFileObject
 *    
 *    
 * 
 *      Subclassing is not available for overriding the behavior of a
 *      standard file manager as it is created by calling a method on a
 *      compiler, not by invoking a constructor.  Instead forwarding
 *      (or delegation) should be used.  These classes makes it easy to
 *      forward most calls to a given file manager or file object while
 *      allowing customizing behavior.  For example, consider how to
 *      log all calls to JavaFileManager.flush():
 * 
 *      
 *        final Logger logger = ...;
 *         Iterable<? extends JavaFileObject> compilationUnits = ...;
 *        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
 *        StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(null, null, null);
 *        JavaFileManager fileManager = new ForwardingJavaFileManager(stdFileManager) {
 *            public void flush() throws IOException {
 *                logger.entering(StandardJavaFileManager.class.getName(), "flush");
 *                super.flush();
 *                logger.exiting(StandardJavaFileManager.class.getName(), "flush");
 *            }
 *        };
 *        compiler.getTask(null, fileManager, null, null, null, compilationUnits).call();
 *    
 * 
 *    SimpleJavaFileObject
 *    
 * 
 *      This class provides a basic file object implementation which
 *      can be used as building block for creating file objects.  For
 *      example, here is how to define a file object which represent
 *      source code stored in a string:
 * 
 *      
 *        /**
 *         * A file object used to represent source coming from a string.
 *          */
 *        public class JavaSourceFromString extends SimpleJavaFileObject {
 *            /**
 *             * The source code of this "file".
 *              */
 *            final String code;
 * 
 *            /**
 *             * Constructs a new JavaSourceFromString.
 *             *  @param name the name of the compilation unit represented by this file object
 *             *  @param code the source code for the compilation unit represented by this file object
 *              */
 *            JavaSourceFromString(String name, String code) {
 *                super(URI.create("string:///" + name.replace('.','/') + Kind.SOURCE.extension),
 *                      Kind.SOURCE);
 *                this.code = code;
 *            }
 * 
 *             @Override
 *            public CharSequence getCharContent(boolean ignoreEncodingErrors) {
 *                return code;
 *            }
 *        }
 *    
 *  
 */
trait JavaCompiler extends Tool with OptionChecker {

    /** Gets a new instance of the standard file manager implementation
     *  for this tool.
     */
    @stub
    def getStandardFileManager(diagnosticListener: DiagnosticListener[_ >: JavaFileObject], locale: Locale, charset: Charset): StandardJavaFileManager = ???

    /** Creates a future for a compilation task with the given
     *  components and arguments.
     */
    @stub
    def getTask(out: Writer, fileManager: JavaFileManager, diagnosticListener: DiagnosticListener[_ >: JavaFileObject], options: Iterable[String], classes: Iterable[String], compilationUnits: Iterable[_ <: JavaFileObject]): JavaCompiler.CompilationTask = ???
}

object JavaCompiler {
    /** Interface representing a future for a compilation task.  The
     *  compilation task has not yet started.  To start the task, call
     *  the call method.
     * 
     *  Before calling the call method, additional aspects of the
     *  task can be configured, for example, by calling the
     *  setProcessors method.
     */
    trait CompilationTask extends Callable[Boolean] {

        /** Performs this compilation task. */
        @stub
        def call(): Boolean = ???

        /** Set the locale to be applied when formatting diagnostics and
         *  other localized data.
         */
        @stub
        def setLocale(locale: Locale): Unit = ???

        /** Sets processors (for annotation processing). */
        @stub
        def setProcessors(processors: Iterable[_ <: Processor]): Unit = ???
    }

}
