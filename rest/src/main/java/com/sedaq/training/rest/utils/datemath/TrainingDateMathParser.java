package com.sedaq.training.rest.utils.datemath;

import org.elasticsearch.common.joda.DateMathParser;
import org.elasticsearch.common.joda.FormatDateTimeFormatter;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * That parser is based on Elasticsearch DateMathParser.
 *
 * <p>
 * Example of usage:
 * </p>
 *
 * <pre>
 * <code>
 * public class YourClass {
 *
 * &#64;Autowired
 * DateMathparser dateMathParser;
 *
 *  yourMethod(...){
 *      dateMathParser.parseDate("now"); //returns current time
 *      dateMathParser.parseDate("now-150s"); // returns current time minus 150 seconds
 *      dateMathParser.parseDate("now-50m"); // returns current time minus 50 minutes
 *      dateMathParser.parseDate("now-1h"); // returns current time minus 1 hours
 *      dateMathParser.parseDate("now-2d"); // returns current time minus 2 days
 *      dateMathParser.parseDate("now-3w"); // returns current time minus 3 weeks
 *      dateMathParser.parseDate("now-2M"); // returns current time minus 2 months
 *      dateMathParser.parseDate("now-1y"); // returns current time minus 1 year
 *
 *      // of course the same could be done with plus operator
 *      dateMathParser.parseDate("now+150s"); // returns current time plus 150 seconds
 *      // ...
 *
 *      dateMathParser.parseDate("1992-03-25 10:10:10");
 *      dateMathParser.parseDate("1992-03-25");
 *      dateMathParser.parseDate("25/03/1992");
 *      dateMathParser.parseDate("1523354137755");  // converts string to long
 *  }
 * }
 * </code>
 * </pre>
 *
 * @author Pavel Šeda
 */
@Component
public class TrainingDateMathParser {

    // checks if String is composed only from digits
    private static final Pattern ONLY_DIGITS = Pattern.compile("(\\d+)");
    // @formatter:off
    private static final DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().append(null,
            new DateTimeParser[]{DateTimeFormat.forPattern("dd/MM/yyyy").getParser(),
                    DateTimeFormat.forPattern("yyyy-MM-dd").getParser(),
                    DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").getParser(),
                    DateTimeFormat.longDateTime().getParser()})
            .toFormatter();
    // @formatter:on

    private static final DateTimeFormatter parser = dateFormatter
            .withZone(DateTimeZone.forID(ZoneId.systemDefault().getId()));
    private static final DateMathParser dateMathParser = new DateMathParser(
            new FormatDateTimeFormatter("YYYY.mm.dd", parser, Locale.ROOT));

    public long parseDate(final String date) {
        if (ONLY_DIGITS.matcher(date).matches()) {
            return Long.parseLong(date);
        } else {
            return dateMathParser.parse(date, System::currentTimeMillis);
        }
    }
}
