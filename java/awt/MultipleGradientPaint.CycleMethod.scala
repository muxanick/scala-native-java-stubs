package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The method to use when painting outside the gradient bounds. */
class MultipleGradientPaint.CycleMethod private (name: String, ordinal: Int) extends Enum[MultipleGradientPaint.CycleMethod](name, ordinal) {
}

object MultipleGradientPaint.CycleMethod {
    /** Use the terminal colors to fill the remaining area. */
    final val NO_CYCLE = new MultipleGradientPaint.CycleMethod(NO_CYCLE, 0)

    /** Cycle the gradient colors start-to-end, end-to-start
     *  to fill the remaining area.
     */
    final val REFLECT = new MultipleGradientPaint.CycleMethod(REFLECT, 1)

    /** Cycle the gradient colors start-to-end, start-to-end
     *  to fill the remaining area.
     */
    final val REPEAT = new MultipleGradientPaint.CycleMethod(REPEAT, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MultipleGradientPaint.CycleMethod = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[MultipleGradientPaint.CycleMethod] = ???
}
