package java.awt

import java.awt.datatransfer.Clipboard
import java.awt.dnd.{DragGestureEvent, DragGestureListener, DragGestureRecognizer, DragSource}
import java.awt.event.AWTEventListener
import java.awt.font.TextAttribute
import java.awt.im.InputMethodHighlight
import java.awt.image.{ColorModel, ImageObserver, ImageProducer}
import java.beans.{PropertyChangeListener, PropertyChangeSupport}
import java.lang.{Class, Object, String}
import java.net.URL
import java.util.{Map, Properties}
import scala.scalanative.annotation.stub

/** This class is the abstract superclass of all actual
 *  implementations of the Abstract Window Toolkit. Subclasses of
 *  the Toolkit class are used to bind the various components
 *  to particular native toolkit implementations.
 *  
 *  Many GUI events may be delivered to user
 *  asynchronously, if the opposite is not specified explicitly.
 *  As well as
 *  many GUI operations may be performed asynchronously.
 *  This fact means that if the state of a component is set, and then
 *  the state immediately queried, the returned value may not yet
 *  reflect the requested change.  This behavior includes, but is not
 *  limited to:
 *  
 *  Scrolling to a specified position.
 *  For example, calling ScrollPane.setScrollPosition
 *      and then getScrollPosition may return an incorrect
 *      value if the original request has not yet been processed.
 * 
 *  Moving the focus from one component to another.
 *  For more information, see
 *  Timing
 *  Focus Transfers, a section in
 *  The Swing
 *  Tutorial.
 * 
 *  Making a top-level container visible.
 *  Calling setVisible(true) on a Window,
 *      Frame or Dialog may occur
 *      asynchronously.
 * 
 *  Setting the size or location of a top-level container.
 *  Calls to setSize, setBounds or
 *      setLocation on a Window,
 *      Frame or Dialog are forwarded
 *      to the underlying window management system and may be
 *      ignored or modified.  See Window for
 *      more information.
 *  
 *  
 *  Most applications should not call any of the methods in this
 *  class directly. The methods defined by Toolkit are
 *  the "glue" that joins the platform-independent classes in the
 *  java.awt package with their counterparts in
 *  java.awt.peer. Some methods defined by
 *  Toolkit query the native operating system directly.
 */
abstract class Toolkit extends Object {

    /**  */
    @stub
    def this() = ???

    /**  */
    protected val desktopProperties: Map[String, Object]

    /**  */
    protected val desktopPropsSupport: PropertyChangeSupport

    /** Adds an AWTEventListener to receive all AWTEvents dispatched
     *  system-wide that conform to the given eventMask.
     */
    def addAWTEventListener(listener: AWTEventListener, eventMask: Long): Unit

    /** Adds the specified property change listener for the named desktop
     *  property.
     */
    def addPropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit

    /** Reports whether events from extra mouse buttons are allowed to be processed and posted into
     *  EventQueue.
     */
    def areExtraMouseButtonsEnabled(): Boolean

    /** Emits an audio beep depending on native system settings and hardware
     *  capabilities.
     */
    def beep(): Unit

    /** Indicates the construction status of a specified image that is
     *  being prepared for display.
     */
    def checkImage(image: Image, width: Int, height: Int, observer: ImageObserver): Int

    /** Creates this toolkit's implementation of Button using
     *  the specified peer interface.
     */
    protected def createButton(target: Button): java.awt.peer.ButtonPeer

    /** Creates this toolkit's implementation of Canvas using
     *  the specified peer interface.
     */
    protected def createCanvas(target: Canvas): java.awt.peer.CanvasPeer

    /** Creates this toolkit's implementation of Checkbox using
     *  the specified peer interface.
     */
    protected def createCheckbox(target: Checkbox): java.awt.peer.CheckboxPeer

    /** Creates this toolkit's implementation of CheckboxMenuItem using
     *  the specified peer interface.
     */
    protected def createCheckboxMenuItem(target: CheckboxMenuItem): java.awt.peer.CheckboxMenuItemPeer

    /** Creates this toolkit's implementation of Choice using
     *  the specified peer interface.
     */
    protected def createChoice(target: Choice): java.awt.peer.ChoicePeer

    /** Creates a peer for a component or container. */
    protected def createComponent(target: Component): java.awt.peer.LightweightPeer

    /** Creates a new custom cursor object. */
    def createCustomCursor(cursor: Image, hotSpot: Point, name: String): Cursor

    /** Creates this toolkit's implementation of the Desktop
     *  using the specified peer interface.
     */
    protected def createDesktopPeer(target: Desktop): java.awt.peer.DesktopPeer

    /** Creates this toolkit's implementation of Dialog using
     *  the specified peer interface.
     */
    protected def createDialog(target: Dialog): java.awt.peer.DialogPeer

    /** Creates a concrete, platform dependent, subclass of the abstract
     *  DragGestureRecognizer class requested, and associates it with the
     *  DragSource, Component and DragGestureListener specified.
     */
    def createDragGestureRecognizer[T <: DragGestureRecognizer](abstractRecognizerClass: Class[T], ds: DragSource, c: Component, srcActions: Int, dgl: DragGestureListener): T

