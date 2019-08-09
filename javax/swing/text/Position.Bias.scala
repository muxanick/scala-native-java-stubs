package javax.swing.text

import java.lang.Object

// A typesafe enumeration to indicate bias to a position
// in the model.  A position indicates a location between
// two characters.  The bias can be used to indicate an
// interest toward one of the two sides of the position
// in boundary conditions where a simple offset is
// ambiguous.
object final Position.Bias extends Object {

    @stub
    // Indicates a bias toward the previous character
    // in the model.
    def Backward: Position.Bias = ???
}
