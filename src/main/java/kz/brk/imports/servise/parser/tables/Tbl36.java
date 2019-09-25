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

        item.setFld181CptlNchl(CheckInt.cellToBigDecimal(row.getCell(183)));
        item.setFld182CptlKnc(CheckInt.cellToBigDecimal(row.getCell(184)));
        item.setFld183UstvCptlNchl(CheckInt.cellToBigDecimal(row.getCell(185)));
        item.setFld184UstvCptlKnc(CheckInt.cellToBigDecimal(row.getCell(186)));
        item.setFld185NeoplCptlNchl(CheckInt.cellToBigDecimal(row.getCell(187)));
        item.setFld186NeoplCptlKnc(CheckInt.cellToBigDecimal(row.getCell(188)));
        item.setFld187VykupSbsDolInstrNchl(CheckInt.cellToBigDecimal(row.getCell(189)));
        item.setFld188VykupSbsDolInstrKnc(CheckInt.cellToBigDecimal(row.getCell(190)));
        item.setFld189EmissDhdNchl(CheckInt.cellToBigDecimal(row.getCell(191)));
        item.setFld190EmissDhdKnc(CheckInt.cellToBigDecimal(row.getCell(192)));
        item.setFld191RzvrNchl(CheckInt.cellToBigDecimal(row.getCell(193)));
        item.setFld192RzvrKnc(CheckInt.cellToBigDecimal(row.getCell(194)));
        item.setFld193NerasprPrbNchl(CheckInt.cellToBigDecimal(row.getCell(195)));
        item.setFld194NerasprPrbKnc(CheckInt.cellToBigDecimal(row.getCell(196)));
        item.setFld195DolMenshNchl(CheckInt.cellToBigDecimal(row.getCell(197)));
        item.setFld196DolMenshKnc(CheckInt.cellToBigDecimal(row.getCell(198)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
