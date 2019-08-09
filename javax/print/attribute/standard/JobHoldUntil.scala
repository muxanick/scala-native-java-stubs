package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, DateTimeSyntax, PrintJobAttribute, PrintRequestAttribute}

/** Class JobHoldUntil is a printing attribute class, a date-time attribute, that
 *  specifies the exact date and time at which the job must become a candidate
 *  for printing.
 *  
 *  If the value of this attribute specifies a date-time that is in the future,
 *  the printer should add the JobStateReason value of
 *  JOB_HOLD_UNTIL_SPECIFIED to the job's JobStateReasons
 *  attribute, must move the job to the PENDING_HELD state, and must not schedule
 *  the job for printing until the specified date-time arrives.
 *  
 *  When the specified date-time arrives, the printer must remove the JobStateReason value of JOB_HOLD_UNTIL_SPECIFIED from the
 *  job's JobStateReasons attribute, if present. If there
 *  are no other job state reasons that keep the job in the PENDING_HELD state,
 *  the printer must consider the job as a candidate for processing by moving the
 *  job to the PENDING state.
 *  
 *  If the specified date-time has already passed, the job must be a candidate
 *  for processing immediately. Thus, one way to make the job immediately become
 *  a candidate for processing is to specify a JobHoldUntil attribute constructed
 *  like this (denoting a date-time of January 1, 1970, 00:00:00 GMT):
 *  
 *      JobHoldUntil immediately = new JobHoldUntil (new Date (0L));
 *  
 *  
 *  If the client does not supply this attribute in a Print Request and the
 *  printer supports this attribute, the printer must use its
 *  (implementation-dependent) default JobHoldUntil value at job submission time
 *  (unlike most job template attributes that are used if necessary at job
 *  processing time).
 *  
 *  To construct a JobHoldUntil attribute from separate values of the year,
 *  month, day, hour, minute, and so on, use a Calendar object to construct a Date object, then use
 *  the Date object to construct the JobHoldUntil
 *  attribute. To convert a JobHoldUntil attribute to separate values of the
 *  year, month, day, hour, minute, and so on, create a Calendar object and set it to the Date from the
 *  JobHoldUntil attribute.
 *  
 *  IPP Compatibility: Although IPP supports a "job-hold-until" attribute
 *  specified as a keyword, IPP does not at this time support a "job-hold-until"
 *  attribute specified as a date and time. However, the date and time can be
 *  converted to one of the standard IPP keywords with some loss of precision;
 *  for example, a JobHoldUntil value with today's date and 9:00pm local time
 *  might be converted to the standard IPP keyword "night". The category name
 *  returned by getName() gives the IPP attribute name.
 *  
 */
final class JobHoldUntil extends DateTimeSyntax with PrintRequestAttribute with PrintJobAttribute {

    /** Returns whether this job hold until attribute is equivalent to the
     *  passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
