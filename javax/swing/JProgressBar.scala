package javax.swing

import java.awt.{Component, Container, Graphics}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.ProgressBarUI

// A component that visually displays the progress of some task.  As the task
// progresses towards completion, the progress bar displays the
// task's percentage of completion.
// This percentage is typically represented visually by a rectangle which
// starts out empty and gradually becomes filled in as the task progresses.
// In addition, the progress bar can display a textual representation of this
// percentage.
// 
// JProgressBar uses a BoundedRangeModel as its data model,
// with the value property representing the "current" state of the task,
// and the minimum and maximum properties representing the
// beginning and end points, respectively.
// 
// To indicate that a task of unknown length is executing,
// you can put a progress bar into indeterminate mode.
// While the bar is in indeterminate mode,
// it animates constantly to show that work is occurring.
// As soon as you can determine the task's length and amount of progress,
// you should update the progress bar's value
// and switch it back to determinate mode.
//
// 
//
// Here is an example of creating a progress bar,
// where task is an object (representing some piece of work)
// which returns information about the progress of the task:
//
//
//progressBar = new JProgressBar(0, task.getLengthOfTask());
//progressBar.setValue(0);
//progressBar.setStringPainted(true);
//
//
// Here is an example of querying the current state of the task, and using
// the returned value to update the progress bar:
//
//
//progressBar.setValue(task.getCurrent());
//
//
// Here is an example of putting a progress bar into
// indeterminate mode,
// and then switching back to determinate mode
// once the length of the task is known:
//
//
//progressBar = new JProgressBar();
//...//when the task of (initially) unknown length begins:
//progressBar.setIndeterminate(true);
//...//do some work; get length of task...
//progressBar.setMaximum(newLength);
//progressBar.setValue(newValue);
//progressBar.setIndeterminate(false);
//
//
// 
//
// For complete examples and further documentation see
// How to Monitor Progress,
// a section in The Java Tutorial.
//
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JProgressBar extends JComponent with SwingConstants, with Accessible {

    @stub
    // Creates a horizontal progress bar
    // that displays a border but no progress string.
    def this() = ???

    @stub
    // Creates a horizontal progress bar
    // that uses the specified model
    // to hold the progress bar's data.
    def this(newModel: BoundedRangeModel) = ???

    @stub
    // Creates a progress bar with the specified orientation,
    // which can be
    // either SwingConstants.VERTICAL or
    // SwingConstants.HORIZONTAL.
    def this(orient: Int) = ???

    @stub
    // Creates a horizontal progress bar
    // with the specified minimum and maximum.
    def this(min: Int, max: Int) = ???

    @stub
    // Only one ChangeEvent is needed per instance since the
    // event's only interesting property is the immutable source, which
    // is the progress bar.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // Listens for change events sent by the progress bar's model,
    // redispatching them
    // to change-event listeners registered upon
    // this progress bar.
    protected def changeListener: ChangeListener = ???

    @stub
    // The object that holds the data for the progress bar.
    protected def model: BoundedRangeModel = ???

    @stub
    // Whether the progress bar is horizontal or vertical.
    protected def orientation: Int = ???

    @stub
    // Whether to display a border around the progress bar.
    protected def paintBorder: Boolean = ???

    @stub
    // Whether to display a string of text on the progress bar.
    protected def paintString: Boolean = ???

    @stub
    // Adds the specified ChangeListener to the progress bar.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Subclasses that want to handle change events
    // from the model differently
    // can override this to return
    // an instance of a custom ChangeListener implementation.
    protected def createChangeListener(): ChangeListener = ???

    @stub
    // Send a ChangeEvent, whose source is this JProgressBar, to
    // all ChangeListeners that have registered interest in
    // ChangeEvents.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JProgressBar.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this progress bar with addChangeListener.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the progress bar's maximum value
    // from the BoundedRangeModel.
    def getMaximum(): Int = ???

    @stub
    // Returns the progress bar's minimum value
    // from the BoundedRangeModel.
    def getMinimum(): Int = ???

    @stub
    // Returns the data model used by this progress bar.
    def getModel(): BoundedRangeModel = ???

    @stub
    // Returns SwingConstants.VERTICAL or
    // SwingConstants.HORIZONTAL, depending on the orientation
    // of the progress bar.
    def getOrientation(): Int = ???

    @stub
    // Returns the percent complete for the progress bar.
    def getPercentComplete(): double = ???

    @stub
    // Returns a String representation of the current progress.
    def getString(): String = ???

    @stub
    // Returns the look-and-feel object that renders this component.
    def getUI(): ProgressBarUI = ???

    @stub
    // Returns the name of the look-and-feel class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the progress bar's current value
    // from the BoundedRangeModel.
    def getValue(): Int = ???

    @stub
    // Returns the borderPainted property.
    def isBorderPainted(): Boolean = ???

    @stub
    // Returns the value of the indeterminate property.
    def isIndeterminate(): Boolean = ???

    @stub
    // Returns the value of the stringPainted property.
    def isStringPainted(): Boolean = ???

    @stub
    // Paints the progress bar's border if the borderPainted
    // property is true.
    protected def paintBorder(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JProgressBar.
    protected def paramString(): String = ???

    @stub
    // Removes a ChangeListener from the progress bar.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Sets the borderPainted property, which is
    // true if the progress bar should paint its border.
    def setBorderPainted(b: Boolean): Unit = ???

    @stub
    // Sets the indeterminate property of the progress bar,
    // which determines whether the progress bar is in determinate
    // or indeterminate mode.
    def setIndeterminate(newValue: Boolean): Unit = ???

    @stub
    // Sets the progress bar's maximum value
    // (stored in the progress bar's data model) to n.
    def setMaximum(n: Int): Unit = ???

    @stub
    // Sets the progress bar's minimum value
    // (stored in the progress bar's data model) to n.
    def setMinimum(n: Int): Unit = ???

    @stub
    // Sets the data model used by the JProgressBar.
    def setModel(newModel: BoundedRangeModel): Unit = ???

    @stub
    // Sets the progress bar's orientation to newOrientation,
    // which must be SwingConstants.VERTICAL or
    // SwingConstants.HORIZONTAL.
    def setOrientation(newOrientation: Int): Unit = ???

    @stub
    // Sets the value of the progress string.
    def setString(s: String): Unit = ???

    @stub
    // Sets the value of the stringPainted property,
    // which determines whether the progress bar
    // should render a progress string.
    def setStringPainted(b: Boolean): Unit = ???

    @stub
    // Sets the look-and-feel object that renders this component.
    def setUI(ui: ProgressBarUI): Unit = ???

    @stub
    // Sets the progress bar's current value to n.
    def setValue(n: Int): Unit = ???
}
