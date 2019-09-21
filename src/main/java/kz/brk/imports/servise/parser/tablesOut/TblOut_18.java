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
        row.createCell(53).setCellValue(item.get(0).getFld051Vsego());
        row.createCell(54).setCellValue(item.get(0).getFld052CorpPdhNlg());
        row.createCell(55).setCellValue(item.get(0).getFld053IndPdhNlg());
        row.createCell(56).setCellValue(item.get(0).getFld054SocNlg());
        row.createCell(57).setCellValue(item.get(0).getFld055OtchSocStrh());
        row.createCell(58).setCellValue(item.get(0).getFld056ZemNlg());
        row.createCell(59).setCellValue(item.get(0).getFld057NlgImsh());
        row.createCell(60).setCellValue(item.get(0).getFld058NlgTs());
        row.createCell(61).setCellValue(item.get(0).getFld059NlgDobStm());
        row.createCell(62).setCellValue(item.get(0).getFld060Akcz());
        row.createCell(63).setCellValue(item.get(0).getFld061NlgSpecPlat());
        row.createCell(64).setCellValue(item.get(0).getFld062NlgSvrhPrb());
        row.createCell(65).setCellValue(item.get(0).getFld063PrSpecPlt());
        row.createCell(66).setCellValue(item.get(0).getFld064DrObzPlat());
        row.createCell(67).setCellValue(item.get(0).getFld065TmzhPlat());
        row.createCell(68).setCellValue(item.get(0).getFld066PrchslObzVzn());
        item.clear();
        em.clear();
    }
}
