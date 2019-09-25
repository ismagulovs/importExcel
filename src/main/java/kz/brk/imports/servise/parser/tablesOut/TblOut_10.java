package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl10RezFinHozDtlPrdp;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_10 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl10RezFinHozDtlPrdp> item = em.createQuery("select t " +
                "from StcTbl10RezFinHozDtlPrdp t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(39).setCellValue(item.get(0).getFld037ValPrb().toString());
        row.createCell(40).setCellValue(item.get(0).getFld038RashRlzcPu().toString());
        row.createCell(41).setCellValue(item.get(0).getFld039AdmRash().toString());
        row.createCell(42).setCellValue(item.get(0).getFld040RashFin().toString());
        row.createCell(43).setCellValue(item.get(0).getFld041PrRash().toString());
        row.createCell(44).setCellValue(item.get(0).getFld042PrblUbtk().toString());
        row.createCell(45).setCellValue(item.get(0).getFld043RashCorpPn().toString());
        item.clear();
        em.clear();
    }
}
