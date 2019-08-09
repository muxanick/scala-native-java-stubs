package java.nio.file.attribute

import java.lang.String

// A file attribute view that provides a view of the legacy "DOS" file attributes.
// These attributes are supported by file systems such as the File Allocation
// Table (FAT) format commonly used in consumer devices.
//
//  A DosFileAttributeView is a BasicFileAttributeView that
// additionally supports access to the set of DOS attribute flags that are used
// to indicate if the file is read-only, hidden, a system file, or archived.
//
//  Where dynamic access to file attributes is required, the attributes
// supported by this attribute view are as defined by BasicFileAttributeView, and in addition, the following attributes are
// supported:
// 
// 
//   
//      Name 
//      Type 
//   
//   
//      readonly 
//      Boolean 
//   
//   
//      hidden 
//      Boolean 
//   
//   
//      system 
//      Boolean 
//   
//   
//      archive 
//      Boolean 
//   
// 
// 
//
//  The getAttribute method may
// be used to read any of these attributes, or any of the attributes defined by
// BasicFileAttributeView as if by invoking the readAttributes() method.
//
//  The setAttribute method may
// be used to update the file's last modified time, last access time or create
// time attributes as defined by BasicFileAttributeView. It may also be
// used to update the DOS attributes as if by invoking the setReadOnly, setHidden, setSystem, and
// setArchive methods respectively.
trait DosFileAttributeView extends BasicFileAttributeView {

    @stub
    // Returns the name of the attribute view.
    def name(): String = ???

    @stub
    // Reads the basic file attributes as a bulk operation.
    def readAttributes(): DosFileAttributes = ???

    @stub
    // Updates the value of the archive attribute.
    def setArchive(value: Boolean): Unit = ???

    @stub
    // Updates the value of the hidden attribute.
    def setHidden(value: Boolean): Unit = ???

    @stub
    // Updates the value of the read-only attribute.
    def setReadOnly(value: Boolean): Unit = ???
}
