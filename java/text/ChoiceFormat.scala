package java.text

import java.lang.{Number, Object, String, StringBuffer}
import scala.scalanative.annotation.stub

/** A ChoiceFormat allows you to attach a format to a range of numbers.
 *  It is generally used in a MessageFormat for handling plurals.
 *  The choice is specified with an ascending list of doubles, where each item
 *  specifies a half-open interval up to the next item:
 *  
 *  
 *  X matches j if and only if limit[j] ≤ X < limit[j+1]
 *  
 *  
 *  If there is no match, then either the first or last index is used, depending
 *  on whether the number (X) is too low or too high.  If the limit array is not
 *  in ascending order, the results of formatting will be incorrect.  ChoiceFormat
 *  also accepts \u221E as equivalent to infinity(INF).
 * 
 *  
 *  Note:
 *  ChoiceFormat differs from the other Format
 *  classes in that you create a ChoiceFormat object with a
 *  constructor (not with a getInstance style factory
 *  method). The factory methods aren't necessary because ChoiceFormat
 *  doesn't require any complex setup for a given locale. In fact,
 *  ChoiceFormat doesn't implement any locale specific behavior.
 * 
 *  
 *  When creating a ChoiceFormat, you must specify an array of formats
 *  and an array of limits. The length of these arrays must be the same.
 *  For example,
 *  
 *  
 *      limits = {1,2,3,4,5,6,7}
 *      formats = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"}
 *  
 *      limits = {0, 1, ChoiceFormat.nextDouble(1)}
 *      formats = {"no files", "one file", "many files"}
 *      (nextDouble can be used to get the next higher double, to
 *      make the half-open interval.)
 *  
 * 
 *  
 *  Here is a simple example that shows formatting and parsing:
 *  
 *  
 *  double[] limits = {1,2,3,4,5,6,7};
 *  String[] dayOfWeekNames = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
 *  ChoiceFormat form = new ChoiceFormat(limits, dayOfWeekNames);
 *  ParsePosition status = new ParsePosition(0);
 *  for (double i = 0.0; i <= 8.0; ++i) {
 *      status.setIndex(0);
 *      System.out.println(i + " -> " + form.format(i) + " -> "
 *                               + form.parse(form.format(i),status));
 *  }
 *  
 *  
 *  Here is a more complex example, with a pattern format:
 *  
 *  
 *  double[] filelimits = {0,1,2};
 *  String[] filepart = {"are no files","is one file","are {2} files"};
 *  ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
 *  Format[] testFormats = {fileform, null, NumberFormat.getInstance()};
 *  MessageFormat pattform = new MessageFormat("There {0} on {1}");
 *  pattform.setFormats(testFormats);
 *  Object[] testArgs = {null, "ADisk", null};
 *  for (int i = 0; i < 4; ++i) {
 *      testArgs[0] = new Integer(i);
 *      testArgs[2] = testArgs[0];
 *      System.out.println(pattform.format(testArgs));
 *  }
 *  
 *  
 *  
 *  Specifying a pattern for ChoiceFormat objects is fairly straightforward.
 *  For example:
 *  
 *  
 *  ChoiceFormat fmt = new ChoiceFormat(
 *       "-1#is negative| 0#is zero or fraction | 1#is one |1.0<is 1+ |2#is two |2<is more than 2.");
 *  System.out.println("Formatter Pattern : " + fmt.toPattern());
 * 
 *  System.out.println("Format with -INF : " + fmt.format(Double.NEGATIVE_INFINITY));
 *  System.out.println("Format with -1.0 : " + fmt.format(-1.0));
 *  System.out.println("Format with 0 : " + fmt.format(0));
 *  System.out.println("Format with 0.9 : " + fmt.format(0.9));
 *  System.out.println("Format with 1.0 : " + fmt.format(1));
 *  System.out.println("Format with 1.5 : " + fmt.format(1.5));
 *  System.out.println("Format with 2 : " + fmt.format(2));
 *  System.out.println("Format with 2.1 : " + fmt.format(2.1));
 *  System.out.println("Format with NaN : " + fmt.format(Double.NaN));
 *  System.out.println("Format with +INF : " + fmt.format(Double.POSITIVE_INFINITY));
 *  
 *  
 *  And the output result would be like the following:
 *  
 *  
 *  Format with -INF : is negative
 *  Format with -1.0 : is negative
 *  Format with 0 : is zero or fraction
 *  Format with 0.9 : is zero or fraction
 *  Format with 1.0 : is one
 *  Format with 1.5 : is 1+
 *  Format with 2 : is two
 *  Format with 2.1 : is more than 2.
 *  Format with NaN : is negative
 *  Format with +INF : is more than 2.
 *  
 *  
 * 
 *  Synchronization
 * 
 *  
 *  Choice formats are not synchronized.
 *  It is recommended to create separate format instances for each thread.
 *  If multiple threads access a format concurrently, it must be synchronized
 *  externally.
 */
class ChoiceFormat extends NumberFormat {

    /** Constructs with the limits and the corresponding formats. */
    @stub
    def this(limits: Array[Double], formats: Array[String]) = ???

    /** Constructs with limits and corresponding formats based on the pattern. */
    @stub
    def this(newPattern: String) = ???

    /** Sets the pattern. */
    @stub
    def applyPattern(newPattern: String): Unit = ???

    /** Overrides Cloneable */
    @stub
    def clone(): Object = ???

    /** Equality comparision between two */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns pattern with formatted double. */
    @stub
    def format(number: Double, toAppendTo: StringBuffer, status: FieldPosition): StringBuffer = ???

    /** Specialization of format. */
    @stub
    def format(number: Long, toAppendTo: StringBuffer, status: FieldPosition): StringBuffer = ???

    /** Get the formats passed in the constructor. */
    @stub
    def getFormats(): Array[Object] = ???

    /** Get the limits passed in the constructor. */
    @stub
    def getLimits(): Array[Double] = ???

    /** Generates a hash code for the message format object. */
    @stub
    def hashCode(): Int = ???

    /** Parses a Number from the input text. */
    @stub
    def parse(text: String, status: ParsePosition): Number = ???

    /** Set the choices to be used in formatting. */
    @stub
    def setChoices(limits: Array[Double], formats: Array[String]): Unit = ???

    /** Gets the pattern. */
    @stub
    def toPattern(): String = ???
}

object ChoiceFormat {
    /** Finds the least double greater than d. */
    @stub
    def nextDouble(d: Double): Double = ???

    /** Finds the least double greater than d (if positive is
     *  true), or the greatest double less than d (if
     *  positive is false).
     */
    @stub
    def nextDouble(d: Double, positive: Boolean): Double = ???

    /** Finds the greatest double less than d. */
    @stub
    def previousDouble(d: Double): Double = ???
}
