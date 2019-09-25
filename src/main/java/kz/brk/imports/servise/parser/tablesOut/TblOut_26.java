package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl26KrtSrAktv;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_26 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;


    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl26KrtSrAktv> item = em.createQuery("select t " +
                "from StcTbl26KrtSrAktv t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(121).setCellValue(item.get(0).getFld119KrtAktvNchl().toString());
        row.createCell(122).setCellValue(item.get(0).getFld120KrtAktvKnc().toString());
        row.createCell(123).setCellValue(item.get(0).getFld121DnzhSrdNchl().toString());
        row.createCell(124).setCellValue(item.get(0).getFld122DnzhSrdKnc().toString());
        row.createCell(125).setCellValue(item.get(0).getFld123DnzhKssNchl().toString());
        row.createCell(126).setCellValue(item.get(0).getFld124DnzhKssKnc().toString());
        row.createCell(127).setCellValue(item.get(0).getFld125KrtFinInvNchl().toString());
        row.createCell(128).setCellValue(item.get(0).getFld126KrtFinInvKnc().toString());
        row.createCell(129).setCellValue(item.get(0).getFld127KrtDbtZdlNchl().toString());
        row.createCell(130).setCellValue(item.get(0).getFld128KrtDbtZdlKnc().toString());
        row.createCell(131).setCellValue(item.get(0).getFld129ZpsNchl().toString());
        row.createCell(132).setCellValue(item.get(0).getFld130ZpsKnc().toString());
        row.createCell(133).setCellValue(item.get(0).getFld131PrAktvNchl().toString());
        row.createCell(134).setCellValue(item.get(0).getFld132PrAktvKnc().toString());

        item.clear();
        em.clear();
    }
}
