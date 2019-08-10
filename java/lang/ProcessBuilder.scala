package java.lang

import java.io.File
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** This class is used to create operating system processes.
 * 
 *  Each ProcessBuilder instance manages a collection
 *  of process attributes.  The start() method creates a new
 *  Process instance with those attributes.  The start() method can be invoked repeatedly from the same instance
 *  to create new subprocesses with identical or related attributes.
 * 
 *  Each process builder manages these process attributes:
 * 
 *  
 * 
 *  a command, a list of strings which signifies the
 *  external program file to be invoked and its arguments, if any.
 *  Which string lists represent a valid operating system command is
 *  system-dependent.  For example, it is common for each conceptual
 *  argument to be an element in this list, but there are operating
 *  systems where programs are expected to tokenize command line
 *  strings themselves - on such a system a Java implementation might
 *  require commands to contain exactly two elements.
 * 
 *  an environment, which is a system-dependent mapping from
 *  variables to values.  The initial value is a copy of
 *  the environment of the current process (see System.getenv()).
 * 
 *  a working directory.  The default value is the current
 *  working directory of the current process, usually the directory
 *  named by the system property user.dir.
 * 
 *  a source of standard input.
 *  By default, the subprocess reads input from a pipe.  Java code
 *  can access this pipe via the output stream returned by
 *  Process.getOutputStream().  However, standard input may
 *  be redirected to another source using
 *  redirectInput.
 *  In this case, Process.getOutputStream() will return a
 *  null output stream, for which:
 * 
 *  
 *  the write methods always
 *  throw IOException
 *  the close method does nothing
 *  
 * 
 *  a destination for standard output
 *  and standard error.  By default, the subprocess writes standard
 *  output and standard error to pipes.  Java code can access these pipes
 *  via the input streams returned by Process.getInputStream() and
 *  Process.getErrorStream().  However, standard output and
 *  standard error may be redirected to other destinations using
 *  redirectOutput and
 *  redirectError.
 *  In this case, Process.getInputStream() and/or
 *  Process.getErrorStream() will return a null input
 *  stream, for which:
 * 
 *  
 *  the read methods always return
 *  -1
 *  the available method always returns
 *  0
 *  the close method does nothing
 *  
 * 
 *  a redirectErrorStream property.  Initially, this property
 *  is false, meaning that the standard output and error
 *  output of a subprocess are sent to two separate streams, which can
 *  be accessed using the Process.getInputStream() and Process.getErrorStream() methods.
 * 
 *  If the value is set to true, then:
 * 
 *  
 *  standard error is merged with the standard output and always sent
 *  to the same destination (this makes it easier to correlate error
 *  messages with the corresponding output)
 *  the common destination of standard error and standard output can be
 *  redirected using
 *  redirectOutput
 *  any redirection set by the
 *  redirectError
 *  method is ignored when creating a subprocess
 *  the stream returned from Process.getErrorStream() will
 *  always be a null input stream
 *  
 * 
 *  
 * 
 *  Modifying a process builder's attributes will affect processes
 *  subsequently started by that object's start() method, but
 *  will never affect previously started processes or the Java process
 *  itself.
 * 
 *  Most error checking is performed by the start() method.
 *  It is possible to modify the state of an object so that start() will fail.  For example, setting the command attribute to
 *  an empty list will not throw an exception unless start()
 *  is invoked.
 * 
 *  Note that this class is not synchronized.
 *  If multiple threads access a ProcessBuilder instance
 *  concurrently, and at least one of the threads modifies one of the
 *  attributes structurally, it must be synchronized externally.
 * 
 *  Starting a new process which uses the default working directory
 *  and environment is easy:
 * 
 *   
 *  Process p = new ProcessBuilder("myCommand", "myArg").start();
 *  
 * 
 *  Here is an example that starts a process with a modified working
 *  directory and environment, and redirects standard output and error
 *  to be appended to a log file:
 * 
 *   
 *  ProcessBuilder pb =
 *    new ProcessBuilder("myCommand", "myArg1", "myArg2");
 *  Map<String, String> env = pb.environment();
 *  env.put("VAR1", "myValue");
 *  env.remove("OTHERVAR");
 *  env.put("VAR2", env.get("VAR1") + "suffix");
 *  pb.directory(new File("myDir"));
 *  File log = new File("log");
 *  pb.redirectErrorStream(true);
 *  pb.redirectOutput(Redirect.appendTo(log));
 *  Process p = pb.start();
 *  assert pb.redirectInput() == Redirect.PIPE;
 *  assert pb.redirectOutput().file() == log;
 *  assert p.getInputStream().read() == -1;
 *  
 * 
 *  To start a process with an explicit set of environment
 *  variables, first call Map.clear()
 *  before adding environment variables.
 */
final class ProcessBuilder extends Object {

    /** Constructs a process builder with the specified operating
     *  system program and arguments.
     */
    @stub
    def this(command: List[String]) = ???

    /** Constructs a process builder with the specified operating
     *  system program and arguments.
     */
    @stub
    def this(command: String*) = ???

    /** Returns this process builder's operating system program and
     *  arguments.
     */
    @stub
    def command(): List[String] = ???

