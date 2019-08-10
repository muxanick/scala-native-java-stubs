package javax.lang.model.element

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** The nesting kind of a type element.
 *  Type elements come in four varieties:
 *  top-level, member, local, and anonymous.
 *  Nesting kind is a non-standard term used here to denote this
 *  classification.
 * 
 *  Note that it is possible additional nesting kinds will be added
 *  in future versions of the platform.
 * 
 *  Example: The classes below are annotated with their nesting kind.
 *  
 * 
 *  import java.lang.annotation.*;
 *  import static java.lang.annotation.RetentionPolicy.*;
 *  import javax.lang.model.element.*;
 *  import static javax.lang.model.element.NestingKind.*;
 * 
 *  @Nesting(TOP_LEVEL)
 *  public class NestingExamples {
 *      @Nesting(MEMBER)
 *      static class MemberClass1{}
 * 
 *      @Nesting(MEMBER)
 *      class MemberClass2{}
 * 
 *      public static void main(String... argv) {
 *          @Nesting(LOCAL)
 *          class LocalClass{};
 * 
 *          Class<?>[] classes = {
 *              NestingExamples.class,
 *              MemberClass1.class,
 *              MemberClass2.class,
 *              LocalClass.class
 *          };
 * 
 *          for(Class<?> clazz : classes) {
 *              System.out.format("%s is %s%n",
 *                                clazz.getName(),
 *                                clazz.getAnnotation(Nesting.class).value());
 *          }
 *      }
 *  }
 * 
 *  @Retention(RUNTIME)
 *  @interface Nesting {
 *      NestingKind value();
 *  }
 *  
 */
class NestingKind private (name: String, ordinal: Int) extends Enum[NestingKind](name, ordinal) {

    /** Does this constant correspond to a nested type element?
     *  A nested type element is any that is not top-level.
     */
    @stub
    def isNested(): Boolean = ???
}

object NestingKind {
    /** A type without a name. */
    final val ANONYMOUS: NestingKind = new NestingKind("ANONYMOUS", 0)

    /** A named type declared within a construct other than a type. */
    final val LOCAL: NestingKind = new NestingKind("LOCAL", 1)

    /** A type that is a named member of another type. */
    final val MEMBER: NestingKind = new NestingKind("MEMBER", 2)

    /** A top-level type, not contained within another type. */
    final val TOP_LEVEL: NestingKind = new NestingKind("TOP_LEVEL", 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): NestingKind = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[NestingKind] = ???
}
