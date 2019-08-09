package javax.swing

import java.io.Serializable
import java.lang.{Comparable, Number, Object}

// A SpinnerModel for sequences of numbers.
// The upper and lower bounds of the sequence are defined
// by properties called minimum and
// maximum. The size of the increase or decrease
// computed by the nextValue and
// previousValue methods is defined by a property called
// stepSize.  The minimum and
// maximum properties can be null
// to indicate that the sequence has no lower or upper limit.
// All of the properties in this class are defined in terms of two
// generic types: Number and
// Comparable, so that all Java numeric types
// may be accommodated.  Internally, there's only support for
// values whose type is one of the primitive Number types:
// Double, Float, Long,
// Integer, Short, or Byte.
// 
// To create a SpinnerNumberModel for the integer
// range zero to one hundred, with
// fifty as the initial value, one could write:
// 
// Integer value = new Integer(50);
// Integer min = new Integer(0);
// Integer max = new Integer(100);
// Integer step = new Integer(1);
// SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
// int fifty = model.getNumber().intValue();
// 
// 
// Spinners for integers and doubles are common, so special constructors
// for these cases are provided.  For example to create the model in
// the previous example, one could also write:
// 
// SpinnerNumberModel model = new SpinnerNumberModel(50, 0, 100, 1);
// 
// 
// This model inherits a ChangeListener.
// The ChangeListeners are notified
// whenever the model's value, stepSize,
// minimum, or maximum properties changes.
class SpinnerNumberModel extends AbstractSpinnerModel with Serializable {

    @stub
    // Constructs a SpinnerNumberModel with no
    // minimum or maximum value,
    // stepSize equal to one, and an initial value of zero.
    def this() = ???

    @stub
    // Constructs a SpinnerNumberModel with the specified
    // value, minimum/maximum bounds,
    // and stepSize.
    def this(value: double, minimum: double, maximum: double, stepSize: double) = ???

    @stub
    // Constructs a SpinnerNumberModel with the specified
    // value, minimum/maximum bounds,
    // and stepSize.
    def this(value: Int, minimum: Int, maximum: Int, stepSize: Int) = ???

    @stub
    // Returns the last number in the sequence.
    def getMaximum(): Comparable = ???

    @stub
    // Returns the first number in this sequence.
    def getMinimum(): Comparable = ???

    @stub
    // Returns the next number in the sequence.
    def getNextValue(): Object = ???

    @stub
    // Returns the value of the current element of the sequence.
    def getNumber(): Number = ???

    @stub
    // Returns the previous number in the sequence.
    def getPreviousValue(): Object = ???

    @stub
    // Returns the size of the value change computed by the
    // getNextValue
    // and getPreviousValue methods.
    def getStepSize(): Number = ???

    @stub
    // Returns the value of the current element of the sequence.
    def getValue(): Object = ???

    @stub
    // Changes the upper bound for numbers in this sequence.
    def setMaximum(maximum: Comparable): Unit = ???

    @stub
    // Changes the lower bound for numbers in this sequence.
    def setMinimum(minimum: Comparable): Unit = ???

    @stub
    // Changes the size of the value change computed by the
    // getNextValue and getPreviousValue
    // methods.
    def setStepSize(stepSize: Number): Unit = ???
}
