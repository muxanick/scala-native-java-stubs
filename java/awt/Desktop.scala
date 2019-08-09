package java.awt

import java.io.File
import java.lang.Object
import java.net.URI

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
}

object Desktop {
    /** Returns the Desktop instance of the current
     *  browser context.
     */
    @stub
    def getDesktop(): Desktop = ???

    /** Tests whether this class is supported on the current platform. */
    @stub
    def isDesktopSupported(): Boolean = ???
}
