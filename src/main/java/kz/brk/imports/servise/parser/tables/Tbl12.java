package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl12GrpPredpDhdUbtk;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl12 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl12GrpPredpDhdUbtk item = new StcTbl12GrpPredpDhdUbtk();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld044ObshKolPrdp(CheckInt.cellToBigDecimal(row.getCell(46)));
        item.setFld045KolPrdpPrb(CheckInt.cellToBigDecimal(row.getCell(47)));
        item.setFld046PrcnObshKolPrb(CheckInt.cellToBigDecimal(row.getCell(48)));
        item.setFld047SumPrb(CheckInt.cellToBigDecimal(row.getCell(49)));
        item.setFld048KolPrdpUbtk(CheckInt.cellToBigDecimal(row.getCell(50)));
        item.setFld049PrcnObshKolUbtk(CheckInt.cellToBigDecimal(row.getCell(51)));
        item.setFld050SumUbtk(CheckInt.cellToBigDecimal(row.getCell(52)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
