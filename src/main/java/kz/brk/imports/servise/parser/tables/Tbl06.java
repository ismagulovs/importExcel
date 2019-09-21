package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl06DhdRlzPrdUslOsn;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl06 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl06DhdRlzPrdUslOsn item = new StcTbl06DhdRlzPrdUslOsn();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld021DhdRlzcPu(CheckInt.cellToInt(row.getCell(23)));
        item.setFld022DhdRlzc(CheckInt.cellToInt(row.getCell(24)));
        item.setFld023DhdFin(CheckInt.cellToInt(row.getCell(25)));
        item.setFld024DvdAkcVzng(CheckInt.cellToInt(row.getCell(26)));
        item.setFld025PrDhd(CheckInt.cellToInt(row.getCell(27)));
        item.setFld026DhdKursRznc(CheckInt.cellToInt(row.getCell(28)));
        item.setFld027DhdVybAkt(CheckInt.cellToInt(row.getCell(29)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
