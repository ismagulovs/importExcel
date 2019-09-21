package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl02OsnPkzFinHozDtlst;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class TblOut_02 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl02OsnPkzFinHozDtlst> item = em.createQuery("select t " +
                "from StcTbl02OsnPkzFinHozDtlst t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(3).setCellValue(item.get(0).getFld001OjmPrzvPrdUsl());
        row.createCell(4).setCellValue(item.get(0).getFld002DhdRlzcPrdUsl());
        row.createCell(5).setCellValue(item.get(0).getFld003SbstRzlPrdUsl());
        row.createCell(6).setCellValue(item.get(0).getFld004PrbNlg());
        row.createCell(7).setCellValue(item.get(0).getFld005RentPrzv().toString());
        item.clear();
        em.clear();
    }
}
