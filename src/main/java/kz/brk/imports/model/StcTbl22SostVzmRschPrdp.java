package kz.brk.imports.model;
import lombok.*;

import java.math.BigDecimal;
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
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_22_sost_vzm_rsch_prdp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_22_sost_vzm_rsch_prdp_id_seq", allocationSize = 1, name = "stc_tbl_22_sost_vzm_rsch_prdp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld083DbtZdlVse;
  private BigDecimal fld084DbtZdlPrsr;
  private BigDecimal fld085ZdlPkpZkzVse;
  private BigDecimal fld086ZdlPkpZkzPrsr;
  private BigDecimal fld087PrDbtZdlVse;
  private BigDecimal fld088PrDbtZdlPrsr;
  private BigDecimal fld089ZdlObzVse;
  private BigDecimal fld090ZdlObzPrsr;
  private BigDecimal fld091RschPstPdrVse;
  private BigDecimal fld092RschPstPdrPrsr;
  private BigDecimal fld093NlgDrObzPlatVse;
  private BigDecimal fld094NlgDrObzPlatPrsr;
  private BigDecimal fld095PrchObzPensVznVse;
  private BigDecimal fld096PrchObzPensVznPrsr;
  private BigDecimal fld097ZaimBankVse;
  private BigDecimal fld098ZaimBankPrsr;
  private BigDecimal fld099PrZaimVse;
  private BigDecimal fld100PrZaimPrsr;
  private BigDecimal fld101PrKrdZdlVse;
  private BigDecimal fld102PrKrdZdlPrsr;
  private BigDecimal fld103ZdlOplTrdVse;
  private BigDecimal fld104ZdlOplTrdPrsr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
