package javax.swing

import java.awt.Component
import scala.scalanative.annotation.stub

/** Identifies components that can be used as "rubber stamps" to paint
 *  the cells in a JList.  For example, to use a JLabel as a
 *  ListCellRenderer, you would write something like this:
 *  
 *  
 *  class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
 *      public MyCellRenderer() {
 *          setOpaque(true);
 *      }
 * 
 *      public Component getListCellRendererComponent(JList<?> list,
 *                                                    Object value,
 *                                                    int index,
 *                                                    boolean isSelected,
 *                                                    boolean cellHasFocus) {
 * 
 *          setText(value.toString());
 * 
 *          Color background;
 *          Color foreground;
 * 
 *          // check if this cell represents the current DnD drop location
 *          JList.DropLocation dropLocation = list.getDropLocation();
 *          if (dropLocation != null
 *                  && !dropLocation.isInsert()
 *                  && dropLocation.getIndex() == index) {
 * 
 *              background = Color.BLUE;
 *              foreground = Color.WHITE;
 * 
 *          // check if this cell is selected
 *          } else if (isSelected) {
 *              background = Color.RED;
 *              foreground = Color.WHITE;
 * 
 *          // unselected, and not the DnD drop location
 *          } else {
 *              background = Color.WHITE;
 *              foreground = Color.BLACK;
 *          };
 * 
 *          setBackground(background);
 *          setForeground(foreground);
 * 
 *          return this;
 *      }
 *  }
 *  
 *  
 */
trait ListCellRenderer[E] {

    /** Return a component that has been configured to display the specified
     *  value.
     */
    @stub
    def getListCellRendererComponent(list: JList[_ <: E], value: E, index: Int, isSelected: Boolean, cellHasFocus: Boolean): Component = ???
}
