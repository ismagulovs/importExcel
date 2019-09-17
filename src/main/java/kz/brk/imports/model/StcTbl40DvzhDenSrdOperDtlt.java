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
@Table(name = "stc_tbl_40_dvzh_den_srd_oper_dtlt")
public class StcTbl40DvzhDenSrdOperDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld197PstpDenzhSr;
  private int fld198RlzcTvr;
  private int fld199PrdsUsl;
  private int fld200Dvdnt;
  private int fld201PstpVoznArend;
  private int fld202PstpStrahPrm;
  private int fld203PrPstp;
  private int fld204VbtDenSrds;
  private int fld205PltPostTvrUsl;
  private int fld206VplVoznZaim;
  private int fld207ZaimBank;
  private int fld208PrZaim;
  private int fld209PltVoznArend;
  private int fld210PltStrahPrm;
  private int fld211PrVbt;
  private int fld212ChstSumDenSr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}