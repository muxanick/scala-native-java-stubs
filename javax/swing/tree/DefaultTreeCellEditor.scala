package javax.swing.tree

import java.awt.{Color, Component, Container, Font}
import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object
import java.util.EventObject
import javax.swing.{Icon, JTree, Timer}
import javax.swing.event.{CellEditorListener, TreeSelectionEvent, TreeSelectionListener}
import scala.scalanative.annotation.stub

/** A TreeCellEditor. You need to supply an
 *  instance of DefaultTreeCellRenderer
 *  so that the icons can be obtained. You can optionally supply
 *  a TreeCellEditor that will be layed out according
 *  to the icon in the DefaultTreeCellRenderer.
 *  If you do not supply a TreeCellEditor,
 *  a TextField will be used. Editing is started
 *  on a triple mouse click, or after a click, pause, click and
 *  a delay of 1200 milliseconds.
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
class DefaultTreeCellEditor extends Object with ActionListener with TreeCellEditor with TreeSelectionListener {

    /** Constructs a DefaultTreeCellEditor
     *  object for a JTree using the specified renderer and
     *  a default editor.
     */
    @stub
    def this(tree: JTree, renderer: DefaultTreeCellRenderer) = ???

    /** Constructs a DefaultTreeCellEditor
     *  object for a JTree using the
     *  specified renderer and the specified editor.
     */
    @stub
    def this(tree: JTree, renderer: DefaultTreeCellRenderer, editor: TreeCellEditor) = ???

    /** TextField used when no editor is supplied. */
    @stub
    object DefaultTextField extends DefaultTreeCellEditor.DefaultTextField

    /** Container responsible for placing the editingComponent. */
    @stub
    object EditorContainer extends DefaultTreeCellEditor.EditorContainer

    /** True if the border selection color should be drawn. */
    @stub
    protected val borderSelectionColor: Color = ???

    /** As of Java 2 platform v1.4 this field should no longer be used. */
    @stub
    protected val canEdit: Boolean = ???

    /** Component used in editing, obtained from the
     *  editingContainer.
     */
    @stub
    protected val editingComponent: Component = ???

    /** Editing container, will contain the editorComponent. */
    @stub
    protected val editingContainer: Container = ???

    /** Icon to use when editing. */
    @stub
    protected val editingIcon: Icon = ???

    /** Font to paint with, null indicates
     *  font of renderer is to be used.
     */
    @stub
    protected val font: Font = ???

    /** Last path that was selected. */
    @stub
    protected val lastPath: TreePath = ???

    /** Row that was last passed into
     *  getTreeCellEditorComponent.
     */
    @stub
    protected val lastRow: Int = ???

    /** Used in editing. */
    @stub
    protected val offset: Int = ???

    /** Editor handling the editing. */
    @stub
    protected val realEditor: TreeCellEditor = ???

    /** Renderer, used to get border and offsets from. */
    @stub
    protected val renderer: DefaultTreeCellRenderer = ???

    /** Used before starting the editing session. */
    @stub
    protected val timer: Timer = ???

    /** JTree instance listening too. */
    @stub
    protected val tree: JTree = ???

    /** Messaged when the timer fires, this will start the editing
     *  session.
     */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /** Adds the CellEditorListener. */
    @stub
    def addCellEditorListener(l: CellEditorListener): Unit = ???

    /** Messages cancelCellEditing to the
     *  realEditor and removes it from this instance.
     */
    @stub
    def cancelCellEditing(): Unit = ???

    /** Returns true if event is null,
     *  or it is a MouseEvent with a click count > 2
     *  and inHitRegion returns true.
     */
    @stub
    protected def canEditImmediately(event: EventObject): Boolean = ???

    /** Creates the container to manage placement of
     *  editingComponent.
     */
    @stub
    protected def createContainer(): Container = ???

    /** This is invoked if a TreeCellEditor
     *  is not supplied in the constructor.
     */
    @stub
    protected def createTreeCellEditor(): TreeCellEditor = ???

    /**  */
    @stub
    protected def determineOffset(tree: JTree, value: Object, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Unit = ???

    /** Returns the color the border is drawn. */
    @stub
    def getBorderSelectionColor(): Color = ???

    /** Returns an array of all the CellEditorListeners added
     *  to this DefaultTreeCellEditor with addCellEditorListener().
     */
    @stub
    def getCellEditorListeners(): Array[CellEditorListener] = ???

    /** Returns the value currently being edited. */
    @stub
    def getCellEditorValue(): Object = ???

    /** Gets the font used for editing. */
    @stub
    def getFont(): Font = ???

    /** Configures the editor. */
    @stub
    def getTreeCellEditorComponent(tree: JTree, value: Object, isSelected: Boolean, expanded: Boolean, leaf: Boolean, row: Int): Component = ???

    /** Returns true if the passed in location is a valid mouse location
     *  to start editing from.
     */
    @stub
    protected def inHitRegion(x: Int, y: Int): Boolean = ???

    /** If the realEditor returns true to this
     *  message, prepareForEditing
     *  is messaged and true is returned.
     */
    @stub
    def isCellEditable(event: EventObject): Boolean = ???

    /** Invoked just before editing is to start. */
    @stub
    protected def prepareForEditing(): Unit = ???

    /** Removes the previously added CellEditorListener. */
    @stub
    def removeCellEditorListener(l: CellEditorListener): Unit = ???

    /** Sets the color to use for the border. */
    @stub
    def setBorderSelectionColor(newColor: Color): Unit = ???

    /** Sets the font to edit with. */
    @stub
    def setFont(font: Font): Unit = ???

    /** Sets the tree currently editing for. */
    @stub
    protected def setTree(newTree: JTree): Unit = ???

    /** Messages the realEditor for the return value. */
    @stub
    def shouldSelectCell(event: EventObject): Boolean = ???

    /** Returns true if event is a MouseEvent
     *  and the click count is 1.
     */
    @stub
    protected def shouldStartEditingTimer(event: EventObject): Boolean = ???

    /** Starts the editing timer. */
    @stub
    protected def startEditingTimer(): Unit = ???

    /** If the realEditor will allow editing to stop,
     *  the realEditor is removed and true is returned,
     *  otherwise false is returned.
     */
    @stub
    def stopCellEditing(): Boolean = ???

    /** Resets lastPath. */
    @stub
    def valueChanged(e: TreeSelectionEvent): Unit = ???
}
