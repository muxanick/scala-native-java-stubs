package javax.swing

import java.awt.Component
import java.lang.{Class, Object, String}
import javax.swing.text.JTextComponent.KeyBinding
import scala.scalanative.annotation.stub

/** LookAndFeel, as the name implies, encapsulates a look and
 *  feel. Beyond installing a look and feel most developers never need to
 *  interact directly with LookAndFeel. In general only developers
 *  creating a custom look and feel need to concern themselves with this class.
 *  
 *  Swing is built upon the foundation that each JComponent
 *  subclass has an implementation of a specific ComponentUI
 *  subclass. The ComponentUI is often referred to as "the ui",
 *  "component ui", or "look and feel delegate". The ComponentUI
 *  subclass is responsible for providing the look and feel specific
 *  functionality of the component. For example, JTree requires
 *  an implementation of the ComponentUI subclass TreeUI. The implementation of the specific ComponentUI subclass is provided by the LookAndFeel. Each
 *  JComponent subclass identifies the ComponentUI
 *  subclass it requires by way of the JComponent method getUIClassID.
 *  
 *  Each LookAndFeel implementation must provide
 *  an implementation of the appropriate ComponentUI subclass by
 *  specifying a value for each of Swing's ui class ids in the UIDefaults object returned from getDefaults. For example,
 *  BasicLookAndFeel uses BasicTreeUI as the concrete
 *  implementation for TreeUI. This is accomplished by BasicLookAndFeel providing the key-value pair "TreeUI"-"javax.swing.plaf.basic.BasicTreeUI", in the
 *  UIDefaults returned from getDefaults. Refer to
 *  UIDefaults.getUI(JComponent) for details on how the implementation
 *  of the ComponentUI subclass is obtained.
 *  
 *  When a LookAndFeel is installed the UIManager does
 *  not check that an entry exists for all ui class ids. As such,
 *  random exceptions will occur if the current look and feel has not
 *  provided a value for a particular ui class id and an instance of
 *  the JComponent subclass is created.
 * 
 *  Recommendations for Look and Feels
 * 
 *  As noted in UIManager each LookAndFeel has the opportunity
 *  to provide a set of defaults that are layered in with developer and
 *  system defaults. Some of Swing's components require the look and feel
 *  to provide a specific set of defaults. These are documented in the
 *  classes that require the specific default.
 * 
 *  ComponentUIs and defaults
 * 
 *  All ComponentUIs typically need to set various properties
 *  on the JComponent the ComponentUI is providing the
 *  look and feel for. This is typically done when the ComponentUI is installed on the JComponent. Setting a
 *  property should only be done if the developer has not set the
 *  property. For non-primitive values it is recommended that the
 *  ComponentUI only change the property on the JComponent if the current value is null or implements
 *  UIResource. If the current value is null or
 *  implements UIResource it indicates the property has not
 *  been set by the developer, and the ui is free to change it.  For
 *  example, BasicButtonUI.installDefaults only changes the
 *  font on the JButton if the return value from button.getFont() is null or implements UIResource. On the other hand if button.getFont() returned
 *  a non-null value that did not implement UIResource
 *  then BasicButtonUI.installDefaults would not change the
 *  JButton's font.
 *  
 *  For primitive values, such as opaque, the method installProperty should be invoked.  installProperty only changes
 *  the corresponding property if the value has not been changed by the
 *  developer.
 *  
 *  ComponentUI implementations should use the various install methods
 *  provided by this class as they handle the necessary checking and install
 *  the property using the recommended guidelines.
 * 
 *  Exceptions
 * 
 *  All of the install methods provided by LookAndFeel need to
 *  access the defaults if the value of the property being changed is
 *  null or a UIResource. For example, installing the
 *  font does the following:
 *  
 *    JComponent c;
 *    Font font = c.getFont();
 *    if (font == null || (font instanceof UIResource)) {
 *        c.setFont(UIManager.getFont("fontKey"));
 *    }
 *  
 *  If the font is null or a UIResource, the
 *  defaults table is queried with the key fontKey. All of
 *  UIDefault's get methods throw a NullPointerException if passed in null. As such, unless
 *  otherwise noted each of the various install methods of LookAndFeel throw a NullPointerException if the current
 *  value is null or a UIResource and the supplied
 *  defaults key is null. In addition, unless otherwise specified
 *  all of the install methods throw a NullPointerException if
 *  a null component is passed in.
 */
