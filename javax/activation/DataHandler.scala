package javax.activation

import java.awt.datatransfer.{DataFlavor, Transferable}
import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}

// The DataHandler class provides a consistent interface to data
// available in many different sources and formats.
// It manages simple stream to string conversions and related operations
// using DataContentHandlers.
// It provides access to commands that can operate on the data.
// The commands are found using a CommandMap. 
//
// DataHandler and the Transferable Interface
// DataHandler implements the Transferable interface so that data can
// be used in AWT data transfer operations, such as cut and paste and
// drag and drop. The implementation of the Transferable interface
// relies on the availability of an installed DataContentHandler
// object corresponding to the MIME type of the data represented in
// the specific instance of the DataHandler.
//
// DataHandler and CommandMaps
// The DataHandler keeps track of the current CommandMap that it uses to
// service requests for commands (getCommand,
// getAllCommands, getPreferredCommands).
// Each instance of a DataHandler may have a CommandMap associated with
// it using the setCommandMap method.  If a CommandMap was
// not set, DataHandler calls the getDefaultCommandMap
// method in CommandMap and uses the value it returns. See
// CommandMap for more information. 
//
// DataHandler and URLs
// The current DataHandler implementation creates a private
// instance of URLDataSource when it is constructed with a URL.
class DataHandler extends Object with Transferable {

    @stub
    // Create a DataHandler instance referencing the
    // specified DataSource.
    def this(ds: DataSource) = ???

    @stub
    // Create a DataHandler instance representing an object
    // of this MIME type.
    def this(obj: Object, mimeType: String) = ???

    @stub
    // Return all the commands for this type of data.
    def getAllCommands(): Array[CommandInfo] = ???

    @stub
    // A convenience method that takes a CommandInfo object
    // and instantiates the corresponding command, usually
    // a JavaBean component.
    def getBean(cmdinfo: CommandInfo): Object = ???

    @stub
    // Get the command cmdName.
    def getCommand(cmdName: String): CommandInfo = ???

    @stub
    // Return the data in its preferred Object form.
    def getContent(): Object = ???

    @stub
    // Return the MIME type of this object as retrieved from
    // the source object.
    def getContentType(): String = ???

    @stub
    // Return the DataSource associated with this instance
    // of DataHandler.
    def getDataSource(): DataSource = ???

    @stub
    // Get the InputStream for this object.
    def getInputStream(): InputStream = ???

    @stub
    // Return the name of the data object.
    def getName(): String = ???

    @stub
    // Get an OutputStream for this DataHandler to allow overwriting
    // the underlying data.
    def getOutputStream(): OutputStream = ???

    @stub
    // Return the preferred commands for this type of data.
    def getPreferredCommands(): Array[CommandInfo] = ???

    @stub
    // Returns an object that represents the data to be
    // transferred.
    def getTransferData(flavor: DataFlavor): Object = ???

    @stub
    // Return the DataFlavors in which this data is available.
    def getTransferDataFlavors(): Array[DataFlavor] = ???

    @stub
    // Returns whether the specified data flavor is supported
    // for this object.
    def isDataFlavorSupported(flavor: DataFlavor): Boolean = ???

    @stub
    // Set the CommandMap for use by this DataHandler.
    def setCommandMap(commandMap: CommandMap): Unit = ???
}

object DataHandler {
    @stub
    // Sets the DataContentHandlerFactory.
    def setDataContentHandlerFactory(newFactory: DataContentHandlerFactory): Unit = ???
}
