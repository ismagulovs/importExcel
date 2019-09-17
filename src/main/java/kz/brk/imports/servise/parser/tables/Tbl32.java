package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl32KrtSrObz;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl32 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl32KrtSrObz item = new StcTbl32KrtSrObz();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld159KrtObzNchl(CheckInt.isNumeric(row.getCell(161).getStringCellValue())? Integer.parseInt(row.getCell(161).getStringCellValue()) : 0 );
        item.setFld160KrtObzKnc(CheckInt.isNumeric(row.getCell(162).getStringCellValue())? Integer.parseInt(row.getCell(162).getStringCellValue()) : 0 );
        item.setFld161KrtFinObzNchl(CheckInt.isNumeric(row.getCell(163).getStringCellValue())? Integer.parseInt(row.getCell(163).getStringCellValue()) : 0 );
        item.setFld162KrtFinObzKnc(CheckInt.isNumeric(row.getCell(164).getStringCellValue())? Integer.parseInt(row.getCell(164).getStringCellValue()) : 0 );
        item.setFld163KrtBnkZaimNchl(CheckInt.isNumeric(row.getCell(165).getStringCellValue())? Integer.parseInt(row.getCell(165).getStringCellValue()) : 0 );
        item.setFld164KrtBnkZaimKnc(CheckInt.isNumeric(row.getCell(166).getStringCellValue())? Integer.parseInt(row.getCell(166).getStringCellValue()) : 0 );
        item.setFld165ObzNlgNchl(CheckInt.isNumeric(row.getCell(167).getStringCellValue())? Integer.parseInt(row.getCell(167).getStringCellValue()) : 0 );
        item.setFld166ObzNlgKnc(CheckInt.isNumeric(row.getCell(168).getStringCellValue())? Integer.parseInt(row.getCell(168).getStringCellValue()) : 0 );
        item.setFld167KrtKrdZdlNchl(CheckInt.isNumeric(row.getCell(169).getStringCellValue())? Integer.parseInt(row.getCell(169).getStringCellValue()) : 0 );
        item.setFld168KrtKrdZdlKnc(CheckInt.isNumeric(row.getCell(170).getStringCellValue())? Integer.parseInt(row.getCell(170).getStringCellValue()) : 0 );
        item.setFld169PrObzNchl(CheckInt.isNumeric(row.getCell(171).getStringCellValue())? Integer.parseInt(row.getCell(171).getStringCellValue()) : 0 );
        item.setFld170PrObzKnc(CheckInt.isNumeric(row.getCell(172).getStringCellValue())? Integer.parseInt(row.getCell(172).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
