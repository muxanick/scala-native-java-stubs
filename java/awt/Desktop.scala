package java.awt

import java.io.File
import java.lang.{Enum, Object, String}
import java.net.URI
import scala.scalanative.annotation.stub

/** The Desktop class allows a Java application to launch
 *  associated applications registered on the native desktop to handle
 *  a URI or a file.
 * 
 *   Supported operations include:
 *  
 *    launching the user-default browser to show a specified
 *        URI;
 *    launching the user-default mail client with an optional
 *        mailto URI;
 *    launching a registered application to open, edit or print a
 *        specified file.
 *  
 * 
 *   This class provides methods corresponding to these
 *  operations. The methods look for the associated application
 *  registered on the current platform, and launch it to handle a URI
 *  or file. If there is no associated application or the associated
 *  application fails to be launched, an exception is thrown.
 * 
 *   An application is registered to a URI or file type; for
 *  example, the "sxi" file extension is typically registered
 *  to StarOffice.  The mechanism of registering, accessing, and
 *  launching the associated application is platform-dependent.
 * 
 *   Each operation is an action type represented by the Desktop.Action class.
 * 
 *   Note: when some action is invoked and the associated
 *  application is executed, it will be executed on the same system as
 *  the one on which the Java application was launched.
 */
class Desktop extends Object {

    /** Launches the default browser to display a URI. */
    @stub
    def browse(uri: URI): Unit = ???

    /** Launches the associated editor application and opens a file for
     *  editing.
     */
    @stub
    def edit(file: File): Unit = ???

    /** Tests whether an action is supported on the current platform. */
    @stub
    def isSupported(action: Desktop.Action): Boolean = ???

    /** Launches the mail composing window of the user default mail
     *  client.
     */
    @stub
    def mail(): Unit = ???

    /** Launches the mail composing window of the user default mail
     *  client, filling the message fields specified by a mailto: URI.
     */
    @stub
    def mail(mailtoURI: URI): Unit = ???

    /** Launches the associated application to open the file. */
    @stub
    def open(file: File): Unit = ???

    /** Prints a file with the native desktop printing facility, using
     *  the associated application's print command.
     */
    @stub
    def print(file: File): Unit = ???
}

object Desktop {
    /** Represents an action type.  Each platform supports a different
     *  set of actions.  You may use the Desktop.isSupported(java.awt.Desktop.Action)
     *  method to determine if the given action is supported by the
     *  current platform.
     */
    class Action private (name: String, ordinal: Int) extends Enum[Action](name, ordinal) {
    }

    object Action {
        /** Represents a "browse" action. */
        final val BROWSE: Action = new Action("BROWSE", 0)

        /** Represents an "edit" action. */
        final val EDIT: Action = new Action("EDIT", 1)

        /** Represents a "mail" action. */
        final val MAIL: Action = new Action("MAIL", 2)

        /** Represents an "open" action. */
        final val OPEN: Action = new Action("OPEN", 3)

        /** Represents a "print" action. */
        final val PRINT: Action = new Action("PRINT", 4)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): Action = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[Action] = ???
    }


    /** Returns the Desktop instance of the current
     *  browser context.
     */
    @stub
    def getDesktop(): Desktop = ???

    /** Tests whether this class is supported on the current platform. */
    @stub
    def isDesktopSupported(): Boolean = ???
}
