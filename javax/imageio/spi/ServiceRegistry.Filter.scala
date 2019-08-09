package javax.imageio.spi

// A simple filter interface used by
// ServiceRegistry.getServiceProviders to select
// providers matching an arbitrary criterion.  Classes that
// implement this interface should be defined in order to make use
// of the getServiceProviders method of
// ServiceRegistry that takes a Filter.
object trait ServiceRegistry.Filter {
