package kz.brk.imports.servise.parser.tablesOut;
import kz.brk.imports.model.StcTbl22SostVzmRschPrdp;
import org.apache.poi.ss.usermodel.Row;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TblOut_22 {
    @PersistenceContext(name="brk-imports")
    EntityManager em;

    public void parseTblOut(Row row, String idSubclass) {

        List<StcTbl22SostVzmRschPrdp> item = em.createQuery("select t " +
                "from StcTbl22SostVzmRschPrdp t where t.relevance=1 and t.idSubclass = :idSubclass")
                .setParameter("idSubclass", idSubclass)
                .getResultList();
        row.createCell(85).setCellValue(item.get(0).getFld083DbtZdlVse().toString());
        row.createCell(86).setCellValue(item.get(0).getFld084DbtZdlPrsr().toString());
        row.createCell(87).setCellValue(item.get(0).getFld085ZdlPkpZkzVse().toString());
        row.createCell(88).setCellValue(item.get(0).getFld086ZdlPkpZkzPrsr().toString());
        row.createCell(89).setCellValue(item.get(0).getFld087PrDbtZdlVse().toString());
        row.createCell(90).setCellValue(item.get(0).getFld088PrDbtZdlPrsr().toString());
        row.createCell(91).setCellValue(item.get(0).getFld089ZdlObzVse().toString());
        row.createCell(92).setCellValue(item.get(0).getFld090ZdlObzPrsr().toString());
        row.createCell(93).setCellValue(item.get(0).getFld091RschPstPdrVse().toString());
        row.createCell(94).setCellValue(item.get(0).getFld092RschPstPdrPrsr().toString());
        row.createCell(95).setCellValue(item.get(0).getFld093NlgDrObzPlatVse().toString());
        row.createCell(96).setCellValue(item.get(0).getFld094NlgDrObzPlatPrsr().toString());
        row.createCell(97).setCellValue(item.get(0).getFld095PrchObzPensVznVse().toString());
        row.createCell(98).setCellValue(item.get(0).getFld096PrchObzPensVznPrsr().toString());
        row.createCell(99).setCellValue(item.get(0).getFld097ZaimBankVse().toString());
        row.createCell(100).setCellValue(item.get(0).getFld098ZaimBankPrsr().toString());
        row.createCell(101).setCellValue(item.get(0).getFld099PrZaimVse().toString());
        row.createCell(102).setCellValue(item.get(0).getFld100PrZaimPrsr().toString());
        row.createCell(103).setCellValue(item.get(0).getFld101PrKrdZdlVse().toString());
        row.createCell(104).setCellValue(item.get(0).getFld102PrKrdZdlPrsr().toString());
        row.createCell(105).setCellValue(item.get(0).getFld103ZdlOplTrdVse().toString());
        row.createCell(106).setCellValue(item.get(0).getFld104ZdlOplTrdPrsr().toString());

        item.clear();
        em.clear();
    }
}
