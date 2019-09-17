package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl12GrpPredpDhdUbtk;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl12 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl12GrpPredpDhdUbtk item = new StcTbl12GrpPredpDhdUbtk();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld044ObshKolPrdp(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld045KolPrdpPrb(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld046PrcnObshKolPrb(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld047SumPrb(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld048KolPrdpUbtk(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld049PrcnObshKolUbtk(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );
        item.setFld050SumUbtk(CheckInt.isNumeric(row.getCell(23).getStringCellValue())? Integer.parseInt(row.getCell(23).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
