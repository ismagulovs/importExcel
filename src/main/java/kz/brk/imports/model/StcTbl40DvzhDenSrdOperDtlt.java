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
@Table(name = "stc_tbl_40_dvzh_den_srd_oper_dtlt")
public class StcTbl40DvzhDenSrdOperDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_40_dvzh_den_srd_oper_dtlt_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_40_dvzh_den_srd_oper_dtlt_id_seq", allocationSize = 1, name = "stc_tbl_40_dvzh_den_srd_oper_dtlt_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld197PstpDenzhSr;
  private BigDecimal fld198RlzcTvr;
  private BigDecimal fld199PrdsUsl;
  private BigDecimal fld200Dvdnt;
  private BigDecimal fld201PstpVoznArend;
  private BigDecimal fld202PstpStrahPrm;
  private BigDecimal fld203PrPstp;
  private BigDecimal fld204VbtDenSrds;
  private BigDecimal fld205PltPostTvrUsl;
  private BigDecimal fld206VplVoznZaim;
  private BigDecimal fld207ZaimBank;
  private BigDecimal fld208PrZaim;
  private BigDecimal fld209PltVoznArend;
  private BigDecimal fld210PltStrahPrm;
  private BigDecimal fld211PrVbt;
  private BigDecimal fld212ChstSumDenSr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}