package java.awt

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The CheckboxGroup class is used to group together
 *  a set of Checkbox buttons.
 *  
 *  Exactly one check box button in a CheckboxGroup can
 *  be in the "on" state at any given time. Pushing any
 *  button sets its state to "on" and forces any other button that
 *  is in the "on" state into the "off" state.
 *  
 *  The following code example produces a new check box group,
 *  with three check boxes:
 * 
 *  
 *  setLayout(new GridLayout(3, 1));
 *  CheckboxGroup cbg = new CheckboxGroup();
 *  add(new Checkbox("one", cbg, true));
 *  add(new Checkbox("two", cbg, false));
 *  add(new Checkbox("three", cbg, false));
 *  
 *  
 *  This image depicts the check box group created by this example:
 *  
 *  
 *  
 */
class CheckboxGroup extends Object with Serializable {

    /** Creates a new instance of CheckboxGroup. */
    @stub
    def this() = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by getSelectedCheckbox().
     * 
     */
    @stub
    def getCurrent(): Checkbox = ???

    /** Gets the current choice from this check box group. */
    @stub
    def getSelectedCheckbox(): Checkbox = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setSelectedCheckbox(Checkbox).
     * 
     */
    @stub
    def setCurrent(box: Checkbox): Unit = ???

    /** Sets the currently selected check box in this group
     *  to be the specified check box.
     */
    @stub
    def setSelectedCheckbox(box: Checkbox): Unit = ???

    /** Returns a string representation of this check box group,
     *  including the value of its current selection.
     */
    @stub
    def toString(): String = ???
}
