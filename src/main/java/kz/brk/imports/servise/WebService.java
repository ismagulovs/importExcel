package kz.brk.imports.servise;
/**
 * Created by ww on 02.03.2016.
 */

import kz.brk.imports.servise.parser.Parser;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Path("/")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
@Stateless
public class WebService {
    @Inject
    Parser parser;

    @GET
    @Consumes("application/json;charset=UTF-8")
    @Path("loadExcel")
    public Response getPotokDateList() {
        String res;
        try{
            res = parser.parse("C:\\distr\\my files\\БРК\\projects\\importExcel\\test_excel.xls")?"ok" :"false";
        }catch (Exception e){
            e.printStackTrace();
        }
        return Response.ok().entity(null).build();
    }

    @POST
    @Consumes("multipart/form-data")
    @Path("upload")
    public Response upload(MultipartFormDataInput input) {
        for (InputPart part : input.getParts()) {
            parser.parseExcel(part);
        }
        return Response.ok().entity(null).build();
    }
}