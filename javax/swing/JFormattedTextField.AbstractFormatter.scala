package javax.swing

import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.text.{DocumentFilter, NavigationFilter}
import scala.scalanative.annotation.stub

/** Instances of AbstractFormatter are used by
 *  JFormattedTextField to handle the conversion both
 *  from an Object to a String, and back from a String to an Object.
 *  AbstractFormatters can also enforce editing policies,
 *  or navigation policies, or manipulate the
 *  JFormattedTextField in any way it sees fit to
 *  enforce the desired policy.
 *  
 *  An AbstractFormatter can only be active in
 *  one JFormattedTextField at a time.
 *  JFormattedTextField invokes
 *  install when it is ready to use it followed
 *  by uninstall when done. Subclasses
 *  that wish to install additional state should override
 *  install and message super appropriately.
 *  
 *  Subclasses must override the conversion methods
 *  stringToValue and valueToString. Optionally
 *  they can override getActions,
 *  getNavigationFilter and getDocumentFilter
 *  to restrict the JFormattedTextField in a particular
 *  way.
 *  
 *  Subclasses that allow the JFormattedTextField to be in
 *  a temporarily invalid state should invoke setEditValid
 *  at the appropriate times.
 */
object abstract JFormattedTextField.AbstractFormatter extends Object with Serializable {

    /**  */
    @stub
    def AbstractFormatter() = ???

    /** Clones the AbstractFormatter. */
    @stub
    protected def clone(): Object = ???

    /** Subclass and override if you wish to provide a custom set of
     *  Actions.
     */
    @stub
    protected def getActions(): Array[Action] = ???

    /** Subclass and override if you wish to provide a
     *  DocumentFilter to restrict what can be input.
     */
    @stub
    protected def getDocumentFilter(): DocumentFilter = ???

    /** Returns the current JFormattedTextField the
     *  AbstractFormatter is installed on.
     */
    @stub
    protected def getFormattedTextField(): JFormattedTextField = ???

    /** Subclass and override if you wish to provide a filter to restrict
     *  where the user can navigate to.
     */
    @stub
    protected def getNavigationFilter(): NavigationFilter = ???

    /** Installs the AbstractFormatter onto a particular
     *  JFormattedTextField.
     */
    @stub
    def install(ftf: JFormattedTextField): Unit = ???

    /** This should be invoked when the user types an invalid character. */
    @stub
    protected def invalidEdit(): Unit = ???

    /** Invoke this to update the editValid property of the
     *  JFormattedTextField.
     */
    @stub
    protected def setEditValid(valid: Boolean): Unit = ???

    /** Parses text returning an arbitrary Object. */
    @stub
    def stringToValue(text: String): Object

    /** Uninstalls any state the AbstractFormatter may have
     *  installed on the JFormattedTextField.
     */
    @stub
    def uninstall(): Unit = ???

    /** Returns the string value to display for value. */
    @stub
    def valueToString(value: Object): String
}
