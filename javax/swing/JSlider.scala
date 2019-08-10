package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Font, Image}
import java.lang.{Number, Object, String}
import java.util.{Dictionary, Hashtable}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole, AccessibleStateSet, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.SliderUI
import scala.scalanative.annotation.stub

/** A component that lets the user graphically select a value by sliding
 *  a knob within a bounded interval. The knob is always positioned
 *  at the points that match integer values within the specified interval.
 *  
 *  The slider can show both
 *  major tick marks, and minor tick marks between the major ones.  The number of
 *  values between the tick marks is controlled with
 *  setMajorTickSpacing and setMinorTickSpacing.
 *  Painting of tick marks is controlled by setPaintTicks.
 *  
 *  Sliders can also print text labels at regular intervals (or at
 *  arbitrary locations) along the slider track.  Painting of labels is
 *  controlled by setLabelTable and setPaintLabels.
 *  
 *  For further information and examples see
 *  How to Use Sliders,
 *  a section in The Java Tutorial.
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
class JSlider extends JComponent with SwingConstants with Accessible {

    /** Creates a horizontal slider with the range 0 to 100 and
     *  an initial value of 50.
     */
    @stub
    def this() = ???

    /** Creates a horizontal slider using the specified
     *  BoundedRangeModel.
     */
    @stub
    def this(brm: BoundedRangeModel) = ???

    /** Creates a slider using the specified orientation with the
     *  range 0 to 100 and an initial value of 50.
     */
    @stub
    def this(orientation: Int) = ???

    /** Creates a horizontal slider using the specified min and max
     *  with an initial value equal to the average of the min plus max.
     */
    @stub
    def this(min: Int, max: Int) = ???

    /** Creates a horizontal slider using the specified min, max and value. */
    @stub
    def this(min: Int, max: Int, value: Int) = ???

    /** Creates a slider with the specified orientation and the
     *  specified minimum, maximum, and initial values.
     */
    @stub
    def this(orientation: Int, min: Int, max: Int, value: Int) = ???

    /** This class implements accessibility support for the
     *  JSlider class.  It provides an implementation of the
     *  Java Accessibility API appropriate to slider user-interface elements.
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
    protected class AccessibleJSlider extends JComponent.AccessibleJComponent with AccessibleValue {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???

        /** Get the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???

        /** Get the AccessibleValue associated with this object. */
        @stub
        def getAccessibleValue(): AccessibleValue = ???

        /** Get the accessible value of this object. */
        @stub
        def getCurrentAccessibleValue(): Number = ???

        /** Get the maximum accessible value of this object. */
        @stub
        def getMaximumAccessibleValue(): Number = ???

        /** Get the minimum accessible value of this object. */
        @stub
        def getMinimumAccessibleValue(): Number = ???

        /** Set the value of this object as a Number. */
        @stub
        def setCurrentAccessibleValue(n: Number): Boolean = ???
    }


    /** Only one ChangeEvent is needed per slider instance since the
     *  event's only (read-only) state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** The changeListener (no suffix) is the listener we add to the
     *  slider's model.
     */
    @stub
    protected val changeListener: ChangeListener = ???

    /** The number of values between the major tick marks -- the
     *  larger marks that break up the minor tick marks.
     */
    @stub
    protected val majorTickSpacing: Int = ???

    /** The number of values between the minor tick marks -- the
     *  smaller marks that occur between the major tick marks.
     */
    @stub
    protected val minorTickSpacing: Int = ???

    /** Whether the slider is horizontal or vertical
     *  The default is horizontal.
     */
    @stub
    protected val orientation: Int = ???

    /** The data model that handles the numeric maximum value,
     *  minimum value, and current-position value for the slider.
     */
    @stub
    protected val sliderModel: BoundedRangeModel = ???

    /** If true, the knob (and the data value it represents)
     *  resolve to the closest tick mark next to where the user
     *  positioned the knob.
     */
    @stub
    protected val snapToTicks: Boolean = ???

    /** Adds a ChangeListener to the slider. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Subclasses that want to handle ChangeEvents
     *  from the model differently
     *  can override this to return
     *  an instance of a custom ChangeListener implementation.
     */
    @stub
    protected def createChangeListener(): ChangeListener = ???

    /** Creates a Hashtable of numerical text labels, starting at the
     *  slider minimum, and using the increment specified.
     */
    @stub
    def createStandardLabels(increment: Int): Hashtable = ???

    /** Creates a Hashtable of numerical text labels, starting at the
     *  starting point specified, and using the increment specified.
     */
    @stub
    def createStandardLabels(increment: Int, start: Int): Hashtable = ???

    /** Send a ChangeEvent, whose source is this JSlider, to
     *  all ChangeListeners that have registered interest in
     *  ChangeEvents.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the AccessibleContext associated with this JSlider. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns an array of all the ChangeListeners added
     *  to this JSlider with addChangeListener().
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the "extent" from the BoundedRangeModel. */
    @stub
    def getExtent(): Int = ???

    /** Returns true if the value-range shown for the slider is reversed, */
    @stub
    def getInverted(): Boolean = ???

    /** Returns the dictionary of what labels to draw at which values. */
    @stub
    def getLabelTable(): Dictionary = ???

    /** This method returns the major tick spacing. */
    @stub
    def getMajorTickSpacing(): Int = ???

    /** Returns the maximum value supported by the slider
     *  from the BoundedRangeModel.
     */
    @stub
    def getMaximum(): Int = ???

    /** Returns the minimum value supported by the slider
     *  from the BoundedRangeModel.
     */
    @stub
    def getMinimum(): Int = ???

    /** This method returns the minor tick spacing. */
    @stub
    def getMinorTickSpacing(): Int = ???

    /** Returns the BoundedRangeModel that handles the slider's three
     *  fundamental properties: minimum, maximum, value.
     */
    @stub
    def getModel(): BoundedRangeModel = ???

    /** Return this slider's vertical or horizontal orientation. */
    @stub
    def getOrientation(): Int = ???

    /** Tells if labels are to be painted. */
    @stub
    def getPaintLabels(): Boolean = ???

    /** Tells if tick marks are to be painted. */
    @stub
    def getPaintTicks(): Boolean = ???

    /** Tells if the track (area the slider slides in) is to be painted. */
    @stub
    def getPaintTrack(): Boolean = ???

    /** Returns true if the knob (and the data value it represents)
     *  resolve to the closest tick mark next to where the user
     *  positioned the knob.
     */
    @stub
    def getSnapToTicks(): Boolean = ???

    /** Gets the UI object which implements the L&F for this component. */
    @stub
    def getUI(): SliderUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns the slider's current value
     *  from the BoundedRangeModel.
     */
    @stub
    def getValue(): Int = ???

    /** Returns the valueIsAdjusting property from the model. */
    @stub
    def getValueIsAdjusting(): Boolean = ???

    /** Repaints the component when the image has changed. */
    @stub
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean = ???

    /** Returns a string representation of this JSlider. */
    @stub
    protected def paramString(): String = ???

    /** Removes a ChangeListener from the slider. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Sets the size of the range "covered" by the knob. */
    @stub
    def setExtent(extent: Int): Unit = ???

    /** Sets the font for this component. */
    @stub
    def setFont(font: Font): Unit = ???

    /** Specify true to reverse the value-range shown for the slider and false to
     *  put the value range in the normal order.
     */
    @stub
    def setInverted(b: Boolean): Unit = ???

    /** Used to specify what label will be drawn at any given value. */
    @stub
    def setLabelTable(labels: Dictionary): Unit = ???

    /** This method sets the major tick spacing. */
    @stub
    def setMajorTickSpacing(n: Int): Unit = ???

    /** Sets the slider's maximum value to maximum. */
    @stub
    def setMaximum(maximum: Int): Unit = ???

    /** Sets the slider's minimum value to minimum. */
    @stub
    def setMinimum(minimum: Int): Unit = ???

    /** This method sets the minor tick spacing. */
    @stub
    def setMinorTickSpacing(n: Int): Unit = ???

    /** Sets the BoundedRangeModel that handles the slider's three
     *  fundamental properties: minimum, maximum, value.
     */
    @stub
    def setModel(newModel: BoundedRangeModel): Unit = ???

    /** Set the slider's orientation to either SwingConstants.VERTICAL or
     *  SwingConstants.HORIZONTAL.
     */
    @stub
    def setOrientation(orientation: Int): Unit = ???

    /** Determines whether labels are painted on the slider. */
    @stub
    def setPaintLabels(b: Boolean): Unit = ???

    /** Determines whether tick marks are painted on the slider. */
    @stub
    def setPaintTicks(b: Boolean): Unit = ???

    /** Determines whether the track is painted on the slider. */
    @stub
    def setPaintTrack(b: Boolean): Unit = ???

    /** Specifying true makes the knob (and the data value it represents)
     *  resolve to the closest tick mark next to where the user
     *  positioned the knob.
     */
    @stub
    def setSnapToTicks(b: Boolean): Unit = ???

    /** Sets the UI object which implements the L&F for this component. */
    @stub
    def setUI(ui: SliderUI): Unit = ???

    /** Sets the slider's current value to n. */
    @stub
    def setValue(n: Int): Unit = ???

    /** Sets the model's valueIsAdjusting property. */
    @stub
    def setValueIsAdjusting(b: Boolean): Unit = ???

    /** Updates the UIs for the labels in the label table by calling
     *  updateUI on each label.
     */
    @stub
    protected def updateLabelUIs(): Unit = ???

    /** Resets the UI property to a value from the current look and feel. */
    @stub
    def updateUI(): Unit = ???
}