    /** Creates the peer for a DragSourceContext. */
    def createDragSourceContextPeer(dge: DragGestureEvent): java.awt.dnd.peer.DragSourceContextPeer

    /** Creates this toolkit's implementation of FileDialog using
     *  the specified peer interface.
     */
    protected def createFileDialog(target: FileDialog): java.awt.peer.FileDialogPeer

    /** Creates this toolkit's implementation of Frame using
     *  the specified peer interface.
     */
    protected def createFrame(target: Frame): java.awt.peer.FramePeer

    /** Creates an image which decodes the image stored in the specified
     *  byte array.
     */
    def createImage(imagedata: Array[Byte]): Image

    /** Creates an image which decodes the image stored in the specified
     *  byte array, and at the specified offset and length.
     */
    def createImage(imagedata: Array[Byte], imageoffset: Int, imagelength: Int): Image

    /** Creates an image with the specified image producer. */
    def createImage(producer: ImageProducer): Image

    /** Returns an image which gets pixel data from the specified file. */
    def createImage(filename: String): Image

    /** Returns an image which gets pixel data from the specified URL. */
    def createImage(url: URL): Image

    /** Creates this toolkit's implementation of Label using
     *  the specified peer interface.
     */
    protected def createLabel(target: Label): java.awt.peer.LabelPeer

    /** Creates this toolkit's implementation of List using
     *  the specified peer interface.
     */
    protected def createList(target: List): java.awt.peer.ListPeer

    /** Creates this toolkit's implementation of Menu using
     *  the specified peer interface.
     */
    protected def createMenu(target: Menu): java.awt.peer.MenuPeer

    /** Creates this toolkit's implementation of MenuBar using
     *  the specified peer interface.
     */
    protected def createMenuBar(target: MenuBar): java.awt.peer.MenuBarPeer

    /** Creates this toolkit's implementation of MenuItem using
     *  the specified peer interface.
     */
    protected def createMenuItem(target: MenuItem): java.awt.peer.MenuItemPeer

    /** Creates this toolkit's implementation of Panel using
     *  the specified peer interface.
     */
    protected def createPanel(target: Panel): java.awt.peer.PanelPeer

    /** Creates this toolkit's implementation of PopupMenu using
     *  the specified peer interface.
     */
    protected def createPopupMenu(target: PopupMenu): java.awt.peer.PopupMenuPeer

    /** Creates this toolkit's implementation of Scrollbar using
     *  the specified peer interface.
     */
    protected def createScrollbar(target: Scrollbar): java.awt.peer.ScrollbarPeer

    /** Creates this toolkit's implementation of ScrollPane using
     *  the specified peer interface.
     */
    protected def createScrollPane(target: ScrollPane): java.awt.peer.ScrollPanePeer

    /** Creates this toolkit's implementation of TextArea using
     *  the specified peer interface.
     */
    protected def createTextArea(target: TextArea): java.awt.peer.TextAreaPeer

    /** Creates this toolkit's implementation of TextField using
     *  the specified peer interface.
     */
    protected def createTextField(target: TextField): java.awt.peer.TextFieldPeer

    /** Creates this toolkit's implementation of Window using
     *  the specified peer interface.
     */
    protected def createWindow(target: Window): java.awt.peer.WindowPeer

    /** Returns an array of all the AWTEventListeners
     *  registered on this toolkit.
     */
    def getAWTEventListeners(): Array[AWTEventListener]

    /** Returns an array of all the AWTEventListeners
     *  registered on this toolkit which listen to all of the event
     *  types specified in the eventMask argument.
     */
    def getAWTEventListeners(eventMask: Long): Array[AWTEventListener]

    /** Returns the supported cursor dimension which is closest to the desired
     *  sizes.
     */
    def getBestCursorSize(preferredWidth: Int, preferredHeight: Int): Dimension

    /** Determines the color model of this toolkit's screen. */
    def getColorModel(): ColorModel

    /** Obtains a value for the specified desktop property. */
    def getDesktopProperty(propertyName: String): Object

    /** Deprecated. 
     * see GraphicsEnvironment.getAvailableFontFamilyNames()
     * 
     */
    def getFontList(): Array[String]

    /** Deprecated. 
     * As of JDK version 1.2, replaced by the Font
     *           method getLineMetrics.
     * 
     */
    def getFontMetrics(font: Font): FontMetrics

    /** Deprecated. 
     * see java.awt.GraphicsEnvironment#getAllFonts
     * 
     */
    protected def getFontPeer(name: String, style: Int): java.awt.peer.FontPeer

    /** Returns an image which gets pixel data from the specified file,
     *  whose format can be either GIF, JPEG or PNG.
     */
    def getImage(filename: String): Image

    /** Returns an image which gets pixel data from the specified URL. */
    def getImage(url: URL): Image

    /** Returns whether the given locking key on the keyboard is currently in
     *  its "on" state.
     */
    def getLockingKeyState(keyCode: Int): Boolean

