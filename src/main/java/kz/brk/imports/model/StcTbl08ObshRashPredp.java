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
@Table(name = "stc_tbl_08_obsh_rash_predp")
public class StcTbl08ObshRashPredp {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_08_obsh_rash_predp_seq")
  @SequenceGenerator(sequenceName = "stc_tbl_08_obsh_rash_predp_id_seq", allocationSize = 1, name = "stc_tbl_08_obsh_rash_predp_seq")
  private int id;
  private String idSubclass;
  private int god;
  private BigDecimal fld028Vsego;
  private BigDecimal fld029PrzvRhd;
  private BigDecimal fld030MatZatr;
  private BigDecimal fld031AmrtOsnSr;
  private BigDecimal fld032AmrtNemat;
  private BigDecimal fld033FondZpr;
  private BigDecimal fld034DenPsbRab;
  private BigDecimal fld035PrZtr;
  private BigDecimal fld036NeprzvRsh;
  @Builder.Default
  private int relevance = 1;
  @Builder.Default
  private Date downloadDate = new Date();
}
