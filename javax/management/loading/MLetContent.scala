package javax.management.loading

import java.lang.{Object, String}
import java.net.URL
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** This class represents the contents of the MLET tag.
 *  It can be consulted by a subclass of MLet that overrides
 *  the MLet.check method.
 */
class MLetContent extends Object {

    /** Creates an MLet instance initialized with attributes read
     *  from an MLET tag in an MLet text file.
     */
    @stub
    def this(url: URL, attributes: Map[String, String], types: List[String], values: List[String]) = ???

    /** Gets the attributes of the MLET tag. */
    @stub
    def getAttributes(): Map[String, String] = ???

    /** Gets the value of the CODE
     *  attribute of the MLET tag.
     */
    @stub
    def getCode(): String = ???

    /** Gets the code base URL. */
    @stub
    def getCodeBase(): URL = ???

    /** Gets the MLet text file's base URL. */
    @stub
    def getDocumentBase(): URL = ???

    /** Gets the list of .jar files specified by the ARCHIVE
     *  attribute of the MLET tag.
     */
    @stub
    def getJarFiles(): String = ???

    /** Gets the value of the NAME
     *  attribute of the MLET tag.
     */
    @stub
    def getName(): String = ???

    /** Gets the list of values of the TYPE attribute in
     *  each nested <PARAM> tag within the MLET
     *  tag.
     */
    @stub
    def getParameterTypes(): List[String] = ???

    /** Gets the list of values of the VALUE attribute in
     *  each nested <PARAM> tag within the MLET
     *  tag.
     */
    @stub
    def getParameterValues(): List[String] = ???

    /** Gets the value of the OBJECT
     *  attribute of the MLET tag.
     */
    @stub
    def getSerializedObject(): String = ???

    /** Gets the value of the VERSION
     *  attribute of the MLET tag.
     */
    @stub
    def getVersion(): String = ???
}
