package java.applet

import java.awt.Image
import java.io.InputStream
import java.lang.String
import java.net.URL
import java.util.{Enumeration, Iterator}

// This interface corresponds to an applet's environment: the
// document containing the applet and the other applets in the same
// document.
// 
// The methods in this interface can be used by an applet to obtain
// information about its environment.
trait AppletContext {

    @stub
    // Finds and returns the applet in the document represented by this
    // applet context with the given name.
    def getApplet(name: String): Applet = ???

    @stub
    // Finds all the applets in the document represented by this applet
    // context.
    def getApplets(): Enumeration[Applet] = ???

    @stub
    // Creates an audio clip.
    def getAudioClip(url: URL): AudioClip = ???

    @stub
    // Returns an Image object that can then be painted on
    // the screen.
    def getImage(url: URL): Image = ???

    @stub
    // Returns the stream to which specified key is associated within this
    // applet context.
    def getStream(key: String): InputStream = ???

    @stub
    // Finds all the keys of the streams in this applet context.
    def getStreamKeys(): Iterator[String] = ???

    @stub
    // Associates the specified stream with the specified key in this
    // applet context.
    def setStream(key: String, stream: InputStream): Unit = ???

    @stub
    // Requests that the browser or applet viewer show the Web page
    // indicated by the url argument.
    def showDocument(url: URL): Unit = ???

    @stub
    // Requests that the browser or applet viewer show the Web page
    // indicated by the url argument.
    def showDocument(url: URL, target: String): Unit = ???
}
