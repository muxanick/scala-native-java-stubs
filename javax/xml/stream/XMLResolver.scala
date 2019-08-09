package javax.xml.stream

/** This interface is used to resolve resources during an XML parse.  If an application wishes to
 *  perform custom entity resolution it must register an instance of this interface with
 *  the XMLInputFactory using the setXMLResolver method.
 */
trait XMLResolver {
}
