package javax.activation

import java.lang.{Object, String}

/** The CommandMap class provides an interface to a registry of
 *  command objects available in the system.
 *  Developers are expected to either use the CommandMap
 *  implementation included with this package (MailcapCommandMap) or
 *  develop their own. Note that some of the methods in this class are
 *  abstract.
 */
abstract class CommandMap extends Object {

    /** Locate a DataContentHandler that corresponds to the MIME type. */
    def createDataContentHandler(mimeType: String): DataContentHandler

    /** Locate a DataContentHandler that corresponds to the MIME type. */
    def createDataContentHandler(mimeType: String, ds: DataSource): DataContentHandler

    /** Get all the available commands for this type. */
    def getAllCommands(mimeType: String): Array[CommandInfo]

    /** Get all the available commands for this type. */
    def getAllCommands(mimeType: String, ds: DataSource): Array[CommandInfo]

    /** Get the default command corresponding to the MIME type. */
    def getCommand(mimeType: String, cmdName: String): CommandInfo

    /** Get the default command corresponding to the MIME type. */
    def getCommand(mimeType: String, cmdName: String, ds: DataSource): CommandInfo

    /** Get all the MIME types known to this command map. */
    def getMimeTypes(): Array[String]

    /** Get the preferred command list from a MIME Type. */
    def getPreferredCommands(mimeType: String): Array[CommandInfo]

    /** Get the preferred command list from a MIME Type. */
    def getPreferredCommands(mimeType: String, ds: DataSource): Array[CommandInfo]
}

object CommandMap {
    /** Get the default CommandMap. */
    @stub
    def getDefaultCommandMap(): CommandMap = ???
}
