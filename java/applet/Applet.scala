package java.applet

import java.awt.{Component, Container, Dimension, Image, Panel}
import java.lang.{Object, String}
import java.net.URL
import java.util.Locale
import javax.accessibility.AccessibleContext
import scala.scalanative.annotation.stub

/** An applet is a small program that is intended not to be run on
 *  its own, but rather to be embedded inside another application.
 *  
 *  The Applet class must be the superclass of any
 *  applet that is to be embedded in a Web page or viewed by the Java
 *  Applet Viewer. The Applet class provides a standard
 *  interface between applets and their environment.
 */
class Applet extends Panel {

    /** Constructs a new Applet. */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  Applet class.
     */
    protected type AccessibleApplet = Applet_AccessibleApplet

    /** Called by the browser or applet viewer to inform
     *  this applet that it is being reclaimed and that it should destroy
     *  any resources that it has allocated.
     */
    @stub
    def destroy(): Unit = ???

    /** Gets the AccessibleContext associated with this Applet. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Determines this applet's context, which allows the applet to
     *  query and affect the environment in which it runs.
     */
    @stub
    def getAppletContext(): AppletContext = ???

    /** Returns information about this applet. */
    @stub
    def getAppletInfo(): String = ???

    /** Returns the AudioClip object specified by the
     *  URL argument.
     */
    @stub
    def getAudioClip(url: URL): AudioClip = ???

    /** Returns the AudioClip object specified by the
     *  URL and name arguments.
     */
    @stub
    def getAudioClip(url: URL, name: String): AudioClip = ???

    /** Gets the base URL. */
    @stub
    def getCodeBase(): URL = ???

    /** Gets the URL of the document in which this applet is embedded. */
    @stub
    def getDocumentBase(): URL = ???

    /** Returns an Image object that can then be painted on
     *  the screen.
     */
    @stub
    def getImage(url: URL): Image = ???

    /** Returns an Image object that can then be painted on
     *  the screen.
     */
    @stub
    def getImage(url: URL, name: String): Image = ???

    /** Gets the locale of the applet. */
    @stub
    def getLocale(): Locale = ???

    /** Returns the value of the named parameter in the HTML tag. */
    @stub
    def getParameter(name: String): String = ???

    /** Returns information about the parameters that are understood by
     *  this applet.
     */
    @stub
    def getParameterInfo(): Array[Array[String]] = ???

    /** Called by the browser or applet viewer to inform
     *  this applet that it has been loaded into the system.
     */
    @stub
    def init(): Unit = ???

    /** Determines if this applet is active. */
    @stub
    def isActive(): Boolean = ???

    /** Indicates if this container is a validate root. */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Plays the audio clip at the specified absolute URL. */
    @stub
    def play(url: URL): Unit = ???

    /** Plays the audio clip given the URL and a specifier that is
     *  relative to it.
     */
    @stub
    def play(url: URL, name: String): Unit = ???

    /** Requests that this applet be resized. */
    @stub
    def resize(d: Dimension): Unit = ???

    /** Requests that this applet be resized. */
    @stub
    def resize(width: Int, height: Int): Unit = ???

    /** Sets this applet's stub. */
    @stub
    def setStub(stub: AppletStub): Unit = ???

    /** Requests that the argument string be displayed in the
     *  "status window".
     */
    @stub
    def showStatus(msg: String): Unit = ???

    /** Called by the browser or applet viewer to inform
     *  this applet that it should start its execution.
     */
    @stub
    def start(): Unit = ???

    /** Called by the browser or applet viewer to inform
     *  this applet that it should stop its execution.
     */
    @stub
    def stop(): Unit = ???
}

object Applet {
    /** Get an audio clip from the given URL. */
    @stub
    def newAudioClip(url: URL): AudioClip = ???
}
