package java.beans

import java.lang.String
import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** An annotation on a constructor that shows how the parameters of
 *    that constructor correspond to the constructed object's getter
 *    methods.  For example:
 * 
 *    
 * 
 *    public class Point {
 *        @ConstructorProperties({"x", "y"})
 *        public Point(int x, int y) {
 *            this.x = x;
 *            this.y = y;
 *        }
 * 
 *        public int getX() {
 *            return x;
 *        }
 * 
 *        public int getY() {
 *            return y;
 *        }
 * 
 *        private final int x, y;
 *    }
 * 
 * 
 * 
 *    The annotation shows that the first parameter of the constructor
 *    can be retrieved with the getX() method and the second with
 *    the getY() method.  Since parameter names are not in
 *    general available at runtime, without the annotation there would be
 *    no way to know whether the parameters correspond to getX()
 *    and getY() or the other way around.
 */
@Documented 
@Target ( value = CONSTRUCTOR ) 
@Retention ( value = RUNTIME ) 
 final class ConstructorProperties extends StaticAnnotation {

    /** The getter names. */
    @stub
    val value: Array[String] = ???
}
