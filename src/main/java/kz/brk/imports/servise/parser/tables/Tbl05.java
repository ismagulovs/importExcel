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

        item.setFld015DhdRlzc(CheckInt.isNumeric(row.getCell(17).getStringCellValue())? Integer.parseInt(row.getCell(17).getStringCellValue()) : 0 );
        item.setFld016DhdFin(CheckInt.isNumeric(row.getCell(18).getStringCellValue())? Integer.parseInt(row.getCell(18).getStringCellValue()) : 0 );
        item.setFld017DvdAkcVzng(CheckInt.isNumeric(row.getCell(19).getStringCellValue())? Integer.parseInt(row.getCell(19).getStringCellValue()) : 0 );
        item.setFld018PrDhd(CheckInt.isNumeric(row.getCell(20).getStringCellValue())? Integer.parseInt(row.getCell(20).getStringCellValue()) : 0 );
        item.setFld019DhdKursRznc(CheckInt.isNumeric(row.getCell(21).getStringCellValue())? Integer.parseInt(row.getCell(21).getStringCellValue()) : 0 );
        item.setFld020DhdVybAkt(CheckInt.isNumeric(row.getCell(22).getStringCellValue())? Integer.parseInt(row.getCell(22).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
