package kz.brk.imports.model;
import lombok.*;
import java.util.Date;
import javax.persistence.*;
import java.util.Date;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "stc_tbl_22_sost_vzm_rsch_prdp")
public class StcTbl22SostVzmRschPrdp {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld083DbtZdlVse;
  private int fld084DbtZdlPrsr;
  private int fld085ZdlPkpZkzVse;
  private int fld086ZdlPkpZkzPrsr;
  private int fld087PrDbtZdlVse;
  private int fld088PrDbtZdlPrsr;
  private int fld089ZdlObzVse;
  private int fld090ZdlObzPrsr;
  private int fld091RschPstPdrVse;
  private int fld092RschPstPdrPrsr;
  private int fld093NlgDrObzPlatVse;
  private int fld094NlgDrObzPlatPrsr;
  private int fld095PrchObzPensVznVse;
  private int fld096PrchObzPensVznPrsr;
  private int fld097ZaimBankVse;
  private int fld098ZaimBankPrsr;
  private int fld099PrZaimVse;
  private int fld100PrZaimPrsr;
  private int fld101PrKrdZdlVse;
  private int fld102PrKrdZdlPrsr;
  private int fld103ZdlOplTrdVse;
  private int fld104ZdlOplTrdPrsr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
