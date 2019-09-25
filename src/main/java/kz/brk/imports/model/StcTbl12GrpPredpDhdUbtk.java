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
@Table(name = "stc_tbl_12_grp_predp_dhd_ubtk")
public class StcTbl12GrpPredpDhdUbtk {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_12_grp_predp_dhd_ubtk_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_12_grp_predp_dhd_ubtk_id_seq", allocationSize = 1, name = "stc_tbl_12_grp_predp_dhd_ubtk_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld044ObshKolPrdp;
  private BigDecimal fld045KolPrdpPrb;
  private BigDecimal fld046PrcnObshKolPrb;
  private BigDecimal fld047SumPrb;
  private BigDecimal fld048KolPrdpUbtk;
  private BigDecimal fld049PrcnObshKolUbtk;
  private BigDecimal fld050SumUbtk;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
