package javax.management.loading

import java.lang.{Object, String}
import java.net.URL
import java.util.{List, Map}

// This class represents the contents of the MLET tag.
// It can be consulted by a subclass of MLet that overrides
// the MLet.check method.
class MLetContent extends Object {

    @stub
    // Gets the attributes of the MLET tag.
    def getAttributes(): Map[String, String] = ???

    @stub
    // Gets the value of the CODE
    // attribute of the MLET tag.
    def getCode(): String = ???

    @stub
    // Gets the code base URL.
    def getCodeBase(): URL = ???

    @stub
    // Gets the MLet text file's base URL.
    def getDocumentBase(): URL = ???

    @stub
    // Gets the list of .jar files specified by the ARCHIVE
    // attribute of the MLET tag.
    def getJarFiles(): String = ???

    @stub
    // Gets the value of the NAME
    // attribute of the MLET tag.
    def getName(): String = ???

    @stub
    // Gets the list of values of the TYPE attribute in
    // each nested <PARAM> tag within the MLET
    // tag.
    def getParameterTypes(): List[String] = ???

    @stub
    // Gets the list of values of the VALUE attribute in
    // each nested <PARAM> tag within the MLET
    // tag.
    def getParameterValues(): List[String] = ???

    @stub
    // Gets the value of the OBJECT
    // attribute of the MLET tag.
    def getSerializedObject(): String = ???
}
