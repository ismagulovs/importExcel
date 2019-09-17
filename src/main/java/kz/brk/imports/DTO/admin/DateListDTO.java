package kz.brk.imports.DTO.admin;

/**
 * Created by ww on 04.03.2016.
 */
public class DateListDTO {
    private short potok;

    public DateListDTO(){}

    public DateListDTO(short potok) {
        this.potok = potok;
    }

    public short getPotok() {
        return potok;
    }

    public void setPotok(short potok) {
        this.potok = potok;
    }
}
