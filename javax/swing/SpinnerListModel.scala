package javax.swing

import java.io.Serializable
import java.lang.Object
import java.util.List
import scala.scalanative.annotation.stub

/** A simple implementation of SpinnerModel whose
 *  values are defined by an array or a List.
 *  For example to create a model defined by
 *  an array of the names of the days of the week:
 *  
 *  String[] days = new DateFormatSymbols().getWeekdays();
 *  SpinnerModel model = new SpinnerListModel(Arrays.asList(days).subList(1, 8));
 *  
 *  This class only stores a reference to the array or List
 *  so if an element of the underlying sequence changes, it's up
 *  to the application to notify the ChangeListeners by calling
 *  fireStateChanged.
 *  
 *  This model inherits a ChangeListener.
 *  The ChangeListeners are notified whenever the
 *  model's value or list properties changes.
 */
class SpinnerListModel extends AbstractSpinnerModel with Serializable {

    /** Constructs an effectively empty SpinnerListModel. */
    @stub
    def this() = ???

    /** Constructs a SpinnerModel whose sequence of
     *  values is defined by the specified List.
     */
    @stub
    def this(values: List[_]) = ???

    /** Constructs a SpinnerModel whose sequence of values
     *  is defined by the specified array.
     */
    @stub
    def this(values: Array[Object]) = ???

    /** Returns the List that defines the sequence for this model. */
    @stub
    def getList(): List[_] = ???

    /** Returns the next legal value of the underlying sequence or
     *  null if value is already the last element.
     */
    @stub
    def getNextValue(): Object = ???

    /** Returns the previous element of the underlying sequence or
     *  null if value is already the first element.
     */
    @stub
    def getPreviousValue(): Object = ???

    /** Returns the current element of the sequence. */
    @stub
    def getValue(): Object = ???

    /** Changes the list that defines this sequence and resets the index
     *  of the models value to zero.
     */
    @stub
    def setList(list: List[_]): Unit = ???

    /** Changes the current element of the sequence and notifies
     *  ChangeListeners.
     */
    @stub
    def setValue(elt: Object): Unit = ???
}
