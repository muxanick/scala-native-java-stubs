package javax.swing

/** This class enables one to store an entry in the defaults
 *  table that isn't constructed until the first time it's
 *  looked up with one of the getXXX(key) methods.
 *  Lazy values are useful for defaults that are expensive
 *  to construct or are seldom retrieved.  The first time
 *  a LazyValue is retrieved its "real value" is computed
 *  by calling LazyValue.createValue() and the real
 *  value is used to replace the LazyValue in the
 *  UIDefaults
 *  table.  Subsequent lookups for the same key return
 *  the real value.  Here's an example of a LazyValue
 *  that constructs a Border:
 *  
 *   Object borderLazyValue = new UIDefaults.LazyValue() {
 *       public Object createValue(UIDefaults table) {
 *           return new BorderFactory.createLoweredBevelBorder();
 *       }
 *   };
 * 
 *   uiDefaultsTable.put("MyBorder", borderLazyValue);
 *  
 */
object trait UIDefaults.LazyValue {
