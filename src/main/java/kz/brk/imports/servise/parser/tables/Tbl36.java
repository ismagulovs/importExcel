package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl36Capital;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl36 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl36Capital item = new StcTbl36Capital();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld181CptlNchl(CheckInt.isNumeric(row.getCell(183).getStringCellValue())? Integer.parseInt(row.getCell(183).getStringCellValue()) : 0 );
        item.setFld182CptlKnc(CheckInt.isNumeric(row.getCell(184).getStringCellValue())? Integer.parseInt(row.getCell(184).getStringCellValue()) : 0 );
        item.setFld183UstvCptlNchl(CheckInt.isNumeric(row.getCell(185).getStringCellValue())? Integer.parseInt(row.getCell(185).getStringCellValue()) : 0 );
        item.setFld184UstvCptlKnc(CheckInt.isNumeric(row.getCell(186).getStringCellValue())? Integer.parseInt(row.getCell(186).getStringCellValue()) : 0 );
        item.setFld185NeoplCptlNchl(CheckInt.isNumeric(row.getCell(187).getStringCellValue())? Integer.parseInt(row.getCell(187).getStringCellValue()) : 0 );
        item.setFld186NeoplCptlKnc(CheckInt.isNumeric(row.getCell(188).getStringCellValue())? Integer.parseInt(row.getCell(188).getStringCellValue()) : 0 );
        item.setFld187VykupSbsDolInstrNchl(CheckInt.isNumeric(row.getCell(189).getStringCellValue())? Integer.parseInt(row.getCell(189).getStringCellValue()) : 0 );
        item.setFld188VykupSbsDolInstrKnc(CheckInt.isNumeric(row.getCell(190).getStringCellValue())? Integer.parseInt(row.getCell(190).getStringCellValue()) : 0 );
        item.setFld189EmissDhdNchl(CheckInt.isNumeric(row.getCell(191).getStringCellValue())? Integer.parseInt(row.getCell(191).getStringCellValue()) : 0 );
        item.setFld190EmissDhdKnc(CheckInt.isNumeric(row.getCell(192).getStringCellValue())? Integer.parseInt(row.getCell(192).getStringCellValue()) : 0 );
        item.setFld191RzvrNchl(CheckInt.isNumeric(row.getCell(193).getStringCellValue())? Integer.parseInt(row.getCell(193).getStringCellValue()) : 0 );
        item.setFld192RzvrKnc(CheckInt.isNumeric(row.getCell(194).getStringCellValue())? Integer.parseInt(row.getCell(194).getStringCellValue()) : 0 );
        item.setFld193NerasprPrbNchl(CheckInt.isNumeric(row.getCell(195).getStringCellValue())? Integer.parseInt(row.getCell(195).getStringCellValue()) : 0 );
        item.setFld194NerasprPrbKnc(CheckInt.isNumeric(row.getCell(196).getStringCellValue())? Integer.parseInt(row.getCell(196).getStringCellValue()) : 0 );
        item.setFld195DolMenshNchl(CheckInt.isNumeric(row.getCell(197).getStringCellValue())? Integer.parseInt(row.getCell(197).getStringCellValue()) : 0 );
        item.setFld196DolMenshKnc(CheckInt.isNumeric(row.getCell(198).getStringCellValue())? Integer.parseInt(row.getCell(198).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
