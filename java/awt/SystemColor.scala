package java.awt

import java.io.Serializable
import java.lang.Object

// A class to encapsulate symbolic colors representing the color of
// native GUI objects on a system.  For systems which support the dynamic
// update of the system colors (when the user changes the colors)
// the actual RGB values of these symbolic colors will also change
// dynamically.  In order to compare the "current" RGB value of a
// SystemColor object with a non-symbolic Color object,
// getRGB should be used rather than equals.
// 
// Note that the way in which these system colors are applied to GUI objects
// may vary slightly from platform to platform since GUI objects may be
// rendered differently on each platform.
// 
// System color values may also be available through the getDesktopProperty
// method on java.awt.Toolkit.
final class SystemColor extends Color with Serializable {
}

object SystemColor {
    @stub
    // The array index for the
    // activeCaption system color.
    def ACTIVE_CAPTION: Int = ???

    @stub
    // The array index for the
    // activeCaptionBorder system color.
    def ACTIVE_CAPTION_BORDER: Int = ???

    @stub
    // The array index for the
    // activeCaptionText system color.
    def ACTIVE_CAPTION_TEXT: Int = ???

    @stub
    // The color rendered for the window-title background of the currently active window.
    def activeCaption: SystemColor = ???

    @stub
    // The color rendered for the border around the currently active window.
    def activeCaptionBorder: SystemColor = ???

    @stub
    // The color rendered for the window-title text of the currently active window.
    def activeCaptionText: SystemColor = ???

    @stub
    // The color rendered for the background of control panels and control objects,
    // such as pushbuttons.
    def control: SystemColor = ???

    @stub
    // The array index for the
    // control system color.
    def CONTROL: Int = ???

    @stub
    // The array index for the
    // controlDkShadow system color.
    def CONTROL_DK_SHADOW: Int = ???

    @stub
    // The array index for the
    // controlHighlight system color.
    def CONTROL_HIGHLIGHT: Int = ???

    @stub
    // The array index for the
    // controlLtHighlight system color.
    def CONTROL_LT_HIGHLIGHT: Int = ???

    @stub
    // The array index for the
    // controlShadow system color.
    def CONTROL_SHADOW: Int = ???

    @stub
    // The array index for the
    // controlText system color.
    def CONTROL_TEXT: Int = ???

    @stub
    // The color rendered for dark shadow areas on 3D control objects, such as pushbuttons.
    def controlDkShadow: SystemColor = ???

    @stub
    // The color rendered for light areas of 3D control objects, such as pushbuttons.
    def controlHighlight: SystemColor = ???

    @stub
    // The color rendered for highlight areas of 3D control objects, such as pushbuttons.
    def controlLtHighlight: SystemColor = ???

    @stub
    // The color rendered for shadow areas of 3D control objects, such as pushbuttons.
    def controlShadow: SystemColor = ???

    @stub
    // The color rendered for the text of control panels and control objects,
    // such as pushbuttons.
    def controlText: SystemColor = ???

    @stub
    // The color rendered for the background of the desktop.
    def desktop: SystemColor = ???

    @stub
    // The array index for the
    // desktop system color.
    def DESKTOP: Int = ???

    @stub
    // The array index for the
    // inactiveCaption system color.
    def INACTIVE_CAPTION: Int = ???

    @stub
    // The array index for the
    // inactiveCaptionBorder system color.
    def INACTIVE_CAPTION_BORDER: Int = ???

    @stub
    // The array index for the
    // inactiveCaptionText system color.
    def INACTIVE_CAPTION_TEXT: Int = ???

    @stub
    // The color rendered for the window-title background of inactive windows.
    def inactiveCaption: SystemColor = ???

    @stub
    // The color rendered for the border around inactive windows.
    def inactiveCaptionBorder: SystemColor = ???

    @stub
    // The color rendered for the window-title text of inactive windows.
    def inactiveCaptionText: SystemColor = ???

    @stub
    // The color rendered for the background of tooltips or spot help.
    def info: SystemColor = ???

    @stub
    // The array index for the
    // info system color.
    def INFO: Int = ???

    @stub
    // The array index for the
    // infoText system color.
    def INFO_TEXT: Int = ???

    @stub
    // The color rendered for the text of tooltips or spot help.
    def infoText: SystemColor = ???

    @stub
    // The color rendered for the background of menus.
    def menu: SystemColor = ???

    @stub
    // The array index for the
    // menu system color.
    def MENU: Int = ???

    @stub
    // The array index for the
    // menuText system color.
    def MENU_TEXT: Int = ???

    @stub
    // The color rendered for the text of menus.
    def menuText: SystemColor = ???

    @stub
    // The number of system colors in the array.
    def NUM_COLORS: Int = ???

    @stub
    // The color rendered for the background of scrollbars.
    def scrollbar: SystemColor = ???

    @stub
    // The array index for the
    // scrollbar system color.
    def SCROLLBAR: Int = ???

    @stub
    // The color rendered for the background of text control objects, such as
    // textfields and comboboxes.
    def text: SystemColor = ???

    @stub
    // The array index for the
    // text system color.
    def TEXT: Int = ???

    @stub
    // The array index for the
    // textHighlight system color.
    def TEXT_HIGHLIGHT: Int = ???

    @stub
    // The array index for the
    // textHighlightText system color.
    def TEXT_HIGHLIGHT_TEXT: Int = ???

    @stub
    // The array index for the
    // textInactiveText system color.
    def TEXT_INACTIVE_TEXT: Int = ???

    @stub
    // The array index for the
    // textText system color.
    def TEXT_TEXT: Int = ???

    @stub
    // The color rendered for the background of selected items, such as in menus,
    // comboboxes, and text.
    def textHighlight: SystemColor = ???

    @stub
    // The color rendered for the text of selected items, such as in menus, comboboxes,
    // and text.
    def textHighlightText: SystemColor = ???

    @stub
    // The color rendered for the text of inactive items, such as in menus.
    def textInactiveText: SystemColor = ???

    @stub
    // The color rendered for the text of text control objects, such as textfields
    // and comboboxes.
    def textText: SystemColor = ???

    @stub
    // The color rendered for the background of interior regions inside windows.
    def window: SystemColor = ???

    @stub
    // The array index for the
    // window system color.
    def WINDOW: Int = ???

    @stub
    // The array index for the
    // windowBorder system color.
    def WINDOW_BORDER: Int = ???

    @stub
    // The array index for the
    // windowText system color.
    def WINDOW_TEXT: Int = ???

    @stub
    // The color rendered for the border around interior regions inside windows.
    def windowBorder: SystemColor = ???
}
