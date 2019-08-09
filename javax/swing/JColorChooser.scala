package javax.swing

import java.awt.{Color, Component, Container}
import java.awt.event.ActionListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.colorchooser.{AbstractColorChooserPanel, ColorSelectionModel}
import javax.swing.plaf.ColorChooserUI

// JColorChooser provides a pane of controls designed to allow
// a user to manipulate and select a color.
// For information about using color choosers, see
// How to Use Color Choosers,
// a section in The Java Tutorial.
//
// 
//
// This class provides three levels of API:
// 
// A static convenience method which shows a modal color-chooser
// dialog and returns the color selected by the user.
// A static convenience method for creating a color-chooser dialog
// where ActionListeners can be specified to be invoked when
// the user presses one of the dialog buttons.
// The ability to create instances of JColorChooser panes
// directly (within any container). PropertyChange listeners
// can be added to detect when the current "color" property changes.
// 
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JColorChooser extends JComponent with Accessible {

    @stub
    // Creates a color chooser pane with an initial color of white.
    def this() = ???

    @stub
    // Creates a color chooser pane with the specified initial color.
    def this(initialColor: Color) = ???

    @stub
    // 
    protected def accessibleContext: AccessibleContext = ???

    @stub
    // Adds a color chooser panel to the color chooser.
    def addChooserPanel(panel: AbstractColorChooserPanel): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JColorChooser.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the specified color panels.
    def getChooserPanels(): Array[AbstractColorChooserPanel] = ???

    @stub
    // Gets the current color value from the color chooser.
    def getColor(): Color = ???

    @stub
    // Gets the value of the dragEnabled property.
    def getDragEnabled(): Boolean = ???

    @stub
    // Returns the preview panel that shows a chosen color.
    def getPreviewPanel(): JComponent = ???

    @stub
    // Returns the data model that handles color selections.
    def getSelectionModel(): ColorSelectionModel = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): ColorChooserUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns a string representation of this JColorChooser.
    protected def paramString(): String = ???

    @stub
    // Removes the Color Panel specified.
    def removeChooserPanel(panel: AbstractColorChooserPanel): AbstractColorChooserPanel = ???

    @stub
    // Specifies the Color Panels used to choose a color value.
    def setChooserPanels(panels: Array[AbstractColorChooserPanel]): Unit = ???

    @stub
    // Sets the current color of the color chooser to the specified color.
    def setColor(color: Color): Unit = ???

    @stub
    // Sets the current color of the color chooser to the
    // specified color.
    def setColor(c: Int): Unit = ???

    @stub
    // Sets the current color of the color chooser to the
    // specified RGB color.
    def setColor(r: Int, g: Int, b: Int): Unit = ???

    @stub
    // Sets the dragEnabled property,
    // which must be true to enable
    // automatic drag handling (the first part of drag and drop)
    // on this component.
    def setDragEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the current preview panel.
    def setPreviewPanel(preview: JComponent): Unit = ???

    @stub
    // Sets the model containing the selected color.
    def setSelectionModel(newModel: ColorSelectionModel): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: ColorChooserUI): Unit = ???
}

object JColorChooser {
    @stub
    // The chooserPanel array property name.
    def CHOOSER_PANELS_PROPERTY: String = ???

    @stub
    // The preview panel property name.
    def PREVIEW_PANEL_PROPERTY: String = ???

    @stub
    // Creates and returns a new dialog containing the specified
    // ColorChooser pane along with "OK", "Cancel", and "Reset"
    // buttons.
    def createDialog(c: Component, title: String, modal: Boolean, chooserPane: JColorChooser, okListener: ActionListener, cancelListener: ActionListener): JDialog = ???

    @stub
    // Shows a modal color-chooser dialog and blocks until the
    // dialog is hidden.
    def showDialog(component: Component, title: String, initialColor: Color): Color = ???
}
