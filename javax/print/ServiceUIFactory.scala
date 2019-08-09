package javax.print

import java.lang.{Object, String}

// Services may optionally provide UIs which allow different styles
// of interaction in different roles.
// One role may be end-user browsing and setting of print options.
// Another role may be administering the print service.
// 
// Although the Print Service API does not presently provide standardised
// support for administering a print service, monitoring of the print
// service is possible and a UI may provide for private update mechanisms.
// 
// The basic design intent is to allow applications to lazily locate and
// initialize services only when needed without any API dependencies
// except in an environment in which they are used.
// 
// Swing UIs are preferred as they provide a more consistent L&F
// and can support accessibility APIs.
// 
// Example usage:
// 
//  ServiceUIFactory factory = printService.getServiceUIFactory();
//  if (factory != null) {
//      JComponent swingui = (JComponent)factory.getUI(
//                                         ServiceUIFactory.MAIN_UIROLE,
//                                         ServiceUIFactory.JCOMPONENT_UI);
//      if (swingui != null) {
//          tabbedpane.add("Custom UI", swingui);
//      }
//  }
// 
abstract class ServiceUIFactory extends Object {

    // Get a UI object which may be cast to the requested UI type
    // by the application and used in its user interface.
    def getUI(role: Int, ui: String): Object
}

object ServiceUIFactory {
    @stub
    // Denotes a UI which performs an informative "About" role.
    def ABOUT_UIROLE: Int = ???

    @stub
    // Denotes a UI which performs an administrative role.
    def ADMIN_UIROLE: Int = ???

    @stub
    // Denotes a UI implemented as an AWT dialog.
    def DIALOG_UI: String = ???

    @stub
    // Denotes a UI implemented as a Swing component.
    def JCOMPONENT_UI: String = ???

    @stub
    // Denotes a UI implemented as a Swing dialog.
    def JDIALOG_UI: String = ???

    @stub
    // Denotes a UI which performs the normal end user role.
    def MAIN_UIROLE: Int = ???

    @stub
    // Denotes a UI implemented as an AWT panel.
    def PANEL_UI: String = ???
}