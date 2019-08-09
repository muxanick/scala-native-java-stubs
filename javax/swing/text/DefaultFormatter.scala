package javax.swing.text

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import javax.swing.{JFormattedTextField, JFormattedTextField.AbstractFormatter}

// DefaultFormatter formats arbitrary objects. Formatting is done
// by invoking the toString method. In order to convert the
// value back to a String, your class must provide a constructor that
// takes a String argument. If no single argument constructor that takes a
// String is found, the returned value will be the String passed into
// stringToValue.
// 
// Instances of DefaultFormatter can not be used in multiple
// instances of JFormattedTextField. To obtain a copy of
// an already configured DefaultFormatter, use the
// clone method.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultFormatter extends JFormattedTextField.AbstractFormatter with Cloneable, with Serializable {

    @stub
    // Creates a copy of the DefaultFormatter.
    def clone(): Object = ???

    @stub
    // Returns whether or not the value being edited is allowed to be invalid
    // for a length of time.
    def getAllowsInvalid(): Boolean = ???

    @stub
    // Returns when edits are published back to the
    // JFormattedTextField.
    def getCommitsOnValidEdit(): Boolean = ???

    @stub
    // Returns the DocumentFilter used to restrict the characters
    // that can be input into the JFormattedTextField.
    protected def getDocumentFilter(): DocumentFilter = ???

    @stub
    // Returns the NavigationFilter used to restrict where the
    // cursor can be placed.
    protected def getNavigationFilter(): NavigationFilter = ???

    @stub
    // Returns the behavior when inserting characters.
    def getOverwriteMode(): Boolean = ???

    @stub
    // Returns that class that is used to create new Objects.
    def getValueClass(): Class[_] = ???

    @stub
    // Installs the DefaultFormatter onto a particular
    // JFormattedTextField.
    def install(ftf: JFormattedTextField): Unit = ???

    @stub
    // Sets whether or not the value being edited is allowed to be invalid
    // for a length of time (that is, stringToValue throws
    // a ParseException).
    def setAllowsInvalid(allowsInvalid: Boolean): Unit = ???

    @stub
    // Sets when edits are published back to the
    // JFormattedTextField.
    def setCommitsOnValidEdit(commit: Boolean): Unit = ???

    @stub
    // Configures the behavior when inserting characters.
    def setOverwriteMode(overwriteMode: Boolean): Unit = ???

    @stub
    // Sets that class that is used to create new Objects.
    def setValueClass(valueClass: Class[_]): Unit = ???

    @stub
    // Converts the passed in String into an instance of
    // getValueClass by way of the constructor that
    // takes a String argument.
    def stringToValue(string: String): Object = ???
}
