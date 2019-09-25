package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl28Zapasy;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl28 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl28Zapasy item = new StcTbl28Zapasy();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld133ZpsNchl(CheckInt.cellToBigDecimal(row.getCell(135)));
        item.setFld134ZpsKnc(CheckInt.cellToBigDecimal(row.getCell(136)));
        item.setFld135SrMtrlNchl(CheckInt.cellToBigDecimal(row.getCell(137)));
        item.setFld136SrMtrlKnc(CheckInt.cellToBigDecimal(row.getCell(138)));
        item.setFld137GtvPrdNchl(CheckInt.cellToBigDecimal(row.getCell(139)));
        item.setFld138GtvPrdKnc(CheckInt.cellToBigDecimal(row.getCell(140)));
        item.setFld139TvrNchl(CheckInt.cellToBigDecimal(row.getCell(141)));
        item.setFld140TvrKnc(CheckInt.cellToBigDecimal(row.getCell(142)));
        item.setFld141NzvrPrzvNchl(CheckInt.cellToBigDecimal(row.getCell(143)));
        item.setFld142NzvrPrzvKnc(CheckInt.cellToBigDecimal(row.getCell(144)));
        item.setFld143PrZpsNchl(CheckInt.cellToBigDecimal(row.getCell(145)));
        item.setFld144PrZpsKnc(CheckInt.cellToBigDecimal(row.getCell(146)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
