package java.awt.dnd

import java.lang.Object
import java.util.EventObject

/** The DragSourceDragEvent is
 *  delivered from the DragSourceContextPeer,
 *  via the DragSourceContext, to the DragSourceListener
 *  registered with that DragSourceContext and with its associated
 *  DragSource.
 *  
 *  The DragSourceDragEvent reports the target drop action
 *  and the user drop action that reflect the current state of
 *  the drag operation.
 *  
 *  Target drop action is one of DnDConstants that represents
 *  the drop action selected by the current drop target if this drop action is
 *  supported by the drag source or DnDConstants.ACTION_NONE if this
 *  drop action is not supported by the drag source.
 *  
 *  User drop action depends on the drop actions supported by the drag
 *  source and the drop action selected by the user. The user can select a drop
 *  action by pressing modifier keys during the drag operation:
 *  
 *    Ctrl + Shift -> ACTION_LINK
 *    Ctrl         -> ACTION_COPY
 *    Shift        -> ACTION_MOVE
 *  
 *  If the user selects a drop action, the user drop action is one of
 *  DnDConstants that represents the selected drop action if this
 *  drop action is supported by the drag source or
 *  DnDConstants.ACTION_NONE if this drop action is not supported
 *  by the drag source.
 *  
 *  If the user doesn't select a drop action, the set of
 *  DnDConstants that represents the set of drop actions supported
 *  by the drag source is searched for DnDConstants.ACTION_MOVE,
 *  then for DnDConstants.ACTION_COPY, then for
 *  DnDConstants.ACTION_LINK and the user drop action is the
 *  first constant found. If no constant is found the user drop action
 *  is DnDConstants.ACTION_NONE.
 */
class DragSourceDragEvent extends DragSourceEvent {

    /** Constructs a DragSourceDragEvent. */
    @stub
    def this(dsc: DragSourceContext, dropAction: Int, action: Int, modifiers: Int) = ???

    /** This method returns the logical intersection of
     *  the target drop action and the set of drop actions supported by
     *  the drag source.
     */
    @stub
    def getDropAction(): Int = ???

    /** This method returns an int representing
     *  the current state of the input device modifiers
     *  associated with the user's gesture.
     */
    @stub
    def getGestureModifiers(): Int = ???

    /** This method returns an int representing
     *  the current state of the input device extended modifiers
     *  associated with the user's gesture.
     */
    @stub
    def getGestureModifiersEx(): Int = ???

    /** This method returns the target drop action. */
    @stub
    def getTargetActions(): Int = ???
}
