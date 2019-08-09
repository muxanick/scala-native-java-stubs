package javax.swing.plaf.synth

import java.awt.Graphics
import java.lang.Object
import scala.scalanative.annotation.stub

/** SynthPainter is used for painting portions of
 *  JComponents. At a minimum each JComponent
 *  has two paint methods: one for the border and one for the background. Some
 *  JComponents have more than one Region, and as
 *  a consequence more paint methods.
 *  
 *  Instances of SynthPainter are obtained from the
 *  SynthStyle.getPainter(javax.swing.plaf.synth.SynthContext) method.
 *  
 *  You typically supply a SynthPainter by way of Synth's
 *  file format. The following
 *  example registers a painter for all JButtons that will
 *  render the image myImage.png:
 *  
 *   <style id="buttonStyle">
 *     <imagePainter path="myImage.png" sourceInsets="2 2 2 2"
 *                   paintCenter="true" stretch="true"/>
 *     <insets top="2" bottom="2" left="2" right="2"/>
 *   </style>
 *   <bind style="buttonStyle" type="REGION" key="button"/>
 * 
 *  
 *  SynthPainter is abstract in so far as it does no painting,
 *  all the methods
 *  are empty. While none of these methods are typed to throw an exception,
 *  subclasses can assume that valid arguments are passed in, and if not
 *  they can throw a NullPointerException or
 *  IllegalArgumentException in response to invalid arguments.
 */
abstract class SynthPainter extends Object {

    /**  */
    @stub
    def this() = ???

