package javax.swing

import java.lang.Object

/** LazyInputMap will create a InputMap
 *  in its createValue
 *  method. The bindings are passed in in the constructor.
 *  The bindings are an array with
 *  the even number entries being string KeyStrokes
 *  (eg "alt SPACE") and
 *  the odd number entries being the value to use in the
 *  InputMap (and the key in the ActionMap).
 */
object UIDefaults.LazyInputMap extends Object with UIDefaults.LazyValue {
