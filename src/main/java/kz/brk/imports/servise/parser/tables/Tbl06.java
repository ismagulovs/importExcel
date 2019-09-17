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

        item.setFld021DhdRlzcPu(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld022DhdRlzc(CheckInt.isNumeric(row.getCell(24).getStringCellValue())? Integer.parseInt(row.getCell(24).getStringCellValue()) : 0 );
        item.setFld023DhdFin(CheckInt.isNumeric(row.getCell(25).getStringCellValue())? Integer.parseInt(row.getCell(25).getStringCellValue()) : 0 );
        item.setFld024DvdAkcVzng(CheckInt.isNumeric(row.getCell(26).getStringCellValue())? Integer.parseInt(row.getCell(26).getStringCellValue()) : 0 );
        item.setFld025PrDhd(CheckInt.isNumeric(row.getCell(27).getStringCellValue())? Integer.parseInt(row.getCell(27).getStringCellValue()) : 0 );
        item.setFld026DhdKursRznc(CheckInt.isNumeric(row.getCell(28).getStringCellValue())? Integer.parseInt(row.getCell(28).getStringCellValue()) : 0 );
        item.setFld027DhdVybAkt(CheckInt.isNumeric(row.getCell(29).getStringCellValue())? Integer.parseInt(row.getCell(29).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
