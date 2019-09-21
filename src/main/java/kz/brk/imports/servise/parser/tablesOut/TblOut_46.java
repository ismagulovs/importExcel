package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl46ValiutPozc;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_46 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl46ValiutPozc> item = em.createQuery("select t " +
                "from StcTbl46ValiutPozc t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(247).setCellValue(item.get(0).getFld245AktvInostrVlt());
        row.createCell(248).setCellValue(item.get(0).getFld246KrtAktvInostrVlt());
        row.createCell(249).setCellValue(item.get(0).getFld247DlgAktvInostrVlt());
        row.createCell(250).setCellValue(item.get(0).getFld248ObzInostrVlt());
        row.createCell(251).setCellValue(item.get(0).getFld249KrtObzInostrVlt());
        row.createCell(252).setCellValue(item.get(0).getFld250DlgObzInostrVlt());
        row.createCell(253).setCellValue(item.get(0).getFld251ChstPzcInostrVlt());
        item.clear();
        em.clear();
    }
}
