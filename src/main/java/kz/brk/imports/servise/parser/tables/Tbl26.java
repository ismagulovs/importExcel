package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl26KrtSrAktv;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl26 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl26KrtSrAktv item = new StcTbl26KrtSrAktv();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld119KrtAktvNchl(CheckInt.isNumeric(row.getCell(121).getStringCellValue())? Integer.parseInt(row.getCell(121).getStringCellValue()) : 0 );
        item.setFld120KrtAktvKnc(CheckInt.isNumeric(row.getCell(122).getStringCellValue())? Integer.parseInt(row.getCell(122).getStringCellValue()) : 0 );
        item.setFld121DnzhSrdNchl(CheckInt.isNumeric(row.getCell(123).getStringCellValue())? Integer.parseInt(row.getCell(123).getStringCellValue()) : 0 );
        item.setFld122DnzhSrdKnc(CheckInt.isNumeric(row.getCell(124).getStringCellValue())? Integer.parseInt(row.getCell(124).getStringCellValue()) : 0 );
        item.setFld123DnzhKssNchl(CheckInt.isNumeric(row.getCell(125).getStringCellValue())? Integer.parseInt(row.getCell(125).getStringCellValue()) : 0 );
        item.setFld124DnzhKssKnc(CheckInt.isNumeric(row.getCell(126).getStringCellValue())? Integer.parseInt(row.getCell(126).getStringCellValue()) : 0 );
        item.setFld125KrtFinInvNchl(CheckInt.isNumeric(row.getCell(127).getStringCellValue())? Integer.parseInt(row.getCell(127).getStringCellValue()) : 0 );
        item.setFld126KrtFinInvKnc(CheckInt.isNumeric(row.getCell(128).getStringCellValue())? Integer.parseInt(row.getCell(128).getStringCellValue()) : 0 );
        item.setFld127KrtDbtZdlNchl(CheckInt.isNumeric(row.getCell(129).getStringCellValue())? Integer.parseInt(row.getCell(129).getStringCellValue()) : 0 );
        item.setFld128KrtDbtZdlKnc(CheckInt.isNumeric(row.getCell(130).getStringCellValue())? Integer.parseInt(row.getCell(130).getStringCellValue()) : 0 );
        item.setFld129ZpsNchl(CheckInt.isNumeric(row.getCell(131).getStringCellValue())? Integer.parseInt(row.getCell(131).getStringCellValue()) : 0 );
        item.setFld130ZpsKnc(CheckInt.isNumeric(row.getCell(132).getStringCellValue())? Integer.parseInt(row.getCell(132).getStringCellValue()) : 0 );
        item.setFld131PrAktvNchl(CheckInt.isNumeric(row.getCell(133).getStringCellValue())? Integer.parseInt(row.getCell(133).getStringCellValue()) : 0 );
        item.setFld132PrAktvKnc(CheckInt.isNumeric(row.getCell(134).getStringCellValue())? Integer.parseInt(row.getCell(134).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
