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
@Table(name = "stc_tbl_42_dvzh_den_srd_invst_dtlt")
public class StcTbl42DvzhDenSrdInvstDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_42_dvzh_den_srd_invst_dtlt_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_42_dvzh_den_srd_invst_dtlt_id_seq", allocationSize = 1, name = "stc_tbl_42_dvzh_den_srd_invst_dtlt_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld213PstpDenzhSr;
  private BigDecimal fld214RlzcFinAktv;
  private BigDecimal fld215RlzcAkcDl;
  private BigDecimal fld216RlzcDlgInstr;
  private BigDecimal fld217PgshZaimDrOrg;
  private BigDecimal fld218PstpFfoDgv;
  private BigDecimal fld219PrPstp;
  private BigDecimal fld220VbtDenSrds;
  private BigDecimal fld221PrbFinAktv;
  private BigDecimal fld222PrbAkcDl;
  private BigDecimal fld223PrbDlgInstr;
  private BigDecimal fld224PrdsZaimDrOrg;
  private BigDecimal fld225KrtSrch;
  private BigDecimal fld226DlgSrch;
  private BigDecimal fld227PltFfoDgv;
  private BigDecimal fld228PrVbt;
  private BigDecimal fld229ChstSumDenSr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}