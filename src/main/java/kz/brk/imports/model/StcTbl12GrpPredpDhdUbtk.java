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
@Table(name = "stc_tbl_12_grp_predp_dhd_ubtk")
public class StcTbl12GrpPredpDhdUbtk {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld044ObshKolPrdp;
  private int fld045KolPrdpPrb;
  private int fld046PrcnObshKolPrb;
  private int fld047SumPrb;
  private int fld048KolPrdpUbtk;
  private int fld049PrcnObshKolUbtk;
  private int fld050SumUbtk;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
