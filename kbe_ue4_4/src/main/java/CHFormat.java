/**
 * Created on 30/11/15.
 */
public class CHFormat implements FormatCode {
    public void format(Datum datum) {
        System.out.printf(datum.getDay()+"."+datum.getMonth()+"."+datum.getYear());
    }
}