    /** Sets this process builder's operating system program and
     *  arguments.
     */
    @stub
    def command(command: List[String]): ProcessBuilder = ???

    /** Sets this process builder's operating system program and
     *  arguments.
     */
    @stub
    def command(command: String*): ProcessBuilder = ???

    /** Returns this process builder's working directory. */
    @stub
    def directory(): File = ???

    /** Sets this process builder's working directory. */
    @stub
    def directory(directory: File): ProcessBuilder = ???

    /** Returns a string map view of this process builder's environment. */
    @stub
    def environment(): Map[String, String] = ???

    /** Sets the source and destination for subprocess standard I/O
     *  to be the same as those of the current Java process.
     */
    @stub
    def inheritIO(): ProcessBuilder = ???

    /** Returns this process builder's standard error destination. */
    @stub
    def redirectError(): ProcessBuilder.Redirect = ???

    /** Sets this process builder's standard error destination to a file. */
    @stub
    def redirectError(file: File): ProcessBuilder = ???

    /** Sets this process builder's standard error destination. */
    @stub
    def redirectError(destination: ProcessBuilder.Redirect): ProcessBuilder = ???

    /** Tells whether this process builder merges standard error and
     *  standard output.
     */
    @stub
    def redirectErrorStream(): Boolean = ???

    /** Sets this process builder's redirectErrorStream property. */
    @stub
    def redirectErrorStream(redirectErrorStream: Boolean): ProcessBuilder = ???

    /** Returns this process builder's standard input source. */
    @stub
    def redirectInput(): ProcessBuilder.Redirect = ???

    /** Sets this process builder's standard input source to a file. */
    @stub
    def redirectInput(file: File): ProcessBuilder = ???

    /** Sets this process builder's standard input source. */
    @stub
    def redirectInput(source: ProcessBuilder.Redirect): ProcessBuilder = ???

    /** Returns this process builder's standard output destination. */
    @stub
    def redirectOutput(): ProcessBuilder.Redirect = ???

    /** Sets this process builder's standard output destination to a file. */
    @stub
    def redirectOutput(file: File): ProcessBuilder = ???

    /** Sets this process builder's standard output destination. */
    @stub
    def redirectOutput(destination: ProcessBuilder.Redirect): ProcessBuilder = ???

    /** Starts a new process using the attributes of this process builder. */
    @stub
    def start(): Process = ???
}

object ProcessBuilder {
    /** Represents a source of subprocess input or a destination of
     *  subprocess output.
     * 
     *  Each Redirect instance is one of the following:
     * 
     *  
     *  the special value Redirect.PIPE
     *  the special value Redirect.INHERIT
     *  a redirection to read from a file, created by an invocation of
     *      Redirect.from(File)
     *  a redirection to write to a file,  created by an invocation of
     *      Redirect.to(File)
     *  a redirection to append to a file, created by an invocation of
     *      Redirect.appendTo(File)
     *  
     * 
     *  Each of the above categories has an associated unique
     *  Type.
     */
    abstract object Redirect extends Object {

        /** The type of a ProcessBuilder.Redirect. */
        class Type private (name: String, ordinal: Int) extends Enum[Type](name, ordinal) {
        }

        object Type {
            /** The type of redirects returned from
             *  Redirect.appendTo(File).
             */
            final val APPEND: Type = new Type("APPEND", 0)

            /** The type of Redirect.INHERIT. */
            final val INHERIT: Type = new Type("INHERIT", 1)

            /** The type of Redirect.PIPE. */
            final val PIPE: Type = new Type("PIPE", 2)

            /** The type of redirects returned from
             *  Redirect.from(File).
             */
            final val READ: Type = new Type("READ", 3)

            /** The type of redirects returned from
             *  Redirect.to(File).
             */
            final val WRITE: Type = new Type("WRITE", 4)

            /** Returns the enum constant of this type with the specified name. */
            @stub
            def valueOf(name: String): Type = ???

            /** Returns an array containing the constants of this enum type, in
             * the order they are declared.
             */
            @stub
            def values(): Array[Type] = ???
        }


        /** Indicates that subprocess I/O source or destination will be the
         *  same as those of the current process.
         */
        @stub
        val INHERIT: Redirect = ???

        /** Indicates that subprocess I/O will be connected to the
         *  current Java process over a pipe.
         */
        @stub
        val PIPE: Redirect = ???

        /** Returns a redirect to append to the specified file. */
        @stub
        def appendTo(file: File): Redirect = ???

        /** Compares the specified object with this Redirect for
         *  equality.
         */
        @stub
        def equals(obj: Any): Boolean = ???

        /** Returns the File source or destination associated
         *  with this redirect, or null if there is no such file.
         */
        @stub
        def file(): File = ???

        /** Returns a redirect to read from the specified file. */
        @stub
        def from(file: File): Redirect = ???

        /** Returns a hash code value for this Redirect. */
        @stub
        def hashCode(): Int = ???

        /** Returns a redirect to write to the specified file. */
        @stub
        def to(file: File): Redirect = ???

        /** Returns the type of this Redirect. */
        def type(): Redirect.Type
    }

}
