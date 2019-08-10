package javax.swing

import java.awt.{Component, Point, Rectangle}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import java.util.Locale
import javax.accessibility.{Accessible, AccessibleComponent, AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** A class to monitor the progress of some operation. If it looks
 *  like the operation will take a while, a progress dialog will be popped up.
 *  When the ProgressMonitor is created it is given a numeric range and a
 *  descriptive string. As the operation progresses, call the setProgress method
 *  to indicate how far along the [min,max] range the operation is.
 *  Initially, there is no ProgressDialog. After the first millisToDecideToPopup
 *  milliseconds (default 500) the progress monitor will predict how long
 *  the operation will take.  If it is longer than millisToPopup (default 2000,
 *  2 seconds) a ProgressDialog will be popped up.
 *  
 *  From time to time, when the Dialog box is visible, the progress bar will
 *  be updated when setProgress is called.  setProgress won't always update
 *  the progress bar, it will only be done if the amount of progress is
 *  visibly significant.
 * 
 *  
 * 
 *  For further documentation and examples see
 *  How to Monitor Progress,
 *  a section in The Java Tutorial.
 */
class ProgressMonitor extends Object with Accessible {

    /** Constructs a graphic object that shows progress, typically by filling
     *  in a rectangular bar as the process nears completion.
     */
    @stub
    def this(parentComponent: Component, message: Any, note: String, min: Int, max: Int) = ???

    /** AccessibleProgressMonitor implements accessibility
     *  support for the ProgressMonitor class.
     */
    protected class AccessibleProgressMonitor extends AccessibleContext with AccessibleText with ChangeListener with PropertyChangeListener {

        /** AccessibleProgressMonitor constructor */
        @stub
        protected def this() = ???

        /** Returns the specified Accessible child of the object. */
        @stub
        def getAccessibleChild(i: Int): Accessible = ???

        /** Returns the number of accessible children of the object. */
        @stub
        def getAccessibleChildrenCount(): Int = ???

        /** Gets the AccessibleComponent associated with this object that has a
         *  graphical representation.
         */
        @stub
        def getAccessibleComponent(): AccessibleComponent = ???

        /** Gets the accessibleDescription property of this object. */
        @stub
        def getAccessibleDescription(): String = ???

        /** Gets the 0-based index of this object in its accessible parent. */
        @stub
        def getAccessibleIndexInParent(): Int = ???

        /** Gets the accessibleName property of this object. */
        @stub
        def getAccessibleName(): String = ???

        /** Gets the Accessible parent of this object. */
        @stub
        def getAccessibleParent(): Accessible = ???

        /** Gets the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Gets the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Gets the AccessibleText associated with this object presenting
         *  text on the display.
         */
        @stub
        def getAccessibleText(): AccessibleText = ???

        /** Gets the AccessibleValue associated with this object that supports a
         *  Numerical value.
         */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Returns the String after a given index. */
        @stub
        def getAfterIndex(part: Int, index: Int): String = ???

        /** Returns the String at a given index. */
        @stub
        def getAtIndex(part: Int, index: Int): String = ???

        /** Returns the String before a given index. */
        @stub
        def getBeforeIndex(part: Int, index: Int): String = ???

        /** Returns the zero-based offset of the caret. */
        @stub
        def getCaretPosition(): Int = ???

        /** Returns the AttributeSet for a given character at a given index */
        @stub
        def getCharacterAttribute(i: Int): AttributeSet = ???

        /** Determines the bounding box of the character at the given
         *  index into the string.
         */
        @stub
        def getCharacterBounds(i: Int): Rectangle = ???

        /** Returns the number of characters (valid indicies) */
        @stub
        def getCharCount(): Int = ???

        /** Given a point in local coordinates, return the zero-based index
         *  of the character under that Point.
         */
        @stub
        def getIndexAtPoint(p: Point): Int = ???

        /** Gets the locale of the component. */
        @stub
        def getLocale(): Locale = ???

        /** Returns the portion of the text that is selected. */
        @stub
        def getSelectedText(): String = ???

        /** Returns the end offset within the selected text. */
        @stub
        def getSelectionEnd(): Int = ???

        /** Returns the start offset within the selected text. */
        @stub
        def getSelectionStart(): Int = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** The AccessibleContext for the ProgressMonitor */
    @stub
    protected val accessibleContext: AccessibleContext = ???

    /** Indicate that the operation is complete. */
    @stub
    def close(): Unit = ???

    /** Gets the AccessibleContext for the
     *  ProgressMonitor
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the maximum value -- the higher end of the progress value. */
    @stub
    def getMaximum(): Int = ???

    /** Returns the amount of time this object waits before deciding whether
     *  or not to popup a progress monitor.
     */
    @stub
    def getMillisToDecideToPopup(): Int = ???

    /** Returns the amount of time it will take for the popup to appear. */
    @stub
    def getMillisToPopup(): Int = ???

    /** Returns the minimum value -- the lower end of the progress value. */
    @stub
    def getMinimum(): Int = ???

    /** Specifies the additional note that is displayed along with the
     *  progress message.
     */
    @stub
    def getNote(): String = ???

    /** Returns true if the user hits the Cancel button in the progress dialog. */
    @stub
    def isCanceled(): Boolean = ???

    /** Specifies the maximum value. */
    @stub
    def setMaximum(m: Int): Unit = ???

    /** Specifies the amount of time to wait before deciding whether or
     *  not to popup a progress monitor.
     */
    @stub
    def setMillisToDecideToPopup(millisToDecideToPopup: Int): Unit = ???

    /** Specifies the amount of time it will take for the popup to appear. */
    @stub
    def setMillisToPopup(millisToPopup: Int): Unit = ???

    /** Specifies the minimum value. */
    @stub
    def setMinimum(m: Int): Unit = ???

    /** Specifies the additional note that is displayed along with the
     *  progress message.
     */
    @stub
    def setNote(note: String): Unit = ???

    /** Indicate the progress of the operation being monitored. */
    @stub
    def setProgress(nv: Int): Unit = ???
}
