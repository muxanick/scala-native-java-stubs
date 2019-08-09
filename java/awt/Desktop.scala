package java.awt

import java.io.File
import java.lang.Object
import java.net.URI

// The Desktop class allows a Java application to launch
// associated applications registered on the native desktop to handle
// a URI or a file.
//
//  Supported operations include:
// 
//   launching the user-default browser to show a specified
//       URI;
//   launching the user-default mail client with an optional
//       mailto URI;
//   launching a registered application to open, edit or print a
//       specified file.
// 
//
//  This class provides methods corresponding to these
// operations. The methods look for the associated application
// registered on the current platform, and launch it to handle a URI
// or file. If there is no associated application or the associated
// application fails to be launched, an exception is thrown.
//
//  An application is registered to a URI or file type; for
// example, the "sxi" file extension is typically registered
// to StarOffice.  The mechanism of registering, accessing, and
// launching the associated application is platform-dependent.
//
//  Each operation is an action type represented by the Desktop.Action class.
//
//  Note: when some action is invoked and the associated
// application is executed, it will be executed on the same system as
// the one on which the Java application was launched.
class Desktop extends Object {

    @stub
    // Launches the default browser to display a URI.
    def browse(uri: URI): Unit = ???

    @stub
    // Launches the associated editor application and opens a file for
    // editing.
    def edit(file: File): Unit = ???

    @stub
    // Tests whether an action is supported on the current platform.
    def isSupported(action: Desktop.Action): Boolean = ???

    @stub
    // Launches the mail composing window of the user default mail
    // client.
    def mail(): Unit = ???

    @stub
    // Launches the mail composing window of the user default mail
    // client, filling the message fields specified by a mailto: URI.
    def mail(mailtoURI: URI): Unit = ???

    @stub
    // Launches the associated application to open the file.
    def open(file: File): Unit = ???
}

object Desktop {
    @stub
    // Returns the Desktop instance of the current
    // browser context.
    def getDesktop(): Desktop = ???

    @stub
    // Tests whether this class is supported on the current platform.
    def isDesktopSupported(): Boolean = ???
}
