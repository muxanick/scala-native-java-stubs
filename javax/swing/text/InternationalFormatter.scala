package javax.swing.text

import java.lang.{Comparable, Object, String}
import java.text.{Format, Format.Field}
import javax.swing.{Action, JFormattedTextField, JFormattedTextField.AbstractFormatter}

// InternationalFormatter extends DefaultFormatter,
// using an instance of java.text.Format to handle the
// conversion to a String, and the conversion from a String.
// 
// If getAllowsInvalid() is false, this will ask the
// Format to format the current text on every edit.
// 
// You can specify a minimum and maximum value by way of the
// setMinimum and setMaximum methods. In order
// for this to work the values returned from stringToValue must be
// comparable to the min/max values by way of the Comparable
// interface.
// 
// Be careful how you configure the Format and the
// InternationalFormatter, as it is possible to create a
// situation where certain values can not be input. Consider the date
// format 'M/d/yy', an InternationalFormatter that is always
// valid (setAllowsInvalid(false)), is in overwrite mode
// (setOverwriteMode(true)) and the date 7/1/99. In this
// case the user will not be able to enter a two digit month or day of
// month. To avoid this, the format should be 'MM/dd/yy'.
// 
// If InternationalFormatter is configured to only allow valid
// values (setAllowsInvalid(false)), every valid edit will result
// in the text of the JFormattedTextField being completely reset
// from the Format.
// The cursor position will also be adjusted as literal characters are
// added/removed from the resulting String.
// 
// InternationalFormatter's behavior of
// stringToValue is  slightly different than that of
// DefaultTextFormatter, it does the following:
// 
//   parseObject is invoked on the Format
//       specified by setFormat
//   If a Class has been set for the values (setValueClass),
//       supers implementation is invoked to convert the value returned
//       from parseObject to the appropriate class.
//   If a ParseException has not been thrown, and the value
//       is outside the min/max a ParseException is thrown.
//   The value is returned.
// 
// InternationalFormatter implements stringToValue
// in this manner so that you can specify an alternate Class than
// Format may return.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class InternationalFormatter extends DefaultFormatter {

    @stub
    // Creates an InternationalFormatter with no
    // Format specified.
    def this() = ???

    @stub
    // Creates a copy of the DefaultFormatter.
    def clone(): Object = ???

    @stub
    // If getSupportsIncrement returns true, this returns
    // two Actions suitable for incrementing/decrementing the value.
    protected def getActions(): Array[Action] = ???

    @stub
    // Returns the Format.Field constants associated with
    // the text at offset.
    def getFields(offset: Int): Array[Format.Field] = ???

    @stub
    // Returns the format that dictates the legal values that can be edited
    // and displayed.
    def getFormat(): Format = ???

    @stub
    // Returns the maximum permissible value.
    def getMaximum(): Comparable = ???

    @stub
    // Returns the minimum permissible value.
    def getMinimum(): Comparable = ???

    @stub
    // Installs the DefaultFormatter onto a particular
    // JFormattedTextField.
    def install(ftf: JFormattedTextField): Unit = ???

    @stub
    // Sets the format that dictates the legal values that can be edited
    // and displayed.
    def setFormat(format: Format): Unit = ???

    @stub
    // Sets the maximum permissible value.
    def setMaximum(max: Comparable): Unit = ???

    @stub
    // Sets the minimum permissible value.
    def setMinimum(minimum: Comparable): Unit = ???

    @stub
    // Returns the Object representation of the
    // String text.
    def stringToValue(text: String): Object = ???
}
