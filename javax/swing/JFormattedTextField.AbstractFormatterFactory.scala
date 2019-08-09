package javax.swing

import java.lang.Object

// Instances of AbstractFormatterFactory are used by
// JFormattedTextField to obtain instances of
// AbstractFormatter which in turn are used to format values.
// AbstractFormatterFactory can return different
// AbstractFormatters based on the state of the
// JFormattedTextField, perhaps returning different
// AbstractFormatters when the
// JFormattedTextField has focus vs when it
// doesn't have focus.
object abstract JFormattedTextField.AbstractFormatterFactory extends Object {
