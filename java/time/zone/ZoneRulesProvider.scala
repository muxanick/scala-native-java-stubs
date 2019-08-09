package java.time.zone

import java.lang.{Object, String}
import java.util.{NavigableMap, Set}

/** Provider of time-zone rules to the system.
 *  
 *  This class manages the configuration of time-zone rules.
 *  The static methods provide the public API that can be used to manage the providers.
 *  The abstract methods provide the SPI that allows rules to be provided.
 *  
 *  ZoneRulesProvider may be installed in an instance of the Java Platform as
 *  extension classes, that is, jar files placed into any of the usual extension
 *  directories. Installed providers are loaded using the service-provider loading
 *  facility defined by the ServiceLoader class. A ZoneRulesProvider
 *  identifies itself with a provider configuration file named
 *  java.time.zone.ZoneRulesProvider in the resource directory
 *  META-INF/services. The file should contain a line that specifies the
 *  fully qualified concrete zonerules-provider class name.
 *  Providers may also be made available by adding them to the class path or by
 *  registering themselves via registerProvider(java.time.zone.ZoneRulesProvider) method.
 *  
 *  The Java virtual machine has a default provider that provides zone rules
 *  for the time-zones defined by IANA Time Zone Database (TZDB). If the system
 *  property java.time.zone.DefaultZoneRulesProvider is defined then
 *  it is taken to be the fully-qualified name of a concrete ZoneRulesProvider
 *  class to be loaded as the default provider, using the system class loader.
 *  If this system property is not defined, a system-default provider will be
 *  loaded to serve as the default provider.
 *  
 *  Rules are looked up primarily by zone ID, as used by ZoneId.
 *  Only zone region IDs may be used, zone offset IDs are not used here.
 *  
 *  Time-zone rules are political, thus the data can change at any time.
 *  Each provider will provide the latest rules for each zone ID, but they
 *  may also provide the history of how the rules changed.
 */
abstract class ZoneRulesProvider extends Object {

    /** SPI method to refresh the rules from the underlying data provider. */
    protected def provideRefresh(): Boolean

    /** SPI method to get the rules for the zone ID. */
    protected def provideRules(zoneId: String, forCaching: Boolean): ZoneRules

    /** SPI method to get the history of rules for the zone ID. */
    protected def provideVersions(zoneId: String): NavigableMap[String, ZoneRules]

    /** SPI method to get the available zone IDs. */
    protected def provideZoneIds(): Set[String]
}

object ZoneRulesProvider {
    /** Gets the set of available zone IDs. */
    @stub
    def getAvailableZoneIds(): Set[String] = ???

    /** Gets the rules for the zone ID. */
    @stub
    def getRules(zoneId: String, forCaching: Boolean): ZoneRules = ???

    /** Gets the history of rules for the zone ID. */
    @stub
    def getVersions(zoneId: String): NavigableMap[String, ZoneRules] = ???

    /** Refreshes the rules from the underlying data provider. */
    @stub
    def refresh(): Boolean = ???
}
