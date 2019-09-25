package kz.brk.imports.model;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "stc_tbl_34_dlg_sr_obz")
public class StcTbl34DlgSrObz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_34_dlg_sr_obz_seq")
    @SequenceGenerator(sequenceName = "stc_tbl_34_dlg_sr_obz_id_seq", allocationSize = 1, name = "stc_tbl_34_dlg_sr_obz_seq")
    private int id;
    private String idSubclass;
    private int god;
    private BigDecimal fld171DlgObzNchl;
    private BigDecimal fld172DlgObzKnc;
    private BigDecimal fld173DlgFinObzNchl;
    private BigDecimal fld174DlgFinObzKnc;
    private BigDecimal fld175DlgBnkZaimNchl;
    private BigDecimal fld176DlgBnkZaimKnc;
    private BigDecimal fld177DlgKrdZdlNchl;
    private BigDecimal fld178DlgKrdZdlKnc;
    private BigDecimal fld179PrObzNchl;
    private BigDecimal fld180PrObzKnc;
    @Builder.Default
    private int relevance = 1;
    @Builder.Default
    private Date downloadDate = new Date();
}
