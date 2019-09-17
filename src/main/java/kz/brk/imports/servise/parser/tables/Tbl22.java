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

        item.setFld083DbtZdlVse(CheckInt.isNumeric(row.getCell(85).getStringCellValue())? Integer.parseInt(row.getCell(85).getStringCellValue()) : 0 );
        item.setFld084DbtZdlPrsr(CheckInt.isNumeric(row.getCell(86).getStringCellValue())? Integer.parseInt(row.getCell(86).getStringCellValue()) : 0 );
        item.setFld085ZdlPkpZkzVse(CheckInt.isNumeric(row.getCell(87).getStringCellValue())? Integer.parseInt(row.getCell(87).getStringCellValue()) : 0 );
        item.setFld086ZdlPkpZkzPrsr(CheckInt.isNumeric(row.getCell(88).getStringCellValue())? Integer.parseInt(row.getCell(88).getStringCellValue()) : 0 );
        item.setFld087PrDbtZdlVse(CheckInt.isNumeric(row.getCell(89).getStringCellValue())? Integer.parseInt(row.getCell(89).getStringCellValue()) : 0 );
        item.setFld088PrDbtZdlPrsr(CheckInt.isNumeric(row.getCell(90).getStringCellValue())? Integer.parseInt(row.getCell(90).getStringCellValue()) : 0 );
        item.setFld089ZdlObzVse(CheckInt.isNumeric(row.getCell(91).getStringCellValue())? Integer.parseInt(row.getCell(91).getStringCellValue()) : 0 );
        item.setFld090ZdlObzPrsr(CheckInt.isNumeric(row.getCell(92).getStringCellValue())? Integer.parseInt(row.getCell(92).getStringCellValue()) : 0 );
        item.setFld091RschPstPdrVse(CheckInt.isNumeric(row.getCell(93).getStringCellValue())? Integer.parseInt(row.getCell(93).getStringCellValue()) : 0 );
        item.setFld092RschPstPdrPrsr(CheckInt.isNumeric(row.getCell(94).getStringCellValue())? Integer.parseInt(row.getCell(94).getStringCellValue()) : 0 );
        item.setFld093NlgDrObzPlatVse(CheckInt.isNumeric(row.getCell(95).getStringCellValue())? Integer.parseInt(row.getCell(95).getStringCellValue()) : 0 );
        item.setFld094NlgDrObzPlatPrsr(CheckInt.isNumeric(row.getCell(96).getStringCellValue())? Integer.parseInt(row.getCell(96).getStringCellValue()) : 0 );
        item.setFld095PrchObzPensVznVse(CheckInt.isNumeric(row.getCell(97).getStringCellValue())? Integer.parseInt(row.getCell(97).getStringCellValue()) : 0 );
        item.setFld096PrchObzPensVznPrsr(CheckInt.isNumeric(row.getCell(98).getStringCellValue())? Integer.parseInt(row.getCell(98).getStringCellValue()) : 0 );
        item.setFld097ZaimBankVse(CheckInt.isNumeric(row.getCell(99).getStringCellValue())? Integer.parseInt(row.getCell(99).getStringCellValue()) : 0 );
        item.setFld098ZaimBankPrsr(CheckInt.isNumeric(row.getCell(100).getStringCellValue())? Integer.parseInt(row.getCell(100).getStringCellValue()) : 0 );
        item.setFld099PrZaimVse(CheckInt.isNumeric(row.getCell(101).getStringCellValue())? Integer.parseInt(row.getCell(101).getStringCellValue()) : 0 );
        item.setFld100PrZaimPrsr(CheckInt.isNumeric(row.getCell(102).getStringCellValue())? Integer.parseInt(row.getCell(102).getStringCellValue()) : 0 );
        item.setFld101PrKrdZdlVse(CheckInt.isNumeric(row.getCell(103).getStringCellValue())? Integer.parseInt(row.getCell(103).getStringCellValue()) : 0 );
        item.setFld102PrKrdZdlPrsr(CheckInt.isNumeric(row.getCell(104).getStringCellValue())? Integer.parseInt(row.getCell(104).getStringCellValue()) : 0 );
        item.setFld103ZdlOplTrdVse(CheckInt.isNumeric(row.getCell(105).getStringCellValue())? Integer.parseInt(row.getCell(105).getStringCellValue()) : 0 );
        item.setFld104ZdlOplTrdPrsr(CheckInt.isNumeric(row.getCell(106).getStringCellValue())? Integer.parseInt(row.getCell(106).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
