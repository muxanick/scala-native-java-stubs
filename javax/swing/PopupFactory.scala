package javax.swing

import java.awt.Component
import java.lang.Object
import scala.scalanative.annotation.stub

/** PopupFactory, as the name implies, is used to obtain
 *  instances of Popups. Popups are used to
 *  display a Component above all other Components
 *  in a particular containment hierarchy. The general contract is that
 *  once you have obtained a Popup from a
 *  PopupFactory, you must invoke hide on the
 *  Popup. The typical usage is:
 *  
 *    PopupFactory factory = PopupFactory.getSharedInstance();
 *    Popup popup = factory.getPopup(owner, contents, x, y);
 *    popup.show();
 *    ...
 *    popup.hide();
 *  
 */
class PopupFactory extends Object {

    /**  */
    @stub
    def this() = ???

    /** Creates a Popup for the Component owner
     *  containing the Component contents.
     */
    @stub
    def getPopup(owner: Component, contents: Component, x: Int, y: Int): Popup = ???
}

object PopupFactory {
    /** Returns the shared PopupFactory which can be used
     *  to obtain Popups.
     */
    @stub
    def getSharedInstance(): PopupFactory = ???

    /** Sets the PopupFactory that will be used to obtain
     *  Popups.
     */
    @stub
    def setSharedInstance(factory: PopupFactory): Unit = ???
}
