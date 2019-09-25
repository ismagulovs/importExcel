package kz.brk.imports.servise.parser.tables;
import kz.brk.imports.model.StcTbl04ObmPrdUslOsn;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl04 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl04ObmPrdUslOsn item = new StcTbl04ObmPrdUslOsn();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld010ObjemPrdUsl(CheckInt.cellToBigDecimal(row.getCell(12)));
        item.setFld011ObjemRlz(CheckInt.cellToBigDecimal(row.getCell(13)));
        item.setFld012PrdUslIsp(CheckInt.cellToBigDecimal(row.getCell(14)));
        item.setFld013IzmZps(CheckInt.cellToBigDecimal(row.getCell(15)));
        item.setFld014PrstUmn(CheckInt.cellToBigDecimal(row.getCell(16)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
