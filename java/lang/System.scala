package java.lang

import java.io.{Console, InputStream, PrintStream}
import java.nio.channels.Channel
import java.util.{Map, Properties}
import scala.scalanative.annotation.stub

/** The System class contains several useful class fields
 *  and methods. It cannot be instantiated.
 * 
 *  Among the facilities provided by the System class
 *  are standard input, standard output, and error output streams;
 *  access to externally defined properties and environment
 *  variables; a means of loading files and libraries; and a utility
 *  method for quickly copying a portion of an array.
 */
final class System extends Object {
}

object System {
    /** The "standard" error output stream. */
    @stub
    val err: PrintStream = ???

    /** The "standard" input stream. */
    @stub
    val in: InputStream = ???

    /** The "standard" output stream. */
    @stub
    val out: PrintStream = ???

    /** Copies an array from the specified source array, beginning at the
     *  specified position, to the specified position of the destination array.
     */
    @stub
    def arraycopy(src: Any, srcPos: Int, dest: Any, destPos: Int, length: Int): Unit = ???

    /** Removes the system property indicated by the specified key. */
    @stub
    def clearProperty(key: String): String = ???

    /** Returns the unique Console object associated
     *  with the current Java virtual machine, if any.
     */
    @stub
    def console(): Console = ???

    /** Returns the current time in milliseconds. */
    @stub
    def currentTimeMillis(): Long = ???

    /** Terminates the currently running Java Virtual Machine. */
    @stub
    def exit(status: Int): Unit = ???

    /** Runs the garbage collector. */
    @stub
    def gc(): Unit = ???

    /** Returns an unmodifiable string map view of the current system environment. */
    @stub
    def getenv(): Map[String, String] = ???

    /** Gets the value of the specified environment variable. */
    @stub
    def getenv(name: String): String = ???

    /** Determines the current system properties. */
    @stub
    def getProperties(): Properties = ???

    /** Gets the system property indicated by the specified key. */
    @stub
    def getProperty(key: String): String = ???

    /** Gets the system property indicated by the specified key. */
    @stub
    def getProperty(key: String, def: String): String = ???

    /** Gets the system security interface. */
    @stub
    def getSecurityManager(): SecurityManager = ???

    /** Returns the same hash code for the given object as
     *  would be returned by the default method hashCode(),
     *  whether or not the given object's class overrides
     *  hashCode().
     */
    @stub
    def identityHashCode(x: Any): Int = ???

    /** Returns the channel inherited from the entity that created this
     *  Java virtual machine.
     */
    @stub
    def inheritedChannel(): Channel = ???

    /** Returns the system-dependent line separator string. */
    @stub
    def lineSeparator(): String = ???

    /** Loads the native library specified by the filename argument. */
    @stub
    def load(filename: String): Unit = ???

    /** Loads the native library specified by the libname
     *  argument.
     */
    @stub
    def loadLibrary(libname: String): Unit = ???

    /** Maps a library name into a platform-specific string representing
     *  a native library.
     */
    @stub
    def mapLibraryName(libname: String): String = ???

    /** Returns the current value of the running Java Virtual Machine's
     *  high-resolution time source, in nanoseconds.
     */
    @stub
    def nanoTime(): Long = ???

    /** Runs the finalization methods of any objects pending finalization. */
    @stub
    def runFinalization(): Unit = ???

    /** Deprecated. 
     * This method is inherently unsafe.  It may result in
     *       finalizers being called on live objects while other threads are
     *       concurrently manipulating those objects, resulting in erratic
     *       behavior or deadlock.
     * 
     */
    @stub
    def runFinalizersOnExit(value: Boolean): Unit = ???

    /** Reassigns the "standard" error output stream. */
    @stub
    def setErr(err: PrintStream): Unit = ???

    /** Reassigns the "standard" input stream. */
    @stub
    def setIn(in: InputStream): Unit = ???

    /** Reassigns the "standard" output stream. */
    @stub
    def setOut(out: PrintStream): Unit = ???

    /** Sets the system properties to the Properties
     *  argument.
     */
    @stub
    def setProperties(props: Properties): Unit = ???

    /** Sets the system property indicated by the specified key. */
    @stub
    def setProperty(key: String, value: String): String = ???

    /** Sets the System security. */
    @stub
    def setSecurityManager(s: SecurityManager): Unit = ???
}
