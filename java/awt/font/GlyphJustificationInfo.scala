package java.awt.font

import java.lang.Object
import scala.scalanative.annotation.stub

/** The GlyphJustificationInfo class represents information
 *  about the justification properties of a glyph.  A glyph is the visual
 *  representation of one or more characters.  Many different glyphs can
 *  be used to represent a single character or combination of characters.
 *  The four justification properties represented by
 *  GlyphJustificationInfo are weight, priority, absorb and
 *  limit.
 *  
 *  Weight is the overall 'weight' of the glyph in the line.  Generally it is
 *  proportional to the size of the font.  Glyphs with larger weight are
 *  allocated a correspondingly larger amount of the change in space.
 *  
 *  Priority determines the justification phase in which this glyph is used.
 *  All glyphs of the same priority are examined before glyphs of the next
 *  priority.  If all the change in space can be allocated to these glyphs
 *  without exceeding their limits, then glyphs of the next priority are not
 *  examined. There are four priorities, kashida, whitespace, interchar,
 *  and none.  KASHIDA is the first priority examined. NONE is the last
 *  priority examined.
 *  
 *  Absorb determines whether a glyph absorbs all change in space.  Within a
 *  given priority, some glyphs may absorb all the change in space.  If any of
 *  these glyphs are present, no glyphs of later priority are examined.
 *  
 *  Limit determines the maximum or minimum amount by which the glyph can
 *  change. Left and right sides of the glyph can have different limits.
 *  
 *  Each GlyphJustificationInfo represents two sets of
 *  metrics, which are growing and shrinking.  Growing
 *  metrics are used when the glyphs on a line are to be
 *  spread apart to fit a larger width.  Shrinking metrics are used when
 *  the glyphs are to be moved together to fit a smaller width.
 */
final class GlyphJustificationInfo extends Object {

    /** Constructs information about the justification properties of a
     *  glyph.
     */
    @stub
    def this(weight: Float, growAbsorb: Boolean, growPriority: Int, growLeftLimit: Float, growRightLimit: Float, shrinkAbsorb: Boolean, shrinkPriority: Int, shrinkLeftLimit: Float, shrinkRightLimit: Float) = ???

    /** If true, this glyph absorbs all extra
     *  space at this and lower priority levels when it grows.
     */
    @stub
    val growAbsorb: Boolean = ???

    /** The maximum amount by which the left side of this glyph can grow. */
    @stub
    val growLeftLimit: Float = ???

    /** The priority level of this glyph as it is growing. */
    @stub
    val growPriority: Int = ???

    /** The maximum amount by which the right side of this glyph can grow. */
    @stub
    val growRightLimit: Float = ???

    /** If true,this glyph absorbs all remaining shrinkage at
     *  this and lower priority levels as it shrinks.
     */
    @stub
    val shrinkAbsorb: Boolean = ???

    /** The maximum amount by which the left side of this glyph can shrink
     *  (a positive number).
     */
    @stub
    val shrinkLeftLimit: Float = ???

    /** The priority level of this glyph as it is shrinking. */
    @stub
    val shrinkPriority: Int = ???

    /** The maximum amount by which the right side of this glyph can shrink
     *  (a positive number).
     */
    @stub
    val shrinkRightLimit: Float = ???

    /** The weight of this glyph. */
    @stub
    val weight: Float = ???
}

object GlyphJustificationInfo {
    /** The second lowest justification priority. */
    @stub
    val PRIORITY_INTERCHAR: Int = ???

    /** The highest justification priority. */
    @stub
    val PRIORITY_KASHIDA: Int = ???

    /** The lowest justification priority. */
    @stub
    val PRIORITY_NONE: Int = ???

    /** The second highest justification priority. */
    @stub
    val PRIORITY_WHITESPACE: Int = ???
}
