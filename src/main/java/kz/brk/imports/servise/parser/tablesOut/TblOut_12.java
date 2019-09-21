package kz.brk.imports.servise.parser.tablesOut;

import kz.brk.imports.model.StcTbl12GrpPredpDhdUbtk;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_12 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl12GrpPredpDhdUbtk> item = em.createQuery("select t " +
                "from StcTbl12GrpPredpDhdUbtk t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(46).setCellValue(item.get(0).getFld044ObshKolPrdp());
        row.createCell(47).setCellValue(item.get(0).getFld045KolPrdpPrb());
        row.createCell(48).setCellValue(item.get(0).getFld046PrcnObshKolPrb().toString());
        row.createCell(49).setCellValue(item.get(0).getFld047SumPrb());
        row.createCell(50).setCellValue(item.get(0).getFld048KolPrdpUbtk());
        row.createCell(51).setCellValue(item.get(0).getFld049PrcnObshKolUbtk().toString());
        row.createCell(52).setCellValue(item.get(0).getFld050SumUbtk());
        item.clear();
        em.clear();
    }
}
