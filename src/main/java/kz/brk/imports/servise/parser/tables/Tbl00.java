package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl00ChislnstRabot;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;

@Stateless
public class Tbl00 {
    @PersistenceContext(name="brk-imports")
    private EntityManager em;

    public void parseTbl(Row row) {
        StcTbl00ChislnstRabot item = new StcTbl00ChislnstRabot();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");
        item.setNameKato(row.getCell(2).getStringCellValue());

        em.persist(item);
        em.flush();
        em.clear();
    }
}
