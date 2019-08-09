package javax.swing

import java.awt.{Color, Component, Container}
import java.awt.event.ActionListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.colorchooser.{AbstractColorChooserPanel, ColorSelectionModel}
import javax.swing.plaf.ColorChooserUI
import scala.scalanative.annotation.stub

/** JColorChooser provides a pane of controls designed to allow
 *  a user to manipulate and select a color.
 *  For information about using color choosers, see
 *  How to Use Color Choosers,
 *  a section in The Java Tutorial.
 * 
 *  
 * 
 *  This class provides three levels of API:
 *  
 *  A static convenience method which shows a modal color-chooser
 *  dialog and returns the color selected by the user.
 *  A static convenience method for creating a color-chooser dialog
 *  where ActionListeners can be specified to be invoked when
 *  the user presses one of the dialog buttons.
 *  The ability to create instances of JColorChooser panes
 *  directly (within any container). PropertyChange listeners
 *  can be added to detect when the current "color" property changes.
 *  
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class JColorChooser extends JComponent with Accessible {

    /** Creates a color chooser pane with an initial color of white. */
    @stub
    def this() = ???

    /** Creates a color chooser pane with the specified initial color. */
    @stub
    def this(initialColor: Color) = ???

    /** Creates a color chooser pane with the specified
     *  ColorSelectionModel.
     */
    @stub
    def this(model: ColorSelectionModel) = ???

    /** This class implements accessibility support for the
     *  JColorChooser class.
     */
    @stub
    protected object AccessibleJColorChooser extends JColorChooser.AccessibleJColorChooser

    /**  */
    @stub
    protected val accessibleContext: AccessibleContext = ???

    /** Adds a color chooser panel to the color chooser. */
    @stub
    def addChooserPanel(panel: AbstractColorChooserPanel): Unit = ???

    /** Gets the AccessibleContext associated with this JColorChooser. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the specified color panels. */
    @stub
    def getChooserPanels(): Array[AbstractColorChooserPanel] = ???

    /** Gets the current color value from the color chooser. */
    @stub
    def getColor(): Color = ???

    /** Gets the value of the dragEnabled property. */
    @stub
    def getDragEnabled(): Boolean = ???

    /** Returns the preview panel that shows a chosen color. */
    @stub
    def getPreviewPanel(): JComponent = ???

    /** Returns the data model that handles color selections. */
    @stub
    def getSelectionModel(): ColorSelectionModel = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): ColorChooserUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns a string representation of this JColorChooser. */
    @stub
    protected def paramString(): String = ???

    /** Removes the Color Panel specified. */
    @stub
    def removeChooserPanel(panel: AbstractColorChooserPanel): AbstractColorChooserPanel = ???

    /** Specifies the Color Panels used to choose a color value. */
    @stub
    def setChooserPanels(panels: Array[AbstractColorChooserPanel]): Unit = ???

    /** Sets the current color of the color chooser to the specified color. */
    @stub
    def setColor(color: Color): Unit = ???

    /** Sets the current color of the color chooser to the
     *  specified color.
     */
    @stub
    def setColor(c: Int): Unit = ???

    /** Sets the current color of the color chooser to the
     *  specified RGB color.
     */
    @stub
    def setColor(r: Int, g: Int, b: Int): Unit = ???

    /** Sets the dragEnabled property,
     *  which must be true to enable
     *  automatic drag handling (the first part of drag and drop)
     *  on this component.
     */
    @stub
    def setDragEnabled(b: Boolean): Unit = ???

    /** Sets the current preview panel. */
    @stub
    def setPreviewPanel(preview: JComponent): Unit = ???

    /** Sets the model containing the selected color. */
    @stub
    def setSelectionModel(newModel: ColorSelectionModel): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: ColorChooserUI): Unit = ???

    /** Notification from the UIManager that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???
}

object JColorChooser {
    /** The chooserPanel array property name. */
    @stub
    val CHOOSER_PANELS_PROPERTY: String = ???

    /** The preview panel property name. */
    @stub
    val PREVIEW_PANEL_PROPERTY: String = ???

    /** The selection model property name. */
    @stub
    val SELECTION_MODEL_PROPERTY: String = ???

    /** Creates and returns a new dialog containing the specified
     *  ColorChooser pane along with "OK", "Cancel", and "Reset"
     *  buttons.
     */
    @stub
    def createDialog(c: Component, title: String, modal: Boolean, chooserPane: JColorChooser, okListener: ActionListener, cancelListener: ActionListener): JDialog = ???

    /** Shows a modal color-chooser dialog and blocks until the
     *  dialog is hidden.
     */
    @stub
    def showDialog(component: Component, title: String, initialColor: Color): Color = ???
}
