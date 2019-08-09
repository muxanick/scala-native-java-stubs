package javax.script

import java.lang.{Exception, Object, String, Throwable}

// The generic Exception class for the Scripting APIs.  Checked
// exception types thrown by underlying scripting implementations must be wrapped in instances of
// ScriptException.  The class has members to store line and column numbers and
// filenames if this information is available.
class ScriptException extends Exception {

    @stub
    // Creates a ScriptException wrapping an Exception thrown by an underlying
    // interpreter.
    def this(e: Exception) = ???

    @stub
    // Creates a ScriptException with a String to be used in its message.
    def this(s: String) = ???

    @stub
    // Creates a ScriptException with message, filename and linenumber to
    // be used in error messages.
    def this(message: String, fileName: String, lineNumber: Int) = ???

    @stub
    // Get the column number on which an error occurred.
    def getColumnNumber(): Int = ???

    @stub
    // Get the source of the script causing the error.
    def getFileName(): String = ???

    @stub
    // Get the line number on which an error occurred.
    def getLineNumber(): Int = ???
}
