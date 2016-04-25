/**
 * Created on 30/11/15.
 */
public class ISOFormat implements FormatCode {

    public void format(Datum datum) {
        System.out.println(datum.getYear()+"-"+datum.getMonth()+"-"+datum.getDay());
    }
}
