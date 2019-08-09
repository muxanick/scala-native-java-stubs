package javax.xml.ws

import java.lang.annotation.{Documented, ElementType, Inherited, Retention, RetentionPolicy, Target}

// Used to indicate whether a Provider implementation wishes to work
// with entire protocol messages or just with protocol message payloads.
@Target ( value = TYPE ) @Retention ( value = RUNTIME ) @Inherited @Documented @interface ServiceMode {
}
