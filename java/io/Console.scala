package java.io

import java.lang.{Object, String}

// Methods to access the character-based console device, if any, associated
// with the current Java virtual machine.
//
//  Whether a virtual machine has a console is dependent upon the
// underlying platform and also upon the manner in which the virtual
// machine is invoked.  If the virtual machine is started from an
// interactive command line without redirecting the standard input and
// output streams then its console will exist and will typically be
// connected to the keyboard and display from which the virtual machine
// was launched.  If the virtual machine is started automatically, for
// example by a background job scheduler, then it will typically not
// have a console.
// 
// If this virtual machine has a console then it is represented by a
// unique instance of this class which can be obtained by invoking the
// System.console() method.  If no console device is
// available then an invocation of that method will return null.
// 
// Read and write operations are synchronized to guarantee the atomic
// completion of critical operations; therefore invoking methods
// readLine(), readPassword(), format(),
// printf() as well as the read, format and write operations
// on the objects returned by reader() and writer() may
// block in multithreaded scenarios.
// 
// Invoking close() on the objects returned by the reader()
// and the writer() will not close the underlying stream of those
// objects.
// 
// The console-read methods return null when the end of the
// console input stream is reached, for example by typing control-D on
// Unix or control-Z on Windows.  Subsequent read operations will succeed
// if additional characters are later entered on the console's input
// device.
// 
// Unless otherwise specified, passing a null argument to any method
// in this class will cause a NullPointerException to be thrown.
// 
// Security note:
// If an application needs to read a password or other secure data, it should
// use readPassword() or readPassword(String, Object...) and
// manually zero the returned character array after processing to minimize the
// lifetime of sensitive data in memory.
//
// 
// Console cons;
// char[] passwd;
// if ((cons = System.console()) != null &&
//     (passwd = cons.readPassword("[%s]", "Password:")) != null) {
//     ...
//     java.util.Arrays.fill(passwd, ' ');
// }
// 
final class Console extends Object with Flushable {

    @stub
    // Flushes the console and forces any buffered output to be written
    // immediately .
    def flush(): Unit = ???

    @stub
    // Writes a formatted string to this console's output stream using
    // the specified format string and arguments.
    def format(fmt: String, args: Object*): Console = ???

    @stub
    // A convenience method to write a formatted string to this console's
    // output stream using the specified format string and arguments.
    def printf(format: String, args: Object*): Console = ???

    @stub
    // Retrieves the unique Reader object associated
    // with this console.
    def reader(): Reader = ???

    @stub
    // Reads a single line of text from the console.
    def readLine(): String = ???

    @stub
    // Provides a formatted prompt, then reads a single line of text from the
    // console.
    def readLine(fmt: String, args: Object*): String = ???

    @stub
    // Reads a password or passphrase from the console with echoing disabled
    def readPassword(): Array[Char] = ???

    @stub
    // Provides a formatted prompt, then reads a password or passphrase from
    // the console with echoing disabled.
    def readPassword(fmt: String, args: Object*): Array[Char] = ???
}
