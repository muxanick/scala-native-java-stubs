package javax.swing

import java.io.Serializable
import java.lang.{Comparable, Number, Object}
import scala.scalanative.annotation.stub

/** A SpinnerModel for sequences of numbers.
 *  The upper and lower bounds of the sequence are defined
 *  by properties called minimum and
 *  maximum. The size of the increase or decrease
 *  computed by the nextValue and
 *  previousValue methods is defined by a property called
 *  stepSize.  The minimum and
 *  maximum properties can be null
 *  to indicate that the sequence has no lower or upper limit.
 *  All of the properties in this class are defined in terms of two
 *  generic types: Number and
 *  Comparable, so that all Java numeric types
 *  may be accommodated.  Internally, there's only support for
 *  values whose type is one of the primitive Number types:
 *  Double, Float, Long,
 *  Integer, Short, or Byte.
 *  
 *  To create a SpinnerNumberModel for the integer
 *  range zero to one hundred, with
 *  fifty as the initial value, one could write:
 *  
 *  Integer value = new Integer(50);
 *  Integer min = new Integer(0);
 *  Integer max = new Integer(100);
 *  Integer step = new Integer(1);
 *  SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, step);
 *  int fifty = model.getNumber().intValue();
 *  
 *  
 *  Spinners for integers and doubles are common, so special constructors
 *  for these cases are provided.  For example to create the model in
 *  the previous example, one could also write:
 *  
 *  SpinnerNumberModel model = new SpinnerNumberModel(50, 0, 100, 1);
 *  
 *  
 *  This model inherits a ChangeListener.
 *  The ChangeListeners are notified
 *  whenever the model's value, stepSize,
 *  minimum, or maximum properties changes.
 */
class SpinnerNumberModel extends AbstractSpinnerModel with Serializable {

    /** Constructs a SpinnerNumberModel with no
     *  minimum or maximum value,
     *  stepSize equal to one, and an initial value of zero.
     */
    @stub
    def this() = ???

    /** Constructs a SpinnerNumberModel with the specified
     *  value, minimum/maximum bounds,
     *  and stepSize.
     */
    @stub
    def this(value: Double, minimum: Double, maximum: Double, stepSize: Double) = ???

    /** Constructs a SpinnerNumberModel with the specified
     *  value, minimum/maximum bounds,
     *  and stepSize.
     */
    @stub
    def this(value: Int, minimum: Int, maximum: Int, stepSize: Int) = ???

    /** Constructs a SpinnerModel that represents
     *  a closed sequence of
     *  numbers from minimum to maximum.
     */
    @stub
    def this(value: Number, minimum: Comparable, maximum: Comparable, stepSize: Number) = ???

    /** Returns the last number in the sequence. */
    @stub
    def getMaximum(): Comparable = ???

    /** Returns the first number in this sequence. */
    @stub
    def getMinimum(): Comparable = ???

    /** Returns the next number in the sequence. */
    @stub
    def getNextValue(): Any = ???

    /** Returns the value of the current element of the sequence. */
    @stub
    def getNumber(): Number = ???

    /** Returns the previous number in the sequence. */
    @stub
    def getPreviousValue(): Any = ???

    /** Returns the size of the value change computed by the
     *  getNextValue
     *  and getPreviousValue methods.
     */
    @stub
    def getStepSize(): Number = ???

    /** Returns the value of the current element of the sequence. */
    @stub
    def getValue(): Any = ???

    /** Changes the upper bound for numbers in this sequence. */
    @stub
    def setMaximum(maximum: Comparable): Unit = ???

    /** Changes the lower bound for numbers in this sequence. */
    @stub
    def setMinimum(minimum: Comparable): Unit = ???

    /** Changes the size of the value change computed by the
     *  getNextValue and getPreviousValue
     *  methods.
     */
    @stub
    def setStepSize(stepSize: Number): Unit = ???

    /** Sets the current value for this sequence. */
    @stub
    def setValue(value: Any): Unit = ???
}
