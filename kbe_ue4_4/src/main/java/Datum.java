/**
 * Created on 23/11/15.
 */
public class Datum {

    private int month;
    private int year;
    private int day;

    /**
     * Contructor to initialize the Date with valide Parameters
     * @param month
     * @param year
     * @param day
     */
    public Datum(int day, int month, int year){
        validateDate(day, month, year);
        this.month = month;
        this.year = year;
        this.day = day;
    }

    /**
     * Konstruktor to initialize the object with another Date object
     * @param datum
     */
    public Datum(Datum datum) {
        validateDate(datum.getDay(),datum.getMonth(),datum.getYear());
        this.month = datum.getMonth();
        this.year = datum.getYear();
        this.day = datum.getDay();
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }


    /**
     * Validates the input month year day
     * @param month
     * @param year
     * @param day
     */
    private void validateDate(int day, int month, int year) {

        if (month > 12 || month <1){
            throw new IllegalArgumentException();
        }

        if(year < 0 || year > 3000){
            throw  new IllegalArgumentException();
        }

        if (day < 0  || day > 31){
            throw new IllegalArgumentException();
        }

    }

}
