package javax.swing.text

import java.awt.{Graphics, Point}
import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** A place within a document view that represents where
 *  things can be inserted into the document model.  A caret
 *  has a position in the document referred to as a dot.
 *  The dot is where the caret is currently located in the
 *  model.  There is
 *  a second position maintained by the caret that represents
 *  the other end of a selection called mark.  If there is
 *  no selection the dot and mark will be equal.  If a selection
 *  exists, the two values will be different.
 *  
 *  The dot can be placed by either calling
 *  setDot or moveDot.  Setting
 *  the dot has the effect of removing any selection that may
 *  have previously existed.  The dot and mark will be equal.
 *  Moving the dot has the effect of creating a selection as
 *  the mark is left at whatever position it previously had.
 */
trait Caret {

    /** Adds a listener to track whenever the caret position
     *  has been changed.
     */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Called when the UI is being removed from the
     *  interface of a JTextComponent.
     */
    @stub
    def deinstall(c: JTextComponent): Unit = ???

    /** Gets the blink rate of the caret. */
    @stub
    def getBlinkRate(): Int = ???

    /** Fetches the current position of the caret. */
    @stub
    def getDot(): Int = ???

    /** Gets the current caret visual location. */
    @stub
    def getMagicCaretPosition(): Point = ???

    /** Fetches the current position of the mark. */
    @stub
    def getMark(): Int = ???

    /** Called when the UI is being installed into the
     *  interface of a JTextComponent.
     */
    @stub
    def install(c: JTextComponent): Unit = ???

    /** Determines if the selection is currently visible. */
    @stub
    def isSelectionVisible(): Boolean = ???

    /** Determines if the caret is currently visible. */
    @stub
    def isVisible(): Boolean = ???

    /** Moves the caret position (dot) to some other position,
     *  leaving behind the mark.
     */
    @stub
    def moveDot(dot: Int): Unit = ???

    /** Renders the caret. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Removes a listener that was tracking caret position changes. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Sets the blink rate of the caret. */
    @stub
    def setBlinkRate(rate: Int): Unit = ???

    /** Sets the caret position to some position. */
    @stub
    def setDot(dot: Int): Unit = ???

    /** Set the current caret visual location. */
    @stub
    def setMagicCaretPosition(p: Point): Unit = ???

    /** Sets the visibility of the selection */
    @stub
    def setSelectionVisible(v: Boolean): Unit = ???

    /** Sets the visibility of the caret. */
    @stub
    def setVisible(v: Boolean): Unit = ???
}
