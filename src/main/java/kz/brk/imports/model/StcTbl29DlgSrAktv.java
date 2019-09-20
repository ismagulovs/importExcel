package kz.brk.imports.model;
import lombok.*;
import javax.persistence.*;
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
  private int fld145DlgAktvNchl;
  private int fld146DlgAktvKnc;
  private int fld147DlgFinInvNchl;
  private int fld148DlgFinInvKnc;
  private int fld149DlgDbtZdlNchl;
  private int fld150DlgDbtZdlKnc;
  private int fld151OsnSrdNchl;
  private int fld152OsnSrdKnc;
  private int fld153BioAktNchl;
  private int fld154BioAktKnc;
  private int fld155NematAktNchl;
  private int fld156NematAktKnc;
  private int fld157PrAktvNchl;
  private int fld158PrAktvKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}