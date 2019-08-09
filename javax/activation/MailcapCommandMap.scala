package javax.activation

import java.io.InputStream
import java.lang.{Object, String}

// MailcapCommandMap extends the CommandMap
// abstract class. It implements a CommandMap whose configuration
// is based on mailcap files
// (RFC 1524).
// The MailcapCommandMap can be configured both programmatically
// and via configuration files.
// 
// Mailcap file search order:
// The MailcapCommandMap looks in various places in the user's
// system for mailcap file entries. When requests are made
// to search for commands in the MailcapCommandMap, it searches
// mailcap files in the following order:
// 
// 
//  Programatically added entries to the MailcapCommandMap instance.
//  The file .mailcap in the user's home directory.
//  The file <java.home>/lib/mailcap.
//  The file or resources named META-INF/mailcap.
//  The file or resource named META-INF/mailcap.default
// (usually found only in the activation.jar file).
// 
// 
// Mailcap file format:
//
// Mailcap files must conform to the mailcap
// file specification (RFC 1524, A User Agent Configuration Mechanism
// For Multimedia Mail Format Information).
// The file format consists of entries corresponding to
// particular MIME types. In general, the specification
// specifies applications for clients to use when they
// themselves cannot operate on the specified MIME type. The
// MailcapCommandMap extends this specification by using a parameter mechanism
// in mailcap files that allows JavaBeans(tm) components to be specified as
// corresponding to particular commands for a MIME type.
//
// When a mailcap file is
// parsed, the MailcapCommandMap recognizes certain parameter signatures,
// specifically those parameter names that begin with x-java-.
// The MailcapCommandMap uses this signature to find
// command entries for inclusion into its registries.
// Parameter names with the form x-java-<name>
// are read by the MailcapCommandMap as identifying a command
// with the name name. When the name is 
// content-handler the MailcapCommandMap recognizes the class
// signified by this parameter as a DataContentHandler.
// All other commands are handled generically regardless of command
// name. The command implementation is specified by a fully qualified
// class name of a JavaBean(tm) component. For example; a command for viewing
// some data can be specified as: x-java-view=com.foo.ViewBean.
//
// When the command name is fallback-entry, the value of
// the command may be true or false.  An
// entry for a MIME type that includes a parameter of
// x-java-fallback-entry=true defines fallback commands
// for that MIME type that will only be used if no non-fallback entry
// can be found.  For example, an entry of the form text/*; ;
// x-java-fallback-entry=true; x-java-view=com.sun.TextViewer
// specifies a view command to be used for any text MIME type.  This
// view command would only be used if a non-fallback view command for
// the MIME type could not be found.
//
// MailcapCommandMap aware mailcap files have the
// following general form:
// 
// # Comments begin with a '#' and continue to the end of the line.
// <mime type>; ; <parameter list>
// # Where a parameter list consists of one or more parameters,
// # where parameters look like: x-java-view=com.sun.TextViewer
// # and a parameter list looks like: 
// text/plain; ; x-java-view=com.sun.TextViewer; x-java-edit=com.sun.TextEdit
// 
// # Note that mailcap entries that do not contain 'x-java' parameters
// # and comply to RFC 1524 are simply ignored:
// image/gif; /usr/dt/bin/sdtimage %s
//
// 
// 
class MailcapCommandMap extends CommandMap {

    @stub
    // The default Constructor.
    def this() = ???

    @stub
    // Constructor that allows the caller to specify an InputStream
    // containing a mailcap file.
    def this(is: InputStream) = ???

    @stub
    // Add entries to the registry.
    def addMailcap(mail_cap: String): Unit = ???

    @stub
    // Return the DataContentHandler for the specified MIME type.
    def createDataContentHandler(mimeType: String): DataContentHandler = ???

    @stub
    // Get all the available commands in all mailcap files known to
    // this instance of MailcapCommandMap for this MIME type.
    def getAllCommands(mimeType: String): Array[CommandInfo] = ???

    @stub
    // Get the command corresponding to cmdName for the MIME type.
    def getCommand(mimeType: String, cmdName: String): CommandInfo = ???

    @stub
    // Get all the MIME types known to this command map.
    def getMimeTypes(): Array[String] = ???

    @stub
    // Get the native commands for the given MIME type.
    def getNativeCommands(mimeType: String): Array[String] = ???
}
