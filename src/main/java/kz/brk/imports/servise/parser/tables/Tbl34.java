package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl34DlgSrObz;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl34 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl34DlgSrObz item = new StcTbl34DlgSrObz();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld171DlgObzNchl(CheckInt.isNumeric(row.getCell(173).getStringCellValue())? Integer.parseInt(row.getCell(173).getStringCellValue()) : 0 );
        item.setFld172DlgObzKnc(CheckInt.isNumeric(row.getCell(174).getStringCellValue())? Integer.parseInt(row.getCell(174).getStringCellValue()) : 0 );
        item.setFld173DlgFinObzNchl(CheckInt.isNumeric(row.getCell(175).getStringCellValue())? Integer.parseInt(row.getCell(175).getStringCellValue()) : 0 );
        item.setFld174DlgFinObzKnc(CheckInt.isNumeric(row.getCell(176).getStringCellValue())? Integer.parseInt(row.getCell(176).getStringCellValue()) : 0 );
        item.setFld175DlgBnkZaimNchl(CheckInt.isNumeric(row.getCell(177).getStringCellValue())? Integer.parseInt(row.getCell(177).getStringCellValue()) : 0 );
        item.setFld176DlgBnkZaimKnc(CheckInt.isNumeric(row.getCell(178).getStringCellValue())? Integer.parseInt(row.getCell(178).getStringCellValue()) : 0 );
        item.setFld177DlgKrdZdlNchl(CheckInt.isNumeric(row.getCell(179).getStringCellValue())? Integer.parseInt(row.getCell(179).getStringCellValue()) : 0 );
        item.setFld178DlgKrdZdlKnc(CheckInt.isNumeric(row.getCell(180).getStringCellValue())? Integer.parseInt(row.getCell(180).getStringCellValue()) : 0 );
        item.setFld179PrObzNchl(CheckInt.isNumeric(row.getCell(181).getStringCellValue())? Integer.parseInt(row.getCell(181).getStringCellValue()) : 0 );
        item.setFld180PrObzKnc(CheckInt.isNumeric(row.getCell(182).getStringCellValue())? Integer.parseInt(row.getCell(182).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
