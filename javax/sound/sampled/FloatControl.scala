package javax.sound.sampled

import java.lang.{Object, String}

// A FloatControl object provides control over a range of
// floating-point values.  Float controls are often
// represented in graphical user interfaces by continuously
// adjustable objects such as sliders or rotary knobs.  Concrete subclasses
// of FloatControl implement controls, such as gain and pan, that
// affect a line's audio signal in some way that an application can manipulate.
// The FloatControl.Type
// inner class provides static instances of types that are used to
// identify some common kinds of float control.
// 
// The FloatControl abstract class provides methods to set and get
// the control's current floating-point value.  Other methods obtain the possible
// range of values and the control's resolution (the smallest increment between
// returned values).  Some float controls allow ramping to a
// new value over a specified period of time.  FloatControl also
// includes methods that return string labels for the minimum, maximum, and midpoint
// positions of the control.
abstract class FloatControl extends Control {

    @stub
    // Constructs a new float control object with the given parameters.
    protected def this(type: FloatControl.Type, minimum: float, maximum: float, precision: float, updatePeriod: Int, initialValue: float, units: String) = ???

    // Obtains the maximum value permitted.
    def getMaximum(): float

    // Obtains the label for the maximum value, such as "Right" or "Full."
    def getMaxLabel(): String

    // Obtains the label for the mid-point value, such as "Center" or "Default."
    def getMidLabel(): String

    // Obtains the minimum value permitted.
    def getMinimum(): float

    // Obtains the label for the minimum value, such as "Left" or "Off."
    def getMinLabel(): String

    // Obtains the resolution or granularity of the control, in the units
    // that the control measures.
    def getPrecision(): float

    // Obtains the label for the units in which the control's values are expressed,
    // such as "dB" or "frames per second."
    def getUnits(): String

    // Obtains the smallest time interval, in microseconds, over which the control's value can
    // change during a shift.
    def getUpdatePeriod(): Int

    // Obtains this control's current value.
    def getValue(): float

    // Sets the current value for the control.
    def setValue(newValue: float): Unit

    // Changes the control value from the initial value to the final
    // value linearly over the specified time period, specified in microseconds.
    def shift(from: float, to: float, microseconds: Int): Unit
}
