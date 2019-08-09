package java.lang

import java.io.{File, InputStream, OutputStream}
import scala.scalanative.annotation.stub

/** Every Java application has a single instance of class
 *  Runtime that allows the application to interface with
 *  the environment in which the application is running. The current
 *  runtime can be obtained from the getRuntime method.
 *  
 *  An application cannot create its own instance of this class.
 */
class Runtime extends Object {

    /** Registers a new virtual-machine shutdown hook. */
    @stub
    def addShutdownHook(hook: Thread): Unit = ???

    /** Returns the number of processors available to the Java virtual machine. */
    @stub
    def availableProcessors(): Int = ???

    /** Executes the specified string command in a separate process. */
    @stub
    def exec(command: String): Process = ???

    /** Executes the specified command and arguments in a separate process. */
    @stub
    def exec(cmdarray: Array[String]): Process = ???

    /** Executes the specified command and arguments in a separate process
     *  with the specified environment.
     */
    @stub
    def exec(cmdarray: Array[String], envp: Array[String]): Process = ???

    /** Executes the specified command and arguments in a separate process with
     *  the specified environment and working directory.
     */
    @stub
    def exec(cmdarray: Array[String], envp: Array[String], dir: File): Process = ???

    /** Executes the specified string command in a separate process with the
     *  specified environment.
     */
    @stub
    def exec(command: String, envp: Array[String]): Process = ???

    /** Executes the specified string command in a separate process with the
     *  specified environment and working directory.
     */
    @stub
    def exec(command: String, envp: Array[String], dir: File): Process = ???

    /** Terminates the currently running Java virtual machine by initiating its
     *  shutdown sequence.
     */
    @stub
    def exit(status: Int): Unit = ???

    /** Returns the amount of free memory in the Java Virtual Machine. */
    @stub
    def freeMemory(): Long = ???

    /** Runs the garbage collector. */
    @stub
    def gc(): Unit = ???

    /** Deprecated. 
     * As of JDK 1.1, the preferred way to translate a byte
     *  stream in the local encoding into a character stream in Unicode is via
     *  the InputStreamReader and BufferedReader
     *  classes.
     * 
     */
    @stub
    def getLocalizedInputStream(in: InputStream): InputStream = ???

    /** Deprecated. 
     * As of JDK 1.1, the preferred way to translate a
     *  Unicode character stream into a byte stream in the local encoding is via
     *  the OutputStreamWriter, BufferedWriter, and
     *  PrintWriter classes.
     * 
     */
    @stub
    def getLocalizedOutputStream(out: OutputStream): OutputStream = ???

    /** Forcibly terminates the currently running Java virtual machine. */
    @stub
    def halt(status: Int): Unit = ???

    /** Loads the native library specified by the filename argument. */
    @stub
    def load(filename: String): Unit = ???

    /** Loads the native library specified by the libname
     *  argument.
     */
    @stub
    def loadLibrary(libname: String): Unit = ???

    /** Returns the maximum amount of memory that the Java virtual machine will
     *  attempt to use.
     */
    @stub
    def maxMemory(): Long = ???

    /** De-registers a previously-registered virtual-machine shutdown hook. */
    @stub
    def removeShutdownHook(hook: Thread): Boolean = ???

    /** Runs the finalization methods of any objects pending finalization. */
    @stub
    def runFinalization(): Unit = ???

    /** Returns the total amount of memory in the Java virtual machine. */
    @stub
    def totalMemory(): Long = ???

    /** Enables/Disables tracing of instructions. */
    @stub
    def traceInstructions(on: Boolean): Unit = ???

    /** Enables/Disables tracing of method calls. */
    @stub
    def traceMethodCalls(on: Boolean): Unit = ???
}

object Runtime {
    /** Returns the runtime object associated with the current Java application. */
    @stub
    def getRuntime(): Runtime = ???

    /** Deprecated. 
     * This method is inherently unsafe.  It may result in
     *       finalizers being called on live objects while other threads are
     *       concurrently manipulating those objects, resulting in erratic
     *       behavior or deadlock.
     * 
     */
    @stub
    def runFinalizersOnExit(value: Boolean): Unit = ???
}
