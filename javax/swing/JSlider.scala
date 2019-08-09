package javax.swing

import java.awt.{Component, Container, Font, Image}
import java.lang.{Object, String}
import java.util.{Dictionary, Hashtable}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.SliderUI

// A component that lets the user graphically select a value by sliding
// a knob within a bounded interval. The knob is always positioned
// at the points that match integer values within the specified interval.
// 
// The slider can show both
// major tick marks, and minor tick marks between the major ones.  The number of
// values between the tick marks is controlled with
// setMajorTickSpacing and setMinorTickSpacing.
// Painting of tick marks is controlled by setPaintTicks.
// 
// Sliders can also print text labels at regular intervals (or at
// arbitrary locations) along the slider track.  Painting of labels is
// controlled by setLabelTable and setPaintLabels.
// 
// For further information and examples see
// How to Use Sliders,
// a section in The Java Tutorial.
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
class JSlider extends JComponent with SwingConstants, with Accessible {

    @stub
    // Creates a horizontal slider with the range 0 to 100 and
    // an initial value of 50.
    def this() = ???

    @stub
    // Creates a horizontal slider using the specified
    // BoundedRangeModel.
    def this(brm: BoundedRangeModel) = ???

    @stub
    // Creates a slider using the specified orientation with the
    // range 0 to 100 and an initial value of 50.
    def this(orientation: Int) = ???

    @stub
    // Creates a horizontal slider using the specified min and max
    // with an initial value equal to the average of the min plus max.
    def this(min: Int, max: Int) = ???

    @stub
    // Creates a horizontal slider using the specified min, max and value.
    def this(min: Int, max: Int, value: Int) = ???

    @stub
    // Only one ChangeEvent is needed per slider instance since the
    // event's only (read-only) state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // The changeListener (no suffix) is the listener we add to the
    // slider's model.
    protected def changeListener: ChangeListener = ???

    @stub
    // The number of values between the major tick marks -- the
    // larger marks that break up the minor tick marks.
    protected def majorTickSpacing: Int = ???

    @stub
    // The number of values between the minor tick marks -- the
    // smaller marks that occur between the major tick marks.
    protected def minorTickSpacing: Int = ???

    @stub
    // Whether the slider is horizontal or vertical
    // The default is horizontal.
    protected def orientation: Int = ???

    @stub
    // The data model that handles the numeric maximum value,
    // minimum value, and current-position value for the slider.
    protected def sliderModel: BoundedRangeModel = ???

    @stub
    // Adds a ChangeListener to the slider.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Subclasses that want to handle ChangeEvents
    // from the model differently
    // can override this to return
    // an instance of a custom ChangeListener implementation.
    protected def createChangeListener(): ChangeListener = ???

    @stub
    // Creates a Hashtable of numerical text labels, starting at the
    // slider minimum, and using the increment specified.
    def createStandardLabels(increment: Int): Hashtable = ???

    @stub
    // Creates a Hashtable of numerical text labels, starting at the
    // starting point specified, and using the increment specified.
    def createStandardLabels(increment: Int, start: Int): Hashtable = ???

    @stub
    // Send a ChangeEvent, whose source is this JSlider, to
    // all ChangeListeners that have registered interest in
    // ChangeEvents.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JSlider.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this JSlider with addChangeListener().
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the "extent" from the BoundedRangeModel.
    def getExtent(): Int = ???

    @stub
    // Returns true if the value-range shown for the slider is reversed,
    def getInverted(): Boolean = ???

    @stub
    // Returns the dictionary of what labels to draw at which values.
    def getLabelTable(): Dictionary = ???

    @stub
    // This method returns the major tick spacing.
    def getMajorTickSpacing(): Int = ???

    @stub
    // Returns the maximum value supported by the slider
    // from the BoundedRangeModel.
    def getMaximum(): Int = ???

    @stub
    // Returns the minimum value supported by the slider
    // from the BoundedRangeModel.
    def getMinimum(): Int = ???

    @stub
    // This method returns the minor tick spacing.
    def getMinorTickSpacing(): Int = ???

    @stub
    // Returns the BoundedRangeModel that handles the slider's three
    // fundamental properties: minimum, maximum, value.
    def getModel(): BoundedRangeModel = ???

    @stub
    // Return this slider's vertical or horizontal orientation.
    def getOrientation(): Int = ???

    @stub
    // Tells if labels are to be painted.
    def getPaintLabels(): Boolean = ???

    @stub
    // Tells if tick marks are to be painted.
    def getPaintTicks(): Boolean = ???

    @stub
    // Tells if the track (area the slider slides in) is to be painted.
    def getPaintTrack(): Boolean = ???

    @stub
    // Returns true if the knob (and the data value it represents)
    // resolve to the closest tick mark next to where the user
    // positioned the knob.
    def getSnapToTicks(): Boolean = ???

    @stub
    // Gets the UI object which implements the L&F for this component.
    def getUI(): SliderUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the slider's current value
    // from the BoundedRangeModel.
    def getValue(): Int = ???

    @stub
    // Returns the valueIsAdjusting property from the model.
    def getValueIsAdjusting(): Boolean = ???

    @stub
    // Repaints the component when the image has changed.
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean = ???

    @stub
    // Returns a string representation of this JSlider.
    protected def paramString(): String = ???

    @stub
    // Removes a ChangeListener from the slider.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Sets the size of the range "covered" by the knob.
    def setExtent(extent: Int): Unit = ???

    @stub
    // Sets the font for this component.
    def setFont(font: Font): Unit = ???

    @stub
    // Specify true to reverse the value-range shown for the slider and false to
    // put the value range in the normal order.
    def setInverted(b: Boolean): Unit = ???

    @stub
    // Used to specify what label will be drawn at any given value.
    def setLabelTable(labels: Dictionary): Unit = ???

    @stub
    // This method sets the major tick spacing.
    def setMajorTickSpacing(n: Int): Unit = ???

    @stub
    // Sets the slider's maximum value to maximum.
    def setMaximum(maximum: Int): Unit = ???

    @stub
    // Sets the slider's minimum value to minimum.
    def setMinimum(minimum: Int): Unit = ???

    @stub
    // This method sets the minor tick spacing.
    def setMinorTickSpacing(n: Int): Unit = ???

    @stub
    // Sets the BoundedRangeModel that handles the slider's three
    // fundamental properties: minimum, maximum, value.
    def setModel(newModel: BoundedRangeModel): Unit = ???

    @stub
    // Set the slider's orientation to either SwingConstants.VERTICAL or
    // SwingConstants.HORIZONTAL.
    def setOrientation(orientation: Int): Unit = ???

    @stub
    // Determines whether labels are painted on the slider.
    def setPaintLabels(b: Boolean): Unit = ???

    @stub
    // Determines whether tick marks are painted on the slider.
    def setPaintTicks(b: Boolean): Unit = ???

    @stub
    // Determines whether the track is painted on the slider.
    def setPaintTrack(b: Boolean): Unit = ???

    @stub
    // Specifying true makes the knob (and the data value it represents)
    // resolve to the closest tick mark next to where the user
    // positioned the knob.
    def setSnapToTicks(b: Boolean): Unit = ???

    @stub
    // Sets the UI object which implements the L&F for this component.
    def setUI(ui: SliderUI): Unit = ???

    @stub
    // Sets the slider's current value to n.
    def setValue(n: Int): Unit = ???

    @stub
    // Sets the model's valueIsAdjusting property.
    def setValueIsAdjusting(b: Boolean): Unit = ???

    @stub
    // Updates the UIs for the labels in the label table by calling
    // updateUI on each label.
    protected def updateLabelUIs(): Unit = ???
}
