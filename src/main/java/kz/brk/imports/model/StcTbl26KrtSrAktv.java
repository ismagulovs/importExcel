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
@Table(name = "stc_tbl_26_krt_sr_aktv")
public class StcTbl26KrtSrAktv {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_26_krt_sr_aktv_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_26_krt_sr_aktv_id_seq", allocationSize = 1, name = "stc_tbl_26_krt_sr_aktv_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld119KrtAktvNchl;
  private int fld120KrtAktvKnc;
  private int fld121DnzhSrdNchl;
  private int fld122DnzhSrdKnc;
  private int fld123DnzhKssNchl;
  private int fld124DnzhKssKnc;
  private int fld125KrtFinInvNchl;
  private int fld126KrtFinInvKnc;
  private int fld127KrtDbtZdlNchl;
  private int fld128KrtDbtZdlKnc;
  private int fld129ZpsNchl;
  private int fld130ZpsKnc;
  private int fld131PrAktvNchl;
  private int fld132PrAktvKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
