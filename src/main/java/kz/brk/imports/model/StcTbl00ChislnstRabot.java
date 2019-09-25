package kz.brk.imports.model;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "stc_tbl_00_chislnst_rabot")
public class StcTbl00ChislnstRabot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_00_chislnst_rabot_seq")
    @SequenceGenerator(sequenceName = "stc_tbl_00_chislnst_rabot_id_seq", allocationSize = 1, name = "stc_tbl_00_chislnst_rabot_seq")
    private int id;
    private String idSubclass;
    private String nameKato;
    private int god;
    @Builder.Default
    private BigDecimal fld000ChisloRbtnk = BigDecimal.valueOf(0);
    @Builder.Default
    private int relevance = 1;
    @Builder.Default
    private Date downloadDate = new Date();
}