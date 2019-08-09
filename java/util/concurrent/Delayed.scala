package java.util.concurrent

import java.lang.Comparable

// A mix-in style interface for marking objects that should be
// acted upon after a given delay.
//
// An implementation of this interface must define a
// compareTo method that provides an ordering consistent with
// its getDelay method.
trait Delayed extends Comparable[Delayed] {
}
