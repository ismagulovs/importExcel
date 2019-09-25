package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl44DvzhDenSrdFinDtlt;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl44 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl44DvzhDenSrdFinDtlt item = new StcTbl44DvzhDenSrdFinDtlt();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld230PstpDenzhSr(CheckInt.cellToBigDecimal(row.getCell(232)));
        item.setFld231EmsAkcCenBmg(CheckInt.cellToBigDecimal(row.getCell(233)));
        item.setFld232EmsAkcDrdolInstr(CheckInt.cellToBigDecimal(row.getCell(234)));
        item.setFld233EmsOblZaimVeks(CheckInt.cellToBigDecimal(row.getCell(235)));
        item.setFld234PlchZaim(CheckInt.cellToBigDecimal(row.getCell(236)));
        item.setFld235PstpZaimBank(CheckInt.cellToBigDecimal(row.getCell(237)));
        item.setFld236PstpPrZaim(CheckInt.cellToBigDecimal(row.getCell(238)));
        item.setFld237PrPstp(CheckInt.cellToBigDecimal(row.getCell(239)));
        item.setFld238VbtDenSr(CheckInt.cellToBigDecimal(row.getCell(240)));
        item.setFld239PgshZdlgZaim(CheckInt.cellToBigDecimal(row.getCell(241)));
        item.setFld240VbtZaimBank(CheckInt.cellToBigDecimal(row.getCell(242)));
        item.setFld241VbtPrZaim(CheckInt.cellToBigDecimal(row.getCell(243)));
        item.setFld242PrbSbsAkc(CheckInt.cellToBigDecimal(row.getCell(244)));
        item.setFld243VpltDvd(CheckInt.cellToBigDecimal(row.getCell(245)));
        item.setFld244PrVbt(CheckInt.cellToBigDecimal(row.getCell(246)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
