package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl24BalancePrdp;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_24 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl24BalancePrdp> item = em.createQuery("select t " +
                "from StcTbl24BalancePrdp t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(107).setCellValue(item.get(0).getFld105BlsAktvNchl().toString());
        row.createCell(108).setCellValue(item.get(0).getFld106BlsAktvKnc().toString());
        row.createCell(109).setCellValue(item.get(0).getFld107KrtAktvNchl().toString());
        row.createCell(110).setCellValue(item.get(0).getFld108KrtAktvKnc().toString());
        row.createCell(111).setCellValue(item.get(0).getFld109DlgAktvNchl().toString());
        row.createCell(112).setCellValue(item.get(0).getFld110DlgAktvKnc().toString());
        row.createCell(113).setCellValue(item.get(0).getFld111BlsObzNchl().toString());
        row.createCell(114).setCellValue(item.get(0).getFld112BlsObzKnc().toString());
        row.createCell(115).setCellValue(item.get(0).getFld113KrtObzNchl().toString());
        row.createCell(116).setCellValue(item.get(0).getFld114KrtObzKnc().toString());
        row.createCell(117).setCellValue(item.get(0).getFld115DlgObzNchl().toString());
        row.createCell(118).setCellValue(item.get(0).getFld116DlgObzKnc().toString());
        row.createCell(119).setCellValue(item.get(0).getFld117KptlNchl().toString());
        row.createCell(120).setCellValue(item.get(0).getFld118KptlKnc().toString());

        item.clear();
        em.clear();
    }
}
