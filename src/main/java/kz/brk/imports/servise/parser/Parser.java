package kz.brk.imports.servise.parser;

import kz.brk.imports.servise.parser.tables.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@Stateless
public class Parser {
    @Inject Tbl00 tbl00; @Inject Tbl02 tbl02; @Inject Tbl03 tbl03; @Inject Tbl04 tbl04; @Inject Tbl05 tbl05;
    @Inject Tbl06 tbl06; @Inject Tbl08 tbl08; @Inject Tbl10 tbl10; @Inject Tbl12 tbl12; @Inject Tbl18 tbl18;
    @Inject Tbl20 tbl20; @Inject Tbl22 tbl22; @Inject Tbl24 tbl24; @Inject Tbl26 tbl26; @Inject Tbl28 tbl28;
    @Inject Tbl29 tbl29; @Inject Tbl32 tbl32; @Inject Tbl34 tbl34; @Inject Tbl36 tbl36; @Inject Tbl40 tbl40;
    @Inject Tbl42 tbl42; @Inject Tbl44 tbl44; @Inject Tbl46 tbl46;

    @Inject UpdateRelevance updateRelevance;

    public boolean parse(String name) {

//        try {
//            XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(name));
//            XSSFSheet sheetx = myExcelBook.getSheetAt(0);
//            System.out.println(sheetx.getRow(0).getCell(0).getCellType());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String result = "";
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new HSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            if(row.getRowNum() > 7) {
//                Iterator<Cell> cells = row.iterator();
                if(row.getCell(1).getStringCellValue().length() == 5){
                    tbl00.parseTbl(row);
                    tbl02.parseTbl(row);
                    tbl03.parseTbl(row);
                    tbl04.parseTbl(row);
                    tbl05.parseTbl(row);

                    tbl06.parseTbl(row);
                    tbl08.parseTbl(row);
                    tbl10.parseTbl(row);
                    tbl12.parseTbl(row);
                    tbl18.parseTbl(row);

                    tbl20.parseTbl(row);
                    tbl22.parseTbl(row);
                    tbl24.parseTbl(row);
                    tbl26.parseTbl(row);
                    tbl28.parseTbl(row);

                    tbl29.parseTbl(row);
                    tbl32.parseTbl(row);
                    tbl34.parseTbl(row);
                    tbl36.parseTbl(row);
                    tbl40.parseTbl(row);

                    tbl42.parseTbl(row);
                    tbl44.parseTbl(row);
                    tbl46.parseTbl(row);
//                    while (cells.hasNext()) {
//                        Cell cell = cells.next();
//                        int cellType = cell.getCellType();
//                        switch (cellType) {
//                            case Cell.CELL_TYPE_STRING:
//                                result += cell.getStringCellValue() + "|";
//                                break;
//                            case Cell.CELL_TYPE_NUMERIC:
//                                result += cell.getNumericCellValue() + "|";
//                                break;
//                            default:
//                                result += "|";
//                                break;
//                        }
//                    }
                }

                result += "\n";
            }
        }
        return true;
    }

    public String parseExcel(InputPart part){
        if(part.getMediaType().getSubtype().equals("vnd.ms-excel")){
            try {
                HSSFWorkbook workbook = new HSSFWorkbook(part.getBody(InputStream.class, null));
                Sheet sheet = workbook.getSheetAt(0);
                parseRow(sheet);
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(part.getMediaType().getSubtype().equals("vnd.openxmlformats-officedocument.spreadsheetml.sheet")){
            try {
                XSSFWorkbook workbook = new XSSFWorkbook(part.getBody(InputStream.class, null));
                Sheet sheet = workbook.getSheetAt(0);
                parseRow(sheet);
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ok";
    }

    private void parseRow(Sheet sheet){

        updateRelevance.update();

        for(Row row: sheet){
            if(row.getRowNum() > 7) {
                if(row.getCell(1) != null){
                    if (row.getCell(1).getStringCellValue().length() == 5) {
                        System.out.println(row.getRowNum());
                        tbl00.parseTbl(row);
                        tbl02.parseTbl(row);
                        tbl03.parseTbl(row);
                        tbl04.parseTbl(row);
                        tbl05.parseTbl(row);

                        tbl06.parseTbl(row);
                        tbl08.parseTbl(row);
                        tbl10.parseTbl(row);
                        tbl12.parseTbl(row);
                        tbl18.parseTbl(row);

                        tbl20.parseTbl(row);
                        tbl22.parseTbl(row);
                        tbl24.parseTbl(row);
                        tbl26.parseTbl(row);
                        tbl28.parseTbl(row);

                        tbl29.parseTbl(row);
                        tbl32.parseTbl(row);
                        tbl34.parseTbl(row);
                        tbl36.parseTbl(row);
                        tbl40.parseTbl(row);

                        tbl42.parseTbl(row);
                        tbl44.parseTbl(row);
                        tbl46.parseTbl(row);
                    }
                }
            }
        }
    }

}
