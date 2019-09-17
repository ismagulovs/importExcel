package kz.brk.imports.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ww on 04.03.2016.
 */
public class DateUtil {
    public Date getDateNow() {
        try {
            Date dt = new Date();
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            String strDT = dtFormat.format(dt);
            dt = dtFormat.parse(strDT);
            return dt;
        }catch (Exception e){
            return null;
        }
    }
}
