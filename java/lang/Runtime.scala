package java.lang

import java.io.{File, InputStream, OutputStream}

// Every Java application has a single instance of class
// Runtime that allows the application to interface with
// the environment in which the application is running. The current
// runtime can be obtained from the getRuntime method.
// 
// An application cannot create its own instance of this class.
class Runtime extends Object {

    @stub
    // Registers a new virtual-machine shutdown hook.
    def addShutdownHook(hook: Thread): Unit = ???

    @stub
    // Returns the number of processors available to the Java virtual machine.
    def availableProcessors(): Int = ???

    @stub
    // Executes the specified string command in a separate process.
    def exec(command: String): Process = ???

    @stub
    // Executes the specified command and arguments in a separate process.
    def exec(cmdarray: Array[String]): Process = ???

    @stub
    // Executes the specified command and arguments in a separate process
    // with the specified environment.
    def exec(cmdarray: Array[String], envp: Array[String]): Process = ???

    @stub
    // Executes the specified command and arguments in a separate process with
    // the specified environment and working directory.
    def exec(cmdarray: Array[String], envp: Array[String], dir: File): Process = ???

    @stub
    // Executes the specified string command in a separate process with the
    // specified environment.
    def exec(command: String, envp: Array[String]): Process = ???

    @stub
    // Executes the specified string command in a separate process with the
    // specified environment and working directory.
    def exec(command: String, envp: Array[String], dir: File): Process = ???

    @stub
    // Terminates the currently running Java virtual machine by initiating its
    // shutdown sequence.
    def exit(status: Int): Unit = ???

    @stub
    // Returns the amount of free memory in the Java Virtual Machine.
    def freeMemory(): Long = ???

    @stub
    // Runs the garbage collector.
    def gc(): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK 1.1, the preferred way to translate a byte
    // stream in the local encoding into a character stream in Unicode is via
    // the InputStreamReader and BufferedReader
    // classes.
    //
    def getLocalizedInputStream(in: InputStream): InputStream = ???

    @stub
    // Deprecated. 
    //As of JDK 1.1, the preferred way to translate a
    // Unicode character stream into a byte stream in the local encoding is via
    // the OutputStreamWriter, BufferedWriter, and
    // PrintWriter classes.
    //
    def getLocalizedOutputStream(out: OutputStream): OutputStream = ???

    @stub
    // Forcibly terminates the currently running Java virtual machine.
    def halt(status: Int): Unit = ???

    @stub
    // Loads the native library specified by the filename argument.
    def load(filename: String): Unit = ???

    @stub
    // Loads the native library specified by the libname
    // argument.
    def loadLibrary(libname: String): Unit = ???

    @stub
    // Returns the maximum amount of memory that the Java virtual machine will
    // attempt to use.
    def maxMemory(): Long = ???

    @stub
    // De-registers a previously-registered virtual-machine shutdown hook.
    def removeShutdownHook(hook: Thread): Boolean = ???

    @stub
    // Runs the finalization methods of any objects pending finalization.
    def runFinalization(): Unit = ???

    @stub
    // Returns the total amount of memory in the Java virtual machine.
    def totalMemory(): Long = ???

    @stub
    // Enables/Disables tracing of instructions.
    def traceInstructions(on: Boolean): Unit = ???
}

object Runtime {
    @stub
    // Returns the runtime object associated with the current Java application.
    def getRuntime(): Runtime = ???

    @stub
    // Deprecated. 
    //This method is inherently unsafe.  It may result in
    //      finalizers being called on live objects while other threads are
    //      concurrently manipulating those objects, resulting in erratic
    //      behavior or deadlock.
    //
    def runFinalizersOnExit(value: Boolean): Unit = ???
}
