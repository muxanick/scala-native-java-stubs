package javax.swing

import java.awt.Component
import java.lang.Object

// An instance of the Spring class holds three properties that
//  characterize its behavior: the minimum, preferred, and
//  maximum values. Each of these properties may be involved in
//  defining its fourth, value, property based on a series of rules.
//  
//  An instance of the Spring class can be visualized as a
//  mechanical spring that provides a corrective force as the spring is compressed
//  or stretched away from its preferred value. This force is modelled
//  as linear function of the distance from the preferred value, but with
//  two different constants -- one for the compressional force and one for the
//  tensional one. Those constants are specified by the minimum and maximum
//  values of the spring such that a spring at its minimum value produces an
//  equal and opposite force to that which is created when it is at its
//  maximum value. The difference between the preferred and
//  minimum values, therefore, represents the ease with which the
//  spring can be compressed and the difference between its maximum
//  and preferred values, indicates the ease with which the
//  Spring can be extended.
//  See the sum(javax.swing.Spring, javax.swing.Spring) method for details.
//
//  
//  By defining simple arithmetic operations on Springs,
//  the behavior of a collection of Springs
//  can be reduced to that of an ordinary (non-compound) Spring. We define
//  the "+", "-", max, and min operators on
//  Springs so that, in each case, the result is a Spring
//  whose characteristics bear a useful mathematical relationship to its constituent
//  springs.
//
//  
//  A Spring can be treated as a pair of intervals
//  with a single common point: the preferred value.
//  The following rules define some of the
//  arithmetic operators that can be applied to intervals
//  ([a, b] refers to the interval
//  from a
//  to b,
//  where a <= b).
//
//  
//          [a1, b1] + [a2, b2] = [a1 + a2, b1 + b2]
//
//                      -[a, b] = [-b, -a]
//
//      max([a1, b1], [a2, b2]) = [max(a1, a2), max(b1, b2)]
//  
//  
//
//  If we denote Springs as [a, b, c],
//  where a <= b <= c, we can define the same
//  arithmetic operators on Springs:
//
//  
//          [a1, b1, c1] + [a2, b2, c2] = [a1 + a2, b1 + b2, c1 + c2]
//
//                           -[a, b, c] = [-c, -b, -a]
//
//      max([a1, b1, c1], [a2, b2, c2]) = [max(a1, a2), max(b1, b2), max(c1, c2)]
//  
//  
//  With both intervals and Springs we can define "-" and min
//  in terms of negation:
//
//  
//      X - Y = X + (-Y)
//
//      min(X, Y) = -max(-X, -Y)
//  
//  
//  For the static methods in this class that embody the arithmetic
//  operators, we do not actually perform the operation in question as
//  that would snapshot the values of the properties of the method's arguments
//  at the time the static method is called. Instead, the static methods
//  create a new Spring instance containing references to
//  the method's arguments so that the characteristics of the new spring track the
//  potentially changing characteristics of the springs from which it
//  was made. This is a little like the idea of a lazy value
//  in a functional language.
// 
// If you are implementing a SpringLayout you
// can find further information and examples in
// How to Use SpringLayout,
// a section in The Java Tutorial.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class Spring extends Object {

    // Returns the maximum value of this Spring.
    def getMaximumValue(): Int

    // Returns the minimum value of this Spring.
    def getMinimumValue(): Int

    // Returns the preferred value of this Spring.
    def getPreferredValue(): Int

    // Returns the current value of this Spring.
    def getValue(): Int

    // Sets the current value of this Spring to value.
    def setValue(value: Int): Unit
}

object Spring {
    @stub
    // Returns a strut -- a spring whose minimum, preferred, and
    // maximum values each have the value pref.
    def constant(pref: Int): Spring = ???

    @stub
    // Returns a spring whose minimum, preferred, and
    // maximum values have the values: min, pref,
    // and max respectively.
    def constant(min: Int, pref: Int, max: Int): Spring = ???

    @stub
    // Returns a spring whose minimum, preferred, maximum
    // and value properties are defined by the heights of the minimumSize,
    // preferredSize, maximumSize and size properties
    // of the supplied component.
    def height(c: Component): Spring = ???

    @stub
    // Returns max(s1, s2): a spring whose value is always greater than (or equal to)
    //         the values of both s1 and s2.
    def max(s1: Spring, s2: Spring): Spring = ???

    @stub
    // Returns -s: a spring running in the opposite direction to s.
    def minus(s: Spring): Spring = ???

    @stub
    // Returns a spring whose minimum, preferred, maximum
    // and value properties are each multiples of the properties of the
    // argument spring, s.
    def scale(s: Spring, factor: float): Spring = ???

    @stub
    // Returns s1+s2: a spring representing s1 and s2
    // in series.
    def sum(s1: Spring, s2: Spring): Spring = ???
}
