package java.applet

import java.awt.Image
import java.io.InputStream
import java.lang.String
import java.net.URL
import java.util.{Enumeration, Iterator}

/** This interface corresponds to an applet's environment: the
 *  document containing the applet and the other applets in the same
 *  document.
 *  
 *  The methods in this interface can be used by an applet to obtain
 *  information about its environment.
 */
trait AppletContext {

    /** Finds and returns the applet in the document represented by this
     *  applet context with the given name.
     */
    @stub
    def getApplet(name: String): Applet = ???

    /** Finds all the applets in the document represented by this applet
     *  context.
     */
    @stub
    def getApplets(): Enumeration[Applet] = ???

    /** Creates an audio clip. */
    @stub
    def getAudioClip(url: URL): AudioClip = ???

    /** Returns an Image object that can then be painted on
     *  the screen.
     */
    @stub
    def getImage(url: URL): Image = ???

    /** Returns the stream to which specified key is associated within this
     *  applet context.
     */
    @stub
    def getStream(key: String): InputStream = ???

    /** Finds all the keys of the streams in this applet context. */
    @stub
    def getStreamKeys(): Iterator[String] = ???

    /** Associates the specified stream with the specified key in this
     *  applet context.
     */
    @stub
    def setStream(key: String, stream: InputStream): Unit = ???

    /** Requests that the browser or applet viewer show the Web page
     *  indicated by the url argument.
     */
    @stub
    def showDocument(url: URL): Unit = ???

    /** Requests that the browser or applet viewer show the Web page
     *  indicated by the url argument.
     */
    @stub
    def showDocument(url: URL, target: String): Unit = ???
}
