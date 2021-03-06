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

        item.setFld037ValPrb(CheckInt.cellToBigDecimal(row.getCell(39)));
        item.setFld038RashRlzcPu(CheckInt.cellToBigDecimal(row.getCell(40)));
        item.setFld039AdmRash(CheckInt.cellToBigDecimal(row.getCell(41)));
        item.setFld040RashFin(CheckInt.cellToBigDecimal(row.getCell(42)));
        item.setFld041PrRash(CheckInt.cellToBigDecimal(row.getCell(43)));
        item.setFld042PrblUbtk(CheckInt.cellToBigDecimal(row.getCell(44)));
        item.setFld043RashCorpPn(CheckInt.cellToBigDecimal(row.getCell(45)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
