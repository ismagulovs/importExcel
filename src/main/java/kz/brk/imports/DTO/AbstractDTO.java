package kz.brk.imports.DTO;

import java.util.Date;

/**
 * Created by ww on 04.03.2016.
 */
public abstract class AbstractDTO {
    private int errorCode;
    private String errorMsgKaz;
    private String errorMsgRus;
    private Date created = new Date();

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsgKaz() {
        return errorMsgKaz;
    }

    public void setErrorMsgKaz(String errorMsgKaz) {
        this.errorMsgKaz = errorMsgKaz;
    }

    public String getErrorMsgRus() {
        return errorMsgRus;
    }

    public void setErrorMsgRus(String errorMsgRus) {
        this.errorMsgRus = errorMsgRus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
