package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl28Zapasy;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_28 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;


    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl28Zapasy> item = em.createQuery("select t " +
                "from StcTbl28Zapasy t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(135).setCellValue(item.get(0).getFld133ZpsNchl().toString());
        row.createCell(136).setCellValue(item.get(0).getFld134ZpsKnc().toString());
        row.createCell(137).setCellValue(item.get(0).getFld135SrMtrlNchl().toString());
        row.createCell(138).setCellValue(item.get(0).getFld136SrMtrlKnc().toString());
        row.createCell(139).setCellValue(item.get(0).getFld137GtvPrdNchl().toString());
        row.createCell(140).setCellValue(item.get(0).getFld138GtvPrdKnc().toString());
        row.createCell(141).setCellValue(item.get(0).getFld139TvrNchl().toString());
        row.createCell(142).setCellValue(item.get(0).getFld140TvrKnc().toString());
        row.createCell(143).setCellValue(item.get(0).getFld141NzvrPrzvNchl().toString());
        row.createCell(144).setCellValue(item.get(0).getFld142NzvrPrzvKnc().toString());
        row.createCell(145).setCellValue(item.get(0).getFld143PrZpsNchl().toString());
        row.createCell(146).setCellValue(item.get(0).getFld144PrZpsKnc().toString());

        item.clear();
        em.clear();
    }
}
