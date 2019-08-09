package java.awt

import java.lang.{Enum, Object, String}

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

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MultipleGradientPaint.CycleMethod = ???
}
