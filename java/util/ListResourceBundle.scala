package java.util

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** ListResourceBundle is an abstract subclass of
 *  ResourceBundle that manages resources for a locale
 *  in a convenient and easy to use list. See ResourceBundle for
 *  more information about resource bundles in general.
 * 
 *  
 *  Subclasses must override getContents and provide an array,
 *  where each item in the array is a pair of objects.
 *  The first element of each pair is the key, which must be a
 *  String, and the second element is the value associated with
 *  that key.
 * 
 *  
 *  The following example shows two members of a resource
 *  bundle family with the base name "MyResources".
 *  "MyResources" is the default member of the bundle family, and
 *  "MyResources_fr" is the French member.
 *  These members are based on ListResourceBundle
 *  (a related example shows
 *  how you can add a bundle to this family that's based on a properties file).
 *  The keys in this example are of the form "s1" etc. The actual
 *  keys are entirely up to your choice, so long as they are the same as
 *  the keys you use in your program to retrieve the objects from the bundle.
 *  Keys are case-sensitive.
 *  
 *  
 * 
 *  public class MyResources extends ListResourceBundle {
 *      protected Object[][] getContents() {
 *          return new Object[][] {
 *          // LOCALIZE THIS
 *              {"s1", "The disk \"{1}\" contains {0}."},  // MessageFormat pattern
 *              {"s2", "1"},                               // location of {0} in pattern
 *              {"s3", "My Disk"},                         // sample disk name
 *              {"s4", "no files"},                        // first ChoiceFormat choice
 *              {"s5", "one file"},                        // second ChoiceFormat choice
 *              {"s6", "{0,number} files"},                // third ChoiceFormat choice
 *              {"s7", "3 Mar 96"},                        // sample date
 *              {"s8", new Dimension(1,5)}                 // real object, not just string
 *          // END OF MATERIAL TO LOCALIZE
 *          };
 *      }
 *  }
 * 
 *  public class MyResources_fr extends ListResourceBundle {
 *      protected Object[][] getContents() {
 *          return new Object[][] {
 *          // LOCALIZE THIS
 *              {"s1", "Le disque \"{1}\" {0}."},          // MessageFormat pattern
 *              {"s2", "1"},                               // location of {0} in pattern
 *              {"s3", "Mon disque"},                      // sample disk name
 *              {"s4", "ne contient pas de fichiers"},     // first ChoiceFormat choice
 *              {"s5", "contient un fichier"},             // second ChoiceFormat choice
 *              {"s6", "contient {0,number} fichiers"},    // third ChoiceFormat choice
 *              {"s7", "3 mars 1996"},                     // sample date
 *              {"s8", new Dimension(1,3)}                 // real object, not just string
 *          // END OF MATERIAL TO LOCALIZE
 *          };
 *      }
 *  }
 *  
 *  
 * 
 *  
 *  The implementation of a ListResourceBundle subclass must be thread-safe
 *  if it's simultaneously used by multiple threads. The default implementations
 *  of the methods in this class are thread-safe.
 */
abstract class ListResourceBundle extends ResourceBundle {

    /** Sole constructor. */
    @stub
    def this() = ???

    /** Returns an array in which each item is a pair of objects in an
     *  Object array.
     */
    protected def getContents(): Array[Array[Object]]

    /** Returns an Enumeration of the keys contained in
     *  this ResourceBundle and its parent bundles.
     */
    def getKeys(): Enumeration[String]

    /** Gets an object for the given key from this resource bundle. */
    def handleGetObject(key: String): Any

    /** Returns a Set of the keys contained
     *  only in this ResourceBundle.
     */
    protected def handleKeySet(): Set[String]
}
