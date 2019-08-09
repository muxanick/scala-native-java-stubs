package java.applet

import java.lang.String
import java.net.URL

/** When an applet is first created, an applet stub is attached to it
 *  using the applet's setStub method. This stub
 *  serves as the interface between the applet and the browser
 *  environment or applet viewer environment in which the application
 *  is running.
 */
trait AppletStub {

    /** Called when the applet wants to be resized. */
    @stub
    def appletResize(width: Int, height: Int): Unit = ???

    /** Returns the applet's context. */
    @stub
    def getAppletContext(): AppletContext = ???

    /** Gets the base URL. */
    @stub
    def getCodeBase(): URL = ???

    /** Gets the URL of the document in which the applet is embedded. */
    @stub
    def getDocumentBase(): URL = ???

    /** Returns the value of the named parameter in the HTML tag. */
    @stub
    def getParameter(name: String): String = ???
}
