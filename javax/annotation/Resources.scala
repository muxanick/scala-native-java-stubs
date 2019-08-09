package javax.annotation

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// This class is used to allow multiple resources declarations.
@Documented @Retention ( value = RUNTIME ) @Target ( value = TYPE ) @interface Resources {
}
