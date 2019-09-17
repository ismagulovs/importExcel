package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl03ObshObmPrdUsl;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl03 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl03ObshObmPrdUsl item = new StcTbl03ObshObmPrdUsl();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld006ObjemRlz(CheckInt.isNumeric(row.getCell(8).getStringCellValue())? Integer.parseInt(row.getCell(8).getStringCellValue()) : 0 );
        item.setFld007PrdUslIsp(CheckInt.isNumeric(row.getCell(9).getStringCellValue())? Integer.parseInt(row.getCell(9).getStringCellValue()) : 0 );
        item.setFld008IzmZps(CheckInt.isNumeric(row.getCell(10).getStringCellValue())? Integer.parseInt(row.getCell(10).getStringCellValue()) : 0 );
        item.setFld009PrstUmn(CheckInt.isNumeric(row.getCell(11).getStringCellValue())? Integer.parseInt(row.getCell(11).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
