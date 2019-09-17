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

        item.setFld067Vse(CheckInt.isNumeric(row.getCell(69).getStringCellValue())? Integer.parseInt(row.getCell(69).getStringCellValue()) : 0 );
        item.setFld068CorpPdhNlg(CheckInt.isNumeric(row.getCell(70).getStringCellValue())? Integer.parseInt(row.getCell(70).getStringCellValue()) : 0 );
        item.setFld069IndPdhNlg(CheckInt.isNumeric(row.getCell(71).getStringCellValue())? Integer.parseInt(row.getCell(71).getStringCellValue()) : 0 );
        item.setFld070SocNlg(CheckInt.isNumeric(row.getCell(72).getStringCellValue())? Integer.parseInt(row.getCell(72).getStringCellValue()) : 0 );
        item.setFld071OtchSocStrh(CheckInt.isNumeric(row.getCell(73).getStringCellValue())? Integer.parseInt(row.getCell(73).getStringCellValue()) : 0 );
        item.setFld072ZemNlg(CheckInt.isNumeric(row.getCell(74).getStringCellValue())? Integer.parseInt(row.getCell(74).getStringCellValue()) : 0 );
        item.setFld073NlgImsh(CheckInt.isNumeric(row.getCell(75).getStringCellValue())? Integer.parseInt(row.getCell(75).getStringCellValue()) : 0 );
        item.setFld074NlgTs(CheckInt.isNumeric(row.getCell(76).getStringCellValue())? Integer.parseInt(row.getCell(76).getStringCellValue()) : 0 );
        item.setFld075NlgDobStm(CheckInt.isNumeric(row.getCell(77).getStringCellValue())? Integer.parseInt(row.getCell(77).getStringCellValue()) : 0 );
        item.setFld076Akcz(CheckInt.isNumeric(row.getCell(78).getStringCellValue())? Integer.parseInt(row.getCell(78).getStringCellValue()) : 0 );
        item.setFld077NlgSpecPlat(CheckInt.isNumeric(row.getCell(79).getStringCellValue())? Integer.parseInt(row.getCell(79).getStringCellValue()) : 0 );
        item.setFld078NlgSvrhPrb(CheckInt.isNumeric(row.getCell(80).getStringCellValue())? Integer.parseInt(row.getCell(80).getStringCellValue()) : 0 );
        item.setFld079PrSpecPlt(CheckInt.isNumeric(row.getCell(81).getStringCellValue())? Integer.parseInt(row.getCell(81).getStringCellValue()) : 0 );
        item.setFld080DrObzPlat(CheckInt.isNumeric(row.getCell(82).getStringCellValue())? Integer.parseInt(row.getCell(82).getStringCellValue()) : 0 );
        item.setFld081TmzhPlat(CheckInt.isNumeric(row.getCell(83).getStringCellValue())? Integer.parseInt(row.getCell(83).getStringCellValue()) : 0 );
        item.setFld082PrchslObzVzn(CheckInt.isNumeric(row.getCell(84).getStringCellValue())? Integer.parseInt(row.getCell(84).getStringCellValue()) : 0 );

        em.persist(item);
    }
}
