package javax.swing

import java.lang.Object

// A data model for a combo box. This interface extends ListDataModel
// and adds the concept of a selected item. The selected item is generally
// the item which is visible in the combo box display area.
// 
// The selected item may not necessarily be managed by the underlying
// ListModel. This disjoint behavior allows for the temporary
// storage and retrieval of a selected item in the model.
trait ComboBoxModel[E] extends ListModel[E] {

    @stub
    // Returns the selected item
    def getSelectedItem(): Object = ???
}
