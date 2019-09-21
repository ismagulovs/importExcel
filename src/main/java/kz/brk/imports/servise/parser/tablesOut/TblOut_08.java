package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl08ObshRashPredp;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_08 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl08ObshRashPredp> item = em.createQuery("select t " +
                "from StcTbl08ObshRashPredp t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(30).setCellValue(item.get(0).getFld028Vsego());
        row.createCell(31).setCellValue(item.get(0).getFld029PrzvRhd());
        row.createCell(32).setCellValue(item.get(0).getFld030MatZatr());
        row.createCell(33).setCellValue(item.get(0).getFld031AmrtOsnSr());
        row.createCell(34).setCellValue(item.get(0).getFld032AmrtNemat());
        row.createCell(35).setCellValue(item.get(0).getFld033FondZpr());
        row.createCell(36).setCellValue(item.get(0).getFld034DenPsbRab());
        row.createCell(37).setCellValue(item.get(0).getFld035PrZtr());
        row.createCell(38).setCellValue(item.get(0).getFld036NeprzvRsh());
        item.clear();
        em.clear();
    }
}
