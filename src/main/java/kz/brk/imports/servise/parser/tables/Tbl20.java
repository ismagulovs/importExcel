package kz.brk.imports.servise.parser.tables;

import kz.brk.imports.model.StcTbl20FactPrchslNlgPlt;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
@Stateless
public class Tbl20 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTbl(Row row) {
        StcTbl20FactPrchslNlgPlt item = new StcTbl20FactPrchslNlgPlt();
        item.setGod(Calendar.getInstance().get(Calendar.YEAR));
        item.setIdSubclass(CheckInt.isNumeric(row.getCell(1).getStringCellValue())?row.getCell(1).getStringCellValue():"0");

        item.setFld067Vse(CheckInt.cellToBigDecimal(row.getCell(69)));
        item.setFld068CorpPdhNlg(CheckInt.cellToBigDecimal(row.getCell(70)));
        item.setFld069IndPdhNlg(CheckInt.cellToBigDecimal(row.getCell(71)));
        item.setFld070SocNlg(CheckInt.cellToBigDecimal(row.getCell(72)));
        item.setFld071OtchSocStrh(CheckInt.cellToBigDecimal(row.getCell(73)));
        item.setFld072ZemNlg(CheckInt.cellToBigDecimal(row.getCell(74)));
        item.setFld073NlgImsh(CheckInt.cellToBigDecimal(row.getCell(75)));
        item.setFld074NlgTs(CheckInt.cellToBigDecimal(row.getCell(76)));
        item.setFld075NlgDobStm(CheckInt.cellToBigDecimal(row.getCell(77)));
        item.setFld076Akcz(CheckInt.cellToBigDecimal(row.getCell(78)));
        item.setFld077NlgSpecPlat(CheckInt.cellToBigDecimal(row.getCell(79)));
        item.setFld078NlgSvrhPrb(CheckInt.cellToBigDecimal(row.getCell(80)));
        item.setFld079PrSpecPlt(CheckInt.cellToBigDecimal(row.getCell(81)));
        item.setFld080DrObzPlat(CheckInt.cellToBigDecimal(row.getCell(82)));
        item.setFld081TmzhPlat(CheckInt.cellToBigDecimal(row.getCell(83)));
        item.setFld082PrchslObzVzn(CheckInt.cellToBigDecimal(row.getCell(84)));

        em.persist(item);
        em.flush();
        em.clear();
    }
}
