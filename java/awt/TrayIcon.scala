package java.awt

import java.awt.event.{ActionListener, MouseListener, MouseMotionListener}
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A TrayIcon object represents a tray icon that can be
 *  added to the system tray. A
 *  TrayIcon can have a tooltip (text), an image, a popup
 *  menu, and a set of listeners associated with it.
 * 
 *  A TrayIcon can generate various MouseEvents and supports adding corresponding listeners to receive
 *  notification of these events.  TrayIcon processes some
 *  of the events by itself.  For example, by default, when the
 *  right-mouse click is performed on the TrayIcon it
 *  displays the specified popup menu.  When the mouse hovers
 *  over the TrayIcon the tooltip is displayed.
 * 
 *  Note: When the MouseEvent is
 *  dispatched to its registered listeners its component
 *  property will be set to null.  (See ComponentEvent.getComponent()) The
 *  source property will be set to this
 *  TrayIcon. (See EventObject.getSource())
 * 
 *  Note: A well-behaved TrayIcon implementation
 *  will assign different gestures to showing a popup menu and
 *  selecting a tray icon.
 * 
 *  A TrayIcon can generate an ActionEvent.  On some platforms, this occurs when the user selects
 *  the tray icon using either the mouse or keyboard.
 * 
 *  If a SecurityManager is installed, the AWTPermission
 *  accessSystemTray must be granted in order to create
 *  a TrayIcon. Otherwise the constructor will throw a
 *  SecurityException.
 * 
 *   See the SystemTray class overview for an example on how
 *  to use the TrayIcon API.
 */
class TrayIcon extends Object {

    /** Creates a TrayIcon with the specified image. */
    @stub
    def this(image: Image) = ???

    /** Creates a TrayIcon with the specified image and
     *  tooltip text.
     */
    @stub
    def this(image: Image, tooltip: String) = ???

    /** Creates a TrayIcon with the specified image,
     *  tooltip and popup menu.
     */
    @stub
    def this(image: Image, tooltip: String, popup: PopupMenu) = ???

    /** Adds the specified action listener to receive
     *  ActionEvents from this TrayIcon.
     */
    @stub
    def addActionListener(listener: ActionListener): Unit = ???

    /** Adds the specified mouse listener to receive mouse events from
     *  this TrayIcon.
     */
    @stub
    def addMouseListener(listener: MouseListener): Unit = ???

    /** Adds the specified mouse listener to receive mouse-motion
     *  events from this TrayIcon.
     */
    @stub
    def addMouseMotionListener(listener: MouseMotionListener): Unit = ???

    /** Displays a popup message near the tray icon. */
    @stub
    def displayMessage(caption: String, text: String, messageType: TrayIcon.MessageType): Unit = ???

    /** Returns the command name of the action event fired by this tray icon. */
    @stub
    def getActionCommand(): String = ???

    /** Returns an array of all the action listeners
     *  registered on this TrayIcon.
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Returns the current image used for this TrayIcon. */
    @stub
    def getImage(): Image = ???

    /** Returns an array of all the mouse listeners
     *  registered on this TrayIcon.
     */
    @stub
    def getMouseListeners(): Array[MouseListener] = ???

    /** Returns an array of all the mouse-motion listeners
     *  registered on this TrayIcon.
     */
    @stub
    def getMouseMotionListeners(): Array[MouseMotionListener] = ???

    /** Returns the popup menu associated with this TrayIcon. */
    @stub
    def getPopupMenu(): PopupMenu = ???

    /** Returns the size, in pixels, of the space that the tray icon
     *  occupies in the system tray.
     */
    @stub
    def getSize(): Dimension = ???

    /** Returns the tooltip string associated with this
     *  TrayIcon.
     */
    @stub
    def getToolTip(): String = ???

    /** Returns the value of the auto-size property. */
    @stub
    def isImageAutoSize(): Boolean = ???

    /** Removes the specified action listener. */
    @stub
    def removeActionListener(listener: ActionListener): Unit = ???

    /** Removes the specified mouse listener. */
    @stub
    def removeMouseListener(listener: MouseListener): Unit = ???

    /** Removes the specified mouse-motion listener. */
    @stub
    def removeMouseMotionListener(listener: MouseMotionListener): Unit = ???

    /** Sets the command name for the action event fired by this tray
     *  icon.
     */
    @stub
    def setActionCommand(command: String): Unit = ???

    /** Sets the image for this TrayIcon. */
    @stub
    def setImage(image: Image): Unit = ???

    /** Sets the auto-size property. */
    @stub
    def setImageAutoSize(autosize: Boolean): Unit = ???

    /** Sets the popup menu for this TrayIcon. */
    @stub
    def setPopupMenu(popup: PopupMenu): Unit = ???

    /** Sets the tooltip string for this TrayIcon. */
    @stub
    def setToolTip(tooltip: String): Unit = ???
}

object TrayIcon {
    /** The message type determines which icon will be displayed in the
     *  caption of the message, and a possible system sound a message
     *  may generate upon showing.
     */
    type MessageType = TrayIcon_MessageType
}
