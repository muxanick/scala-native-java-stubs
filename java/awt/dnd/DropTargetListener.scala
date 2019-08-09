package java.awt.dnd

import java.util.EventListener

/** The DropTargetListener interface
 *  is the callback interface used by the
 *  DropTarget class to provide
 *  notification of DnD operations that involve
 *  the subject DropTarget. Methods of
 *  this interface may be implemented to provide
 *  "drag under" visual feedback to the user throughout
 *  the Drag and Drop operation.
 *  
 *  Create a listener object by implementing the interface and then register it
 *  with a DropTarget. When the drag enters, moves over, or exits
 *  the operable part of the drop site for that DropTarget, when
 *  the drop action changes, and when the drop occurs, the relevant method in
 *  the listener object is invoked, and the DropTargetEvent is
 *  passed to it.
 *  
 *  The operable part of the drop site for the DropTarget is
 *  the part of the associated Component's geometry that is not
 *  obscured by an overlapping top-level window or by another
 *  Component higher in the Z-order that has an associated active
 *  DropTarget.
 *  
 *  During the drag, the data associated with the current drag operation can be
 *  retrieved by calling getTransferable() on
 *  DropTargetDragEvent instances passed to the listener's
 *  methods.
 *  
 *  Note that getTransferable() on the
 *  DropTargetDragEvent instance should only be called within the
 *  respective listener's method and all the necessary data should be retrieved
 *  from the returned Transferable before that method returns.
 */
trait DropTargetListener extends EventListener {

    /** Called while a drag operation is ongoing, when the mouse pointer enters
     *  the operable part of the drop site for the DropTarget
     *  registered with this listener.
     */
    @stub
    def dragEnter(dtde: DropTargetDragEvent): Unit = ???

    /** Called while a drag operation is ongoing, when the mouse pointer has
     *  exited the operable part of the drop site for the
     *  DropTarget registered with this listener.
     */
    @stub
    def dragExit(dte: DropTargetEvent): Unit = ???

    /** Called when a drag operation is ongoing, while the mouse pointer is still
     *  over the operable part of the drop site for the DropTarget
     *  registered with this listener.
     */
    @stub
    def dragOver(dtde: DropTargetDragEvent): Unit = ???

    /** Called when the drag operation has terminated with a drop on
     *  the operable part of the drop site for the DropTarget
     *  registered with this listener.
     */
    @stub
    def drop(dtde: DropTargetDropEvent): Unit = ???
}
