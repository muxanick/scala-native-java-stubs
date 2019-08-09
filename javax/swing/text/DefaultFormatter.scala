package javax.swing.text

import java.io.Serializable
import java.lang.{Class, Cloneable, Object, String}
import javax.swing.{JFormattedTextField, JFormattedTextField.AbstractFormatter}
import scala.scalanative.annotation.stub

/** DefaultFormatter formats arbitrary objects. Formatting is done
 *  by invoking the toString method. In order to convert the
 *  value back to a String, your class must provide a constructor that
 *  takes a String argument. If no single argument constructor that takes a
 *  String is found, the returned value will be the String passed into
 *  stringToValue.
 *  
 *  Instances of DefaultFormatter can not be used in multiple
 *  instances of JFormattedTextField. To obtain a copy of
 *  an already configured DefaultFormatter, use the
 *  clone method.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class DefaultFormatter extends JFormattedTextField.AbstractFormatter with Cloneable with Serializable {

    /** Creates a DefaultFormatter. */
    @stub
    def this() = ???

    /** Creates a copy of the DefaultFormatter. */
    @stub
    def clone(): Object = ???

    /** Returns whether or not the value being edited is allowed to be invalid
     *  for a length of time.
     */
    @stub
    def getAllowsInvalid(): Boolean = ???

    /** Returns when edits are published back to the
     *  JFormattedTextField.
     */
    @stub
    def getCommitsOnValidEdit(): Boolean = ???

    /** Returns the DocumentFilter used to restrict the characters
     *  that can be input into the JFormattedTextField.
     */
    @stub
    protected def getDocumentFilter(): DocumentFilter = ???

    /** Returns the NavigationFilter used to restrict where the
     *  cursor can be placed.
     */
    @stub
    protected def getNavigationFilter(): NavigationFilter = ???

    /** Returns the behavior when inserting characters. */
    @stub
    def getOverwriteMode(): Boolean = ???

    /** Returns that class that is used to create new Objects. */
    @stub
    def getValueClass(): Class[_] = ???

    /** Installs the DefaultFormatter onto a particular
     *  JFormattedTextField.
     */
    @stub
    def install(ftf: JFormattedTextField): Unit = ???

    /** Sets whether or not the value being edited is allowed to be invalid
     *  for a length of time (that is, stringToValue throws
     *  a ParseException).
     */
    @stub
    def setAllowsInvalid(allowsInvalid: Boolean): Unit = ???

    /** Sets when edits are published back to the
     *  JFormattedTextField.
     */
    @stub
    def setCommitsOnValidEdit(commit: Boolean): Unit = ???

    /** Configures the behavior when inserting characters. */
    @stub
    def setOverwriteMode(overwriteMode: Boolean): Unit = ???

    /** Sets that class that is used to create new Objects. */
    @stub
    def setValueClass(valueClass: Class[_]): Unit = ???

    /** Converts the passed in String into an instance of
     *  getValueClass by way of the constructor that
     *  takes a String argument.
     */
    @stub
    def stringToValue(string: String): Object = ???

    /** Converts the passed in Object into a String by way of the
     *  toString method.
     */
    @stub
    def valueToString(value: Object): String = ???
}
