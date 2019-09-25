package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl18NachNlgDrPlat;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_18 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl18NachNlgDrPlat> item = em.createQuery("select t " +
                "from StcTbl18NachNlgDrPlat t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(53).setCellValue(item.get(0).getFld051Vsego().toString());
        row.createCell(54).setCellValue(item.get(0).getFld052CorpPdhNlg().toString());
        row.createCell(55).setCellValue(item.get(0).getFld053IndPdhNlg().toString());
        row.createCell(56).setCellValue(item.get(0).getFld054SocNlg().toString());
        row.createCell(57).setCellValue(item.get(0).getFld055OtchSocStrh().toString());
        row.createCell(58).setCellValue(item.get(0).getFld056ZemNlg().toString());
        row.createCell(59).setCellValue(item.get(0).getFld057NlgImsh().toString());
        row.createCell(60).setCellValue(item.get(0).getFld058NlgTs().toString());
        row.createCell(61).setCellValue(item.get(0).getFld059NlgDobStm().toString());
        row.createCell(62).setCellValue(item.get(0).getFld060Akcz().toString());
        row.createCell(63).setCellValue(item.get(0).getFld061NlgSpecPlat().toString());
        row.createCell(64).setCellValue(item.get(0).getFld062NlgSvrhPrb().toString());
        row.createCell(65).setCellValue(item.get(0).getFld063PrSpecPlt().toString());
        row.createCell(66).setCellValue(item.get(0).getFld064DrObzPlat().toString());
        row.createCell(67).setCellValue(item.get(0).getFld065TmzhPlat().toString());
        row.createCell(68).setCellValue(item.get(0).getFld066PrchslObzVzn().toString());
        item.clear();
        em.clear();
    }
}
