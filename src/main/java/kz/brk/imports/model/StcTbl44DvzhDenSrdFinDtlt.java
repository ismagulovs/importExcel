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
@Table(name = "stc_tbl_44_dvzh_den_srd_fin_dtlt")
public class StcTbl44DvzhDenSrdFinDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_44_dvzh_den_srd_fin_dtlt_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_44_dvzh_den_srd_fin_dtlt_id_seq", allocationSize = 1, name = "stc_tbl_44_dvzh_den_srd_fin_dtlt_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld230PstpDenzhSr;
  private BigDecimal fld231EmsAkcCenBmg;
  private BigDecimal fld232EmsAkcDrdolInstr;
  private BigDecimal fld233EmsOblZaimVeks;
  private BigDecimal fld234PlchZaim;
  private BigDecimal fld235PstpZaimBank;
  private BigDecimal fld236PstpPrZaim;
  private BigDecimal fld237PrPstp;
  private BigDecimal fld238VbtDenSr;
  private BigDecimal fld239PgshZdlgZaim;
  private BigDecimal fld240VbtZaimBank;
  private BigDecimal fld241VbtPrZaim;
  private BigDecimal fld242PrbSbsAkc;
  private BigDecimal fld243VpltDvd;
  private BigDecimal fld244PrVbt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}