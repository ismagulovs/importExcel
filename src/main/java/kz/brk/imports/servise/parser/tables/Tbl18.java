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

        item.setFld051Vsego(CheckInt.cellToBigDecimal(row.getCell(53)));
        item.setFld052CorpPdhNlg(CheckInt.cellToBigDecimal(row.getCell(54)));
        item.setFld053IndPdhNlg(CheckInt.cellToBigDecimal(row.getCell(55)));
        item.setFld054SocNlg(CheckInt.cellToBigDecimal(row.getCell(56)));
        item.setFld055OtchSocStrh(CheckInt.cellToBigDecimal(row.getCell(57)));
        item.setFld056ZemNlg(CheckInt.cellToBigDecimal(row.getCell(58)));
        item.setFld057NlgImsh(CheckInt.cellToBigDecimal(row.getCell(59)));
        item.setFld058NlgTs(CheckInt.cellToBigDecimal(row.getCell(60)));
        item.setFld059NlgDobStm(CheckInt.cellToBigDecimal(row.getCell(61)));
        item.setFld060Akcz(CheckInt.cellToBigDecimal(row.getCell(62)));
        item.setFld061NlgSpecPlat(CheckInt.cellToBigDecimal(row.getCell(63)));
        item.setFld062NlgSvrhPrb(CheckInt.cellToBigDecimal(row.getCell(64)));
        item.setFld063PrSpecPlt(CheckInt.cellToBigDecimal(row.getCell(65)));
        item.setFld064DrObzPlat(CheckInt.cellToBigDecimal(row.getCell(66)));
        item.setFld065TmzhPlat(CheckInt.cellToBigDecimal(row.getCell(67)));
        item.setFld066PrchslObzVzn(CheckInt.cellToBigDecimal(row.getCell(68)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
