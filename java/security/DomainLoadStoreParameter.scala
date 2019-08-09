package java.security

import java.lang.Object
import java.net.URI

/** Configuration data that specifies the keystores in a keystore domain.
 *  A keystore domain is a collection of keystores that are presented as a
 *  single logical keystore. The configuration data is used during
 *  KeyStore
 *  load and
 *  store operations.
 *  
 *  The following syntax is supported for configuration data:
 *  
 *      domain <domainName> [<property> ...] {
 *          keystore <keystoreName> [<property> ...] ;
 *          ...
 *      };
 *      ...
 *  
 *  where domainName and keystoreName are identifiers
 *  and property is a key/value pairing. The key and value are
 *  separated by an 'equals' symbol and the value is enclosed in double
 *  quotes. A property value may be either a printable string or a binary
 *  string of colon-separated pairs of hexadecimal digits. Multi-valued
 *  properties are represented as a comma-separated list of values,
 *  enclosed in square brackets.
 *  See Arrays.toString(java.lang.Object[]).
 *  
 *  To ensure that keystore entries are uniquely identified, each
 *  entry's alias is prefixed by its keystoreName followed
 *  by the entry name separator and each keystoreName must be
 *  unique within its domain. Entry name prefixes are omitted when
 *  storing a keystore.
 *  
 *  Properties are context-sensitive: properties that apply to
 *  all the keystores in a domain are located in the domain clause,
 *  and properties that apply only to a specific keystore are located
 *  in that keystore's clause.
 *  Unless otherwise specified, a property in a keystore clause overrides
 *  a property of the same name in the domain clause. All property names
 *  are case-insensitive. The following properties are supported:
 *  
 *   keystoreType="<type>" 
 *       The keystore type. 
 *   keystoreURI="<url>" 
 *       The keystore location. 
 *   keystoreProviderName="<name>" 
 *       The name of the keystore's JCE provider. 
 *   keystorePasswordEnv="<environment-variable>" 
 *       The environment variable that stores a keystore password.
 *           Alternatively, passwords may be supplied to the constructor
 *           method in a Map<String, ProtectionParameter>. 
 *   entryNameSeparator="<separator>" 
 *       The separator between a keystore name prefix and an entry name.
 *           When specified, it applies to all the entries in a domain.
 *           Its default value is a space. 
 *  
 *  
 *  For example, configuration data for a simple keystore domain
 *  comprising three keystores is shown below:
 *  
 * 
 *  domain app1 {
 *      keystore app1-truststore
 *          keystoreURI="file:///app1/etc/truststore.jks";
 * 
 *      keystore system-truststore
 *          keystoreURI="${java.home}/lib/security/cacerts";
 * 
 *      keystore app1-keystore
 *          keystoreType="PKCS12"
 *          keystoreURI="file:///app1/etc/keystore.p12";
 *  };
 * 
 *  
 */
final class DomainLoadStoreParameter extends Object with KeyStore.LoadStoreParameter {

    /** Gets the identifier for the domain configuration data. */
    @stub
    def getConfiguration(): URI = ???

    /** Gets the keystore protection parameters for this domain. */
    @stub
    def getProtectionParameter(): KeyStore.ProtectionParameter = ???
}
