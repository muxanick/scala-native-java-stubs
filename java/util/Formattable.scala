package java.util

/** The Formattable interface must be implemented by any class that
 *  needs to perform custom formatting using the 's' conversion
 *  specifier of Formatter.  This interface allows basic
 *  control for formatting arbitrary objects.
 * 
 *  For example, the following class prints out different representations of a
 *  stock's name depending on the flags and length constraints:
 * 
 *  import java.nio.CharBuffer;
 *    import java.util.Formatter;
 *    import java.util.Formattable;
 *    import java.util.Locale;
 *    import static java.util.FormattableFlags.*;
 * 
 *   ...
 * 
 *    public class StockName implements Formattable {
 *        private String symbol, companyName, frenchCompanyName;
 *        public StockName(String symbol, String companyName,
 *                         String frenchCompanyName) {
 *            ...
 *        }
 * 
 *        ...
 * 
 *        public void formatTo(Formatter fmt, int f, int width, int precision) {
 *            StringBuilder sb = new StringBuilder();
 * 
 *            // decide form of name
 *            String name = companyName;
 *            if (fmt.locale().equals(Locale.FRANCE))
 *                name = frenchCompanyName;
 *            boolean alternate = (f & ALTERNATE) == ALTERNATE;
 *            boolean usesymbol = alternate || (precision != -1 && precision < 10);
 *            String out = (usesymbol ? symbol : name);
 * 
 *            // apply precision
 *            if (precision == -1 || out.length() < precision) {
 *                // write it all
 *                sb.append(out);
 *            } else {
 *                sb.append(out.substring(0, precision - 1)).append('*');
 *            }
 * 
 *            // apply width and justification
 *            int len = sb.length();
 *            if (len < width)
 *                for (int i = 0; i < width - len; i++)
 *                    if ((f & LEFT_JUSTIFY) == LEFT_JUSTIFY)
 *                        sb.append(' ');
 *                    else
 *                        sb.insert(0, ' ');
 * 
 *            fmt.format(sb.toString());
 *        }
 * 
 *        public String toString() {
 *            return String.format("%s - %s", symbol, companyName);
 *        }
 *    }
 *  
 * 
 *   When used in conjunction with the Formatter, the above
 *  class produces the following output for various format strings.
 * 
 *  Formatter fmt = new Formatter();
 *    StockName sn = new StockName("HUGE", "Huge Fruit, Inc.",
 *                                 "Fruit Titanesque, Inc.");
 *    fmt.format("%s", sn);                   //   -> "Huge Fruit, Inc."
 *    fmt.format("%s", sn.toString());        //   -> "HUGE - Huge Fruit, Inc."
 *    fmt.format("%#s", sn);                  //   -> "HUGE"
 *    fmt.format("%-10.8s", sn);              //   -> "HUGE      "
 *    fmt.format("%.12s", sn);                //   -> "Huge Fruit,*"
 *    fmt.format(Locale.FRANCE, "%25s", sn);  //   -> "   Fruit Titanesque, Inc."
 *  
 * 
 *   Formattables are not necessarily safe for multithreaded access.  Thread
 *  safety is optional and may be enforced by classes that extend and implement
 *  this interface.
 * 
 *   Unless otherwise specified, passing a null argument to
 *  any method in this interface will cause a NullPointerException to be thrown.
 */
trait Formattable {
}
