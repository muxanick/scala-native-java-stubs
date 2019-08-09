package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.text.View

// Support for providing html views for the swing components.
// This translates a simple html string to a javax.swing.text.View
// implementation that can render the html and provide the necessary
// layout semantics.
class BasicHTML extends Object {
}

object BasicHTML {
    @stub
    // Key stored as a client property to indicate the base that relative
    // references are resolved against.
    def documentBaseKey: String = ???

    @stub
    // Create an html renderer for the given component and
    // string of html.
    def createHTMLView(c: JComponent, html: String): View = ???

    @stub
    // Returns the baseline for the html renderer.
    def getHTMLBaseline(view: View, w: Int, h: Int): Int = ???

    @stub
    // Check the given string to see if it should trigger the
    // html rendering logic in a non-text component that supports
    // html rendering.
    def isHTMLString(s: String): Boolean = ???
}
