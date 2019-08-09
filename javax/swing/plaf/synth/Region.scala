package javax.swing.plaf.synth

import java.lang.{Object, String}

// A distinct rendering area of a Swing component.  A component may
// support one or more regions.  Specific component regions are defined
// by the typesafe enumeration in this class.
// 
// Regions are typically used as a way to identify the Components
// and areas a particular style is to apply to. Synth's file format allows you
// to bind styles based on the name of a Region.
// The name is derived from the field name of the constant:
// 
//  Map all characters to lowercase.
//  Map the first character to uppercase.
//  Map the first character after underscores to uppercase.
//  Remove all underscores.
// 
// For example, to identify the SPLIT_PANE
// Region you would use SplitPane.
// The following shows a custom SynthStyleFactory
// that returns a specific style for split panes:
// 
//    public SynthStyle getStyle(JComponent c, Region id) {
//        if (id == Region.SPLIT_PANE) {
//            return splitPaneStyle;
//        }
//        ...
//    }
// 
// The following xml
// accomplishes the same thing:
// 
// <style id="splitPaneStyle">
//   ...
// </style>
// <bind style="splitPaneStyle" type="region" key="SplitPane"/>
// 
class Region extends Object {

    @stub
    // Returns the name of the region.
    def getName(): String = ???

    @stub
    // Returns true if the Region is a subregion of a Component, otherwise
    // false.
    def isSubregion(): Boolean = ???
}

object Region {
    @stub
    // ArrowButton's are special types of buttons that also render a
    // directional indicator, typically an arrow.
    def ARROW_BUTTON: Region = ???

    @stub
    // Button region.
    def BUTTON: Region = ???

    @stub
    // CheckBox region.
    def CHECK_BOX: Region = ???

    @stub
    // CheckBoxMenuItem region.
    def CHECK_BOX_MENU_ITEM: Region = ???

    @stub
    // ColorChooser region.
    def COLOR_CHOOSER: Region = ???

    @stub
    // ComboBox region.
    def COMBO_BOX: Region = ???

    @stub
    // DesktopIcon region.
    def DESKTOP_ICON: Region = ???

    @stub
    // DesktopPane region.
    def DESKTOP_PANE: Region = ???

    @stub
    // EditorPane region.
    def EDITOR_PANE: Region = ???

    @stub
    // FileChooser region.
    def FILE_CHOOSER: Region = ???

    @stub
    // FormattedTextField region.
    def FORMATTED_TEXT_FIELD: Region = ???

    @stub
    // InternalFrame region.
    def INTERNAL_FRAME: Region = ???

    @stub
    // TitlePane of an InternalFrame.
    def INTERNAL_FRAME_TITLE_PANE: Region = ???

    @stub
    // Label region.
    def LABEL: Region = ???

    @stub
    // List region.
    def LIST: Region = ???

    @stub
    // Menu region.
    def MENU: Region = ???

    @stub
    // MenuBar region.
    def MENU_BAR: Region = ???

    @stub
    // MenuItem region.
    def MENU_ITEM: Region = ???

    @stub
    // Accelerator region of a MenuItem.
    def MENU_ITEM_ACCELERATOR: Region = ???

    @stub
    // OptionPane region.
    def OPTION_PANE: Region = ???

    @stub
    // Panel region.
    def PANEL: Region = ???

    @stub
    // PasswordField region.
    def PASSWORD_FIELD: Region = ???

    @stub
    // PopupMenu region.
    def POPUP_MENU: Region = ???

    @stub
    // PopupMenuSeparator region.
    def POPUP_MENU_SEPARATOR: Region = ???

    @stub
    // ProgressBar region.
    def PROGRESS_BAR: Region = ???

    @stub
    // RadioButton region.
    def RADIO_BUTTON: Region = ???

    @stub
    // RegionButtonMenuItem region.
    def RADIO_BUTTON_MENU_ITEM: Region = ???

    @stub
    // RootPane region.
    def ROOT_PANE: Region = ???

    @stub
    // ScrollBar region.
    def SCROLL_BAR: Region = ???

    @stub
    // Thumb of the ScrollBar.
    def SCROLL_BAR_THUMB: Region = ???

    @stub
    // Track of the ScrollBar.
    def SCROLL_BAR_TRACK: Region = ???

    @stub
    // ScrollPane region.
    def SCROLL_PANE: Region = ???

    @stub
    // Separator region.
    def SEPARATOR: Region = ???

    @stub
    // Slider region.
    def SLIDER: Region = ???

    @stub
    // Thumb of the Slider.
    def SLIDER_THUMB: Region = ???

    @stub
    // Track of the Slider.
    def SLIDER_TRACK: Region = ???

    @stub
    // Spinner region.
    def SPINNER: Region = ???

    @stub
    // SplitPane region.
    def SPLIT_PANE: Region = ???

    @stub
    // Divider of the SplitPane.
    def SPLIT_PANE_DIVIDER: Region = ???

    @stub
    // TabbedPane region.
    def TABBED_PANE: Region = ???

    @stub
    // Region of a TabbedPane containing the content.
    def TABBED_PANE_CONTENT: Region = ???

    @stub
    // Region of a TabbedPane for one tab.
    def TABBED_PANE_TAB: Region = ???

    @stub
    // Region of a TabbedPane containing the tabs.
    def TABBED_PANE_TAB_AREA: Region = ???

    @stub
    // Table region.
    def TABLE: Region = ???

    @stub
    // TableHeader region.
    def TABLE_HEADER: Region = ???

    @stub
    // TextArea region.
    def TEXT_AREA: Region = ???

    @stub
    // TextField region.
    def TEXT_FIELD: Region = ???

    @stub
    // TextPane region.
    def TEXT_PANE: Region = ???

    @stub
    // ToggleButton region.
    def TOGGLE_BUTTON: Region = ???

    @stub
    // ToolBar region.
    def TOOL_BAR: Region = ???

    @stub
    // Region of the ToolBar containing the content.
    def TOOL_BAR_CONTENT: Region = ???

    @stub
    // Region for the Window containing the ToolBar.
    def TOOL_BAR_DRAG_WINDOW: Region = ???

    @stub
    // ToolBar separator region.
    def TOOL_BAR_SEPARATOR: Region = ???

    @stub
    // ToolTip region.
    def TOOL_TIP: Region = ???

    @stub
    // Tree region.
    def TREE: Region = ???

    @stub
    // Region of the Tree for one cell.
    def TREE_CELL: Region = ???
}
