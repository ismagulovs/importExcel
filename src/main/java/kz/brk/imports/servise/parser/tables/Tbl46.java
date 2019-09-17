package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl46ValiutPozc;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl46 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl46ValiutPozc item = new StcTbl46ValiutPozc();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld245AktvInostrVlt(CheckInt.isNumeric(row.getCell(247).getStringCellValue())? Integer.parseInt(row.getCell(247).getStringCellValue()) : 0 );
        item.setFld246KrtAktvInostrVlt(CheckInt.isNumeric(row.getCell(248).getStringCellValue())? Integer.parseInt(row.getCell(248).getStringCellValue()) : 0 );
        item.setFld247DlgAktvInostrVlt(CheckInt.isNumeric(row.getCell(249).getStringCellValue())? Integer.parseInt(row.getCell(249).getStringCellValue()) : 0 );
        item.setFld248ObzInostrVlt(CheckInt.isNumeric(row.getCell(250).getStringCellValue())? Integer.parseInt(row.getCell(250).getStringCellValue()) : 0 );
        item.setFld249KrtObzInostrVlt(CheckInt.isNumeric(row.getCell(251).getStringCellValue())? Integer.parseInt(row.getCell(251).getStringCellValue()) : 0 );
        item.setFld250DlgObzInostrVlt(CheckInt.isNumeric(row.getCell(252).getStringCellValue())? Integer.parseInt(row.getCell(252).getStringCellValue()) : 0 );
        item.setFld251ChstPzcInostrVlt(CheckInt.isNumeric(row.getCell(253).getStringCellValue())? Integer.parseInt(row.getCell(253).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
