package javax.accessibility

import java.lang.Number

// The AccessibleValue interface should be supported by any object
// that supports a numerical value (e.g., a scroll bar).  This interface
// provides the standard mechanism for an assistive technology to determine
// and set the numerical value as well as get the minimum and maximum values.
// Applications can determine
// if an object supports the AccessibleValue interface by first
// obtaining its AccessibleContext (see
// Accessible) and then calling the
// AccessibleContext.getAccessibleValue() method.
// If the return value is not null, the object supports this interface.
trait AccessibleValue {

    @stub
    // Get the value of this object as a Number.
    def getCurrentAccessibleValue(): Number = ???

    @stub
    // Get the maximum value of this object as a Number.
    def getMaximumAccessibleValue(): Number = ???

    @stub
    // Get the minimum value of this object as a Number.
    def getMinimumAccessibleValue(): Number = ???
}
