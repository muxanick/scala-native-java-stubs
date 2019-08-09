package java.awt

import java.beans.PropertyChangeListener
import java.lang.{Object, String}

// The SystemTray class represents the system tray for a
// desktop.  On Microsoft Windows it is referred to as the "Taskbar
// Status Area", on Gnome it is referred to as the "Notification
// Area", on KDE it is referred to as the "System Tray".  The system
// tray is shared by all applications running on the desktop.
//
//  On some platforms the system tray may not be present or may not
// be supported, in this case getSystemTray()
// throws UnsupportedOperationException.  To detect whether the
// system tray is supported, use isSupported().
//
// The SystemTray may contain one or more TrayIcons, which are added to the tray using the add(java.awt.TrayIcon) method, and removed when no longer needed, using the
// remove(java.awt.TrayIcon).  TrayIcon consists of an
// image, a popup menu and a set of associated listeners.  Please see
// the TrayIcon class for details.
//
// Every Java application has a single SystemTray
// instance that allows the app to interface with the system tray of
// the desktop while the app is running.  The SystemTray
// instance can be obtained from the getSystemTray() method.
// An application may not create its own instance of
// SystemTray.
//
// The following code snippet demonstrates how to access
// and customize the system tray:
// 
// 
//     TrayIcon trayIcon = null;
//     if (SystemTray.isSupported()) {
//         // get the SystemTray instance
//         SystemTray tray = SystemTray.getSystemTray();
//         // load an image
//         Image image = Toolkit.getDefaultToolkit().getImage(...);
//         // create a action listener to listen for default action executed on the tray icon
//         ActionListener listener = new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 // execute default action of the application
//                 // ...
//             }
//         };
//         // create a popup menu
//         PopupMenu popup = new PopupMenu();
//         // create menu item for the default action
//         MenuItem defaultItem = new MenuItem(...);
//         defaultItem.addActionListener(listener);
//         popup.add(defaultItem);
//         /// ... add other items
//         // construct a TrayIcon
//         trayIcon = new TrayIcon(image, "Tray Demo", popup);
//         // set the TrayIcon properties
//         trayIcon.addActionListener(listener);
//         // ...
//         // add the tray image
//         try {
//             tray.add(trayIcon);
//         } catch (AWTException e) {
//             System.err.println(e);
//         }
//         // ...
//     } else {
//         // disable tray option in your application or
//         // perform other actions
//         ...
//     }
//     // ...
//     // some time later
//     // the application state has changed - update the image
//     if (trayIcon != null) {
//         trayIcon.setImage(updatedImage);
//     }
//     // ...
// 
// 
class SystemTray extends Object {

    @stub
    // Adds a TrayIcon to the SystemTray.
    def add(trayIcon: TrayIcon): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the list of listeners for the
    // specific property.
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    @stub
    // Returns an array of all the listeners that have been associated
    // with the named property.
    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = ???

    @stub
    // Returns an array of all icons added to the tray by this
    // application.
    def getTrayIcons(): Array[TrayIcon] = ???

    @stub
    // Returns the size, in pixels, of the space that a tray icon will
    // occupy in the system tray.
    def getTrayIconSize(): Dimension = ???

    @stub
    // Removes the specified TrayIcon from the
    // SystemTray.
    def remove(trayIcon: TrayIcon): Unit = ???
}

object SystemTray {
    @stub
    // Gets the SystemTray instance that represents the
    // desktop's tray area.
    def getSystemTray(): SystemTray = ???

    @stub
    // Returns whether the system tray is supported on the current
    // platform.
    def isSupported(): Boolean = ???
}
