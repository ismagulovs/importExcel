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
        row.createCell(69).setCellValue(item.get(0).getFld067Vse().toString());
        row.createCell(70).setCellValue(item.get(0).getFld068CorpPdhNlg().toString());
        row.createCell(71).setCellValue(item.get(0).getFld069IndPdhNlg().toString());
        row.createCell(72).setCellValue(item.get(0).getFld070SocNlg().toString());
        row.createCell(73).setCellValue(item.get(0).getFld071OtchSocStrh().toString());
        row.createCell(74).setCellValue(item.get(0).getFld072ZemNlg().toString());
        row.createCell(75).setCellValue(item.get(0).getFld073NlgImsh().toString());
        row.createCell(76).setCellValue(item.get(0).getFld074NlgTs().toString());
        row.createCell(77).setCellValue(item.get(0).getFld075NlgDobStm().toString());
        row.createCell(78).setCellValue(item.get(0).getFld076Akcz().toString());
        row.createCell(79).setCellValue(item.get(0).getFld077NlgSpecPlat().toString());
        row.createCell(80).setCellValue(item.get(0).getFld078NlgSvrhPrb().toString());
        row.createCell(81).setCellValue(item.get(0).getFld079PrSpecPlt().toString());
        row.createCell(82).setCellValue(item.get(0).getFld080DrObzPlat().toString());
        row.createCell(83).setCellValue(item.get(0).getFld081TmzhPlat().toString());
        row.createCell(84).setCellValue(item.get(0).getFld082PrchslObzVzn().toString());

        item.clear();
        em.clear();
    }
}
