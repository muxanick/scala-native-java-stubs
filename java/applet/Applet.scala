package java.applet

import java.awt.{Component, Container, Dimension, Image, Panel}
import java.lang.{Object, String}
import java.net.URL
import java.util.Locale
import javax.accessibility.AccessibleContext

// An applet is a small program that is intended not to be run on
// its own, but rather to be embedded inside another application.
// 
// The Applet class must be the superclass of any
// applet that is to be embedded in a Web page or viewed by the Java
// Applet Viewer. The Applet class provides a standard
// interface between applets and their environment.
class Applet extends Panel {

    @stub
    // Called by the browser or applet viewer to inform
    // this applet that it is being reclaimed and that it should destroy
    // any resources that it has allocated.
    def destroy(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Applet.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Determines this applet's context, which allows the applet to
    // query and affect the environment in which it runs.
    def getAppletContext(): AppletContext = ???

    @stub
    // Returns information about this applet.
    def getAppletInfo(): String = ???

    @stub
    // Returns the AudioClip object specified by the
    // URL argument.
    def getAudioClip(url: URL): AudioClip = ???

    @stub
    // Returns the AudioClip object specified by the
    // URL and name arguments.
    def getAudioClip(url: URL, name: String): AudioClip = ???

    @stub
    // Gets the base URL.
    def getCodeBase(): URL = ???

    @stub
    // Gets the URL of the document in which this applet is embedded.
    def getDocumentBase(): URL = ???

    @stub
    // Returns an Image object that can then be painted on
    // the screen.
    def getImage(url: URL): Image = ???

    @stub
    // Returns an Image object that can then be painted on
    // the screen.
    def getImage(url: URL, name: String): Image = ???

    @stub
    // Gets the locale of the applet.
    def getLocale(): Locale = ???

    @stub
    // Returns the value of the named parameter in the HTML tag.
    def getParameter(name: String): String = ???

    @stub
    // Returns information about the parameters that are understood by
    // this applet.
    def getParameterInfo(): Array[Array[String]] = ???

    @stub
    // Called by the browser or applet viewer to inform
    // this applet that it has been loaded into the system.
    def init(): Unit = ???

    @stub
    // Determines if this applet is active.
    def isActive(): Boolean = ???

    @stub
    // Indicates if this container is a validate root.
    def isValidateRoot(): Boolean = ???

    @stub
    // Plays the audio clip at the specified absolute URL.
    def play(url: URL): Unit = ???

    @stub
    // Plays the audio clip given the URL and a specifier that is
    // relative to it.
    def play(url: URL, name: String): Unit = ???

    @stub
    // Requests that this applet be resized.
    def resize(d: Dimension): Unit = ???

    @stub
    // Requests that this applet be resized.
    def resize(width: Int, height: Int): Unit = ???

    @stub
    // Sets this applet's stub.
    def setStub(stub: AppletStub): Unit = ???

    @stub
    // Requests that the argument string be displayed in the
    // "status window".
    def showStatus(msg: String): Unit = ???

    @stub
    // Called by the browser or applet viewer to inform
    // this applet that it should start its execution.
    def start(): Unit = ???
}

object Applet {
    @stub
    // Get an audio clip from the given URL.
    def newAudioClip(url: URL): AudioClip = ???
}
