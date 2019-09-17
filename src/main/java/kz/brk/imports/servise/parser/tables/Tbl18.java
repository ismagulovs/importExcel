package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl18NachNlgDrPlat;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl18 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl18NachNlgDrPlat item = new StcTbl18NachNlgDrPlat();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld051Vsego(CheckInt.isNumeric(row.getCell(53).getStringCellValue())? Integer.parseInt(row.getCell(53).getStringCellValue()) : 0 );
        item.setFld052CorpPdhNlg(CheckInt.isNumeric(row.getCell(54).getStringCellValue())? Integer.parseInt(row.getCell(54).getStringCellValue()) : 0 );
        item.setFld053IndPdhNlg(CheckInt.isNumeric(row.getCell(55).getStringCellValue())? Integer.parseInt(row.getCell(55).getStringCellValue()) : 0 );
        item.setFld054SocNlg(CheckInt.isNumeric(row.getCell(56).getStringCellValue())? Integer.parseInt(row.getCell(56).getStringCellValue()) : 0 );
        item.setFld055OtchSocStrh(CheckInt.isNumeric(row.getCell(57).getStringCellValue())? Integer.parseInt(row.getCell(57).getStringCellValue()) : 0 );
        item.setFld056ZemNlg(CheckInt.isNumeric(row.getCell(58).getStringCellValue())? Integer.parseInt(row.getCell(58).getStringCellValue()) : 0 );
        item.setFld057NlgImsh(CheckInt.isNumeric(row.getCell(59).getStringCellValue())? Integer.parseInt(row.getCell(59).getStringCellValue()) : 0 );
        item.setFld058NlgTs(CheckInt.isNumeric(row.getCell(60).getStringCellValue())? Integer.parseInt(row.getCell(60).getStringCellValue()) : 0 );
        item.setFld059NlgDobStm(CheckInt.isNumeric(row.getCell(61).getStringCellValue())? Integer.parseInt(row.getCell(61).getStringCellValue()) : 0 );
        item.setFld060Akcz(CheckInt.isNumeric(row.getCell(62).getStringCellValue())? Integer.parseInt(row.getCell(62).getStringCellValue()) : 0 );
        item.setFld061NlgSpecPlat(CheckInt.isNumeric(row.getCell(63).getStringCellValue())? Integer.parseInt(row.getCell(63).getStringCellValue()) : 0 );
        item.setFld062NlgSvrhPrb(CheckInt.isNumeric(row.getCell(64).getStringCellValue())? Integer.parseInt(row.getCell(64).getStringCellValue()) : 0 );
        item.setFld063PrSpecPlt(CheckInt.isNumeric(row.getCell(65).getStringCellValue())? Integer.parseInt(row.getCell(65).getStringCellValue()) : 0 );
        item.setFld064DrObzPlat(CheckInt.isNumeric(row.getCell(66).getStringCellValue())? Integer.parseInt(row.getCell(66).getStringCellValue()) : 0 );
        item.setFld065TmzhPlat(CheckInt.isNumeric(row.getCell(67).getStringCellValue())? Integer.parseInt(row.getCell(67).getStringCellValue()) : 0 );
        item.setFld066PrchslObzVzn(CheckInt.isNumeric(row.getCell(68).getStringCellValue())? Integer.parseInt(row.getCell(68).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
