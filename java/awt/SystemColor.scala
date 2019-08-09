package java.awt

import java.io.Serializable
import java.lang.Object

/** A class to encapsulate symbolic colors representing the color of
 *  native GUI objects on a system.  For systems which support the dynamic
 *  update of the system colors (when the user changes the colors)
 *  the actual RGB values of these symbolic colors will also change
 *  dynamically.  In order to compare the "current" RGB value of a
 *  SystemColor object with a non-symbolic Color object,
 *  getRGB should be used rather than equals.
 *  
 *  Note that the way in which these system colors are applied to GUI objects
 *  may vary slightly from platform to platform since GUI objects may be
 *  rendered differently on each platform.
 *  
 *  System color values may also be available through the getDesktopProperty
 *  method on java.awt.Toolkit.
 */
final class SystemColor extends Color with Serializable {
}

object SystemColor {
    /** The array index for the
     *  activeCaption system color.
     */
    @stub
    val ACTIVE_CAPTION: Int = ???

    /** The array index for the
     *  activeCaptionBorder system color.
     */
    @stub
    val ACTIVE_CAPTION_BORDER: Int = ???

    /** The array index for the
     *  activeCaptionText system color.
     */
    @stub
    val ACTIVE_CAPTION_TEXT: Int = ???

    /** The color rendered for the window-title background of the currently active window. */
    @stub
    val activeCaption: SystemColor = ???

    /** The color rendered for the border around the currently active window. */
    @stub
    val activeCaptionBorder: SystemColor = ???

    /** The color rendered for the window-title text of the currently active window. */
    @stub
    val activeCaptionText: SystemColor = ???

    /** The color rendered for the background of control panels and control objects,
     *  such as pushbuttons.
     */
    @stub
    val control: SystemColor = ???

    /** The array index for the
     *  control system color.
     */
    @stub
    val CONTROL: Int = ???

    /** The array index for the
     *  controlDkShadow system color.
     */
    @stub
    val CONTROL_DK_SHADOW: Int = ???

    /** The array index for the
     *  controlHighlight system color.
     */
    @stub
    val CONTROL_HIGHLIGHT: Int = ???

    /** The array index for the
     *  controlLtHighlight system color.
     */
    @stub
    val CONTROL_LT_HIGHLIGHT: Int = ???

    /** The array index for the
     *  controlShadow system color.
     */
    @stub
    val CONTROL_SHADOW: Int = ???

    /** The array index for the
     *  controlText system color.
     */
    @stub
    val CONTROL_TEXT: Int = ???

    /** The color rendered for dark shadow areas on 3D control objects, such as pushbuttons. */
    @stub
    val controlDkShadow: SystemColor = ???

    /** The color rendered for light areas of 3D control objects, such as pushbuttons. */
    @stub
    val controlHighlight: SystemColor = ???

    /** The color rendered for highlight areas of 3D control objects, such as pushbuttons. */
    @stub
    val controlLtHighlight: SystemColor = ???

    /** The color rendered for shadow areas of 3D control objects, such as pushbuttons. */
    @stub
    val controlShadow: SystemColor = ???

    /** The color rendered for the text of control panels and control objects,
     *  such as pushbuttons.
     */
    @stub
    val controlText: SystemColor = ???

    /** The color rendered for the background of the desktop. */
    @stub
    val desktop: SystemColor = ???

    /** The array index for the
     *  desktop system color.
     */
    @stub
    val DESKTOP: Int = ???

    /** The array index for the
     *  inactiveCaption system color.
     */
    @stub
    val INACTIVE_CAPTION: Int = ???

    /** The array index for the
     *  inactiveCaptionBorder system color.
     */
    @stub
    val INACTIVE_CAPTION_BORDER: Int = ???

    /** The array index for the
     *  inactiveCaptionText system color.
     */
    @stub
    val INACTIVE_CAPTION_TEXT: Int = ???

    /** The color rendered for the window-title background of inactive windows. */
    @stub
    val inactiveCaption: SystemColor = ???

    /** The color rendered for the border around inactive windows. */
    @stub
    val inactiveCaptionBorder: SystemColor = ???

    /** The color rendered for the window-title text of inactive windows. */
    @stub
    val inactiveCaptionText: SystemColor = ???

    /** The color rendered for the background of tooltips or spot help. */
    @stub
    val info: SystemColor = ???

    /** The array index for the
     *  info system color.
     */
    @stub
    val INFO: Int = ???

    /** The array index for the
     *  infoText system color.
     */
    @stub
    val INFO_TEXT: Int = ???

    /** The color rendered for the text of tooltips or spot help. */
    @stub
    val infoText: SystemColor = ???

    /** The color rendered for the background of menus. */
    @stub
    val menu: SystemColor = ???

    /** The array index for the
     *  menu system color.
     */
    @stub
    val MENU: Int = ???

    /** The array index for the
     *  menuText system color.
     */
    @stub
    val MENU_TEXT: Int = ???

    /** The color rendered for the text of menus. */
    @stub
    val menuText: SystemColor = ???

    /** The number of system colors in the array. */
    @stub
    val NUM_COLORS: Int = ???

    /** The color rendered for the background of scrollbars. */
    @stub
    val scrollbar: SystemColor = ???

    /** The array index for the
     *  scrollbar system color.
     */
    @stub
    val SCROLLBAR: Int = ???

    /** The color rendered for the background of text control objects, such as
     *  textfields and comboboxes.
     */
    @stub
    val text: SystemColor = ???

    /** The array index for the
     *  text system color.
     */
    @stub
    val TEXT: Int = ???

    /** The array index for the
     *  textHighlight system color.
     */
    @stub
    val TEXT_HIGHLIGHT: Int = ???

    /** The array index for the
     *  textHighlightText system color.
     */
    @stub
    val TEXT_HIGHLIGHT_TEXT: Int = ???

    /** The array index for the
     *  textInactiveText system color.
     */
    @stub
    val TEXT_INACTIVE_TEXT: Int = ???

    /** The array index for the
     *  textText system color.
     */
    @stub
    val TEXT_TEXT: Int = ???

    /** The color rendered for the background of selected items, such as in menus,
     *  comboboxes, and text.
     */
    @stub
    val textHighlight: SystemColor = ???

    /** The color rendered for the text of selected items, such as in menus, comboboxes,
     *  and text.
     */
    @stub
    val textHighlightText: SystemColor = ???

    /** The color rendered for the text of inactive items, such as in menus. */
    @stub
    val textInactiveText: SystemColor = ???

    /** The color rendered for the text of text control objects, such as textfields
     *  and comboboxes.
     */
    @stub
    val textText: SystemColor = ???

    /** The color rendered for the background of interior regions inside windows. */
    @stub
    val window: SystemColor = ???

    /** The array index for the
     *  window system color.
     */
    @stub
    val WINDOW: Int = ???

    /** The array index for the
     *  windowBorder system color.
     */
    @stub
    val WINDOW_BORDER: Int = ???

    /** The array index for the
     *  windowText system color.
     */
    @stub
    val WINDOW_TEXT: Int = ???

    /** The color rendered for the border around interior regions inside windows. */
    @stub
    val windowBorder: SystemColor = ???
}
