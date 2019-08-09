package java.nio.file.attribute

import java.lang.String
import scala.scalanative.annotation.stub

/** A file attribute view that provides a view of a basic set of file
 *  attributes common to many file systems. The basic set of file attributes
 *  consist of mandatory and optional file attributes as
 *  defined by the BasicFileAttributes interface.
 * 
 *   The file attributes are retrieved from the file system as a bulk
 *  operation by invoking the readAttributes method.
 *  This class also defines the setTimes method to update the
 *  file's time attributes.
 * 
 *   Where dynamic access to file attributes is required, the attributes
 *  supported by this attribute view have the following names and types:
 *  
 *   
 *    
 *       Name 
 *       Type 
 *    
 *   
 *       "lastModifiedTime" 
 *       FileTime 
 *    
 *    
 *       "lastAccessTime" 
 *       FileTime 
 *    
 *    
 *       "creationTime" 
 *       FileTime 
 *    
 *    
 *       "size" 
 *       Long 
 *    
 *    
 *       "isRegularFile" 
 *       Boolean 
 *    
 *    
 *       "isDirectory" 
 *       Boolean 
 *    
 *    
 *       "isSymbolicLink" 
 *       Boolean 
 *    
 *    
 *       "isOther" 
 *       Boolean 
 *    
 *    
 *       "fileKey" 
 *       Object 
 *    
 *  
 *  
 * 
 *   The getAttribute method may be
 *  used to read any of these attributes as if by invoking the readAttributes() method.
 * 
 *   The setAttribute method may be
 *  used to update the file's last modified time, last access time or create time
 *  attributes as if by invoking the setTimes method.
 */
trait BasicFileAttributeView extends FileAttributeView {

    /** Returns the name of the attribute view. */
    @stub
    def name(): String = ???

    /** Reads the basic file attributes as a bulk operation. */
    @stub
    def readAttributes(): BasicFileAttributes = ???

    /** Updates any or all of the file's last modified time, last access time,
     *  and create time attributes.
     */
    @stub
    def setTimes(lastModifiedTime: FileTime, lastAccessTime: FileTime, createTime: FileTime): Unit = ???
}
