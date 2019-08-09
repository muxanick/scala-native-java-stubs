package javax.print

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Services may optionally provide UIs which allow different styles
 *  of interaction in different roles.
 *  One role may be end-user browsing and setting of print options.
 *  Another role may be administering the print service.
 *  
 *  Although the Print Service API does not presently provide standardised
 *  support for administering a print service, monitoring of the print
 *  service is possible and a UI may provide for private update mechanisms.
 *  
 *  The basic design intent is to allow applications to lazily locate and
 *  initialize services only when needed without any API dependencies
 *  except in an environment in which they are used.
 *  
 *  Swing UIs are preferred as they provide a more consistent L&F
 *  and can support accessibility APIs.
 *  
 *  Example usage:
 *  
 *   ServiceUIFactory factory = printService.getServiceUIFactory();
 *   if (factory != null) {
 *       JComponent swingui = (JComponent)factory.getUI(
 *                                          ServiceUIFactory.MAIN_UIROLE,
 *                                          ServiceUIFactory.JCOMPONENT_UI);
 *       if (swingui != null) {
 *           tabbedpane.add("Custom UI", swingui);
 *       }
 *   }
 *  
 */
abstract class ServiceUIFactory extends Object {

    /**  */
    @stub
    def this() = ???

    /** Get a UI object which may be cast to the requested UI type
     *  by the application and used in its user interface.
     */
    def getUI(role: Int, ui: String): Object

    /** Given a UI role obtained from this factory obtain the UI
     *  types available from this factory which implement this role.
     */
    def getUIClassNamesForRole(role: Int): Array[String]
}

object ServiceUIFactory {
    /** Denotes a UI which performs an informative "About" role. */
    @stub
    val ABOUT_UIROLE: Int = ???

    /** Denotes a UI which performs an administrative role. */
    @stub
    val ADMIN_UIROLE: Int = ???

    /** Denotes a UI implemented as an AWT dialog. */
    @stub
    val DIALOG_UI: String = ???

    /** Denotes a UI implemented as a Swing component. */
    @stub
    val JCOMPONENT_UI: String = ???

    /** Denotes a UI implemented as a Swing dialog. */
    @stub
    val JDIALOG_UI: String = ???

    /** Denotes a UI which performs the normal end user role. */
    @stub
    val MAIN_UIROLE: Int = ???

    /** Denotes a UI implemented as an AWT panel. */
    @stub
    val PANEL_UI: String = ???

    /** Not a valid role but role id's greater than this may be used
     *  for private roles supported by a service.
     */
    @stub
    val RESERVED_UIROLE: Int = ???
}
