package javax.xml.soap

import java.lang.{Object, String}
import java.util.Iterator

/** A container for MimeHeader objects, which represent
 *  the MIME headers present in a MIME part of a message.
 * 
 *  This class is used primarily when an application wants to
 *  retrieve specific attachments based on certain MIME headers and
 *  values. This class will most likely be used by implementations of
 *  AttachmentPart and other MIME dependent parts of the SAAJ
 *  API.
 */
class MimeHeaders extends Object {

    /** Adds a MimeHeader object with the specified name and value
     *  to this MimeHeaders object's list of headers.
     */
    @stub
    def addHeader(name: String, value: String): Unit = ???

    /** Returns all the MimeHeaders in this MimeHeaders object. */
    @stub
    def getAllHeaders(): Iterator = ???

    /** Returns all of the values for the specified header as an array of
     *  String objects.
     */
    @stub
    def getHeader(name: String): Array[String] = ???

    /** Returns all the MimeHeader objects whose name matches
     *  a name in the given array of names.
     */
    @stub
    def getMatchingHeaders(names: Array[String]): Iterator = ???

    /** Returns all of the MimeHeader objects whose name does not
     *  match a name in the given array of names.
     */
    @stub
    def getNonMatchingHeaders(names: Array[String]): Iterator = ???

    /** Removes all the header entries from this MimeHeaders object. */
    @stub
    def removeAllHeaders(): Unit = ???

    /** Remove all MimeHeader objects whose name matches the
     *  given name.
     */
    @stub
    def removeHeader(name: String): Unit = ???
}
