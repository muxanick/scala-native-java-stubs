package java.lang

import java.io.{Console, InputStream, PrintStream}
import java.nio.channels.Channel
import java.util.{Map, Properties}

// The System class contains several useful class fields
// and methods. It cannot be instantiated.
//
// Among the facilities provided by the System class
// are standard input, standard output, and error output streams;
// access to externally defined properties and environment
// variables; a means of loading files and libraries; and a utility
// method for quickly copying a portion of an array.
final class System extends Object {
}

object System {
    @stub
    // The "standard" error output stream.
    def err: PrintStream = ???

    @stub
    // The "standard" input stream.
    def in: InputStream = ???

    @stub
    // Copies an array from the specified source array, beginning at the
    // specified position, to the specified position of the destination array.
    def arraycopy(src: Object, srcPos: Int, dest: Object, destPos: Int, length: Int): Unit = ???

    @stub
    // Removes the system property indicated by the specified key.
    def clearProperty(key: String): String = ???

    @stub
    // Returns the unique Console object associated
    // with the current Java virtual machine, if any.
    def console(): Console = ???

    @stub
    // Returns the current time in milliseconds.
    def currentTimeMillis(): Long = ???

    @stub
    // Terminates the currently running Java Virtual Machine.
    def exit(status: Int): Unit = ???

    @stub
    // Runs the garbage collector.
    def gc(): Unit = ???

    @stub
    // Returns an unmodifiable string map view of the current system environment.
    def getenv(): Map[String, String] = ???

    @stub
    // Gets the value of the specified environment variable.
    def getenv(name: String): String = ???

    @stub
    // Determines the current system properties.
    def getProperties(): Properties = ???

    @stub
    // Gets the system property indicated by the specified key.
    def getProperty(key: String): String = ???

    @stub
    // Gets the system property indicated by the specified key.
    def getProperty(key: String, def: String): String = ???

    @stub
    // Gets the system security interface.
    def getSecurityManager(): SecurityManager = ???

    @stub
    // Returns the same hash code for the given object as
    // would be returned by the default method hashCode(),
    // whether or not the given object's class overrides
    // hashCode().
    def identityHashCode(x: Object): Int = ???

    @stub
    // Returns the channel inherited from the entity that created this
    // Java virtual machine.
    def inheritedChannel(): Channel = ???

    @stub
    // Returns the system-dependent line separator string.
    def lineSeparator(): String = ???

    @stub
    // Loads the native library specified by the filename argument.
    def load(filename: String): Unit = ???

    @stub
    // Loads the native library specified by the libname
    // argument.
    def loadLibrary(libname: String): Unit = ???

    @stub
    // Maps a library name into a platform-specific string representing
    // a native library.
    def mapLibraryName(libname: String): String = ???

    @stub
    // Returns the current value of the running Java Virtual Machine's
    // high-resolution time source, in nanoseconds.
    def nanoTime(): Long = ???

    @stub
    // Runs the finalization methods of any objects pending finalization.
    def runFinalization(): Unit = ???

    @stub
    // Deprecated. 
    //This method is inherently unsafe.  It may result in
    //      finalizers being called on live objects while other threads are
    //      concurrently manipulating those objects, resulting in erratic
    //      behavior or deadlock.
    //
    def runFinalizersOnExit(value: Boolean): Unit = ???

    @stub
    // Reassigns the "standard" error output stream.
    def setErr(err: PrintStream): Unit = ???

    @stub
    // Reassigns the "standard" input stream.
    def setIn(in: InputStream): Unit = ???

    @stub
    // Reassigns the "standard" output stream.
    def setOut(out: PrintStream): Unit = ???

    @stub
    // Sets the system properties to the Properties
    // argument.
    def setProperties(props: Properties): Unit = ???

    @stub
    // Sets the system property indicated by the specified key.
    def setProperty(key: String, value: String): String = ???
}
