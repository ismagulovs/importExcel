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
@Table(name = "stc_tbl_29_dlg_sr_aktv")
public class StcTbl29DlgSrAktv {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_29_dlg_sr_aktv_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_29_dlg_sr_aktv_id_seq", allocationSize = 1, name = "stc_tbl_29_dlg_sr_aktv_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld145DlgAktvNchl;
  private BigDecimal fld146DlgAktvKnc;
  private BigDecimal fld147DlgFinInvNchl;
  private BigDecimal fld148DlgFinInvKnc;
  private BigDecimal fld149DlgDbtZdlNchl;
  private BigDecimal fld150DlgDbtZdlKnc;
  private BigDecimal fld151OsnSrdNchl;
  private BigDecimal fld152OsnSrdKnc;
  private BigDecimal fld153BioAktNchl;
  private BigDecimal fld154BioAktKnc;
  private BigDecimal fld155NematAktNchl;
  private BigDecimal fld156NematAktKnc;
  private BigDecimal fld157PrAktvNchl;
  private BigDecimal fld158PrAktvKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}