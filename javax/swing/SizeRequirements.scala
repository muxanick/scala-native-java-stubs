package javax.swing

import java.io.Serializable
import java.lang.Object

// For the convenience of layout managers,
// calculates information about the size and position of components.
// All size and position calculation methods are class methods
// that take arrays of SizeRequirements as arguments.
// The SizeRequirements class supports two types of layout:
//
// 
// 
//  tiled
//  The components are placed end-to-end,
//      starting either at coordinate 0 (the leftmost or topmost position)
//      or at the coordinate representing the end of the allocated span
//      (the rightmost or bottommost position).
//
//  aligned
//  The components are aligned as specified
//      by each component's X or Y alignment value.
// 
// 
//
// 
//
// Each SizeRequirements object contains information
// about either the width (and X alignment)
// or height (and Y alignment)
// of a single component or a group of components:
//
// 
// 
//  minimum
//  The smallest reasonable width/height of the component
//      or component group, in pixels.
//
//  preferred
//  The natural width/height of the component
//      or component group, in pixels.
//
//  maximum
//  The largest reasonable width/height of the component
//      or component group, in pixels.
//
//  alignment
//  The X/Y alignment of the component
//      or component group.
// 
// 
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SizeRequirements extends Object with Serializable {

    @stub
    // Creates a SizeRequirements object with the minimum, preferred,
    // and maximum sizes set to zero and an alignment value of 0.5
    // (centered).
    def this() = ???

    @stub
    // The alignment, specified as a value between 0.0 and 1.0,
    // inclusive.
    def alignment: float = ???

    @stub
    // The maximum size allowed.
    def maximum: Int = ???

    @stub
    // The minimum size required.
    def minimum: Int = ???
}

object SizeRequirements {
    @stub
    // Adjust a specified array of sizes by a given amount.
    def adjustSizes(delta: Int, children: Array[SizeRequirements]): Array[Int] = ???

    @stub
    // Creates a bunch of offset/span pairs specifying how to
    // lay out a set of components with the specified alignments.
    def calculateAlignedPositions(allocated: Int, total: SizeRequirements, children: Array[SizeRequirements], offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Creates a set of offset/span pairs specifying how to
    // lay out a set of components with the specified alignments.
    def calculateAlignedPositions(allocated: Int, total: SizeRequirements, children: Array[SizeRequirements], offsets: Array[Int], spans: Array[Int], normal: Boolean): Unit = ???

    @stub
    // Creates a set of offset/span pairs representing how to
    // lay out a set of components end-to-end.
    def calculateTiledPositions(allocated: Int, total: SizeRequirements, children: Array[SizeRequirements], offsets: Array[Int], spans: Array[Int]): Unit = ???

    @stub
    // Creates a set of offset/span pairs representing how to
    // lay out a set of components end-to-end.
    def calculateTiledPositions(allocated: Int, total: SizeRequirements, children: Array[SizeRequirements], offsets: Array[Int], spans: Array[Int], forward: Boolean): Unit = ???

    @stub
    // Determines the total space necessary to
    // align a set of components.
    def getAlignedSizeRequirements(children: Array[SizeRequirements]): SizeRequirements = ???

    @stub
    // Determines the total space necessary to
    // place a set of components end-to-end.
    def getTiledSizeRequirements(children: Array[SizeRequirements]): SizeRequirements = ???
}
