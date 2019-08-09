package javax.swing

import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.text.{DocumentFilter, NavigationFilter}

// Instances of AbstractFormatter are used by
// JFormattedTextField to handle the conversion both
// from an Object to a String, and back from a String to an Object.
// AbstractFormatters can also enforce editing policies,
// or navigation policies, or manipulate the
// JFormattedTextField in any way it sees fit to
// enforce the desired policy.
// 
// An AbstractFormatter can only be active in
// one JFormattedTextField at a time.
// JFormattedTextField invokes
// install when it is ready to use it followed
// by uninstall when done. Subclasses
// that wish to install additional state should override
// install and message super appropriately.
// 
// Subclasses must override the conversion methods
// stringToValue and valueToString. Optionally
// they can override getActions,
// getNavigationFilter and getDocumentFilter
// to restrict the JFormattedTextField in a particular
// way.
// 
// Subclasses that allow the JFormattedTextField to be in
// a temporarily invalid state should invoke setEditValid
// at the appropriate times.
object abstract JFormattedTextField.AbstractFormatter extends Object with Serializable {

    @stub
    // Clones the AbstractFormatter.
    protected def clone(): Object = ???

    @stub
    // Subclass and override if you wish to provide a custom set of
    // Actions.
    protected def getActions(): Array[Action] = ???

    @stub
    // Subclass and override if you wish to provide a
    // DocumentFilter to restrict what can be input.
    protected def getDocumentFilter(): DocumentFilter = ???

    @stub
    // Returns the current JFormattedTextField the
    // AbstractFormatter is installed on.
    protected def getFormattedTextField(): JFormattedTextField = ???

    @stub
    // Subclass and override if you wish to provide a filter to restrict
    // where the user can navigate to.
    protected def getNavigationFilter(): NavigationFilter = ???

    @stub
    // Installs the AbstractFormatter onto a particular
    // JFormattedTextField.
    def install(ftf: JFormattedTextField): Unit = ???

    @stub
    // This should be invoked when the user types an invalid character.
    protected def invalidEdit(): Unit = ???

    @stub
    // Invoke this to update the editValid property of the
    // JFormattedTextField.
    protected def setEditValid(valid: Boolean): Unit = ???

    @stub
    // Parses text returning an arbitrary Object.
    def stringToValue(text: String): Object

    @stub
    // Uninstalls any state the AbstractFormatter may have
    // installed on the JFormattedTextField.
    def uninstall(): Unit = ???
}
