package javax.swing

import java.io.Serializable
import java.lang.Object
import java.util.List

// A simple implementation of SpinnerModel whose
// values are defined by an array or a List.
// For example to create a model defined by
// an array of the names of the days of the week:
// 
// String[] days = new DateFormatSymbols().getWeekdays();
// SpinnerModel model = new SpinnerListModel(Arrays.asList(days).subList(1, 8));
// 
// This class only stores a reference to the array or List
// so if an element of the underlying sequence changes, it's up
// to the application to notify the ChangeListeners by calling
// fireStateChanged.
// 
// This model inherits a ChangeListener.
// The ChangeListeners are notified whenever the
// model's value or list properties changes.
class SpinnerListModel extends AbstractSpinnerModel with Serializable {

    @stub
    // Constructs an effectively empty SpinnerListModel.
    def this() = ???

    @stub
    // Constructs a SpinnerModel whose sequence of
    // values is defined by the specified List.
    def this(values: List[_]) = ???

    @stub
    // Returns the List that defines the sequence for this model.
    def getList(): List[_] = ???

    @stub
    // Returns the next legal value of the underlying sequence or
    // null if value is already the last element.
    def getNextValue(): Object = ???

    @stub
    // Returns the previous element of the underlying sequence or
    // null if value is already the first element.
    def getPreviousValue(): Object = ???

    @stub
    // Returns the current element of the sequence.
    def getValue(): Object = ???

    @stub
    // Changes the list that defines this sequence and resets the index
    // of the models value to zero.
    def setList(list: List[_]): Unit = ???
}
