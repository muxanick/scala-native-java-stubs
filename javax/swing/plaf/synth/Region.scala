package javax.swing.plaf.synth

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A distinct rendering area of a Swing component.  A component may
 *  support one or more regions.  Specific component regions are defined
 *  by the typesafe enumeration in this class.
 *  
 *  Regions are typically used as a way to identify the Components
 *  and areas a particular style is to apply to. Synth's file format allows you
 *  to bind styles based on the name of a Region.
 *  The name is derived from the field name of the constant:
 *  
 *   Map all characters to lowercase.
 *   Map the first character to uppercase.
 *   Map the first character after underscores to uppercase.
 *   Remove all underscores.
 *  
 *  For example, to identify the SPLIT_PANE
 *  Region you would use SplitPane.
 *  The following shows a custom SynthStyleFactory
 *  that returns a specific style for split panes:
 *  
 *     public SynthStyle getStyle(JComponent c, Region id) {
 *         if (id == Region.SPLIT_PANE) {
 *             return splitPaneStyle;
 *         }
 *         ...
 *     }
 *  
 *  The following xml
 *  accomplishes the same thing:
 *  
 *  <style id="splitPaneStyle">
 *    ...
 *  </style>
 *  <bind style="splitPaneStyle" type="region" key="SplitPane"/>
 *  
 */
class Region extends Object {

    /** Creates a Region with the specified name. */
    @stub
    protected def this(name: String, ui: String, subregion: Boolean) = ???

    /** Returns the name of the region. */
    @stub
    def getName(): String = ???

    /** Returns true if the Region is a subregion of a Component, otherwise
     *  false.
     */
    @stub
    def isSubregion(): Boolean = ???

    /** Returns the name of the Region. */
    @stub
    def toString(): String = ???
}

object Region {
    /** ArrowButton's are special types of buttons that also render a
     *  directional indicator, typically an arrow.
     */
    @stub
    val ARROW_BUTTON: Region = ???

    /** Button region. */
    @stub
    val BUTTON: Region = ???

    /** CheckBox region. */
    @stub
    val CHECK_BOX: Region = ???

    /** CheckBoxMenuItem region. */
    @stub
    val CHECK_BOX_MENU_ITEM: Region = ???

    /** ColorChooser region. */
    @stub
    val COLOR_CHOOSER: Region = ???

    /** ComboBox region. */
    @stub
    val COMBO_BOX: Region = ???

    /** DesktopIcon region. */
    @stub
    val DESKTOP_ICON: Region = ???

    /** DesktopPane region. */
    @stub
    val DESKTOP_PANE: Region = ???

    /** EditorPane region. */
    @stub
    val EDITOR_PANE: Region = ???

    /** FileChooser region. */
    @stub
    val FILE_CHOOSER: Region = ???

    /** FormattedTextField region. */
    @stub
    val FORMATTED_TEXT_FIELD: Region = ???

    /** InternalFrame region. */
    @stub
    val INTERNAL_FRAME: Region = ???

    /** TitlePane of an InternalFrame. */
    @stub
    val INTERNAL_FRAME_TITLE_PANE: Region = ???

    /** Label region. */
    @stub
    val LABEL: Region = ???

    /** List region. */
    @stub
    val LIST: Region = ???

    /** Menu region. */
    @stub
    val MENU: Region = ???

    /** MenuBar region. */
    @stub
    val MENU_BAR: Region = ???

    /** MenuItem region. */
    @stub
    val MENU_ITEM: Region = ???

    /** Accelerator region of a MenuItem. */
    @stub
    val MENU_ITEM_ACCELERATOR: Region = ???

    /** OptionPane region. */
    @stub
    val OPTION_PANE: Region = ???

    /** Panel region. */
    @stub
    val PANEL: Region = ???

    /** PasswordField region. */
    @stub
    val PASSWORD_FIELD: Region = ???

    /** PopupMenu region. */
    @stub
    val POPUP_MENU: Region = ???

    /** PopupMenuSeparator region. */
    @stub
    val POPUP_MENU_SEPARATOR: Region = ???

    /** ProgressBar region. */
    @stub
    val PROGRESS_BAR: Region = ???

    /** RadioButton region. */
    @stub
    val RADIO_BUTTON: Region = ???

    /** RegionButtonMenuItem region. */
    @stub
    val RADIO_BUTTON_MENU_ITEM: Region = ???

    /** RootPane region. */
    @stub
    val ROOT_PANE: Region = ???

    /** ScrollBar region. */
    @stub
    val SCROLL_BAR: Region = ???

    /** Thumb of the ScrollBar. */
    @stub
    val SCROLL_BAR_THUMB: Region = ???

    /** Track of the ScrollBar. */
    @stub
    val SCROLL_BAR_TRACK: Region = ???

    /** ScrollPane region. */
    @stub
    val SCROLL_PANE: Region = ???

    /** Separator region. */
    @stub
    val SEPARATOR: Region = ???

    /** Slider region. */
    @stub
    val SLIDER: Region = ???

    /** Thumb of the Slider. */
    @stub
    val SLIDER_THUMB: Region = ???

    /** Track of the Slider. */
    @stub
    val SLIDER_TRACK: Region = ???

    /** Spinner region. */
    @stub
    val SPINNER: Region = ???

    /** SplitPane region. */
    @stub
    val SPLIT_PANE: Region = ???

    /** Divider of the SplitPane. */
    @stub
    val SPLIT_PANE_DIVIDER: Region = ???

    /** TabbedPane region. */
    @stub
    val TABBED_PANE: Region = ???

    /** Region of a TabbedPane containing the content. */
    @stub
    val TABBED_PANE_CONTENT: Region = ???

    /** Region of a TabbedPane for one tab. */
    @stub
    val TABBED_PANE_TAB: Region = ???

    /** Region of a TabbedPane containing the tabs. */
    @stub
    val TABBED_PANE_TAB_AREA: Region = ???

    /** Table region. */
    @stub
    val TABLE: Region = ???

    /** TableHeader region. */
    @stub
    val TABLE_HEADER: Region = ???

    /** TextArea region. */
    @stub
    val TEXT_AREA: Region = ???

    /** TextField region. */
    @stub
    val TEXT_FIELD: Region = ???

    /** TextPane region. */
    @stub
    val TEXT_PANE: Region = ???

    /** ToggleButton region. */
    @stub
    val TOGGLE_BUTTON: Region = ???

    /** ToolBar region. */
    @stub
    val TOOL_BAR: Region = ???

    /** Region of the ToolBar containing the content. */
    @stub
    val TOOL_BAR_CONTENT: Region = ???

    /** Region for the Window containing the ToolBar. */
    @stub
    val TOOL_BAR_DRAG_WINDOW: Region = ???

    /** ToolBar separator region. */
    @stub
    val TOOL_BAR_SEPARATOR: Region = ???

    /** ToolTip region. */
    @stub
    val TOOL_TIP: Region = ???

    /** Tree region. */
    @stub
    val TREE: Region = ???

    /** Region of the Tree for one cell. */
    @stub
    val TREE_CELL: Region = ???

    /** Viewport region. */
    @stub
    val VIEWPORT: Region = ???
}
