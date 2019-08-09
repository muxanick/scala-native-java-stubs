package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.text.View
import scala.scalanative.annotation.stub

/** Support for providing html views for the swing components.
 *  This translates a simple html string to a javax.swing.text.View
 *  implementation that can render the html and provide the necessary
 *  layout semantics.
 */
class BasicHTML extends Object {

    /**  */
    @stub
    def this() = ???
}

object BasicHTML {
    /** Key stored as a client property to indicate the base that relative
     *  references are resolved against.
     */
    @stub
    val documentBaseKey: String = ???

    /** Key to use for the html renderer when stored as a
     *  client property of a JComponent.
     */
    @stub
    val propertyKey: String = ???

    /** Create an html renderer for the given component and
     *  string of html.
     */
    @stub
    def createHTMLView(c: JComponent, html: String): View = ???

    /** Returns the baseline for the html renderer. */
    @stub
    def getHTMLBaseline(view: View, w: Int, h: Int): Int = ???

    /** Check the given string to see if it should trigger the
     *  html rendering logic in a non-text component that supports
     *  html rendering.
     */
    @stub
    def isHTMLString(s: String): Boolean = ???

    /** Stash the HTML render for the given text into the client
     *  properties of the given JComponent.
     */
    @stub
    def updateRenderer(c: JComponent, text: String): Unit = ???
}
