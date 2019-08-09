package java.awt.datatransfer

// Defines the interface for classes that will provide data to
// a clipboard. An instance of this interface becomes the owner
// of the contents of a clipboard (clipboard owner) if it is
// passed as an argument to
// Clipboard.setContents(java.awt.datatransfer.Transferable, java.awt.datatransfer.ClipboardOwner) method of
// the clipboard and this method returns successfully.
// The instance remains the clipboard owner until another application
// or another object within this application asserts ownership
// of this clipboard.
trait ClipboardOwner {
}
