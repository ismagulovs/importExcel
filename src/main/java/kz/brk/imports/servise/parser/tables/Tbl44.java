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

        item.setFld230PstpDenzhSr(CheckInt.isNumeric(row.getCell(232).getStringCellValue())? Integer.parseInt(row.getCell(232).getStringCellValue()) : 0 );
        item.setFld231EmsAkcCenBmg(CheckInt.isNumeric(row.getCell(233).getStringCellValue())? Integer.parseInt(row.getCell(233).getStringCellValue()) : 0 );
        item.setFld232EmsAkcDrdolInstr(CheckInt.isNumeric(row.getCell(234).getStringCellValue())? Integer.parseInt(row.getCell(234).getStringCellValue()) : 0 );
        item.setFld233EmsOblZaimVeks(CheckInt.isNumeric(row.getCell(235).getStringCellValue())? Integer.parseInt(row.getCell(235).getStringCellValue()) : 0 );
        item.setFld234PlchZaim(CheckInt.isNumeric(row.getCell(236).getStringCellValue())? Integer.parseInt(row.getCell(236).getStringCellValue()) : 0 );
        item.setFld235PstpZaimBank(CheckInt.isNumeric(row.getCell(237).getStringCellValue())? Integer.parseInt(row.getCell(237).getStringCellValue()) : 0 );
        item.setFld236PstpPrZaim(CheckInt.isNumeric(row.getCell(238).getStringCellValue())? Integer.parseInt(row.getCell(238).getStringCellValue()) : 0 );
        item.setFld237PrPstp(CheckInt.isNumeric(row.getCell(239).getStringCellValue())? Integer.parseInt(row.getCell(239).getStringCellValue()) : 0 );
        item.setFld238VbtDenSr(CheckInt.isNumeric(row.getCell(240).getStringCellValue())? Integer.parseInt(row.getCell(240).getStringCellValue()) : 0 );
        item.setFld239PgshZdlgZaim(CheckInt.isNumeric(row.getCell(241).getStringCellValue())? Integer.parseInt(row.getCell(241).getStringCellValue()) : 0 );
        item.setFld240VbtZaimBank(CheckInt.isNumeric(row.getCell(242).getStringCellValue())? Integer.parseInt(row.getCell(242).getStringCellValue()) : 0 );
        item.setFld241VbtPrZaim(CheckInt.isNumeric(row.getCell(243).getStringCellValue())? Integer.parseInt(row.getCell(243).getStringCellValue()) : 0 );
        item.setFld242PrbSbsAkc(CheckInt.isNumeric(row.getCell(244).getStringCellValue())? Integer.parseInt(row.getCell(244).getStringCellValue()) : 0 );
        item.setFld243VpltDvd(CheckInt.isNumeric(row.getCell(245).getStringCellValue())? Integer.parseInt(row.getCell(245).getStringCellValue()) : 0 );
        item.setFld244PrVbt(CheckInt.isNumeric(row.getCell(246).getStringCellValue())? Integer.parseInt(row.getCell(246).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
