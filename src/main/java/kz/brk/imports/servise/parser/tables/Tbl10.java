package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl10RezFinHozDtlPrdp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl10 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl10RezFinHozDtlPrdp item = new StcTbl10RezFinHozDtlPrdp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld037ValPrb(CheckInt.isNumeric(row.getCell(39).getStringCellValue())? Integer.parseInt(row.getCell(39).getStringCellValue()) : 0 );
        item.setFld038RashRlzcPu(CheckInt.isNumeric(row.getCell(40).getStringCellValue())? Integer.parseInt(row.getCell(40).getStringCellValue()) : 0 );
        item.setFld039AdmRash(CheckInt.isNumeric(row.getCell(41).getStringCellValue())? Integer.parseInt(row.getCell(41).getStringCellValue()) : 0 );
        item.setFld040RashFin(CheckInt.isNumeric(row.getCell(42).getStringCellValue())? Integer.parseInt(row.getCell(42).getStringCellValue()) : 0 );
        item.setFld041PrRash(CheckInt.isNumeric(row.getCell(43).getStringCellValue())? Integer.parseInt(row.getCell(43).getStringCellValue()) : 0 );
        item.setFld042PrblUbtk(CheckInt.isNumeric(row.getCell(44).getStringCellValue())? Integer.parseInt(row.getCell(44).getStringCellValue()) : 0 );
        item.setFld043RashCorpPn(CheckInt.isNumeric(row.getCell(45).getStringCellValue())? Integer.parseInt(row.getCell(45).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
