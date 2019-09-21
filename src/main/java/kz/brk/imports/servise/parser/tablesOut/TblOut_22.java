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
        row.createCell(85).setCellValue(item.get(0).getFld083DbtZdlVse());
        row.createCell(86).setCellValue(item.get(0).getFld084DbtZdlPrsr());
        row.createCell(87).setCellValue(item.get(0).getFld085ZdlPkpZkzVse());
        row.createCell(88).setCellValue(item.get(0).getFld086ZdlPkpZkzPrsr());
        row.createCell(89).setCellValue(item.get(0).getFld087PrDbtZdlVse());
        row.createCell(90).setCellValue(item.get(0).getFld088PrDbtZdlPrsr());
        row.createCell(91).setCellValue(item.get(0).getFld089ZdlObzVse());
        row.createCell(92).setCellValue(item.get(0).getFld090ZdlObzPrsr());
        row.createCell(93).setCellValue(item.get(0).getFld091RschPstPdrVse());
        row.createCell(94).setCellValue(item.get(0).getFld092RschPstPdrPrsr());
        row.createCell(95).setCellValue(item.get(0).getFld093NlgDrObzPlatVse());
        row.createCell(96).setCellValue(item.get(0).getFld094NlgDrObzPlatPrsr());
        row.createCell(97).setCellValue(item.get(0).getFld095PrchObzPensVznVse());
        row.createCell(98).setCellValue(item.get(0).getFld096PrchObzPensVznPrsr());
        row.createCell(99).setCellValue(item.get(0).getFld097ZaimBankVse());
        row.createCell(100).setCellValue(item.get(0).getFld098ZaimBankPrsr());
        row.createCell(101).setCellValue(item.get(0).getFld099PrZaimVse());
        row.createCell(102).setCellValue(item.get(0).getFld100PrZaimPrsr());
        row.createCell(103).setCellValue(item.get(0).getFld101PrKrdZdlVse());
        row.createCell(104).setCellValue(item.get(0).getFld102PrKrdZdlPrsr());
        row.createCell(105).setCellValue(item.get(0).getFld103ZdlOplTrdVse());
        row.createCell(106).setCellValue(item.get(0).getFld104ZdlOplTrdPrsr());

        item.clear();
        em.clear();
    }
}
