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
        row.createCell(39).setCellValue(item.get(0).getFld037ValPrb());
        row.createCell(40).setCellValue(item.get(0).getFld038RashRlzcPu());
        row.createCell(41).setCellValue(item.get(0).getFld039AdmRash());
        row.createCell(42).setCellValue(item.get(0).getFld040RashFin());
        row.createCell(43).setCellValue(item.get(0).getFld041PrRash());
        row.createCell(44).setCellValue(item.get(0).getFld042PrblUbtk());
        row.createCell(45).setCellValue(item.get(0).getFld043RashCorpPn());
        item.clear();
        em.clear();
    }
}
