package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.text.View

/** Support for providing html views for the swing components.
 *  This translates a simple html string to a javax.swing.text.View
 *  implementation that can render the html and provide the necessary
 *  layout semantics.
 */
class BasicHTML extends Object {
}

object BasicHTML {
    /** Key stored as a client property to indicate the base that relative
     *  references are resolved against.
     */
    @stub
    val documentBaseKey: String = ???

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
}
