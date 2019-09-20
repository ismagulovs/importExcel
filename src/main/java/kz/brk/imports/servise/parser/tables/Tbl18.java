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

        item.setFld051Vsego(CheckInt.cellToInt(row.getCell(53)));
        item.setFld052CorpPdhNlg(CheckInt.cellToInt(row.getCell(54)));
        item.setFld053IndPdhNlg(CheckInt.cellToInt(row.getCell(55)));
        item.setFld054SocNlg(CheckInt.cellToInt(row.getCell(56)));
        item.setFld055OtchSocStrh(CheckInt.cellToInt(row.getCell(57)));
        item.setFld056ZemNlg(CheckInt.cellToInt(row.getCell(58)));
        item.setFld057NlgImsh(CheckInt.cellToInt(row.getCell(59)));
        item.setFld058NlgTs(CheckInt.cellToInt(row.getCell(60)));
        item.setFld059NlgDobStm(CheckInt.cellToInt(row.getCell(61)));
        item.setFld060Akcz(CheckInt.cellToInt(row.getCell(62)));
        item.setFld061NlgSpecPlat(CheckInt.cellToInt(row.getCell(63)));
        item.setFld062NlgSvrhPrb(CheckInt.cellToInt(row.getCell(64)));
        item.setFld063PrSpecPlt(CheckInt.cellToInt(row.getCell(65)));
        item.setFld064DrObzPlat(CheckInt.cellToInt(row.getCell(66)));
        item.setFld065TmzhPlat(CheckInt.cellToInt(row.getCell(67)));
        item.setFld066PrchslObzVzn(CheckInt.cellToInt(row.getCell(68)));

        em.persist(item);
    }
}
