package javax.swing

import java.lang.Object
import javax.swing.event.ChangeListener

// A model for a potentially unbounded sequence of object values.  This model
// is similar to ListModel however there are some important differences:
// 
//  The number of sequence elements isn't necessarily bounded.
//  The model doesn't support indexed random access to sequence elements.
//      Only three sequence values are accessible at a time: current, next and
//      previous.
//  The current sequence element, can be set.
// 
// 
// A SpinnerModel has three properties, only the first is read/write.
// 
//   value
//   The current element of the sequence.
//
//   nextValue
//   The following element or null if value is the
//     last element of the sequence.
//
//   previousValue
//   The preceding element or null if value is the
//     first element of the sequence.
// 
// When the the value property changes,
// ChangeListeners are notified.  SpinnerModel may
// choose to notify the ChangeListeners under other circumstances.
trait SpinnerModel {

    @stub
    // Adds a ChangeListener to the model's listener list.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Return the object in the sequence that comes after the object returned
    // by getValue().
    def getNextValue(): Object = ???

    @stub
    // Return the object in the sequence that comes before the object returned
    // by getValue().
    def getPreviousValue(): Object = ???

    @stub
    // The current element of the sequence.
    def getValue(): Object = ???

    @stub
    // Removes a ChangeListener from the model's listener list.
    def removeChangeListener(l: ChangeListener): Unit = ???
}
