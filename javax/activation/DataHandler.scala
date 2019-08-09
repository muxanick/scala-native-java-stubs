package javax.activation

import java.awt.datatransfer.{DataFlavor, Transferable}
import java.io.{InputStream, OutputStream}
import java.lang.{Object, String}
import java.net.URL
import scala.scalanative.annotation.stub

/** The DataHandler class provides a consistent interface to data
 *  available in many different sources and formats.
 *  It manages simple stream to string conversions and related operations
 *  using DataContentHandlers.
 *  It provides access to commands that can operate on the data.
 *  The commands are found using a CommandMap. 
 * 
 *  DataHandler and the Transferable Interface
 *  DataHandler implements the Transferable interface so that data can
 *  be used in AWT data transfer operations, such as cut and paste and
 *  drag and drop. The implementation of the Transferable interface
 *  relies on the availability of an installed DataContentHandler
 *  object corresponding to the MIME type of the data represented in
 *  the specific instance of the DataHandler.
 * 
 *  DataHandler and CommandMaps
 *  The DataHandler keeps track of the current CommandMap that it uses to
 *  service requests for commands (getCommand,
 *  getAllCommands, getPreferredCommands).
 *  Each instance of a DataHandler may have a CommandMap associated with
 *  it using the setCommandMap method.  If a CommandMap was
 *  not set, DataHandler calls the getDefaultCommandMap
 *  method in CommandMap and uses the value it returns. See
 *  CommandMap for more information. 
 * 
 *  DataHandler and URLs
 *  The current DataHandler implementation creates a private
 *  instance of URLDataSource when it is constructed with a URL.
 */
class DataHandler extends Object with Transferable {

    /** Create a DataHandler instance referencing the
     *  specified DataSource.
     */
    @stub
    def this(ds: DataSource) = ???

    /** Create a DataHandler instance representing an object
     *  of this MIME type.
     */
    @stub
    def this(obj: Object, mimeType: String) = ???

    /** Create a DataHandler instance referencing a URL. */
    @stub
    def this(url: URL) = ???

    /** Return all the commands for this type of data. */
    @stub
    def getAllCommands(): Array[CommandInfo] = ???

    /** A convenience method that takes a CommandInfo object
     *  and instantiates the corresponding command, usually
     *  a JavaBean component.
     */
    @stub
    def getBean(cmdinfo: CommandInfo): Object = ???

    /** Get the command cmdName. */
    @stub
    def getCommand(cmdName: String): CommandInfo = ???

    /** Return the data in its preferred Object form. */
    @stub
    def getContent(): Object = ???

    /** Return the MIME type of this object as retrieved from
     *  the source object.
     */
    @stub
    def getContentType(): String = ???

    /** Return the DataSource associated with this instance
     *  of DataHandler.
     */
    @stub
    def getDataSource(): DataSource = ???

    /** Get the InputStream for this object. */
    @stub
    def getInputStream(): InputStream = ???

    /** Return the name of the data object. */
    @stub
    def getName(): String = ???

    /** Get an OutputStream for this DataHandler to allow overwriting
     *  the underlying data.
     */
    @stub
    def getOutputStream(): OutputStream = ???

    /** Return the preferred commands for this type of data. */
    @stub
    def getPreferredCommands(): Array[CommandInfo] = ???

    /** Returns an object that represents the data to be
     *  transferred.
     */
    @stub
    def getTransferData(flavor: DataFlavor): Object = ???

    /** Return the DataFlavors in which this data is available. */
    @stub
    def getTransferDataFlavors(): Array[DataFlavor] = ???

    /** Returns whether the specified data flavor is supported
     *  for this object.
     */
    @stub
    def isDataFlavorSupported(flavor: DataFlavor): Boolean = ???

    /** Set the CommandMap for use by this DataHandler. */
    @stub
    def setCommandMap(commandMap: CommandMap): Unit = ???

    /** Write the data to an OutputStream. */
    @stub
    def writeTo(os: OutputStream): Unit = ???
}

object DataHandler {
    /** Sets the DataContentHandlerFactory. */
    @stub
    def setDataContentHandlerFactory(newFactory: DataContentHandlerFactory): Unit = ???
}
