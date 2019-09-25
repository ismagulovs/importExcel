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
@Table(name = "stc_tbl_10_rez_fin_hoz_dtl_prdp")
public class StcTbl10RezFinHozDtlPrdp {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_10_rez_fin_hoz_dtl_prdp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_10_rez_fin_hoz_dtl_prdp_id_seq", allocationSize = 1, name = "stc_tbl_10_rez_fin_hoz_dtl_prdp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld037ValPrb;
  private BigDecimal fld038RashRlzcPu;
  private BigDecimal fld039AdmRash;
  private BigDecimal fld040RashFin;
  private BigDecimal fld041PrRash;
  private BigDecimal fld042PrblUbtk;
  private BigDecimal fld043RashCorpPn;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
