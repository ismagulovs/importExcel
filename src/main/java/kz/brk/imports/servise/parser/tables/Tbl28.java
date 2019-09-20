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

        item.setFld133ZpsNchl(CheckInt.cellToInt(row.getCell(135)));
        item.setFld134ZpsKnc(CheckInt.cellToInt(row.getCell(136)));
        item.setFld135SrMtrlNchl(CheckInt.cellToInt(row.getCell(137)));
        item.setFld136SrMtrlKnc(CheckInt.cellToInt(row.getCell(138)));
        item.setFld137GtvPrdNchl(CheckInt.cellToInt(row.getCell(139)));
        item.setFld138GtvPrdKnc(CheckInt.cellToInt(row.getCell(140)));
        item.setFld139TvrNchl(CheckInt.cellToInt(row.getCell(141)));
        item.setFld140TvrKnc(CheckInt.cellToInt(row.getCell(142)));
        item.setFld141NzvrPrzvNchl(CheckInt.cellToInt(row.getCell(143)));
        item.setFld142NzvrPrzvKnc(CheckInt.cellToInt(row.getCell(144)));
        item.setFld143PrZpsNchl(CheckInt.cellToInt(row.getCell(145)));
        item.setFld144PrZpsKnc(CheckInt.cellToInt(row.getCell(146)));

        em.persist(item);
    }
}
