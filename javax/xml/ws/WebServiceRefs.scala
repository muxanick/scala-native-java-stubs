package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** The WebServiceRefs annotation allows
 *  multiple web service references to be declared at the
 *  class level.
 * 
 *  
 *  It can be used to inject both service and proxy
 *  instances. These injected references are not thread safe.
 *  If the references are accessed by multiple threads,
 *  usual synchronization techniques can be used to
 *  support multiple threads.
 * 
 *  
 *  There is no way to associate web service features with
 *  the injected instances. If an instance needs to be
 *  configured with web service features, use @WebServiceRef
 *  to inject the resource along with its features.
 * 
 *  
 *  Example: The StockQuoteProvider
 *  proxy instance, and the StockQuoteService service
 *  instance are injected using @WebServiceRefs.
 * 
 *  
 *     @WebServiceRefs({@WebServiceRef(name="service/stockquoteservice", value=StockQuoteService.class),
 *                      @WebServiceRef(name="service/stockquoteprovider", type=StockQuoteProvider.class, value=StockQuoteService.class})
 *     public class MyClient {
 *         void init() {
 *             Context ic = new InitialContext();
 *             StockQuoteService service = (StockQuoteService) ic.lookup("java:comp/env/service/stockquoteservice");
 *             StockQuoteProvider port = (StockQuoteProvider) ic.lookup("java:comp/env/service/stockquoteprovider");
 *             ...
 *        }
 *        ...
 *     }
 *  
 */
@Documented
@Retention(value=RUNTIME)
@Target(value=TYPE)
final class WebServiceRefs extends StaticAnnotation {

    /** Array used for multiple web service reference declarations. */
    @stub
    val value: Array[WebServiceRef] = ???
}
