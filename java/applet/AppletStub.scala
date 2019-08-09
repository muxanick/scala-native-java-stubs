package java.applet

import java.lang.String
import java.net.URL

// When an applet is first created, an applet stub is attached to it
// using the applet's setStub method. This stub
// serves as the interface between the applet and the browser
// environment or applet viewer environment in which the application
// is running.
trait AppletStub {

    @stub
    // Called when the applet wants to be resized.
    def appletResize(width: Int, height: Int): Unit = ???

    @stub
    // Returns the applet's context.
    def getAppletContext(): AppletContext = ???

    @stub
    // Gets the base URL.
    def getCodeBase(): URL = ???

    @stub
    // Gets the URL of the document in which the applet is embedded.
    def getDocumentBase(): URL = ???

    @stub
    // Returns the value of the named parameter in the HTML tag.
    def getParameter(name: String): String = ???
}
