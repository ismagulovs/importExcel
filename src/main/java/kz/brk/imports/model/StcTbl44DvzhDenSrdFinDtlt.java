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
@Table(name = "stc_tbl_44_dvzh_den_srd_fin_dtlt")
public class StcTbl44DvzhDenSrdFinDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String idSubclass;
  private int god;
  private int fld230PstpDenzhSr;
  private int fld231EmsAkcCenBmg;
  private int fld232EmsAkcDrdolInstr;
  private int fld233EmsOblZaimVeks;
  private int fld234PlchZaim;
  private int fld235PstpZaimBank;
  private int fld236PstpPrZaim;
  private int fld237PrPstp;
  private int fld238VbtDenSr;
  private int fld239PgshZdlgZaim;
  private int fld240VbtZaimBank;
  private int fld241VbtPrZaim;
  private int fld242PrbSbsAkc;
  private int fld243VpltDvd;
  private int fld244PrVbt;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}