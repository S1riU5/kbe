/**
 * Created on 30/11/15.
 */
public class USFormat implements FormatCode {

    public void format(Datum datum) {
        System.out.printf(datum.getMonth()+"/"+datum.getDay()+"/"+datum.getYear());
    }
}
