package javax.swing.tree

import java.awt.{Color, Component, Container, Font}
import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object
import java.util.EventObject
import javax.swing.{Icon, JTree, Timer}
import javax.swing.event.{CellEditorListener, TreeSelectionListener}

// A TreeCellEditor. You need to supply an
// instance of DefaultTreeCellRenderer
// so that the icons can be obtained. You can optionally supply
// a TreeCellEditor that will be layed out according
// to the icon in the DefaultTreeCellRenderer.
// If you do not supply a TreeCellEditor,
// a TextField will be used. Editing is started
// on a triple mouse click, or after a click, pause, click and
// a delay of 1200 milliseconds.
//
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class DefaultTreeCellEditor extends Object with ActionListener, with TreeCellEditor, with TreeSelectionListener {

    @stub
    // Constructs a DefaultTreeCellEditor
    // object for a JTree using the specified renderer and
    // a default editor.
    def this(tree: JTree, renderer: DefaultTreeCellRenderer) = ???

    @stub
    // TextField used when no editor is supplied.
    def DefaultTreeCellEditor.DefaultTextField: class = ???

    @stub
    // True if the border selection color should be drawn.
    protected def borderSelectionColor: Color = ???

    @stub
    // As of Java 2 platform v1.4 this field should no longer be used.
    protected def canEdit: Boolean = ???

    @stub
    // Component used in editing, obtained from the
    // editingContainer.
    protected def editingComponent: Component = ???

    @stub
    // Editing container, will contain the editorComponent.
    protected def editingContainer: Container = ???

    @stub
    // Icon to use when editing.
    protected def editingIcon: Icon = ???

    @stub
    // Font to paint with, null indicates
    // font of renderer is to be used.
    protected def font: Font = ???

    @stub
    // Last path that was selected.
    protected def lastPath: TreePath = ???

    @stub
    // Row that was last passed into
    // getTreeCellEditorComponent.
    protected def lastRow: Int = ???

    @stub
    // Used in editing.
    protected def offset: Int = ???

    @stub
    // Editor handling the editing.
    protected def realEditor: TreeCellEditor = ???

    @stub
    // Renderer, used to get border and offsets from.
    protected def renderer: DefaultTreeCellRenderer = ???

    @stub
    // Used before starting the editing session.
    protected def timer: Timer = ???

    @stub
    // Messaged when the timer fires, this will start the editing
    // session.
    def actionPerformed(e: ActionEvent): Unit = ???

    @stub
    // Adds the CellEditorListener.
    def addCellEditorListener(l: CellEditorListener): Unit = ???

    @stub
    // Messages cancelCellEditing to the
    // realEditor and removes it from this instance.
    def cancelCellEditing(): Unit = ???

    @stub
    // Returns true if event is null,
    // or it is a MouseEvent with a click count > 2
    // and inHitRegion returns true.
    protected def canEditImmediately(event: EventObject): Boolean = ???

    @stub
    // Creates the container to manage placement of
    // editingComponent.
    protected def createContainer(): Container = ???

    @stub
    // This is invoked if a TreeCellEditor
    // is not supplied in the constructor.
    protected def createTreeCellEditor(): TreeCellEditor = ???

    @stub
    // 
    protected def determineOffset(tree: JTree, value: Object, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Unit = ???

    @stub
    // Returns the color the border is drawn.
    def getBorderSelectionColor(): Color = ???

    @stub
    // Returns an array of all the CellEditorListeners added
    // to this DefaultTreeCellEditor with addCellEditorListener().
    def getCellEditorListeners(): Array[CellEditorListener] = ???

    @stub
    // Returns the value currently being edited.
    def getCellEditorValue(): Object = ???

    @stub
    // Gets the font used for editing.
    def getFont(): Font = ???

    @stub
    // Configures the editor.
    def getTreeCellEditorComponent(tree: JTree, value: Object, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Component = ???

    @stub
    // Returns true if the passed in location is a valid mouse location
    // to start editing from.
    protected def inHitRegion(x: Int, y: Int): Boolean = ???

    @stub
    // If the realEditor returns true to this
    // message, prepareForEditing
    // is messaged and true is returned.
    def isCellEditable(event: EventObject): Boolean = ???

    @stub
    // Invoked just before editing is to start.
    protected def prepareForEditing(): Unit = ???

    @stub
    // Removes the previously added CellEditorListener.
    def removeCellEditorListener(l: CellEditorListener): Unit = ???

    @stub
    // Sets the color to use for the border.
    def setBorderSelectionColor(newColor: Color): Unit = ???

    @stub
    // Sets the font to edit with.
    def setFont(font: Font): Unit = ???

    @stub
    // Sets the tree currently editing for.
    protected def setTree(newTree: JTree): Unit = ???

    @stub
    // Messages the realEditor for the return value.
    def shouldSelectCell(event: EventObject): Boolean = ???

    @stub
    // Returns true if event is a MouseEvent
    // and the click count is 1.
    protected def shouldStartEditingTimer(event: EventObject): Boolean = ???

    @stub
    // Starts the editing timer.
    protected def startEditingTimer(): Unit = ???

    @stub
    // If the realEditor will allow editing to stop,
    // the realEditor is removed and true is returned,
    // otherwise false is returned.
    def stopCellEditing(): Boolean = ???
}
