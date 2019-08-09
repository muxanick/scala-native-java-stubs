package java.lang

import java.io.{InputStream, OutputStream}

// The ProcessBuilder.start() and
// Runtime.exec
// methods create a native process and return an instance of a
// subclass of Process that can be used to control the process
// and obtain information about it.  The class Process
// provides methods for performing input from the process, performing
// output to the process, waiting for the process to complete,
// checking the exit status of the process, and destroying (killing)
// the process.
//
// The methods that create processes may not work well for special
// processes on certain native platforms, such as native windowing
// processes, daemon processes, Win16/DOS processes on Microsoft
// Windows, or shell scripts.
//
// By default, the created subprocess does not have its own terminal
// or console.  All its standard I/O (i.e. stdin, stdout, stderr)
// operations will be redirected to the parent process, where they can
// be accessed via the streams obtained using the methods
// getOutputStream(),
// getInputStream(), and
// getErrorStream().
// The parent process uses these streams to feed input to and get output
// from the subprocess.  Because some native platforms only provide
// limited buffer size for standard input and output streams, failure
// to promptly write the input stream or read the output stream of
// the subprocess may cause the subprocess to block, or even deadlock.
//
// Where desired, 
// subprocess I/O can also be redirected
// using methods of the ProcessBuilder class.
//
// The subprocess is not killed when there are no more references to
// the Process object, but rather the subprocess
// continues executing asynchronously.
//
// There is no requirement that a process represented by a Process object execute asynchronously or concurrently with respect
// to the Java process that owns the Process object.
//
// As of 1.5, ProcessBuilder.start() is the preferred way
// to create a Process.
abstract class Process extends Object {

    // Kills the subprocess.
    def destroy(): Unit

    // Kills the subprocess.
    def destroyForcibly(): Process

    // Returns the exit value for the subprocess.
    def exitValue(): Int

    // Returns the input stream connected to the error output of the
    // subprocess.
    def getErrorStream(): InputStream

    // Returns the input stream connected to the normal output of the
    // subprocess.
    def getInputStream(): InputStream

    // Returns the output stream connected to the normal input of the
    // subprocess.
    def getOutputStream(): OutputStream

    // Tests whether the subprocess represented by this Process is
    // alive.
    def isAlive(): Boolean

    // Causes the current thread to wait, if necessary, until the
    // process represented by this Process object has
    // terminated.
    def waitFor(): Int
}
