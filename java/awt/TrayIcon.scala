package java.awt

import java.awt.event.{ActionListener, MouseListener, MouseMotionListener}
import java.lang.{Object, String}

// A TrayIcon object represents a tray icon that can be
// added to the system tray. A
// TrayIcon can have a tooltip (text), an image, a popup
// menu, and a set of listeners associated with it.
//
// A TrayIcon can generate various MouseEvents and supports adding corresponding listeners to receive
// notification of these events.  TrayIcon processes some
// of the events by itself.  For example, by default, when the
// right-mouse click is performed on the TrayIcon it
// displays the specified popup menu.  When the mouse hovers
// over the TrayIcon the tooltip is displayed.
//
// Note: When the MouseEvent is
// dispatched to its registered listeners its component
// property will be set to null.  (See ComponentEvent.getComponent()) The
// source property will be set to this
// TrayIcon. (See EventObject.getSource())
//
// Note: A well-behaved TrayIcon implementation
// will assign different gestures to showing a popup menu and
// selecting a tray icon.
//
// A TrayIcon can generate an ActionEvent.  On some platforms, this occurs when the user selects
// the tray icon using either the mouse or keyboard.
//
// If a SecurityManager is installed, the AWTPermission
// accessSystemTray must be granted in order to create
// a TrayIcon. Otherwise the constructor will throw a
// SecurityException.
//
//  See the SystemTray class overview for an example on how
// to use the TrayIcon API.
class TrayIcon extends Object {

    @stub
    // Creates a TrayIcon with the specified image.
    def this(image: Image) = ???

    @stub
    // Creates a TrayIcon with the specified image and
    // tooltip text.
    def this(image: Image, tooltip: String) = ???

    @stub
    // Adds the specified action listener to receive
    // ActionEvents from this TrayIcon.
    def addActionListener(listener: ActionListener): Unit = ???

    @stub
    // Adds the specified mouse listener to receive mouse events from
    // this TrayIcon.
    def addMouseListener(listener: MouseListener): Unit = ???

    @stub
    // Adds the specified mouse listener to receive mouse-motion
    // events from this TrayIcon.
    def addMouseMotionListener(listener: MouseMotionListener): Unit = ???

    @stub
    // Displays a popup message near the tray icon.
    def displayMessage(caption: String, text: String, messageType: TrayIcon.MessageType): Unit = ???

    @stub
    // Returns the command name of the action event fired by this tray icon.
    def getActionCommand(): String = ???

    @stub
    // Returns an array of all the action listeners
    // registered on this TrayIcon.
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Returns the current image used for this TrayIcon.
    def getImage(): Image = ???

    @stub
    // Returns an array of all the mouse listeners
    // registered on this TrayIcon.
    def getMouseListeners(): Array[MouseListener] = ???

    @stub
    // Returns an array of all the mouse-motion listeners
    // registered on this TrayIcon.
    def getMouseMotionListeners(): Array[MouseMotionListener] = ???

    @stub
    // Returns the popup menu associated with this TrayIcon.
    def getPopupMenu(): PopupMenu = ???

    @stub
    // Returns the size, in pixels, of the space that the tray icon
    // occupies in the system tray.
    def getSize(): Dimension = ???

    @stub
    // Returns the tooltip string associated with this
    // TrayIcon.
    def getToolTip(): String = ???

    @stub
    // Returns the value of the auto-size property.
    def isImageAutoSize(): Boolean = ???

    @stub
    // Removes the specified action listener.
    def removeActionListener(listener: ActionListener): Unit = ???

    @stub
    // Removes the specified mouse listener.
    def removeMouseListener(listener: MouseListener): Unit = ???

    @stub
    // Removes the specified mouse-motion listener.
    def removeMouseMotionListener(listener: MouseMotionListener): Unit = ???

    @stub
    // Sets the command name for the action event fired by this tray
    // icon.
    def setActionCommand(command: String): Unit = ???

    @stub
    // Sets the image for this TrayIcon.
    def setImage(image: Image): Unit = ???

    @stub
    // Sets the auto-size property.
    def setImageAutoSize(autosize: Boolean): Unit = ???

    @stub
    // Sets the popup menu for this TrayIcon.
    def setPopupMenu(popup: PopupMenu): Unit = ???
}
