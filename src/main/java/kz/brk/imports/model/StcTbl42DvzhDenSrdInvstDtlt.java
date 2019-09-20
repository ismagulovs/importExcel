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
@Table(name = "stc_tbl_42_dvzh_den_srd_invst_dtlt")
public class StcTbl42DvzhDenSrdInvstDtlt {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_42_dvzh_den_srd_invst_dtlt_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_42_dvzh_den_srd_invst_dtlt_id_seq", allocationSize = 1, name = "stc_tbl_42_dvzh_den_srd_invst_dtlt_seq")
  private int id;
  private String idSubclass;
  private int god;
  private int fld213PstpDenzhSr;
  private int fld214RlzcFinAktv;
  private int fld215RlzcAkcDl;
  private int fld216RlzcDlgInstr;
  private int fld217PgshZaimDrOrg;
  private int fld218PstpFfoDgv;
  private int fld219PrPstp;
  private int fld220VbtDenSrds;
  private int fld221PrbFinAktv;
  private int fld222PrbAkcDl;
  private int fld223PrbDlgInstr;
  private int fld224PrdsZaimDrOrg;
  private int fld225KrtSrch;
  private int fld226DlgSrch;
  private int fld227PltFfoDgv;
  private int fld228PrVbt;
  private int fld229ChstSumDenSr;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}