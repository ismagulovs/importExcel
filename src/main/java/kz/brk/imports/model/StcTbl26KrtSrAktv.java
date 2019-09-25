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
@Table(name = "stc_tbl_26_krt_sr_aktv")
public class StcTbl26KrtSrAktv {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_26_krt_sr_aktv_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_26_krt_sr_aktv_id_seq", allocationSize = 1, name = "stc_tbl_26_krt_sr_aktv_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld119KrtAktvNchl;
  private BigDecimal fld120KrtAktvKnc;
  private BigDecimal fld121DnzhSrdNchl;
  private BigDecimal fld122DnzhSrdKnc;
  private BigDecimal fld123DnzhKssNchl;
  private BigDecimal fld124DnzhKssKnc;
  private BigDecimal fld125KrtFinInvNchl;
  private BigDecimal fld126KrtFinInvKnc;
  private BigDecimal fld127KrtDbtZdlNchl;
  private BigDecimal fld128KrtDbtZdlKnc;
  private BigDecimal fld129ZpsNchl;
  private BigDecimal fld130ZpsKnc;
  private BigDecimal fld131PrAktvNchl;
  private BigDecimal fld132PrAktvKnc;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
