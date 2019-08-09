package javax.swing

import java.awt.{Component, Container, Graphics}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.ProgressBarUI

/** A component that visually displays the progress of some task.  As the task
 *  progresses towards completion, the progress bar displays the
 *  task's percentage of completion.
 *  This percentage is typically represented visually by a rectangle which
 *  starts out empty and gradually becomes filled in as the task progresses.
 *  In addition, the progress bar can display a textual representation of this
 *  percentage.
 *  
 *  JProgressBar uses a BoundedRangeModel as its data model,
 *  with the value property representing the "current" state of the task,
 *  and the minimum and maximum properties representing the
 *  beginning and end points, respectively.
 *  
 *  To indicate that a task of unknown length is executing,
 *  you can put a progress bar into indeterminate mode.
 *  While the bar is in indeterminate mode,
 *  it animates constantly to show that work is occurring.
 *  As soon as you can determine the task's length and amount of progress,
 *  you should update the progress bar's value
 *  and switch it back to determinate mode.
 * 
 *  
 * 
 *  Here is an example of creating a progress bar,
 *  where task is an object (representing some piece of work)
 *  which returns information about the progress of the task:
 * 
 * 
 * progressBar = new JProgressBar(0, task.getLengthOfTask());
 * progressBar.setValue(0);
 * progressBar.setStringPainted(true);
 * 
 * 
 *  Here is an example of querying the current state of the task, and using
 *  the returned value to update the progress bar:
 * 
 * 
 * progressBar.setValue(task.getCurrent());
 * 
 * 
 *  Here is an example of putting a progress bar into
 *  indeterminate mode,
 *  and then switching back to determinate mode
 *  once the length of the task is known:
 * 
 * 
 * progressBar = new JProgressBar();
 * ...//when the task of (initially) unknown length begins:
 * progressBar.setIndeterminate(true);
 * ...//do some work; get length of task...
 * progressBar.setMaximum(newLength);
 * progressBar.setValue(newValue);
 * progressBar.setIndeterminate(false);
 * 
 * 
 *  
 * 
 *  For complete examples and further documentation see
 *  How to Monitor Progress,
 *  a section in The Java Tutorial.
 * 
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JProgressBar extends JComponent with SwingConstants with Accessible {

    /** Creates a horizontal progress bar
     *  that displays a border but no progress string.
     */
    @stub
    def this() = ???

    /** Creates a horizontal progress bar
     *  that uses the specified model
     *  to hold the progress bar's data.
     */
    @stub
    def this(newModel: BoundedRangeModel) = ???

    /** Creates a progress bar with the specified orientation,
     *  which can be
     *  either SwingConstants.VERTICAL or
     *  SwingConstants.HORIZONTAL.
     */
    @stub
    def this(orient: Int) = ???

    /** Creates a horizontal progress bar
     *  with the specified minimum and maximum.
     */
    @stub
    def this(min: Int, max: Int) = ???

    /** Only one ChangeEvent is needed per instance since the
     *  event's only interesting property is the immutable source, which
     *  is the progress bar.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** Listens for change events sent by the progress bar's model,
     *  redispatching them
     *  to change-event listeners registered upon
     *  this progress bar.
     */
    @stub
    protected val changeListener: ChangeListener = ???

    /** The object that holds the data for the progress bar. */
    @stub
    protected val model: BoundedRangeModel = ???

    /** Whether the progress bar is horizontal or vertical. */
    @stub
    protected val orientation: Int = ???

    /** Whether to display a border around the progress bar. */
    @stub
    protected val paintBorder: Boolean = ???

    /** Whether to display a string of text on the progress bar. */
    @stub
    protected val paintString: Boolean = ???

    /** Adds the specified ChangeListener to the progress bar. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Subclasses that want to handle change events
     *  from the model differently
     *  can override this to return
     *  an instance of a custom ChangeListener implementation.
     */
    @stub
    protected def createChangeListener(): ChangeListener = ???

    /** Send a ChangeEvent, whose source is this JProgressBar, to
     *  all ChangeListeners that have registered interest in
     *  ChangeEvents.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  JProgressBar.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the ChangeListeners added
     *  to this progress bar with addChangeListener.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the progress bar's maximum value
     *  from the BoundedRangeModel.
     */
    @stub
    def getMaximum(): Int = ???

    /** Returns the progress bar's minimum value
     *  from the BoundedRangeModel.
     */
    @stub
    def getMinimum(): Int = ???

    /** Returns the data model used by this progress bar. */
    @stub
    def getModel(): BoundedRangeModel = ???

    /** Returns SwingConstants.VERTICAL or
     *  SwingConstants.HORIZONTAL, depending on the orientation
     *  of the progress bar.
     */
    @stub
    def getOrientation(): Int = ???

    /** Returns the percent complete for the progress bar. */
    @stub
    def getPercentComplete(): Double = ???

    /** Returns a String representation of the current progress. */
    @stub
    def getString(): String = ???

    /** Returns the look-and-feel object that renders this component. */
    @stub
    def getUI(): ProgressBarUI = ???

    /** Returns the name of the look-and-feel class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns the progress bar's current value
     *  from the BoundedRangeModel.
     */
    @stub
    def getValue(): Int = ???

    /** Returns the borderPainted property. */
    @stub
    def isBorderPainted(): Boolean = ???

    /** Returns the value of the indeterminate property. */
    @stub
    def isIndeterminate(): Boolean = ???

    /** Returns the value of the stringPainted property. */
    @stub
    def isStringPainted(): Boolean = ???

    /** Paints the progress bar's border if the borderPainted
     *  property is true.
     */
    @stub
    protected def paintBorder(g: Graphics): Unit = ???

    /** Returns a string representation of this JProgressBar. */
    @stub
    protected def paramString(): String = ???

    /** Removes a ChangeListener from the progress bar. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Sets the borderPainted property, which is
     *  true if the progress bar should paint its border.
     */
    @stub
    def setBorderPainted(b: Boolean): Unit = ???

    /** Sets the indeterminate property of the progress bar,
     *  which determines whether the progress bar is in determinate
     *  or indeterminate mode.
     */
    @stub
    def setIndeterminate(newValue: Boolean): Unit = ???

    /** Sets the progress bar's maximum value
     *  (stored in the progress bar's data model) to n.
     */
    @stub
    def setMaximum(n: Int): Unit = ???

    /** Sets the progress bar's minimum value
     *  (stored in the progress bar's data model) to n.
     */
    @stub
    def setMinimum(n: Int): Unit = ???

    /** Sets the data model used by the JProgressBar. */
    @stub
    def setModel(newModel: BoundedRangeModel): Unit = ???

    /** Sets the progress bar's orientation to newOrientation,
     *  which must be SwingConstants.VERTICAL or
     *  SwingConstants.HORIZONTAL.
     */
    @stub
    def setOrientation(newOrientation: Int): Unit = ???

    /** Sets the value of the progress string. */
    @stub
    def setString(s: String): Unit = ???

    /** Sets the value of the stringPainted property,
     *  which determines whether the progress bar
     *  should render a progress string.
     */
    @stub
    def setStringPainted(b: Boolean): Unit = ???

    /** Sets the look-and-feel object that renders this component. */
    @stub
    def setUI(ui: ProgressBarUI): Unit = ???

    /** Sets the progress bar's current value to n. */
    @stub
    def setValue(n: Int): Unit = ???
}
