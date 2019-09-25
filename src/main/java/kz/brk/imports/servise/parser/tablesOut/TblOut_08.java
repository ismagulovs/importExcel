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
        row.createCell(30).setCellValue(item.get(0).getFld028Vsego().toString());
        row.createCell(31).setCellValue(item.get(0).getFld029PrzvRhd().toString());
        row.createCell(32).setCellValue(item.get(0).getFld030MatZatr().toString());
        row.createCell(33).setCellValue(item.get(0).getFld031AmrtOsnSr().toString());
        row.createCell(34).setCellValue(item.get(0).getFld032AmrtNemat().toString());
        row.createCell(35).setCellValue(item.get(0).getFld033FondZpr().toString());
        row.createCell(36).setCellValue(item.get(0).getFld034DenPsbRab().toString());
        row.createCell(37).setCellValue(item.get(0).getFld035PrZtr().toString());
        row.createCell(38).setCellValue(item.get(0).getFld036NeprzvRsh().toString());
        item.clear();
        em.clear();
    }
}
