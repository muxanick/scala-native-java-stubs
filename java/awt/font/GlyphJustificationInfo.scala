package java.awt.font

import java.lang.Object

// The GlyphJustificationInfo class represents information
// about the justification properties of a glyph.  A glyph is the visual
// representation of one or more characters.  Many different glyphs can
// be used to represent a single character or combination of characters.
// The four justification properties represented by
// GlyphJustificationInfo are weight, priority, absorb and
// limit.
// 
// Weight is the overall 'weight' of the glyph in the line.  Generally it is
// proportional to the size of the font.  Glyphs with larger weight are
// allocated a correspondingly larger amount of the change in space.
// 
// Priority determines the justification phase in which this glyph is used.
// All glyphs of the same priority are examined before glyphs of the next
// priority.  If all the change in space can be allocated to these glyphs
// without exceeding their limits, then glyphs of the next priority are not
// examined. There are four priorities, kashida, whitespace, interchar,
// and none.  KASHIDA is the first priority examined. NONE is the last
// priority examined.
// 
// Absorb determines whether a glyph absorbs all change in space.  Within a
// given priority, some glyphs may absorb all the change in space.  If any of
// these glyphs are present, no glyphs of later priority are examined.
// 
// Limit determines the maximum or minimum amount by which the glyph can
// change. Left and right sides of the glyph can have different limits.
// 
// Each GlyphJustificationInfo represents two sets of
// metrics, which are growing and shrinking.  Growing
// metrics are used when the glyphs on a line are to be
// spread apart to fit a larger width.  Shrinking metrics are used when
// the glyphs are to be moved together to fit a smaller width.
final class GlyphJustificationInfo extends Object {

    @stub
    // If true, this glyph absorbs all extra
    // space at this and lower priority levels when it grows.
    def growAbsorb: Boolean = ???

    @stub
    // The maximum amount by which the left side of this glyph can grow.
    def growLeftLimit: float = ???

    @stub
    // The priority level of this glyph as it is growing.
    def growPriority: Int = ???

    @stub
    // The maximum amount by which the right side of this glyph can grow.
    def growRightLimit: float = ???

    @stub
    // If true,this glyph absorbs all remaining shrinkage at
    // this and lower priority levels as it shrinks.
    def shrinkAbsorb: Boolean = ???

    @stub
    // The maximum amount by which the left side of this glyph can shrink
    // (a positive number).
    def shrinkLeftLimit: float = ???

    @stub
    // The priority level of this glyph as it is shrinking.
    def shrinkPriority: Int = ???

    @stub
    // The maximum amount by which the right side of this glyph can shrink
    // (a positive number).
    def shrinkRightLimit: float = ???
}

object GlyphJustificationInfo {
    @stub
    // The second lowest justification priority.
    def PRIORITY_INTERCHAR: Int = ???

    @stub
    // The highest justification priority.
    def PRIORITY_KASHIDA: Int = ???

    @stub
    // The lowest justification priority.
    def PRIORITY_NONE: Int = ???

    @stub
    // The second highest justification priority.
    def PRIORITY_WHITESPACE: Int = ???
}
