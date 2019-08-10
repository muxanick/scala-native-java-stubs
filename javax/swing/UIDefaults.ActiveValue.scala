package javax.swing

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class enables one to store an entry in the defaults
 *  table that's constructed each time it's looked up with one of
 *  the getXXX(key) methods. Here's an example of
 *  an ActiveValue that constructs a
 *  DefaultListCellRenderer:
 *  
 *   Object cellRendererActiveValue = new UIDefaults.ActiveValue() {
 *       public Object createValue(UIDefaults table) {
 *           return new DefaultListCellRenderer();
 *       }
 *   };
 * 
 *   uiDefaultsTable.put("MyRenderer", cellRendererActiveValue);
 *  
 */
trait UIDefaults_ActiveValue {

    /** Creates the value retrieved from the UIDefaults table. */
    @stub
    def createValue(table: UIDefaults): Any = ???
}