abstract class LookAndFeel extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns the look and feel defaults. */
    def getDefaults(): UIDefaults

    /** Return a one line description of this look and feel implementation,
     *  e.g.
     */
    def getDescription(): String

    /** Returns an Icon with a disabled appearance. */
    def getDisabledIcon(component: JComponent, icon: Icon): Icon

    /** Returns an Icon for use by disabled
     *  components that are also selected.
     */
    def getDisabledSelectedIcon(component: JComponent, icon: Icon): Icon

    /** Return a string that identifies this look and feel. */
    def getID(): String

    /** Returns the LayoutStyle for this look
     *  and feel.
     */
    def getLayoutStyle(): LayoutStyle

    /** Return a short string that identifies this look and feel, e.g. */
    def getName(): String

    /** Returns true if the LookAndFeel returned
     *  RootPaneUI instances support providing Window
     *  decorations in a JRootPane.
     */
    def getSupportsWindowDecorations(): Boolean

    /** Initializes the look and feel. */
    def initialize(): Unit

    /** If the underlying platform has a "native" look and feel, and
     *  this is an implementation of it, return true.
     */
    def isNativeLookAndFeel(): Boolean

    /** Return true if the underlying platform supports and or permits
     *  this look and feel.
     */
    def isSupportedLookAndFeel(): Boolean

    /** Invoked when the user attempts an invalid operation,
     *  such as pasting into an uneditable JTextField
     *  that has focus.
     */
    def provideErrorFeedback(component: Component): Unit

    /** Returns a string that displays and identifies this
     *  object's properties.
     */
    def toString(): String

    /** Uninitializes the look and feel. */
    def uninitialize(): Unit
}

object LookAndFeel {
    /** Returns the value of the specified system desktop property by
     *  invoking Toolkit.getDefaultToolkit().getDesktopProperty().
     */
    @stub
    def getDesktopPropertyValue(systemPropertyName: String, fallbackValue: Any): Any = ???

    /** Convenience method for setting a component's border property with
     *  a value from the defaults.
     */
    @stub
    def installBorder(c: JComponent, defaultBorderName: String): Unit = ???

    /** Convenience method for setting a component's foreground
     *  and background color properties with values from the
     *  defaults.
     */
    @stub
    def installColors(c: JComponent, defaultBgName: String, defaultFgName: String): Unit = ???

    /** Convenience method for setting a component's foreground,
     *  background and font properties with values from the
     *  defaults.
     */
    @stub
    def installColorsAndFont(c: JComponent, defaultBgName: String, defaultFgName: String, defaultFontName: String): Unit = ???

    /** Convenience method for installing a property with the specified name
     *  and value on a component if that property has not already been set
     *  by the developer.
     */
    @stub
    def installProperty(c: JComponent, propertyName: String, propertyValue: Any): Unit = ???

    /** Populates an InputMap with the specified bindings. */
    @stub
    def loadKeyBindings(retMap: InputMap, keys: Array[Object]): Unit = ???

    /** Creates a ComponentInputMapUIResource from
     *  keys.
     */
    @stub
    def makeComponentInputMap(c: JComponent, keys: Array[Object]): ComponentInputMap = ???

    /** Creates and returns a UIDefault.LazyValue that loads an
     *  image.
     */
    @stub
    def makeIcon(baseClass: Class[_], gifFile: String): Any = ???

    /** Creates a InputMapUIResource from keys. */
    @stub
    def makeInputMap(keys: Array[Object]): InputMap = ???

    /** Convenience method for building an array of KeyBindings. */
    @stub
    def makeKeyBindings(keyBindingList: Array[Object]): Array[JTextComponent.KeyBinding] = ???

    /** Convenience method for uninstalling a border. */
    @stub
    def uninstallBorder(c: JComponent): Unit = ???
}
