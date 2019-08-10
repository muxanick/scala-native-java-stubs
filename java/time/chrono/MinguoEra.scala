package java.time.chrono

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** An era in the Minguo calendar system.
 *  
 *  The Minguo calendar system has two eras.
 *  The current era, for years from 1 onwards, is known as the 'Republic of China' era.
 *  All previous years, zero or earlier in the proleptic count or one and greater
 *  in the year-of-era count, are part of the 'Before Republic of China' era.
 * 
 *  
 *  
 *  
 *  year-of-era
 *  era
 *  proleptic-year
 *  ISO proleptic-year
 *  
 *  
 *  
 *  
 *  2ROC21913
 *  
 *  
 *  1ROC11912
 *  
 *  
 *  1BEFORE_ROC01911
 *  
 *  
 *  2BEFORE_ROC-11910
 *  
 *  
 *  
 *  
 *  Do not use ordinal() to obtain the numeric representation of MinguoEra.
 *  Use getValue() instead.
 */
class MinguoEra private (name: String, ordinal: Int) extends Enum[MinguoEra](name, ordinal) with Era {

    /** Gets the numeric era int value. */
    @stub
    def getValue(): Int = ???
}

object MinguoEra {
    /** The singleton instance for the era before the current one, 'Before Republic of China Era',
     *  which has the numeric value 0.
     */
    final val BEFORE_ROC: MinguoEra = new MinguoEra("BEFORE_ROC", 0)

    /** The singleton instance for the current era, 'Republic of China Era',
     *  which has the numeric value 1.
     */
    final val ROC: MinguoEra = new MinguoEra("ROC", 1)

    /** Obtains an instance of MinguoEra from an int value. */
    @stub
    def of(minguoEra: Int): MinguoEra = ???

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): MinguoEra = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[MinguoEra] = ???
}
