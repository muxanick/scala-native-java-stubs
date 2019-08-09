package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Instructs JAXB to also bind other classes when binding this class.
 * 
 *  
 *  Java makes it impractical/impossible to list all sub-classes of
 *  a given class. This often gets in a way of JAXB users, as it JAXB
 *  cannot automatically list up the classes that need to be known
 *  to JAXBContext.
 * 
 *  
 *  For example, with the following class definitions:
 * 
 *  
 *  class Animal {}
 *  class Dog extends Animal {}
 *  class Cat extends Animal {}
 *  
 * 
 *  
 *  The user would be required to create JAXBContext as
 *  JAXBContext.newInstance(Dog.class,Cat.class)
 *  (Animal will be automatically picked up since Dog
 *  and Cat refers to it.)
 * 
 *  
 *  XmlSeeAlso annotation would allow you to write:
 *  
 *  @XmlSeeAlso({Dog.class,Cat.class})
 *  class Animal {}
 *  class Dog extends Animal {}
 *  class Cat extends Animal {}
 *  
 * 
 *  
 *  This would allow you to do JAXBContext.newInstance(Animal.class).
 *  By the help of this annotation, JAXB implementations will be able to
 *  correctly bind Dog and Cat.
 */
@Target ( value = TYPE ) 
@Retention ( value = RUNTIME ) 
 final class XmlSeeAlso extends StaticAnnotation {
}