    /** Paints the background of an arrow button. */
    def paintArrowButtonBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of an arrow button. */
    def paintArrowButtonBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the foreground of an arrow button. */
    def paintArrowButtonForeground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, direction: Int): Unit

    /** Paints the background of a button. */
    def paintButtonBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a button. */
    def paintButtonBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a check box. */
    def paintCheckBoxBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a check box. */
    def paintCheckBoxBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a check box menu item. */
    def paintCheckBoxMenuItemBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a check box menu item. */
    def paintCheckBoxMenuItemBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a color chooser. */
    def paintColorChooserBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a color chooser. */
    def paintColorChooserBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a combo box. */
    def paintComboBoxBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a combo box. */
    def paintComboBoxBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a desktop icon. */
    def paintDesktopIconBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a desktop icon. */
    def paintDesktopIconBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a desktop pane. */
    def paintDesktopPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a desktop pane. */
    def paintDesktopPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of an editor pane. */
    def paintEditorPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of an editor pane. */
    def paintEditorPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a file chooser. */
    def paintFileChooserBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a file chooser. */
    def paintFileChooserBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a formatted text field. */
    def paintFormattedTextFieldBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a formatted text field. */
    def paintFormattedTextFieldBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of an internal frame. */
    def paintInternalFrameBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of an internal frame. */
    def paintInternalFrameBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of an internal frame title pane. */
    def paintInternalFrameTitlePaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of an internal frame title pane. */
    def paintInternalFrameTitlePaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a label. */
    def paintLabelBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a label. */
    def paintLabelBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a list. */
    def paintListBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a list. */
    def paintListBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a menu. */
    def paintMenuBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a menu bar. */
    def paintMenuBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a menu bar. */
    def paintMenuBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a menu. */
    def paintMenuBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a menu item. */
    def paintMenuItemBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a menu item. */
    def paintMenuItemBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of an option pane. */
    def paintOptionPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of an option pane. */
    def paintOptionPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a panel. */
    def paintPanelBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a panel. */
    def paintPanelBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a password field. */
    def paintPasswordFieldBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a password field. */
    def paintPasswordFieldBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a popup menu. */
    def paintPopupMenuBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a popup menu. */
    def paintPopupMenuBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a progress bar. */
    def paintProgressBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a progress bar. */
    def paintProgressBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of a progress bar. */
    def paintProgressBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a progress bar. */
    def paintProgressBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the foreground of a progress bar. */
    def paintProgressBarForeground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a radio button. */
    def paintRadioButtonBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a radio button. */
    def paintRadioButtonBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a radio button menu item. */
    def paintRadioButtonMenuItemBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a radio button menu item. */
    def paintRadioButtonMenuItemBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a root pane. */
    def paintRootPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a root pane. */
    def paintRootPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a scrollbar. */
    def paintScrollBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a scrollbar. */
    def paintScrollBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of a scrollbar. */
    def paintScrollBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a scrollbar. */
    def paintScrollBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the thumb of a scrollbar. */
    def paintScrollBarThumbBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the thumb of a scrollbar. */
    def paintScrollBarThumbBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the track of a scrollbar. */
    def paintScrollBarTrackBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the track of a scrollbar. */
    def paintScrollBarTrackBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the track of a scrollbar. */
    def paintScrollBarTrackBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the track of a scrollbar. */
    def paintScrollBarTrackBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a scroll pane. */
    def paintScrollPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a scroll pane. */
    def paintScrollPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a separator. */
    def paintSeparatorBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a separator. */
    def paintSeparatorBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of a separator. */
    def paintSeparatorBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a separator. */
    def paintSeparatorBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the foreground of a separator. */
    def paintSeparatorForeground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a slider. */
    def paintSliderBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a slider. */
    def paintSliderBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of a slider. */
    def paintSliderBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a slider. */
    def paintSliderBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the thumb of a slider. */
    def paintSliderThumbBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the thumb of a slider. */
    def paintSliderThumbBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the track of a slider. */
    def paintSliderTrackBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the track of a slider. */
    def paintSliderTrackBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the track of a slider. */
    def paintSliderTrackBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the track of a slider. */
    def paintSliderTrackBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a spinner. */
    def paintSpinnerBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a spinner. */
    def paintSpinnerBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a split pane. */
    def paintSplitPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a split pane. */
    def paintSplitPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the divider of a split pane. */
    def paintSplitPaneDividerBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the divider of a split pane. */
    def paintSplitPaneDividerBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the foreground of the divider of a split pane. */
    def paintSplitPaneDividerForeground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the divider, when the user is dragging the divider, of a
     *  split pane.
     */
    def paintSplitPaneDragDivider(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a tabbed pane. */
    def paintTabbedPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a tabbed pane. */
    def paintTabbedPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the area that contains the content of the
     *  selected tab of a tabbed pane.
     */
    def paintTabbedPaneContentBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the area that contains the content of the
     *  selected tab of a tabbed pane.
     */
    def paintTabbedPaneContentBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the area behind the tabs of a tabbed pane. */
    def paintTabbedPaneTabAreaBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the area behind the tabs of a tabbed pane. */
    def paintTabbedPaneTabAreaBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the area behind the tabs of a tabbed pane. */
    def paintTabbedPaneTabAreaBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the area behind the tabs of a tabbed pane. */
    def paintTabbedPaneTabAreaBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a tab of a tabbed pane. */
    def paintTabbedPaneTabBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, tabIndex: Int): Unit

    /** Paints the background of a tab of a tabbed pane. */
    def paintTabbedPaneTabBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, tabIndex: Int, orientation: Int): Unit

    /** Paints the border of a tab of a tabbed pane. */
    def paintTabbedPaneTabBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, tabIndex: Int): Unit

    /** Paints the border of a tab of a tabbed pane. */
    def paintTabbedPaneTabBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, tabIndex: Int, orientation: Int): Unit

    /** Paints the background of a table. */
    def paintTableBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a table. */
    def paintTableBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the header of a table. */
    def paintTableHeaderBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the header of a table. */
    def paintTableHeaderBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a text area. */
    def paintTextAreaBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a text area. */
    def paintTextAreaBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a text field. */
    def paintTextFieldBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a text field. */
    def paintTextFieldBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a text pane. */
    def paintTextPaneBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a text pane. */
    def paintTextPaneBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a toggle button. */
    def paintToggleButtonBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a toggle button. */
    def paintToggleButtonBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a tool bar. */
    def paintToolBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a tool bar. */
    def paintToolBarBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of a tool bar. */
    def paintToolBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a tool bar. */
    def paintToolBarBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the tool bar's content area. */
    def paintToolBarContentBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the tool bar's content area. */
    def paintToolBarContentBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the content area of a tool bar. */
    def paintToolBarContentBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the content area of a tool bar. */
    def paintToolBarContentBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of the window containing the tool bar when it
     *  has been detached from its primary frame.
     */
    def paintToolBarDragWindowBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the window containing the tool bar when it
     *  has been detached from its primary frame.
     */
    def paintToolBarDragWindowBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the border of the window containing the tool bar when it
     *  has been detached from it's primary frame.
     */
    def paintToolBarDragWindowBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the window containing the tool bar when it
     *  has been detached from it's primary frame.
     */
    def paintToolBarDragWindowBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int, orientation: Int): Unit

    /** Paints the background of a tool tip. */
    def paintToolTipBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a tool tip. */
    def paintToolTipBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of a tree. */
    def paintTreeBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a tree. */
    def paintTreeBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the row containing a cell in a tree. */
    def paintTreeCellBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of the row containing a cell in a tree. */
    def paintTreeCellBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the focus indicator for a cell in a tree when it has focus. */
    def paintTreeCellFocus(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the background of the viewport. */
    def paintViewportBackground(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the border of a viewport. */
    def paintViewportBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit
}
