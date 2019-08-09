package javax.naming.ldap

/** This interface is for returning controls with objects returned
 *  in NamingEnumerations.
 *  For example, suppose a server sends back controls with the results
 *  of a search operation, the service provider would return a NamingEnumeration of
 *  objects that are both SearchResult and implement HasControls.
 * 
 *    NamingEnumeration elts = ectx.search((Name)name, filter, sctls);
 *    while (elts.hasMore()) {
 *      Object entry = elts.next();
 * 
 *      // Get search result
 *      SearchResult res = (SearchResult)entry;
 *      // do something with it
 * 
 *      // Get entry controls
 *      if (entry instanceof HasControls) {
 *          Control[] entryCtls = ((HasControls)entry).getControls();
 *          // do something with controls
 *      }
 *    }
 * 
 */
trait HasControls {
}
