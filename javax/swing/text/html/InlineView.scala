package javax.swing.text.html

import java.awt.Shape
import java.lang.Object
import javax.swing.event.DocumentEvent
import javax.swing.text.{AttributeSet, GlyphView, LabelView, View, ViewFactory}

// Displays the inline element styles
// based upon css attributes.
class InlineView extends LabelView {

    @stub
    // Tries to break this view on the given axis.
    def breakView(axis: Int, offset: Int, pos: float, len: float): View = ???

    @stub
    // Gives notification from the document that attributes were changed
    // in a location that this view is responsible for.
    def changedUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Fetches the attributes to use when rendering.
    def getAttributes(): AttributeSet = ???

    @stub
    // Determines how attractive a break opportunity in
    // this view is.
    def getBreakWeight(axis: Int, pos: float, len: float): Int = ???

    @stub
    // 
    protected def getStyleSheet(): StyleSheet = ???

    @stub
    // Gives notification that something was inserted into
    // the document in a location that this view is responsible for.
    def insertUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???

    @stub
    // Gives notification that something was removed from the document
    // in a location that this view is responsible for.
    def removeUpdate(e: DocumentEvent, a: Shape, f: ViewFactory): Unit = ???
}
