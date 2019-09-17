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
@Table(name = "stc_tbl_34_dlg_sr_obz")
public class StcTbl34DlgSrObz {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld171DlgObzNchl;
  private int fld172DlgObzKnc;
  private int fld173DlgFinObzNchl;
  private int fld174DlgFinObzKnc;
  private int fld175DlgBnkZaimNchl;
  private int fld176DlgBnkZaimKnc;
  private int fld177DlgKrdZdlNchl;
  private int fld178DlgKrdZdlKnc;
  private int fld179PrObzNchl;
  private int fld180PrObzKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
