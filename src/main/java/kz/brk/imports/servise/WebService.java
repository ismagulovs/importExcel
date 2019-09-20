package kz.brk.imports.servise;
/**
 * Created by ww on 02.03.2016.
 */

import kz.brk.imports.servise.parser.Parser;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

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
            res = parser.parse("C:\\Users\\SultanI\\work\\java\\a-aitkazin-brk_import_excel\\test_excel.xls")?"ok" :"false";
        }catch (Exception e){
            e.printStackTrace();
        }
        return Response.ok().entity(null).build();
    }

    @POST
    @Consumes("multipart/form-data")
    @Path("upload")
    public Response upload(MultipartFormDataInput input) {
        return Response.ok().entity(parser.parseExcel(input.getParts().get(0))).build();
    }
}