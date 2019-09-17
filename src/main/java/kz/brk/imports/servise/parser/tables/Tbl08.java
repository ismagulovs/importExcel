package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl08ObshRashPredp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl08 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl08ObshRashPredp item = new StcTbl08ObshRashPredp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld028Vsego(CheckInt.isNumeric(row.getCell(30).getStringCellValue())? Integer.parseInt(row.getCell(30).getStringCellValue()) : 0 );
        item.setFld029PrzvRhd(CheckInt.isNumeric(row.getCell(31).getStringCellValue())? Integer.parseInt(row.getCell(31).getStringCellValue()) : 0 );
        item.setFld030MatZatr(CheckInt.isNumeric(row.getCell(32).getStringCellValue())? Integer.parseInt(row.getCell(32).getStringCellValue()) : 0 );
        item.setFld031AmrtOsnSr(CheckInt.isNumeric(row.getCell(33).getStringCellValue())? Integer.parseInt(row.getCell(33).getStringCellValue()) : 0 );
        item.setFld032AmrtNemat(CheckInt.isNumeric(row.getCell(34).getStringCellValue())? Integer.parseInt(row.getCell(34).getStringCellValue()) : 0 );
        item.setFld033FondZpr(CheckInt.isNumeric(row.getCell(35).getStringCellValue())? Integer.parseInt(row.getCell(35).getStringCellValue()) : 0 );
        item.setFld034DenPsbRab(CheckInt.isNumeric(row.getCell(36).getStringCellValue())? Integer.parseInt(row.getCell(36).getStringCellValue()) : 0 );
        item.setFld035PrZtr(CheckInt.isNumeric(row.getCell(37).getStringCellValue())? Integer.parseInt(row.getCell(37).getStringCellValue()) : 0 );
        item.setFld036NeprzvRsh(CheckInt.isNumeric(row.getCell(38).getStringCellValue())? Integer.parseInt(row.getCell(38).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
