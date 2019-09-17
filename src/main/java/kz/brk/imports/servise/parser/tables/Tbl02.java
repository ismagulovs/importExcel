package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl02OsnPkzFinHozDtlst;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

@Singleton
public class Tbl02 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl02OsnPkzFinHozDtlst item = new StcTbl02OsnPkzFinHozDtlst();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));

        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");
        item.setFld001OjmPrzvPrdUsl(CheckInt.cellToInt(row.getCell(3)));
        item.setFld002DhdRlzcPrdUsl(CheckInt.cellToInt(row.getCell(4)));
        item.setFld003SbstRzlPrdUsl(CheckInt.cellToInt(row.getCell(5)));
        item.setFld004PrbNlg(CheckInt.cellToInt(row.getCell(6)));
        item.setFld005RentPrzv(CheckInt.cellToBigDecimal(row.getCell(7)));
        em.persist(item);
        em.flush();
    }
}
