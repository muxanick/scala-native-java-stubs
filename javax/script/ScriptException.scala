package javax.script

import java.lang.{Exception, Object, String, Throwable}

/** The generic Exception class for the Scripting APIs.  Checked
 *  exception types thrown by underlying scripting implementations must be wrapped in instances of
 *  ScriptException.  The class has members to store line and column numbers and
 *  filenames if this information is available.
 */
class ScriptException extends Exception {

    /** Creates a ScriptException wrapping an Exception thrown by an underlying
     *  interpreter.
     */
    @stub
    def this(e: Exception) = ???

    /** Creates a ScriptException with a String to be used in its message. */
    @stub
    def this(s: String) = ???

    /** Creates a ScriptException with message, filename and linenumber to
     *  be used in error messages.
     */
    @stub
    def this(message: String, fileName: String, lineNumber: Int) = ???

    /** Get the column number on which an error occurred. */
    @stub
    def getColumnNumber(): Int = ???

    /** Get the source of the script causing the error. */
    @stub
    def getFileName(): String = ???

    /** Get the line number on which an error occurred. */
    @stub
    def getLineNumber(): Int = ???
}
