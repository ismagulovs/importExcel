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

        item.setFld010ObjemPrdUsl(CheckInt.isNumeric(row.getCell(12).getStringCellValue())? Integer.parseInt(row.getCell(12).getStringCellValue()) : 0 );
        item.setFld011ObjemRlz(CheckInt.isNumeric(row.getCell(13).getStringCellValue())? Integer.parseInt(row.getCell(13).getStringCellValue()) : 0 );
        item.setFld012PrdUslIsp(CheckInt.isNumeric(row.getCell(14).getStringCellValue())? Integer.parseInt(row.getCell(14).getStringCellValue()) : 0 );
        item.setFld013IzmZps(CheckInt.isNumeric(row.getCell(15).getStringCellValue())? Integer.parseInt(row.getCell(15).getStringCellValue()) : 0 );
        item.setFld014PrstUmn(CheckInt.isNumeric(row.getCell(16).getStringCellValue())? Integer.parseInt(row.getCell(16).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
