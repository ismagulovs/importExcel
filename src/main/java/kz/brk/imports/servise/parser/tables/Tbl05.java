package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl05DhdRlzPrdUsl;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl05 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl05DhdRlzPrdUsl item = new StcTbl05DhdRlzPrdUsl();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld015DhdRlzc(CheckInt.cellToInt(row.getCell(17)));
        item.setFld016DhdFin(CheckInt.cellToInt(row.getCell(18)));
        item.setFld017DvdAkcVzng(CheckInt.cellToInt(row.getCell(19)));
        item.setFld018PrDhd(CheckInt.cellToInt(row.getCell(20)));
        item.setFld019DhdKursRznc(CheckInt.cellToInt(row.getCell(21)));
        item.setFld020DhdVybAkt(CheckInt.cellToInt(row.getCell(22)));

        em.persist(item);
    }
}
