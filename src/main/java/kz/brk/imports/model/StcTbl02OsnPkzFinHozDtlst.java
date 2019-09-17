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
@Table(name = "stc_tbl_02_osn_pkz_fin_hoz_dtlst")
public class StcTbl02OsnPkzFinHozDtlst {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stc_tbl_02_osn_pkz_fin_hoz_dtlst_seq")
    @SequenceGenerator(sequenceName = "stc_tbl_02_osn_pkz_fin_hoz_dtlst_id_seq", allocationSize = 1, name = "stc_tbl_02_osn_pkz_fin_hoz_dtlst_seq")
    private int id;
    private String idSubclass;
    private int god;
    private int fld001OjmPrzvPrdUsl;
    private int fld002DhdRlzcPrdUsl;
    private int fld003SbstRzlPrdUsl;
    private int fld004PrbNlg;
    private BigDecimal fld005RentPrzv;
    @Builder.Default
    private int relevance = 1;
    @Builder.Default
    private Date downloadDate = new Date();
}