package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl24BalancePrdp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl24 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl24BalancePrdp item = new StcTbl24BalancePrdp();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld105BlsAktvNchl(CheckInt.isNumeric(row.getCell(107).getStringCellValue())? Integer.parseInt(row.getCell(107).getStringCellValue()) : 0 );
        item.setFld106BlsAktvKnc(CheckInt.isNumeric(row.getCell(108).getStringCellValue())? Integer.parseInt(row.getCell(108).getStringCellValue()) : 0 );
        item.setFld107KrtAktvNchl(CheckInt.isNumeric(row.getCell(109).getStringCellValue())? Integer.parseInt(row.getCell(109).getStringCellValue()) : 0 );
        item.setFld108KrtAktvKnc(CheckInt.isNumeric(row.getCell(110).getStringCellValue())? Integer.parseInt(row.getCell(110).getStringCellValue()) : 0 );
        item.setFld109DlgAktvNchl(CheckInt.isNumeric(row.getCell(111).getStringCellValue())? Integer.parseInt(row.getCell(111).getStringCellValue()) : 0 );
        item.setFld110DlgAktvKnc(CheckInt.isNumeric(row.getCell(112).getStringCellValue())? Integer.parseInt(row.getCell(112).getStringCellValue()) : 0 );
        item.setFld111BlsObzNchl(CheckInt.isNumeric(row.getCell(113).getStringCellValue())? Integer.parseInt(row.getCell(113).getStringCellValue()) : 0 );
        item.setFld112BlsObzKnc(CheckInt.isNumeric(row.getCell(114).getStringCellValue())? Integer.parseInt(row.getCell(114).getStringCellValue()) : 0 );
        item.setFld113KrtObzNchl(CheckInt.isNumeric(row.getCell(115).getStringCellValue())? Integer.parseInt(row.getCell(115).getStringCellValue()) : 0 );
        item.setFld114KrtObzKnc(CheckInt.isNumeric(row.getCell(116).getStringCellValue())? Integer.parseInt(row.getCell(116).getStringCellValue()) : 0 );
        item.setFld115DlgObzNchl(CheckInt.isNumeric(row.getCell(117).getStringCellValue())? Integer.parseInt(row.getCell(117).getStringCellValue()) : 0 );
        item.setFld116DlgObzKnc(CheckInt.isNumeric(row.getCell(118).getStringCellValue())? Integer.parseInt(row.getCell(118).getStringCellValue()) : 0 );
        item.setFld117KptlNchl(CheckInt.isNumeric(row.getCell(119).getStringCellValue())? Integer.parseInt(row.getCell(119).getStringCellValue()) : 0 );
        item.setFld118KptlKnc(CheckInt.isNumeric(row.getCell(120).getStringCellValue())? Integer.parseInt(row.getCell(120).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
