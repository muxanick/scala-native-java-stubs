package javax.jws

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value = METHOD ) @interface WebMethod {

    @stub
    // 
    def action: String = ???

    @stub
    // 
    def exclude: Boolean = ???
}
