package javax.swing.text

import java.awt.{Graphics, Point}
import javax.swing.event.ChangeListener

// A place within a document view that represents where
// things can be inserted into the document model.  A caret
// has a position in the document referred to as a dot.
// The dot is where the caret is currently located in the
// model.  There is
// a second position maintained by the caret that represents
// the other end of a selection called mark.  If there is
// no selection the dot and mark will be equal.  If a selection
// exists, the two values will be different.
// 
// The dot can be placed by either calling
// setDot or moveDot.  Setting
// the dot has the effect of removing any selection that may
// have previously existed.  The dot and mark will be equal.
// Moving the dot has the effect of creating a selection as
// the mark is left at whatever position it previously had.
trait Caret {

    @stub
    // Adds a listener to track whenever the caret position
    // has been changed.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Called when the UI is being removed from the
    // interface of a JTextComponent.
    def deinstall(c: JTextComponent): Unit = ???

    @stub
    // Gets the blink rate of the caret.
    def getBlinkRate(): Int = ???

    @stub
    // Fetches the current position of the caret.
    def getDot(): Int = ???

    @stub
    // Gets the current caret visual location.
    def getMagicCaretPosition(): Point = ???

    @stub
    // Fetches the current position of the mark.
    def getMark(): Int = ???

    @stub
    // Called when the UI is being installed into the
    // interface of a JTextComponent.
    def install(c: JTextComponent): Unit = ???

    @stub
    // Determines if the selection is currently visible.
    def isSelectionVisible(): Boolean = ???

    @stub
    // Determines if the caret is currently visible.
    def isVisible(): Boolean = ???

    @stub
    // Moves the caret position (dot) to some other position,
    // leaving behind the mark.
    def moveDot(dot: Int): Unit = ???

    @stub
    // Renders the caret.
    def paint(g: Graphics): Unit = ???

    @stub
    // Removes a listener that was tracking caret position changes.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Sets the blink rate of the caret.
    def setBlinkRate(rate: Int): Unit = ???

    @stub
    // Sets the caret position to some position.
    def setDot(dot: Int): Unit = ???

    @stub
    // Set the current caret visual location.
    def setMagicCaretPosition(p: Point): Unit = ???

    @stub
    // Sets the visibility of the selection
    def setSelectionVisible(v: Boolean): Unit = ???
}
