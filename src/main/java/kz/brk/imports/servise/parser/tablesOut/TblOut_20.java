package kz.brk.imports.servise.parser.tablesOut;

import kz.brk.imports.model.StcTbl20FactPrchslNlgPlt;
import kz.brk.imports.model.StcTbl22SostVzmRschPrdp;
import kz.brk.imports.servise.parser.CheckInt;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
import java.util.List;

@Stateless
public class TblOut_20 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl20FactPrchslNlgPlt> item = em.createQuery("select t " +
                "from StcTbl20FactPrchslNlgPlt t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(69).setCellValue(item.get(0).getFld067Vse());
        row.createCell(70).setCellValue(item.get(0).getFld068CorpPdhNlg());
        row.createCell(71).setCellValue(item.get(0).getFld069IndPdhNlg());
        row.createCell(72).setCellValue(item.get(0).getFld070SocNlg());
        row.createCell(73).setCellValue(item.get(0).getFld071OtchSocStrh());
        row.createCell(74).setCellValue(item.get(0).getFld072ZemNlg());
        row.createCell(75).setCellValue(item.get(0).getFld073NlgImsh());
        row.createCell(76).setCellValue(item.get(0).getFld074NlgTs());
        row.createCell(77).setCellValue(item.get(0).getFld075NlgDobStm());
        row.createCell(78).setCellValue(item.get(0).getFld076Akcz());
        row.createCell(79).setCellValue(item.get(0).getFld077NlgSpecPlat());
        row.createCell(80).setCellValue(item.get(0).getFld078NlgSvrhPrb());
        row.createCell(81).setCellValue(item.get(0).getFld079PrSpecPlt());
        row.createCell(82).setCellValue(item.get(0).getFld080DrObzPlat());
        row.createCell(83).setCellValue(item.get(0).getFld081TmzhPlat());
        row.createCell(84).setCellValue(item.get(0).getFld082PrchslObzVzn());

        item.clear();
        em.clear();
    }
}
