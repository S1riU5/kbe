package de.htw_berlin.ai_bachelor.kbe.checklist.mb;



import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created on 31/12/15.
 */
@ManagedBean
@ApplicationScoped
public class OwnTime {

    private Date date;
    private DateFormat dataFormat;

    public OwnTime() {
        this.date = new Date();
        this.dataFormat = new SimpleDateFormat("h:mm:ss", Locale.GERMANY);
    }


    public String getDate() {
        date.setTime(System.currentTimeMillis());
        return dataFormat.format(date);
    }




}
