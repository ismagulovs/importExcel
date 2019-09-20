package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl22SostVzmRschPrdp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl22 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl22SostVzmRschPrdp item = new StcTbl22SostVzmRschPrdp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld083DbtZdlVse(CheckInt.cellToInt(row.getCell(85)));
        item.setFld084DbtZdlPrsr(CheckInt.cellToInt(row.getCell(86)));
        item.setFld085ZdlPkpZkzVse(CheckInt.cellToInt(row.getCell(87)));
        item.setFld086ZdlPkpZkzPrsr(CheckInt.cellToInt(row.getCell(88)));
        item.setFld087PrDbtZdlVse(CheckInt.cellToInt(row.getCell(89)));
        item.setFld088PrDbtZdlPrsr(CheckInt.cellToInt(row.getCell(90)));
        item.setFld089ZdlObzVse(CheckInt.cellToInt(row.getCell(91)));
        item.setFld090ZdlObzPrsr(CheckInt.cellToInt(row.getCell(92)));
        item.setFld091RschPstPdrVse(CheckInt.cellToInt(row.getCell(93)));
        item.setFld092RschPstPdrPrsr(CheckInt.cellToInt(row.getCell(94)));
        item.setFld093NlgDrObzPlatVse(CheckInt.cellToInt(row.getCell(95)));
        item.setFld094NlgDrObzPlatPrsr(CheckInt.cellToInt(row.getCell(96)));
        item.setFld095PrchObzPensVznVse(CheckInt.cellToInt(row.getCell(97)));
        item.setFld096PrchObzPensVznPrsr(CheckInt.cellToInt(row.getCell(98)));
        item.setFld097ZaimBankVse(CheckInt.cellToInt(row.getCell(99)));
        item.setFld098ZaimBankPrsr(CheckInt.cellToInt(row.getCell(100)));
        item.setFld099PrZaimVse(CheckInt.cellToInt(row.getCell(101)));
        item.setFld100PrZaimPrsr(CheckInt.cellToInt(row.getCell(102)));
        item.setFld101PrKrdZdlVse(CheckInt.cellToInt(row.getCell(103)));
        item.setFld102PrKrdZdlPrsr(CheckInt.cellToInt(row.getCell(104)));
        item.setFld103ZdlOplTrdVse(CheckInt.cellToInt(row.getCell(105)));
        item.setFld104ZdlOplTrdPrsr(CheckInt.cellToInt(row.getCell(106)));

        em.persist(item);
    }
}