    /** Returns the maximum number of colors the Toolkit supports in a custom cursor
     *  palette.
     */
    def getMaximumCursorColors(): Int

    /** Determines which modifier key is the appropriate accelerator
     *  key for menu shortcuts.
     */
    def getMenuShortcutKeyMask(): Int

    /** Obtains this toolkit's implementation of helper class for
     *  MouseInfo operations.
     */
    protected def getMouseInfoPeer(): java.awt.peer.MouseInfoPeer

    /** Gets a PrintJob object which is the result of initiating
     *  a print operation on the toolkit's platform.
     */
    def getPrintJob(frame: Frame, jobtitle: String, jobAttributes: JobAttributes, pageAttributes: PageAttributes): PrintJob

    /** Gets a PrintJob object which is the result of initiating
     *  a print operation on the toolkit's platform.
     */
    def getPrintJob(frame: Frame, jobtitle: String, props: Properties): PrintJob

    /** Returns an array of all the property change listeners
     *  registered on this toolkit.
     */
    def getPropertyChangeListeners(): Array[PropertyChangeListener]

    /** Returns an array of all property change listeners
     *  associated with the specified name of a desktop property.
     */
    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener]

    /** Gets the insets of the screen. */
    def getScreenInsets(gc: GraphicsConfiguration): Insets

    /** Returns the screen resolution in dots-per-inch. */
    def getScreenResolution(): Int

    /** Gets the size of the screen. */
    def getScreenSize(): Dimension

    /** Gets the singleton instance of the system Clipboard which interfaces
     *  with clipboard facilities provided by the native platform.
     */
    def getSystemClipboard(): Clipboard

    /** Get the application's or applet's EventQueue instance. */
    def getSystemEventQueue(): EventQueue

    /** Gets the application's or applet's EventQueue
     *  instance, without checking access.
     */
    protected def getSystemEventQueueImpl(): EventQueue

    /** Gets the singleton instance of the system selection as a
     *  Clipboard object.
     */
    def getSystemSelection(): Clipboard

    /** initializeDesktopProperties */
    protected def initializeDesktopProperties(): Unit

    /** Returns whether the always-on-top mode is supported by this toolkit. */
    def isAlwaysOnTopSupported(): Boolean

    /** Returns whether dynamic layout of Containers on resize is
     *  currently active (both set in program
     * ( isDynamicLayoutSet() )
     * , and supported
     *  by the underlying operating system and/or window manager).
     */
    def isDynamicLayoutActive(): Boolean

    /** Returns whether the layout of Containers is validated dynamically
     *  during resizing, or statically, after resizing is complete.
     */
    protected def isDynamicLayoutSet(): Boolean

    /** Returns whether Toolkit supports this state for
     *  Frames.
     */
    def isFrameStateSupported(state: Int): Boolean

    /** Returns whether the given modal exclusion type is supported by this
     *  toolkit.
     */
    def isModalExclusionTypeSupported(modalExclusionType: Dialog.ModalExclusionType): Boolean

    /** Returns whether the given modality type is supported by this toolkit. */
    def isModalityTypeSupported(modalityType: Dialog.ModalityType): Boolean

    /** an opportunity to lazily evaluate desktop property values. */
    protected def lazilyLoadDesktopProperty(name: String): Object

    /** Fills in the integer array that is supplied as an argument
     *  with the current system color values.
     */
    protected def loadSystemColors(systemColors: Array[Int]): Unit

    /** Returns a map of visual attributes for the abstract level description
     *  of the given input method highlight, or null if no mapping is found.
     */
    def mapInputMethodHighlight(highlight: InputMethodHighlight): Map[TextAttribute, _]

    /** Prepares an image for rendering. */
    def prepareImage(image: Image, width: Int, height: Int, observer: ImageObserver): Boolean

    /** Removes an AWTEventListener from receiving dispatched AWTEvents. */
    def removeAWTEventListener(listener: AWTEventListener): Unit

    /** Removes the specified property change listener for the named
     *  desktop property.
     */
    def removePropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit

    /** Sets the named desktop property to the specified value and fires a
     *  property change event to notify any listeners that the value has changed.
     */
    protected def setDesktopProperty(name: String, newValue: Object): Unit

    /** Controls whether the layout of Containers is validated dynamically
     *  during resizing, or statically, after resizing is complete.
     */
    def setDynamicLayout(dynamic: Boolean): Unit

    /** Sets the state of the given locking key on the keyboard. */
    def setLockingKeyState(keyCode: Int, on: Boolean): Unit

    /** Synchronizes this toolkit's graphics state. */
    def sync(): Unit
}

object Toolkit {
    /** Gets the default toolkit. */
    @stub
    def getDefaultToolkit(): Toolkit = ???

    /** Give native peers the ability to query the native container
     *  given a native component (eg the direct parent may be lightweight).
     */
    @stub
    protected def getNativeContainer(c: Component): Container = ???

    /** Gets a property with the specified key and default. */
    @stub
    def getProperty(key: String, defaultValue: String): String = ???
}
