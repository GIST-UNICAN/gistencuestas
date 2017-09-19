package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Column;
import com.siimkinks.sqlitemagic.annotation.Table;

@Table(persistAll = true)
public class SurveyObjectSendItem {

    public SurveyObjectSendItem() {
    }
    @Column(useAccessMethods = true)
    @SerializedName("encuestador")
    @Expose
    private String encuestador;
    @Column(useAccessMethods = true)
    @SerializedName("hora")
    @Expose
    private String hora;
    @Column(useAccessMethods = true)
    @SerializedName("sexo_hombre")
    @Expose
    private Integer sexoHombre;
    @Column(useAccessMethods = true)
    @SerializedName("sexo_mujer")
    @Expose
    private Integer sexoMujer;
    @Column(useAccessMethods = true)
    @SerializedName("edad_25")
    @Expose
    private Integer edad25;
    @Column(useAccessMethods = true)
    @SerializedName("edad_2534")
    @Expose
    private Integer edad2534;
    @Column(useAccessMethods = true)
    @SerializedName("edad_3544")
    @Expose
    private Integer edad3544;
    @Column(useAccessMethods = true)
    @SerializedName("edad_4554")
    @Expose
    private Integer edad4554;
    @Column(useAccessMethods = true)
    @SerializedName("edad_5564")
    @Expose
    private Integer edad5564;
    @Column(useAccessMethods = true)
    @SerializedName("edad_65")
    @Expose
    private Integer edad65;
    @Column(useAccessMethods = true)
    @SerializedName("trabajo_trabajador")
    @Expose
    private Integer trabajoTrabajador;
    @Column(useAccessMethods = true)
    @SerializedName("trabajo_desempleado")
    @Expose
    private Integer trabajoDesempleado;
    @Column(useAccessMethods = true)
    @SerializedName("trabajo_estudiante")
    @Expose
    private Integer trabajoEstudiante;
    @Column(useAccessMethods = true)
    @SerializedName("trabajo_jubilado")
    @Expose
    private Integer trabajoJubilado;
    @Column(useAccessMethods = true)
    @SerializedName("carnet_si")
    @Expose
    private Integer carnetSi;
    @Column(useAccessMethods = true)
    @SerializedName("carnet_no")
    @Expose
    private Integer carnetNo;
    @Column(useAccessMethods = true)
    @SerializedName("vehiculo_si")
    @Expose
    private Integer vehiculoSi;
    @Column(useAccessMethods = true)
    @SerializedName("vehiculo_no")
    @Expose
    private Integer vehiculoNo;
    @Column(useAccessMethods = true)
    @SerializedName("linea")
    @Expose
    private String linea;
    @Column(useAccessMethods = true)
    @SerializedName("motivo_inicio")
    @Expose
    private String motivoInicio;
    @Column(useAccessMethods = true)
    @SerializedName("motivo_fin")
    @Expose
    private String motivoFin;
    @Column(useAccessMethods = true)
    @SerializedName("viajes_5")
    @Expose
    private Integer viajes5;
    @Column(useAccessMethods = true)
    @SerializedName("viajes_515")
    @Expose
    private Integer viajes515;
    @Column(useAccessMethods = true)
    @SerializedName("viajes_1530")
    @Expose
    private Integer viajes1530;
    @Column(useAccessMethods = true)
    @SerializedName("viajes_30")
    @Expose
    private Integer viajes30;
    @Column(useAccessMethods = true)
    @SerializedName("pago_tarjeta")
    @Expose
    private Integer pagoTarjeta;
    @Column(useAccessMethods = true)
    @SerializedName("pago_efectivo")
    @Expose
    private Integer pagoEfectivo;
    @Column(useAccessMethods = true)
    @SerializedName("ingreso_900")
    @Expose
    private Integer ingreso900;
    @Column(useAccessMethods = true)
    @SerializedName("ingreso_9001500")
    @Expose
    private Integer ingreso9001500;
    @Column(useAccessMethods = true)
    @SerializedName("ingreso_15002500")
    @Expose
    private Integer ingreso15002500;
    @Column(useAccessMethods = true)
    @SerializedName("ingreso_2500")
    @Expose
    private Integer ingreso2500;
    @Column(useAccessMethods = true)
    @SerializedName("ingreso_nsnc")
    @Expose
    private Integer ingresoNsnc;
    @Column(useAccessMethods = true)
    @SerializedName("valoriacion_muymal")
    @Expose
    private Integer valoracionMuymal;
    @Column(useAccessMethods = true)
    @SerializedName("valoracion_mal")
    @Expose
    private Integer valoracionMal;
    @Column(useAccessMethods = true)
    @SerializedName("valoracion_normal")
    @Expose
    private Integer valoracionNormal;
    @Column(useAccessMethods = true)
    @SerializedName("valoracion_bien")
    @Expose
    private Integer valoracionBien;
    @Column(useAccessMethods = true)
    @SerializedName("valoracion_muybien")
    @Expose
    private Integer valoracionMuybien;
    @Column(useAccessMethods = true)
    @SerializedName("thp_mm")
    @Expose
    private Integer thpMm;
    @Column(useAccessMethods = true)
    @SerializedName("thp_ma")
    @Expose
    private Integer thpMa;
    @Column(useAccessMethods = true)
    @SerializedName("thp_no")
    @Expose
    private Integer thpNo;
    @Column(useAccessMethods = true)
    @SerializedName("thp_bi")
    @Expose
    private Integer thpBi;
    @Column(useAccessMethods = true)
    @SerializedName("thp_mb")
    @Expose
    private Integer thpMb;
    @Column(useAccessMethods = true)
    @SerializedName("thp_ns")
    @Expose
    private Integer thpNs;
    @Column(useAccessMethods = true)
    @SerializedName("thp_be")
    @Expose
    private Integer thpBe;
    @Column(useAccessMethods = true)
    @SerializedName("thp_wo")
    @Expose
    private Integer thpWo;
    @Column(useAccessMethods = true)
    @SerializedName("thp_mi")
    @Expose
    private Integer thpMi;
    @Column(useAccessMethods = true)
    @SerializedName("thp_li")
    @Expose
    private Integer thpLi;
    @Column(useAccessMethods = true)
    @SerializedName("tep_mm")
    @Expose
    private Integer tepMm;
    @Column(useAccessMethods = true)
    @SerializedName("tep_ma")
    @Expose
    private Integer tepMa;
    @Column(useAccessMethods = true)
    @SerializedName("tep_no")
    @Expose
    private Integer tepNo;
    @Column(useAccessMethods = true)
    @SerializedName("tep_bi")
    @Expose
    private Integer tepBi;
    @Column(useAccessMethods = true)
    @SerializedName("tep_mb")
    @Expose
    private Integer tepMb;
    @Column(useAccessMethods = true)
    @SerializedName("tep_ns")
    @Expose
    private Integer tepNs;
    @Column(useAccessMethods = true)
    @SerializedName("tep_be")
    @Expose
    private Integer tepBe;
    @Column(useAccessMethods = true)
    @SerializedName("tep_wo")
    @Expose
    private Integer tepWo;
    @Column(useAccessMethods = true)
    @SerializedName("tep_mi")
    @Expose
    private Integer tepMi;
    @Column(useAccessMethods = true)
    @SerializedName("tep_li")
    @Expose
    private Integer tepLi;
    @Column(useAccessMethods = true)
    @SerializedName("tv_mm")
    @Expose
    private Integer tvMm;
    @Column(useAccessMethods = true)
    @SerializedName("tv_ma")
    @Expose
    private Integer tvMa;
    @Column(useAccessMethods = true)
    @SerializedName("tv_no")
    @Expose
    private Integer tvNo;
    @Column(useAccessMethods = true)
    @SerializedName("tv_bi")
    @Expose
    private Integer tvBi;
    @Column(useAccessMethods = true)
    @SerializedName("tv_mb")
    @Expose
    private Integer tvMb;
    @Column(useAccessMethods = true)
    @SerializedName("tv_ns")
    @Expose
    private Integer tvNs;
    @Column(useAccessMethods = true)
    @SerializedName("tv_be")
    @Expose
    private Integer tvBe;
    @Column(useAccessMethods = true)
    @SerializedName("tv_wo")
    @Expose
    private Integer tvWo;
    @Column(useAccessMethods = true)
    @SerializedName("tv_mi")
    @Expose
    private Integer tvMi;
    @Column(useAccessMethods = true)
    @SerializedName("tv_li")
    @Expose
    private Integer tvLi;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_mm")
    @Expose
    private Integer tpdMm;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_ma")
    @Expose
    private Integer tpdMa;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_no")
    @Expose
    private Integer tpdNo;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_bi")
    @Expose
    private Integer tpdBi;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_mb")
    @Expose
    private Integer tpdMb;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_ns")
    @Expose
    private Integer tpdNs;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_be")
    @Expose
    private Integer tpdBe;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_wo")
    @Expose
    private Integer tpdWo;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_mi")
    @Expose
    private Integer tpdMi;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_li")
    @Expose
    private Integer tpdLi;
    @Column(useAccessMethods = true)
    @SerializedName("pv_mm")
    @Expose
    private Integer pvMm;
    @Column(useAccessMethods = true)
    @SerializedName("pv_ma")
    @Expose
    private Integer pvMa;
    @Column(useAccessMethods = true)
    @SerializedName("pv_no")
    @Expose
    private Integer pvNo;
    @Column(useAccessMethods = true)
    @SerializedName("pv_bi")
    @Expose
    private Integer pvBi;
    @Column(useAccessMethods = true)
    @SerializedName("pv_mb")
    @Expose
    private Integer pvMb;
    @Column(useAccessMethods = true)
    @SerializedName("pv_ns")
    @Expose
    private Integer pvNs;
    @Column(useAccessMethods = true)
    @SerializedName("pv_be")
    @Expose
    private Integer pvBe;
    @Column(useAccessMethods = true)
    @SerializedName("pv_wo")
    @Expose
    private Integer pvWo;
    @Column(useAccessMethods = true)
    @SerializedName("pv_mi")
    @Expose
    private Integer pvMi;
    @Column(useAccessMethods = true)
    @SerializedName("pv_li")
    @Expose
    private Integer pvLi;
    @Column(useAccessMethods = true)
    @SerializedName("ft_mm")
    @Expose
    private Integer ftMm;
    @Column(useAccessMethods = true)
    @SerializedName("ft_ma")
    @Expose
    private Integer ftMa;
    @Column(useAccessMethods = true)
    @SerializedName("ft_no")
    @Expose
    private Integer ftNo;
    @Column(useAccessMethods = true)
    @SerializedName("ft_bi")
    @Expose
    private Integer ftBi;
    @Column(useAccessMethods = true)
    @SerializedName("ft_mb")
    @Expose
    private Integer ftMb;
    @Column(useAccessMethods = true)
    @SerializedName("ft_ns")
    @Expose
    private Integer ftNs;
    @Column(useAccessMethods = true)
    @SerializedName("ft_be")
    @Expose
    private Integer ftBe;
    @Column(useAccessMethods = true)
    @SerializedName("ft_wo")
    @Expose
    private Integer ftWo;
    @Column(useAccessMethods = true)
    @SerializedName("ft_mi")
    @Expose
    private Integer ftMi;
    @Column(useAccessMethods = true)
    @SerializedName("ft_li")
    @Expose
    private Integer ftLi;
    @Column(useAccessMethods = true)
    @SerializedName("so_mm")
    @Expose
    private Integer soMm;
    @Column(useAccessMethods = true)
    @SerializedName("so_ma")
    @Expose
    private Integer soMa;
    @Column(useAccessMethods = true)
    @SerializedName("so_no")
    @Expose
    private Integer soNo;
    @Column(useAccessMethods = true)
    @SerializedName("so_bi")
    @Expose
    private Integer soBi;
    @Column(useAccessMethods = true)
    @SerializedName("so_mb")
    @Expose
    private Integer soMb;
    @Column(useAccessMethods = true)
    @SerializedName("so_ns")
    @Expose
    private Integer soNs;
    @Column(useAccessMethods = true)
    @SerializedName("so_be")
    @Expose
    private Integer soBe;
    @Column(useAccessMethods = true)
    @SerializedName("so_wo")
    @Expose
    private Integer soWo;
    @Column(useAccessMethods = true)
    @SerializedName("so_mi")
    @Expose
    private Integer soMi;
    @Column(useAccessMethods = true)
    @SerializedName("so_li")
    @Expose
    private Integer soLi;
    @Column(useAccessMethods = true)
    @SerializedName("fs_mm")
    @Expose
    private Integer fsMm;
    @Column(useAccessMethods = true)
    @SerializedName("fs_ma")
    @Expose
    private Integer fsMa;
    @Column(useAccessMethods = true)
    @SerializedName("fs_no")
    @Expose
    private Integer fsNo;
    @Column(useAccessMethods = true)
    @SerializedName("fs_bi")
    @Expose
    private Integer fsBi;
    @Column(useAccessMethods = true)
    @SerializedName("fs_mb")
    @Expose
    private Integer fsMb;
    @Column(useAccessMethods = true)
    @SerializedName("fs_ns")
    @Expose
    private Integer fsNs;
    @Column(useAccessMethods = true)
    @SerializedName("fs_be")
    @Expose
    private Integer fsBe;
    @Column(useAccessMethods = true)
    @SerializedName("fs_wo")
    @Expose
    private Integer fsWo;
    @Column(useAccessMethods = true)
    @SerializedName("fs_mi")
    @Expose
    private Integer fsMi;
    @Column(useAccessMethods = true)
    @SerializedName("fs_li")
    @Expose
    private Integer fsLi;
    @Column(useAccessMethods = true)
    @SerializedName("le_mm")
    @Expose
    private Integer leMm;
    @Column(useAccessMethods = true)
    @SerializedName("le_ma")
    @Expose
    private Integer leMa;
    @Column(useAccessMethods = true)
    @SerializedName("le_no")
    @Expose
    private Integer leNo;
    @Column(useAccessMethods = true)
    @SerializedName("le_bi")
    @Expose
    private Integer leBi;
    @Column(useAccessMethods = true)
    @SerializedName("le_mb")
    @Expose
    private Integer leMb;
    @Column(useAccessMethods = true)
    @SerializedName("le_ns")
    @Expose
    private Integer leNs;
    @Column(useAccessMethods = true)
    @SerializedName("le_be")
    @Expose
    private Integer leBe;
    @Column(useAccessMethods = true)
    @SerializedName("le_wo")
    @Expose
    private Integer leWo;
    @Column(useAccessMethods = true)
    @SerializedName("le_mi")
    @Expose
    private Integer leMi;
    @Column(useAccessMethods = true)
    @SerializedName("le_li")
    @Expose
    private Integer leLi;
    @Column(useAccessMethods = true)
    @SerializedName("sn_mm")
    @Expose
    private Integer snMm;
    @Column(useAccessMethods = true)
    @SerializedName("sn_ma")
    @Expose
    private Integer snMa;
    @Column(useAccessMethods = true)
    @SerializedName("sn_no")
    @Expose
    private Integer snNo;
    @Column(useAccessMethods = true)
    @SerializedName("sn_bi")
    @Expose
    private Integer snBi;
    @Column(useAccessMethods = true)
    @SerializedName("sn_mb")
    @Expose
    private Integer snMb;
    @Column(useAccessMethods = true)
    @SerializedName("sn_ns")
    @Expose
    private Integer snNs;
    @Column(useAccessMethods = true)
    @SerializedName("sn_be")
    @Expose
    private Integer snBe;
    @Column(useAccessMethods = true)
    @SerializedName("sn_wo")
    @Expose
    private Integer snWo;
    @Column(useAccessMethods = true)
    @SerializedName("sn_mi")
    @Expose
    private Integer snMi;
    @Column(useAccessMethods = true)
    @SerializedName("sn_li")
    @Expose
    private Integer snLi;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_mm")
    @Expose
    private Integer sfsMm;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_ma")
    @Expose
    private Integer sfsMa;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_no")
    @Expose
    private Integer sfsNo;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_bi")
    @Expose
    private Integer sfsBi;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_mb")
    @Expose
    private Integer sfsMb;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_ns")
    @Expose
    private Integer sfsNs;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_be")
    @Expose
    private Integer sfsBe;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_wo")
    @Expose
    private Integer sfsWo;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_mi")
    @Expose
    private Integer sfsMi;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_li")
    @Expose
    private Integer sfsLi;
    @Column(useAccessMethods = true)
    @SerializedName("cl_mm")
    @Expose
    private Integer clMm;
    @Column(useAccessMethods = true)
    @SerializedName("cl_ma")
    @Expose
    private Integer clMa;
    @Column(useAccessMethods = true)
    @SerializedName("cl_no")
    @Expose
    private Integer clNo;
    @Column(useAccessMethods = true)
    @SerializedName("cl_bi")
    @Expose
    private Integer clBi;
    @Column(useAccessMethods = true)
    @SerializedName("cl_mb")
    @Expose
    private Integer clMb;
    @Column(useAccessMethods = true)
    @SerializedName("cl_ns")
    @Expose
    private Integer clNs;
    @Column(useAccessMethods = true)
    @SerializedName("cl_be")
    @Expose
    private Integer clBe;
    @Column(useAccessMethods = true)
    @SerializedName("cl_wo")
    @Expose
    private Integer clWo;
    @Column(useAccessMethods = true)
    @SerializedName("cl_mi")
    @Expose
    private Integer clMi;
    @Column(useAccessMethods = true)
    @SerializedName("cl_li")
    @Expose
    private Integer clLi;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_mm")
    @Expose
    private Integer ipiMm;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_ma")
    @Expose
    private Integer ipiMa;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_no")
    @Expose
    private Integer ipiNo;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_bi")
    @Expose
    private Integer ipiBi;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_mb")
    @Expose
    private Integer ipiMb;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_ns")
    @Expose
    private Integer ipiNs;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_be")
    @Expose
    private Integer ipiBe;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_wo")
    @Expose
    private Integer ipiWo;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_mi")
    @Expose
    private Integer ipiMi;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_li")
    @Expose
    private Integer ipiLi;
    @Column(useAccessMethods = true)
    @SerializedName("isi_mm")
    @Expose
    private Integer isiMm;
    @Column(useAccessMethods = true)
    @SerializedName("isi_ma")
    @Expose
    private Integer isiMa;
    @Column(useAccessMethods = true)
    @SerializedName("isi_no")
    @Expose
    private Integer isiNo;
    @Column(useAccessMethods = true)
    @SerializedName("isi_bi")
    @Expose
    private Integer isiBi;
    @Column(useAccessMethods = true)
    @SerializedName("isi_mb")
    @Expose
    private Integer isiMb;
    @Column(useAccessMethods = true)
    @SerializedName("isi_ns")
    @Expose
    private Integer isiNs;
    @Column(useAccessMethods = true)
    @SerializedName("isi_be")
    @Expose
    private Integer isiBe;
    @Column(useAccessMethods = true)
    @SerializedName("isi_wo")
    @Expose
    private Integer isiWo;
    @Column(useAccessMethods = true)
    @SerializedName("isi_mi")
    @Expose
    private Integer isiMi;
    @Column(useAccessMethods = true)
    @SerializedName("isi_li")
    @Expose
    private Integer isiLi;
    @Column(useAccessMethods = true)
    @SerializedName("ima_mm")
    @Expose
    private Integer imaMm;
    @Column(useAccessMethods = true)
    @SerializedName("ima_ma")
    @Expose
    private Integer imaMa;
    @Column(useAccessMethods = true)
    @SerializedName("ima_no")
    @Expose
    private Integer imaNo;
    @Column(useAccessMethods = true)
    @SerializedName("ima_bi")
    @Expose
    private Integer imaBi;
    @Column(useAccessMethods = true)
    @SerializedName("ima_mb")
    @Expose
    private Integer imaMb;
    @Column(useAccessMethods = true)
    @SerializedName("ima_ns")
    @Expose
    private Integer imaNs;
    @Column(useAccessMethods = true)
    @SerializedName("ima_be")
    @Expose
    private Integer imaBe;
    @Column(useAccessMethods = true)
    @SerializedName("ima_wo")
    @Expose
    private Integer imaWo;
    @Column(useAccessMethods = true)
    @SerializedName("ima_mi")
    @Expose
    private Integer imaMi;
    @Column(useAccessMethods = true)
    @SerializedName("ima_li")
    @Expose
    private Integer imaLi;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_mm")
    @Expose
    private Integer ocuMm;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_ma")
    @Expose
    private Integer ocuMa;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_no")
    @Expose
    private Integer ocuNo;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_bi")
    @Expose
    private Integer ocuBi;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_mb")
    @Expose
    private Integer ocuMb;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_ns")
    @Expose
    private Integer ocuNs;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_be")
    @Expose
    private Integer ocuBe;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_wo")
    @Expose
    private Integer ocuWo;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_mi")
    @Expose
    private Integer ocuMi;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_li")
    @Expose
    private Integer ocuLi;
    @Column(useAccessMethods = true)
    @SerializedName("cac_mm")
    @Expose
    private Integer cacMm;
    @Column(useAccessMethods = true)
    @SerializedName("cac_ma")
    @Expose
    private Integer cacMa;
    @Column(useAccessMethods = true)
    @SerializedName("cac_no")
    @Expose
    private Integer cacNo;
    @Column(useAccessMethods = true)
    @SerializedName("cac_bi")
    @Expose
    private Integer cacBi;
    @Column(useAccessMethods = true)
    @SerializedName("cac_mb")
    @Expose
    private Integer cacMb;
    @Column(useAccessMethods = true)
    @SerializedName("cac_ns")
    @Expose
    private Integer cacNs;
    @Column(useAccessMethods = true)
    @SerializedName("cac_be")
    @Expose
    private Integer cacBe;
    @Column(useAccessMethods = true)
    @SerializedName("cac_wo")
    @Expose
    private Integer cacWo;
    @Column(useAccessMethods = true)
    @SerializedName("cac_mi")
    @Expose
    private Integer cacMi;
    @Column(useAccessMethods = true)
    @SerializedName("cac_li")
    @Expose
    private Integer cacLi;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_mm")
    @Expose
    private Integer pmrMm;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_ma")
    @Expose
    private Integer pmrMa;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_no")
    @Expose
    private Integer pmrNo;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_bi")
    @Expose
    private Integer pmrBi;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_mb")
    @Expose
    private Integer pmrMb;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_ns")
    @Expose
    private Integer pmrNs;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_be")
    @Expose
    private Integer pmrBe;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_wo")
    @Expose
    private Integer pmrWo;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_mi")
    @Expose
    private Integer pmrMi;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_li")
    @Expose
    private Integer pmrLi;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_mm")
    @Expose
    private Integer ccfMm;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_ma")
    @Expose
    private Integer ccfMa;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_no")
    @Expose
    private Integer ccfNo;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_bi")
    @Expose
    private Integer ccfBi;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_mb")
    @Expose
    private Integer ccfMb;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_ns")
    @Expose
    private Integer ccfNs;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_be")
    @Expose
    private Integer ccfBe;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_wo")
    @Expose
    private Integer ccfWo;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_mi")
    @Expose
    private Integer ccfMi;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_li")
    @Expose
    private Integer ccfLi;
    @Column(useAccessMethods = true)
    @SerializedName("la_mm")
    @Expose
    private Integer laMm;
    @Column(useAccessMethods = true)
    @SerializedName("la_ma")
    @Expose
    private Integer laMa;
    @Column(useAccessMethods = true)
    @SerializedName("la_no")
    @Expose
    private Integer laNo;
    @Column(useAccessMethods = true)
    @SerializedName("la_bi")
    @Expose
    private Integer laBi;
    @Column(useAccessMethods = true)
    @SerializedName("la_mb")
    @Expose
    private Integer laMb;
    @Column(useAccessMethods = true)
    @SerializedName("la_ns")
    @Expose
    private Integer laNs;
    @Column(useAccessMethods = true)
    @SerializedName("la_be")
    @Expose
    private Integer laBe;
    @Column(useAccessMethods = true)
    @SerializedName("la_wo")
    @Expose
    private Integer laWo;
    @Column(useAccessMethods = true)
    @SerializedName("la_mi")
    @Expose
    private Integer laMi;
    @Column(useAccessMethods = true)
    @SerializedName("la_li")
    @Expose
    private Integer laLi;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_mm")
    @Expose
    private Integer ppoMm;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_ma")
    @Expose
    private Integer ppoMa;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_no")
    @Expose
    private Integer ppoNo;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_bi")
    @Expose
    private Integer ppoBi;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_mb")
    @Expose
    private Integer ppoMb;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_ns")
    @Expose
    private Integer ppoNs;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_be")
    @Expose
    private Integer ppoBe;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_wo")
    @Expose
    private Integer ppoWo;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_mi")
    @Expose
    private Integer ppoMi;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_li")
    @Expose
    private Integer ppoLi;
    @Column(useAccessMethods = true)
    @SerializedName("fc_mm")
    @Expose
    private Integer fcMm;
    @Column(useAccessMethods = true)
    @SerializedName("fc_ma")
    @Expose
    private Integer fcMa;
    @Column(useAccessMethods = true)
    @SerializedName("fc_no")
    @Expose
    private Integer fcNo;
    @Column(useAccessMethods = true)
    @SerializedName("fc_bi")
    @Expose
    private Integer fcBi;
    @Column(useAccessMethods = true)
    @SerializedName("fc_mb")
    @Expose
    private Integer fcMb;
    @Column(useAccessMethods = true)
    @SerializedName("fc_ns")
    @Expose
    private Integer fcNs;
    @Column(useAccessMethods = true)
    @SerializedName("fc_be")
    @Expose
    private Integer fcBe;
    @Column(useAccessMethods = true)
    @SerializedName("fc_wo")
    @Expose
    private Integer fcWo;
    @Column(useAccessMethods = true)
    @SerializedName("fc_mi")
    @Expose
    private Integer fcMi;
    @Column(useAccessMethods = true)
    @SerializedName("fc_li")
    @Expose
    private Integer fcLi;
    @Column(useAccessMethods = true)
    @SerializedName("aco_mm")
    @Expose
    private Integer acoMm;
    @Column(useAccessMethods = true)
    @SerializedName("aco_ma")
    @Expose
    private Integer acoMa;
    @Column(useAccessMethods = true)
    @SerializedName("aco_no")
    @Expose
    private Integer acoNo;
    @Column(useAccessMethods = true)
    @SerializedName("aco_bi")
    @Expose
    private Integer acoBi;
    @Column(useAccessMethods = true)
    @SerializedName("aco_mb")
    @Expose
    private Integer acoMb;
    @Column(useAccessMethods = true)
    @SerializedName("aco_ns")
    @Expose
    private Integer acoNs;
    @Column(useAccessMethods = true)
    @SerializedName("aco_be")
    @Expose
    private Integer acoBe;
    @Column(useAccessMethods = true)
    @SerializedName("aco_wo")
    @Expose
    private Integer acoWo;
    @Column(useAccessMethods = true)
    @SerializedName("aco_mi")
    @Expose
    private Integer acoMi;
    @Column(useAccessMethods = true)
    @SerializedName("aco_li")
    @Expose
    private Integer acoLi;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_mm")
    @Expose
    private Integer ibhMm;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_ma")
    @Expose
    private Integer ibhMa;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_no")
    @Expose
    private Integer ibhNo;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_bi")
    @Expose
    private Integer ibhBi;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_mb")
    @Expose
    private Integer ibhMb;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_ns")
    @Expose
    private Integer ibhNs;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_be")
    @Expose
    private Integer ibhBe;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_wo")
    @Expose
    private Integer ibhWo;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_mi")
    @Expose
    private Integer ibhMi;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_li")
    @Expose
    private Integer ibhLi;
    @Column(useAccessMethods = true)
    @SerializedName("cas_mm")
    @Expose
    private Integer casMm;
    @Column(useAccessMethods = true)
    @SerializedName("cas_ma")
    @Expose
    private Integer casMa;
    @Column(useAccessMethods = true)
    @SerializedName("cas_no")
    @Expose
    private Integer casNo;
    @Column(useAccessMethods = true)
    @SerializedName("cas_bi")
    @Expose
    private Integer casBi;
    @Column(useAccessMethods = true)
    @SerializedName("cas_mb")
    @Expose
    private Integer casMb;
    @Column(useAccessMethods = true)
    @SerializedName("cas_ns")
    @Expose
    private Integer casNs;
    @Column(useAccessMethods = true)
    @SerializedName("cas_be")
    @Expose
    private Integer casBe;
    @Column(useAccessMethods = true)
    @SerializedName("cas_wo")
    @Expose
    private Integer casWo;
    @Column(useAccessMethods = true)
    @SerializedName("cas_mi")
    @Expose
    private Integer casMi;
    @Column(useAccessMethods = true)
    @SerializedName("cas_li")
    @Expose
    private Integer casLi;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_mm")
    @Expose
    private Integer vgsMm;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_ma")
    @Expose
    private Integer vgsMa;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_no")
    @Expose
    private Integer vgsNo;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_bi")
    @Expose
    private Integer vgsBi;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_mb")
    @Expose
    private Integer vgsMb;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_ns")
    @Expose
    private Integer vgsNs;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_be")
    @Expose
    private Integer vgsBe;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_wo")
    @Expose
    private Integer vgsWo;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_mi")
    @Expose
    private Integer vgsMi;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_li")
    @Expose
    private Integer vgsLi;
    @Column(useAccessMethods = true)
    @SerializedName("thp_group")
    @Expose
    private Integer thpGroup;
    @Column(useAccessMethods = true)
    @SerializedName("tep_group")
    @Expose
    private Integer tepGroup;
    @Column(useAccessMethods = true)
    @SerializedName("tv_group")
    @Expose
    private Integer tvGroup;
    @Column(useAccessMethods = true)
    @SerializedName("tpd_group")
    @Expose
    private Integer tpdGroup;
    @Column(useAccessMethods = true)
    @SerializedName("pv_group")
    @Expose
    private Integer pvGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ft_group")
    @Expose
    private Integer ftGroup;
    @Column(useAccessMethods = true)
    @SerializedName("so_group")
    @Expose
    private Integer soGroup;
    @Column(useAccessMethods = true)
    @SerializedName("fs_group")
    @Expose
    private Integer fsGroup;
    @Column(useAccessMethods = true)
    @SerializedName("le_group")
    @Expose
    private Integer leGroup;
    @Column(useAccessMethods = true)
    @SerializedName("sn_group")
    @Expose
    private Integer snGroup;
    @Column(useAccessMethods = true)
    @SerializedName("sfs_group")
    @Expose
    private Integer sfsGroup;
    @Column(useAccessMethods = true)
    @SerializedName("cl_group")
    @Expose
    private Integer clGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ipi_group")
    @Expose
    private Integer ipiGroup;
    @Column(useAccessMethods = true)
    @SerializedName("isi_group")
    @Expose
    private Integer isiGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ima_group")
    @Expose
    private Integer imaGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ocu_group")
    @Expose
    private Integer ocuGroup;
    @Column(useAccessMethods = true)
    @SerializedName("cac_group")
    @Expose
    private Integer cacGroup;
    @Column(useAccessMethods = true)
    @SerializedName("pmr_group")
    @Expose
    private Integer pmrGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ccf_group")
    @Expose
    private Integer ccfGroup;
    @Column(useAccessMethods = true)
    @SerializedName("la_group")
    @Expose
    private Integer laGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ppo_group")
    @Expose
    private Integer ppoGroup;
    @Column(useAccessMethods = true)
    @SerializedName("fc_group")
    @Expose
    private Integer fcGroup;
    @Column(useAccessMethods = true)
    @SerializedName("aco_group")
    @Expose
    private Integer acoGroup;
    @Column(useAccessMethods = true)
    @SerializedName("ibh_group")
    @Expose
    private Integer ibhGroup;
    @Column(useAccessMethods = true)
    @SerializedName("cas_group")
    @Expose
    private Integer casGroup;
    @Column(useAccessMethods = true)
    @SerializedName("vgs_group")
    @Expose
    private Integer vgsGroup;
    @Column(useAccessMethods = true)
    @SerializedName("otras_lineas")
    @Expose
    private String otrasLineas;
    @Column(useAccessMethods = true)
    @SerializedName("parada_subida")
    @Expose
    private String paradaSubida;
    @Column(useAccessMethods = true)
    @SerializedName("parada_bajada")
    @Expose
    private String paradaBajada;
    @Column(useAccessMethods = true)
    @SerializedName("iam_mm")
    @Expose
    private Integer iamMm;
    @Column(useAccessMethods = true)
    @SerializedName("iam_ma")
    @Expose
    private Integer iamMa;
    @Column(useAccessMethods = true)
    @SerializedName("iam_no")
    @Expose
    private Integer iamNo;
    @Column(useAccessMethods = true)
    @SerializedName("iam_bi")
    @Expose
    private Integer iamBi;
    @Column(useAccessMethods = true)
    @SerializedName("iam_mb")
    @Expose
    private Integer iamMb;
    @Column(useAccessMethods = true)
    @SerializedName("iam_ns")
    @Expose
    private Integer iamNs;
    @Column(useAccessMethods = true)
    @SerializedName("iam_be")
    @Expose
    private Integer iamBe;
    @Column(useAccessMethods = true)
    @SerializedName("iam_wo")
    @Expose
    private Integer iamWo;
    @Column(useAccessMethods = true)
    @SerializedName("iam_mi")
    @Expose
    private Integer iamMi;
    @Column(useAccessMethods = true)
    @SerializedName("iam_li")
    @Expose
    private Integer iamLi;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_mm")
    @Expose
    private Integer cpaMm;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_ma")
    @Expose
    private Integer cpaMa;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_no")
    @Expose
    private Integer cpaNo;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_bi")
    @Expose
    private Integer cpaBi;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_mb")
    @Expose
    private Integer cpaMb;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_ns")
    @Expose
    private Integer cpaNs;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_be")
    @Expose
    private Integer cpaBe;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_wo")
    @Expose
    private Integer cpaWo;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_mi")
    @Expose
    private Integer cpaMi;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_li")
    @Expose
    private Integer cpaLi;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_mm")
    @Expose
    private Integer dmrMm;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_ma")
    @Expose
    private Integer dmrMa;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_no")
    @Expose
    private Integer dmrNo;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_bi")
    @Expose
    private Integer dmrBi;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_mb")
    @Expose
    private Integer dmrMb;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_ns")
    @Expose
    private Integer dmrNs;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_be")
    @Expose
    private Integer dmrBe;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_wo")
    @Expose
    private Integer dmrWo;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_mi")
    @Expose
    private Integer dmrMi;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_li")
    @Expose
    private Integer dmrLi;
    @Column(useAccessMethods = true)
    @SerializedName("iam_group")
    @Expose
    private Integer iamGroup;
    @Column(useAccessMethods = true)
    @SerializedName("cpa_group")
    @Expose
    private Integer cpaGroup;
    @Column(useAccessMethods = true)
    @SerializedName("dmr_group")
    @Expose
    private Integer dmrGroup;


    public String getEncuestador() {
        return encuestador;
    }

    public void setEncuestador(String encuestador) {
        this.encuestador = encuestador;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getSexoHombre() {
        return sexoHombre;
    }

    public void setSexoHombre(Integer sexoHombre) {
        this.sexoHombre = sexoHombre;
    }

    public Integer getSexoMujer() {
        return sexoMujer;
    }

    public void setSexoMujer(Integer sexoMujer) {
        this.sexoMujer = sexoMujer;
    }

    public Integer getEdad25() {
        return edad25;
    }

    public void setEdad25(Integer edad25) {
        this.edad25 = edad25;
    }

    public Integer getEdad2534() {
        return edad2534;
    }

    public void setEdad2534(Integer edad2534) {
        this.edad2534 = edad2534;
    }

    public Integer getEdad3544() {
        return edad3544;
    }

    public void setEdad3544(Integer edad3544) {
        this.edad3544 = edad3544;
    }

    public Integer getEdad4554() {
        return edad4554;
    }

    public void setEdad4554(Integer edad4554) {
        this.edad4554 = edad4554;
    }

    public Integer getEdad5564() {
        return edad5564;
    }

    public void setEdad5564(Integer edad5564) {
        this.edad5564 = edad5564;
    }

    public Integer getEdad65() {
        return edad65;
    }

    public void setEdad65(Integer edad65) {
        this.edad65 = edad65;
    }

    public Integer getTrabajoTrabajador() {
        return trabajoTrabajador;
    }

    public void setTrabajoTrabajador(Integer trabajoTrabajador) {
        this.trabajoTrabajador = trabajoTrabajador;
    }

    public Integer getTrabajoDesempleado() {
        return trabajoDesempleado;
    }

    public void setTrabajoDesempleado(Integer trabajoDesempleado) {
        this.trabajoDesempleado = trabajoDesempleado;
    }

    public Integer getTrabajoEstudiante() {
        return trabajoEstudiante;
    }

    public void setTrabajoEstudiante(Integer trabajoEstudiante) {
        this.trabajoEstudiante = trabajoEstudiante;
    }

    public Integer getTrabajoJubilado() {
        return trabajoJubilado;
    }

    public void setTrabajoJubilado(Integer trabajoJubilado) {
        this.trabajoJubilado = trabajoJubilado;
    }

    public Integer getCarnetSi() {
        return carnetSi;
    }

    public void setCarnetSi(Integer carnetSi) {
        this.carnetSi = carnetSi;
    }

    public Integer getCarnetNo() {
        return carnetNo;
    }

    public void setCarnetNo(Integer carnetNo) {
        this.carnetNo = carnetNo;
    }

    public Integer getVehiculoSi() {
        return vehiculoSi;
    }

    public void setVehiculoSi(Integer vehiculoSi) {
        this.vehiculoSi = vehiculoSi;
    }

    public Integer getVehiculoNo() {
        return vehiculoNo;
    }

    public void setVehiculoNo(Integer vehiculoNo) {
        this.vehiculoNo = vehiculoNo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMotivoInicio() {
        return motivoInicio;
    }

    public void setMotivoInicio(String motivoInicio) {
        this.motivoInicio = motivoInicio;
    }

    public String getMotivoFin() {
        return motivoFin;
    }

    public void setMotivoFin(String motivoFin) {
        this.motivoFin = motivoFin;
    }

    public Integer getViajes5() {
        return viajes5;
    }

    public void setViajes5(Integer viajes5) {
        this.viajes5 = viajes5;
    }

    public Integer getViajes515() {
        return viajes515;
    }

    public void setViajes515(Integer viajes515) {
        this.viajes515 = viajes515;
    }

    public Integer getViajes1530() {
        return viajes1530;
    }

    public void setViajes1530(Integer viajes1530) {
        this.viajes1530 = viajes1530;
    }

    public Integer getViajes30() {
        return viajes30;
    }

    public void setViajes30(Integer viajes30) {
        this.viajes30 = viajes30;
    }

    public Integer getPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(Integer pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    public Integer getPagoEfectivo() {
        return pagoEfectivo;
    }

    public void setPagoEfectivo(Integer pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public Integer getIngreso900() {
        return ingreso900;
    }

    public void setIngreso900(Integer ingreso900) {
        this.ingreso900 = ingreso900;
    }

    public Integer getIngreso9001500() {
        return ingreso9001500;
    }

    public void setIngreso9001500(Integer ingreso9001500) {
        this.ingreso9001500 = ingreso9001500;
    }

    public Integer getIngreso15002500() {
        return ingreso15002500;
    }

    public void setIngreso15002500(Integer ingreso15002500) {
        this.ingreso15002500 = ingreso15002500;
    }

    public Integer getIngreso2500() {
        return ingreso2500;
    }

    public void setIngreso2500(Integer ingreso2500) {
        this.ingreso2500 = ingreso2500;
    }

    public Integer getIngresoNsnc() {
        return ingresoNsnc;
    }

    public void setIngresoNsnc(Integer ingresoNsnc) {
        this.ingresoNsnc = ingresoNsnc;
    }

    public Integer getValoracionMuymal() {
        return valoracionMuymal;
    }

    public void setValoracionMuymal(Integer valoriacionMuymal) {
        this.valoracionMuymal = valoriacionMuymal;
    }

    public Integer getValoracionMal() {
        return valoracionMal;
    }

    public void setValoracionMal(Integer valoracionMal) {
        this.valoracionMal = valoracionMal;
    }

    public Integer getValoracionNormal() {
        return valoracionNormal;
    }

    public void setValoracionNormal(Integer valoracionNormal) {
        this.valoracionNormal = valoracionNormal;
    }

    public Integer getValoracionBien() {
        return valoracionBien;
    }

    public void setValoracionBien(Integer valoracionBien) {
        this.valoracionBien = valoracionBien;
    }

    public Integer getValoracionMuybien() {
        return valoracionMuybien;
    }

    public void setValoracionMuybien(Integer valoracionMuybien) {
        this.valoracionMuybien = valoracionMuybien;
    }

    public Integer getThpMm() {
        return thpMm;
    }

    public void setThpMm(Integer thpMm) {
        this.thpMm = thpMm;
    }

    public Integer getThpMa() {
        return thpMa;
    }

    public void setThpMa(Integer thpMa) {
        this.thpMa = thpMa;
    }

    public Integer getThpNo() {
        return thpNo;
    }

    public void setThpNo(Integer thpNo) {
        this.thpNo = thpNo;
    }

    public Integer getThpBi() {
        return thpBi;
    }

    public void setThpBi(Integer thpBi) {
        this.thpBi = thpBi;
    }

    public Integer getThpMb() {
        return thpMb;
    }

    public void setThpMb(Integer thpMb) {
        this.thpMb = thpMb;
    }

    public Integer getThpNs() {
        return thpNs;
    }

    public void setThpNs(Integer thpNs) {
        this.thpNs = thpNs;
    }

    public Integer getThpBe() {
        return thpBe;
    }

    public void setThpBe(Integer thpBe) {
        this.thpBe = thpBe;
    }

    public Integer getThpWo() {
        return thpWo;
    }

    public void setThpWo(Integer thpWo) {
        this.thpWo = thpWo;
    }

    public Integer getThpMi() {
        return thpMi;
    }

    public void setThpMi(Integer thpMi) {
        this.thpMi = thpMi;
    }

    public Integer getThpLi() {
        return thpLi;
    }

    public void setThpLi(Integer thpLi) {
        this.thpLi = thpLi;
    }

    public Integer getTepMm() {
        return tepMm;
    }

    public void setTepMm(Integer tepMm) {
        this.tepMm = tepMm;
    }

    public Integer getTepMa() {
        return tepMa;
    }

    public void setTepMa(Integer tepMa) {
        this.tepMa = tepMa;
    }

    public Integer getTepNo() {
        return tepNo;
    }

    public void setTepNo(Integer tepNo) {
        this.tepNo = tepNo;
    }

    public Integer getTepBi() {
        return tepBi;
    }

    public void setTepBi(Integer tepBi) {
        this.tepBi = tepBi;
    }

    public Integer getTepMb() {
        return tepMb;
    }

    public void setTepMb(Integer tepMb) {
        this.tepMb = tepMb;
    }

    public Integer getTepNs() {
        return tepNs;
    }

    public void setTepNs(Integer tepNs) {
        this.tepNs = tepNs;
    }

    public Integer getTepBe() {
        return tepBe;
    }

    public void setTepBe(Integer tepBe) {
        this.tepBe = tepBe;
    }

    public Integer getTepWo() {
        return tepWo;
    }

    public void setTepWo(Integer tepWo) {
        this.tepWo = tepWo;
    }

    public Integer getTepMi() {
        return tepMi;
    }

    public void setTepMi(Integer tepMi) {
        this.tepMi = tepMi;
    }

    public Integer getTepLi() {
        return tepLi;
    }

    public void setTepLi(Integer tepLi) {
        this.tepLi = tepLi;
    }

    public Integer getTvMm() {
        return tvMm;
    }

    public void setTvMm(Integer tvMm) {
        this.tvMm = tvMm;
    }

    public Integer getTvMa() {
        return tvMa;
    }

    public void setTvMa(Integer tvMa) {
        this.tvMa = tvMa;
    }

    public Integer getTvNo() {
        return tvNo;
    }

    public void setTvNo(Integer tvNo) {
        this.tvNo = tvNo;
    }

    public Integer getTvBi() {
        return tvBi;
    }

    public void setTvBi(Integer tvBi) {
        this.tvBi = tvBi;
    }

    public Integer getTvMb() {
        return tvMb;
    }

    public void setTvMb(Integer tvMb) {
        this.tvMb = tvMb;
    }

    public Integer getTvNs() {
        return tvNs;
    }

    public void setTvNs(Integer tvNs) {
        this.tvNs = tvNs;
    }

    public Integer getTvBe() {
        return tvBe;
    }

    public void setTvBe(Integer tvBe) {
        this.tvBe = tvBe;
    }

    public Integer getTvWo() {
        return tvWo;
    }

    public void setTvWo(Integer tvWo) {
        this.tvWo = tvWo;
    }

    public Integer getTvMi() {
        return tvMi;
    }

    public void setTvMi(Integer tvMi) {
        this.tvMi = tvMi;
    }

    public Integer getTvLi() {
        return tvLi;
    }

    public void setTvLi(Integer tvLi) {
        this.tvLi = tvLi;
    }

    public Integer getTpdMm() {
        return tpdMm;
    }

    public void setTpdMm(Integer tpdMm) {
        this.tpdMm = tpdMm;
    }

    public Integer getTpdMa() {
        return tpdMa;
    }

    public void setTpdMa(Integer tpdMa) {
        this.tpdMa = tpdMa;
    }

    public Integer getTpdNo() {
        return tpdNo;
    }

    public void setTpdNo(Integer tpdNo) {
        this.tpdNo = tpdNo;
    }

    public Integer getTpdBi() {
        return tpdBi;
    }

    public void setTpdBi(Integer tpdBi) {
        this.tpdBi = tpdBi;
    }

    public Integer getTpdMb() {
        return tpdMb;
    }

    public void setTpdMb(Integer tpdMb) {
        this.tpdMb = tpdMb;
    }

    public Integer getTpdNs() {
        return tpdNs;
    }

    public void setTpdNs(Integer tpdNs) {
        this.tpdNs = tpdNs;
    }

    public Integer getTpdBe() {
        return tpdBe;
    }

    public void setTpdBe(Integer tpdBe) {
        this.tpdBe = tpdBe;
    }

    public Integer getTpdWo() {
        return tpdWo;
    }

    public void setTpdWo(Integer tpdWo) {
        this.tpdWo = tpdWo;
    }

    public Integer getTpdMi() {
        return tpdMi;
    }

    public void setTpdMi(Integer tpdMi) {
        this.tpdMi = tpdMi;
    }

    public Integer getTpdLi() {
        return tpdLi;
    }

    public void setTpdLi(Integer tpdLi) {
        this.tpdLi = tpdLi;
    }

    public Integer getPvMm() {
        return pvMm;
    }

    public void setPvMm(Integer pvMm) {
        this.pvMm = pvMm;
    }

    public Integer getPvMa() {
        return pvMa;
    }

    public void setPvMa(Integer pvMa) {
        this.pvMa = pvMa;
    }

    public Integer getPvNo() {
        return pvNo;
    }

    public void setPvNo(Integer pvNo) {
        this.pvNo = pvNo;
    }

    public Integer getPvBi() {
        return pvBi;
    }

    public void setPvBi(Integer pvBi) {
        this.pvBi = pvBi;
    }

    public Integer getPvMb() {
        return pvMb;
    }

    public void setPvMb(Integer pvMb) {
        this.pvMb = pvMb;
    }

    public Integer getPvNs() {
        return pvNs;
    }

    public void setPvNs(Integer pvNs) {
        this.pvNs = pvNs;
    }

    public Integer getPvBe() {
        return pvBe;
    }

    public void setPvBe(Integer pvBe) {
        this.pvBe = pvBe;
    }

    public Integer getPvWo() {
        return pvWo;
    }

    public void setPvWo(Integer pvWo) {
        this.pvWo = pvWo;
    }

    public Integer getPvMi() {
        return pvMi;
    }

    public void setPvMi(Integer pvMi) {
        this.pvMi = pvMi;
    }

    public Integer getPvLi() {
        return pvLi;
    }

    public void setPvLi(Integer pvLi) {
        this.pvLi = pvLi;
    }

    public Integer getFtMm() {
        return ftMm;
    }

    public void setFtMm(Integer ftMm) {
        this.ftMm = ftMm;
    }

    public Integer getFtMa() {
        return ftMa;
    }

    public void setFtMa(Integer ftMa) {
        this.ftMa = ftMa;
    }

    public Integer getFtNo() {
        return ftNo;
    }

    public void setFtNo(Integer ftNo) {
        this.ftNo = ftNo;
    }

    public Integer getFtBi() {
        return ftBi;
    }

    public void setFtBi(Integer ftBi) {
        this.ftBi = ftBi;
    }

    public Integer getFtMb() {
        return ftMb;
    }

    public void setFtMb(Integer ftMb) {
        this.ftMb = ftMb;
    }

    public Integer getFtNs() {
        return ftNs;
    }

    public void setFtNs(Integer ftNs) {
        this.ftNs = ftNs;
    }

    public Integer getFtBe() {
        return ftBe;
    }

    public void setFtBe(Integer ftBe) {
        this.ftBe = ftBe;
    }

    public Integer getFtWo() {
        return ftWo;
    }

    public void setFtWo(Integer ftWo) {
        this.ftWo = ftWo;
    }

    public Integer getFtMi() {
        return ftMi;
    }

    public void setFtMi(Integer ftMi) {
        this.ftMi = ftMi;
    }

    public Integer getFtLi() {
        return ftLi;
    }

    public void setFtLi(Integer ftLi) {
        this.ftLi = ftLi;
    }

    public Integer getSoMm() {
        return soMm;
    }

    public void setSoMm(Integer soMm) {
        this.soMm = soMm;
    }

    public Integer getSoMa() {
        return soMa;
    }

    public void setSoMa(Integer soMa) {
        this.soMa = soMa;
    }

    public Integer getSoNo() {
        return soNo;
    }

    public void setSoNo(Integer soNo) {
        this.soNo = soNo;
    }

    public Integer getSoBi() {
        return soBi;
    }

    public void setSoBi(Integer soBi) {
        this.soBi = soBi;
    }

    public Integer getSoMb() {
        return soMb;
    }

    public void setSoMb(Integer soMb) {
        this.soMb = soMb;
    }

    public Integer getSoNs() {
        return soNs;
    }

    public void setSoNs(Integer soNs) {
        this.soNs = soNs;
    }

    public Integer getSoBe() {
        return soBe;
    }

    public void setSoBe(Integer soBe) {
        this.soBe = soBe;
    }

    public Integer getSoWo() {
        return soWo;
    }

    public void setSoWo(Integer soWo) {
        this.soWo = soWo;
    }

    public Integer getSoMi() {
        return soMi;
    }

    public void setSoMi(Integer soMi) {
        this.soMi = soMi;
    }

    public Integer getSoLi() {
        return soLi;
    }

    public void setSoLi(Integer soLi) {
        this.soLi = soLi;
    }

    public Integer getFsMm() {
        return fsMm;
    }

    public void setFsMm(Integer fsMm) {
        this.fsMm = fsMm;
    }

    public Integer getFsMa() {
        return fsMa;
    }

    public void setFsMa(Integer fsMa) {
        this.fsMa = fsMa;
    }

    public Integer getFsNo() {
        return fsNo;
    }

    public void setFsNo(Integer fsNo) {
        this.fsNo = fsNo;
    }

    public Integer getFsBi() {
        return fsBi;
    }

    public void setFsBi(Integer fsBi) {
        this.fsBi = fsBi;
    }

    public Integer getFsMb() {
        return fsMb;
    }

    public void setFsMb(Integer fsMb) {
        this.fsMb = fsMb;
    }

    public Integer getFsNs() {
        return fsNs;
    }

    public void setFsNs(Integer fsNs) {
        this.fsNs = fsNs;
    }

    public Integer getFsBe() {
        return fsBe;
    }

    public void setFsBe(Integer fsBe) {
        this.fsBe = fsBe;
    }

    public Integer getFsWo() {
        return fsWo;
    }

    public void setFsWo(Integer fsWo) {
        this.fsWo = fsWo;
    }

    public Integer getFsMi() {
        return fsMi;
    }

    public void setFsMi(Integer fsMi) {
        this.fsMi = fsMi;
    }

    public Integer getFsLi() {
        return fsLi;
    }

    public void setFsLi(Integer fsLi) {
        this.fsLi = fsLi;
    }

    public Integer getLeMm() {
        return leMm;
    }

    public void setLeMm(Integer leMm) {
        this.leMm = leMm;
    }

    public Integer getLeMa() {
        return leMa;
    }

    public void setLeMa(Integer leMa) {
        this.leMa = leMa;
    }

    public Integer getLeNo() {
        return leNo;
    }

    public void setLeNo(Integer leNo) {
        this.leNo = leNo;
    }

    public Integer getLeBi() {
        return leBi;
    }

    public void setLeBi(Integer leBi) {
        this.leBi = leBi;
    }

    public Integer getLeMb() {
        return leMb;
    }

    public void setLeMb(Integer leMb) {
        this.leMb = leMb;
    }

    public Integer getLeNs() {
        return leNs;
    }

    public void setLeNs(Integer leNs) {
        this.leNs = leNs;
    }

    public Integer getLeBe() {
        return leBe;
    }

    public void setLeBe(Integer leBe) {
        this.leBe = leBe;
    }

    public Integer getLeWo() {
        return leWo;
    }

    public void setLeWo(Integer leWo) {
        this.leWo = leWo;
    }

    public Integer getLeMi() {
        return leMi;
    }

    public void setLeMi(Integer leMi) {
        this.leMi = leMi;
    }

    public Integer getLeLi() {
        return leLi;
    }

    public void setLeLi(Integer leLi) {
        this.leLi = leLi;
    }

    public Integer getSnMm() {
        return snMm;
    }

    public void setSnMm(Integer snMm) {
        this.snMm = snMm;
    }

    public Integer getSnMa() {
        return snMa;
    }

    public void setSnMa(Integer snMa) {
        this.snMa = snMa;
    }

    public Integer getSnNo() {
        return snNo;
    }

    public void setSnNo(Integer snNo) {
        this.snNo = snNo;
    }

    public Integer getSnBi() {
        return snBi;
    }

    public void setSnBi(Integer snBi) {
        this.snBi = snBi;
    }

    public Integer getSnMb() {
        return snMb;
    }

    public void setSnMb(Integer snMb) {
        this.snMb = snMb;
    }

    public Integer getSnNs() {
        return snNs;
    }

    public void setSnNs(Integer snNs) {
        this.snNs = snNs;
    }

    public Integer getSnBe() {
        return snBe;
    }

    public void setSnBe(Integer snBe) {
        this.snBe = snBe;
    }

    public Integer getSnWo() {
        return snWo;
    }

    public void setSnWo(Integer snWo) {
        this.snWo = snWo;
    }

    public Integer getSnMi() {
        return snMi;
    }

    public void setSnMi(Integer snMi) {
        this.snMi = snMi;
    }

    public Integer getSnLi() {
        return snLi;
    }

    public void setSnLi(Integer snLi) {
        this.snLi = snLi;
    }

    public Integer getSfsMm() {
        return sfsMm;
    }

    public void setSfsMm(Integer sfsMm) {
        this.sfsMm = sfsMm;
    }

    public Integer getSfsMa() {
        return sfsMa;
    }

    public void setSfsMa(Integer sfsMa) {
        this.sfsMa = sfsMa;
    }

    public Integer getSfsNo() {
        return sfsNo;
    }

    public void setSfsNo(Integer sfsNo) {
        this.sfsNo = sfsNo;
    }

    public Integer getSfsBi() {
        return sfsBi;
    }

    public void setSfsBi(Integer sfsBi) {
        this.sfsBi = sfsBi;
    }

    public Integer getSfsMb() {
        return sfsMb;
    }

    public void setSfsMb(Integer sfsMb) {
        this.sfsMb = sfsMb;
    }

    public Integer getSfsNs() {
        return sfsNs;
    }

    public void setSfsNs(Integer sfsNs) {
        this.sfsNs = sfsNs;
    }

    public Integer getSfsBe() {
        return sfsBe;
    }

    public void setSfsBe(Integer sfsBe) {
        this.sfsBe = sfsBe;
    }

    public Integer getSfsWo() {
        return sfsWo;
    }

    public void setSfsWo(Integer sfsWo) {
        this.sfsWo = sfsWo;
    }

    public Integer getSfsMi() {
        return sfsMi;
    }

    public void setSfsMi(Integer sfsMi) {
        this.sfsMi = sfsMi;
    }

    public Integer getSfsLi() {
        return sfsLi;
    }

    public void setSfsLi(Integer sfsLi) {
        this.sfsLi = sfsLi;
    }

    public Integer getClMm() {
        return clMm;
    }

    public void setClMm(Integer clMm) {
        this.clMm = clMm;
    }

    public Integer getClMa() {
        return clMa;
    }

    public void setClMa(Integer clMa) {
        this.clMa = clMa;
    }

    public Integer getClNo() {
        return clNo;
    }

    public void setClNo(Integer clNo) {
        this.clNo = clNo;
    }

    public Integer getClBi() {
        return clBi;
    }

    public void setClBi(Integer clBi) {
        this.clBi = clBi;
    }

    public Integer getClMb() {
        return clMb;
    }

    public void setClMb(Integer clMb) {
        this.clMb = clMb;
    }

    public Integer getClNs() {
        return clNs;
    }

    public void setClNs(Integer clNs) {
        this.clNs = clNs;
    }

    public Integer getClBe() {
        return clBe;
    }

    public void setClBe(Integer clBe) {
        this.clBe = clBe;
    }

    public Integer getClWo() {
        return clWo;
    }

    public void setClWo(Integer clWo) {
        this.clWo = clWo;
    }

    public Integer getClMi() {
        return clMi;
    }

    public void setClMi(Integer clMi) {
        this.clMi = clMi;
    }

    public Integer getClLi() {
        return clLi;
    }

    public void setClLi(Integer clLi) {
        this.clLi = clLi;
    }

    public Integer getIpiMm() {
        return ipiMm;
    }

    public void setIpiMm(Integer ipiMm) {
        this.ipiMm = ipiMm;
    }

    public Integer getIpiMa() {
        return ipiMa;
    }

    public void setIpiMa(Integer ipiMa) {
        this.ipiMa = ipiMa;
    }

    public Integer getIpiNo() {
        return ipiNo;
    }

    public void setIpiNo(Integer ipiNo) {
        this.ipiNo = ipiNo;
    }

    public Integer getIpiBi() {
        return ipiBi;
    }

    public void setIpiBi(Integer ipiBi) {
        this.ipiBi = ipiBi;
    }

    public Integer getIpiMb() {
        return ipiMb;
    }

    public void setIpiMb(Integer ipiMb) {
        this.ipiMb = ipiMb;
    }

    public Integer getIpiNs() {
        return ipiNs;
    }

    public void setIpiNs(Integer ipiNs) {
        this.ipiNs = ipiNs;
    }

    public Integer getIpiBe() {
        return ipiBe;
    }

    public void setIpiBe(Integer ipiBe) {
        this.ipiBe = ipiBe;
    }

    public Integer getIpiWo() {
        return ipiWo;
    }

    public void setIpiWo(Integer ipiWo) {
        this.ipiWo = ipiWo;
    }

    public Integer getIpiMi() {
        return ipiMi;
    }

    public void setIpiMi(Integer ipiMi) {
        this.ipiMi = ipiMi;
    }

    public Integer getIpiLi() {
        return ipiLi;
    }

    public void setIpiLi(Integer ipiLi) {
        this.ipiLi = ipiLi;
    }

    public Integer getIsiMm() {
        return isiMm;
    }

    public void setIsiMm(Integer isiMm) {
        this.isiMm = isiMm;
    }

    public Integer getIsiMa() {
        return isiMa;
    }

    public void setIsiMa(Integer isiMa) {
        this.isiMa = isiMa;
    }

    public Integer getIsiNo() {
        return isiNo;
    }

    public void setIsiNo(Integer isiNo) {
        this.isiNo = isiNo;
    }

    public Integer getIsiBi() {
        return isiBi;
    }

    public void setIsiBi(Integer isiBi) {
        this.isiBi = isiBi;
    }

    public Integer getIsiMb() {
        return isiMb;
    }

    public void setIsiMb(Integer isiMb) {
        this.isiMb = isiMb;
    }

    public Integer getIsiNs() {
        return isiNs;
    }

    public void setIsiNs(Integer isiNs) {
        this.isiNs = isiNs;
    }

    public Integer getIsiBe() {
        return isiBe;
    }

    public void setIsiBe(Integer isiBe) {
        this.isiBe = isiBe;
    }

    public Integer getIsiWo() {
        return isiWo;
    }

    public void setIsiWo(Integer isiWo) {
        this.isiWo = isiWo;
    }

    public Integer getIsiMi() {
        return isiMi;
    }

    public void setIsiMi(Integer isiMi) {
        this.isiMi = isiMi;
    }

    public Integer getIsiLi() {
        return isiLi;
    }

    public void setIsiLi(Integer isiLi) {
        this.isiLi = isiLi;
    }

    public Integer getImaMm() {
        return imaMm;
    }

    public void setImaMm(Integer imaMm) {
        this.imaMm = imaMm;
    }

    public Integer getImaMa() {
        return imaMa;
    }

    public void setImaMa(Integer imaMa) {
        this.imaMa = imaMa;
    }

    public Integer getImaNo() {
        return imaNo;
    }

    public void setImaNo(Integer imaNo) {
        this.imaNo = imaNo;
    }

    public Integer getImaBi() {
        return imaBi;
    }

    public void setImaBi(Integer imaBi) {
        this.imaBi = imaBi;
    }

    public Integer getImaMb() {
        return imaMb;
    }

    public void setImaMb(Integer imaMb) {
        this.imaMb = imaMb;
    }

    public Integer getImaNs() {
        return imaNs;
    }

    public void setImaNs(Integer imaNs) {
        this.imaNs = imaNs;
    }

    public Integer getImaBe() {
        return imaBe;
    }

    public void setImaBe(Integer imaBe) {
        this.imaBe = imaBe;
    }

    public Integer getImaWo() {
        return imaWo;
    }

    public void setImaWo(Integer imaWo) {
        this.imaWo = imaWo;
    }

    public Integer getImaMi() {
        return imaMi;
    }

    public void setImaMi(Integer imaMi) {
        this.imaMi = imaMi;
    }

    public Integer getImaLi() {
        return imaLi;
    }

    public void setImaLi(Integer imaLi) {
        this.imaLi = imaLi;
    }

    public Integer getOcuMm() {
        return ocuMm;
    }

    public void setOcuMm(Integer ocuMm) {
        this.ocuMm = ocuMm;
    }

    public Integer getOcuMa() {
        return ocuMa;
    }

    public void setOcuMa(Integer ocuMa) {
        this.ocuMa = ocuMa;
    }

    public Integer getOcuNo() {
        return ocuNo;
    }

    public void setOcuNo(Integer ocuNo) {
        this.ocuNo = ocuNo;
    }

    public Integer getOcuBi() {
        return ocuBi;
    }

    public void setOcuBi(Integer ocuBi) {
        this.ocuBi = ocuBi;
    }

    public Integer getOcuMb() {
        return ocuMb;
    }

    public void setOcuMb(Integer ocuMb) {
        this.ocuMb = ocuMb;
    }

    public Integer getOcuNs() {
        return ocuNs;
    }

    public void setOcuNs(Integer ocuNs) {
        this.ocuNs = ocuNs;
    }

    public Integer getOcuBe() {
        return ocuBe;
    }

    public void setOcuBe(Integer ocuBe) {
        this.ocuBe = ocuBe;
    }

    public Integer getOcuWo() {
        return ocuWo;
    }

    public void setOcuWo(Integer ocuWo) {
        this.ocuWo = ocuWo;
    }

    public Integer getOcuMi() {
        return ocuMi;
    }

    public void setOcuMi(Integer ocuMi) {
        this.ocuMi = ocuMi;
    }

    public Integer getOcuLi() {
        return ocuLi;
    }

    public void setOcuLi(Integer ocuLi) {
        this.ocuLi = ocuLi;
    }

    public Integer getCacMm() {
        return cacMm;
    }

    public void setCacMm(Integer cacMm) {
        this.cacMm = cacMm;
    }

    public Integer getCacMa() {
        return cacMa;
    }

    public void setCacMa(Integer cacMa) {
        this.cacMa = cacMa;
    }

    public Integer getCacNo() {
        return cacNo;
    }

    public void setCacNo(Integer cacNo) {
        this.cacNo = cacNo;
    }

    public Integer getCacBi() {
        return cacBi;
    }

    public void setCacBi(Integer cacBi) {
        this.cacBi = cacBi;
    }

    public Integer getCacMb() {
        return cacMb;
    }

    public void setCacMb(Integer cacMb) {
        this.cacMb = cacMb;
    }

    public Integer getCacNs() {
        return cacNs;
    }

    public void setCacNs(Integer cacNs) {
        this.cacNs = cacNs;
    }

    public Integer getCacBe() {
        return cacBe;
    }

    public void setCacBe(Integer cacBe) {
        this.cacBe = cacBe;
    }

    public Integer getCacWo() {
        return cacWo;
    }

    public void setCacWo(Integer cacWo) {
        this.cacWo = cacWo;
    }

    public Integer getCacMi() {
        return cacMi;
    }

    public void setCacMi(Integer cacMi) {
        this.cacMi = cacMi;
    }

    public Integer getCacLi() {
        return cacLi;
    }

    public void setCacLi(Integer cacLi) {
        this.cacLi = cacLi;
    }

    public Integer getPmrMm() {
        return pmrMm;
    }

    public void setPmrMm(Integer pmrMm) {
        this.pmrMm = pmrMm;
    }

    public Integer getPmrMa() {
        return pmrMa;
    }

    public void setPmrMa(Integer pmrMa) {
        this.pmrMa = pmrMa;
    }

    public Integer getPmrNo() {
        return pmrNo;
    }

    public void setPmrNo(Integer pmrNo) {
        this.pmrNo = pmrNo;
    }

    public Integer getPmrBi() {
        return pmrBi;
    }

    public void setPmrBi(Integer pmrBi) {
        this.pmrBi = pmrBi;
    }

    public Integer getPmrMb() {
        return pmrMb;
    }

    public void setPmrMb(Integer pmrMb) {
        this.pmrMb = pmrMb;
    }

    public Integer getPmrNs() {
        return pmrNs;
    }

    public void setPmrNs(Integer pmrNs) {
        this.pmrNs = pmrNs;
    }

    public Integer getPmrBe() {
        return pmrBe;
    }

    public void setPmrBe(Integer pmrBe) {
        this.pmrBe = pmrBe;
    }

    public Integer getPmrWo() {
        return pmrWo;
    }

    public void setPmrWo(Integer pmrWo) {
        this.pmrWo = pmrWo;
    }

    public Integer getPmrMi() {
        return pmrMi;
    }

    public void setPmrMi(Integer pmrMi) {
        this.pmrMi = pmrMi;
    }

    public Integer getPmrLi() {
        return pmrLi;
    }

    public void setPmrLi(Integer pmrLi) {
        this.pmrLi = pmrLi;
    }

    public Integer getCcfMm() {
        return ccfMm;
    }

    public void setCcfMm(Integer ccfMm) {
        this.ccfMm = ccfMm;
    }

    public Integer getCcfMa() {
        return ccfMa;
    }

    public void setCcfMa(Integer ccfMa) {
        this.ccfMa = ccfMa;
    }

    public Integer getCcfNo() {
        return ccfNo;
    }

    public void setCcfNo(Integer ccfNo) {
        this.ccfNo = ccfNo;
    }

    public Integer getCcfBi() {
        return ccfBi;
    }

    public void setCcfBi(Integer ccfBi) {
        this.ccfBi = ccfBi;
    }

    public Integer getCcfMb() {
        return ccfMb;
    }

    public void setCcfMb(Integer ccfMb) {
        this.ccfMb = ccfMb;
    }

    public Integer getCcfNs() {
        return ccfNs;
    }

    public void setCcfNs(Integer ccfNs) {
        this.ccfNs = ccfNs;
    }

    public Integer getCcfBe() {
        return ccfBe;
    }

    public void setCcfBe(Integer ccfBe) {
        this.ccfBe = ccfBe;
    }

    public Integer getCcfWo() {
        return ccfWo;
    }

    public void setCcfWo(Integer ccfWo) {
        this.ccfWo = ccfWo;
    }

    public Integer getCcfMi() {
        return ccfMi;
    }

    public void setCcfMi(Integer ccfMi) {
        this.ccfMi = ccfMi;
    }

    public Integer getCcfLi() {
        return ccfLi;
    }

    public void setCcfLi(Integer ccfLi) {
        this.ccfLi = ccfLi;
    }

    public Integer getLaMm() {
        return laMm;
    }

    public void setLaMm(Integer laMm) {
        this.laMm = laMm;
    }

    public Integer getLaMa() {
        return laMa;
    }

    public void setLaMa(Integer laMa) {
        this.laMa = laMa;
    }

    public Integer getLaNo() {
        return laNo;
    }

    public void setLaNo(Integer laNo) {
        this.laNo = laNo;
    }

    public Integer getLaBi() {
        return laBi;
    }

    public void setLaBi(Integer laBi) {
        this.laBi = laBi;
    }

    public Integer getLaMb() {
        return laMb;
    }

    public void setLaMb(Integer laMb) {
        this.laMb = laMb;
    }

    public Integer getLaNs() {
        return laNs;
    }

    public void setLaNs(Integer laNs) {
        this.laNs = laNs;
    }

    public Integer getLaBe() {
        return laBe;
    }

    public void setLaBe(Integer laBe) {
        this.laBe = laBe;
    }

    public Integer getLaWo() {
        return laWo;
    }

    public void setLaWo(Integer laWo) {
        this.laWo = laWo;
    }

    public Integer getLaMi() {
        return laMi;
    }

    public void setLaMi(Integer laMi) {
        this.laMi = laMi;
    }

    public Integer getLaLi() {
        return laLi;
    }

    public void setLaLi(Integer laLi) {
        this.laLi = laLi;
    }

    public Integer getPpoMm() {
        return ppoMm;
    }

    public void setPpoMm(Integer ppoMm) {
        this.ppoMm = ppoMm;
    }

    public Integer getPpoMa() {
        return ppoMa;
    }

    public void setPpoMa(Integer ppoMa) {
        this.ppoMa = ppoMa;
    }

    public Integer getPpoNo() {
        return ppoNo;
    }

    public void setPpoNo(Integer ppoNo) {
        this.ppoNo = ppoNo;
    }

    public Integer getPpoBi() {
        return ppoBi;
    }

    public void setPpoBi(Integer ppoBi) {
        this.ppoBi = ppoBi;
    }

    public Integer getPpoMb() {
        return ppoMb;
    }

    public void setPpoMb(Integer ppoMb) {
        this.ppoMb = ppoMb;
    }

    public Integer getPpoNs() {
        return ppoNs;
    }

    public void setPpoNs(Integer ppoNs) {
        this.ppoNs = ppoNs;
    }

    public Integer getPpoBe() {
        return ppoBe;
    }

    public void setPpoBe(Integer ppoBe) {
        this.ppoBe = ppoBe;
    }

    public Integer getPpoWo() {
        return ppoWo;
    }

    public void setPpoWo(Integer ppoWo) {
        this.ppoWo = ppoWo;
    }

    public Integer getPpoMi() {
        return ppoMi;
    }

    public void setPpoMi(Integer ppoMi) {
        this.ppoMi = ppoMi;
    }

    public Integer getPpoLi() {
        return ppoLi;
    }

    public void setPpoLi(Integer ppoLi) {
        this.ppoLi = ppoLi;
    }

    public Integer getFcMm() {
        return fcMm;
    }

    public void setFcMm(Integer fcMm) {
        this.fcMm = fcMm;
    }

    public Integer getFcMa() {
        return fcMa;
    }

    public void setFcMa(Integer fcMa) {
        this.fcMa = fcMa;
    }

    public Integer getFcNo() {
        return fcNo;
    }

    public void setFcNo(Integer fcNo) {
        this.fcNo = fcNo;
    }

    public Integer getFcBi() {
        return fcBi;
    }

    public void setFcBi(Integer fcBi) {
        this.fcBi = fcBi;
    }

    public Integer getFcMb() {
        return fcMb;
    }

    public void setFcMb(Integer fcMb) {
        this.fcMb = fcMb;
    }

    public Integer getFcNs() {
        return fcNs;
    }

    public void setFcNs(Integer fcNs) {
        this.fcNs = fcNs;
    }

    public Integer getFcBe() {
        return fcBe;
    }

    public void setFcBe(Integer fcBe) {
        this.fcBe = fcBe;
    }

    public Integer getFcWo() {
        return fcWo;
    }

    public void setFcWo(Integer fcWo) {
        this.fcWo = fcWo;
    }

    public Integer getFcMi() {
        return fcMi;
    }

    public void setFcMi(Integer fcMi) {
        this.fcMi = fcMi;
    }

    public Integer getFcLi() {
        return fcLi;
    }

    public void setFcLi(Integer fcLi) {
        this.fcLi = fcLi;
    }

    public Integer getAcoMm() {
        return acoMm;
    }

    public void setAcoMm(Integer acoMm) {
        this.acoMm = acoMm;
    }

    public Integer getAcoMa() {
        return acoMa;
    }

    public void setAcoMa(Integer acoMa) {
        this.acoMa = acoMa;
    }

    public Integer getAcoNo() {
        return acoNo;
    }

    public void setAcoNo(Integer acoNo) {
        this.acoNo = acoNo;
    }

    public Integer getAcoBi() {
        return acoBi;
    }

    public void setAcoBi(Integer acoBi) {
        this.acoBi = acoBi;
    }

    public Integer getAcoMb() {
        return acoMb;
    }

    public void setAcoMb(Integer acoMb) {
        this.acoMb = acoMb;
    }

    public Integer getAcoNs() {
        return acoNs;
    }

    public void setAcoNs(Integer acoNs) {
        this.acoNs = acoNs;
    }

    public Integer getAcoBe() {
        return acoBe;
    }

    public void setAcoBe(Integer acoBe) {
        this.acoBe = acoBe;
    }

    public Integer getAcoWo() {
        return acoWo;
    }

    public void setAcoWo(Integer acoWo) {
        this.acoWo = acoWo;
    }

    public Integer getAcoMi() {
        return acoMi;
    }

    public void setAcoMi(Integer acoMi) {
        this.acoMi = acoMi;
    }

    public Integer getAcoLi() {
        return acoLi;
    }

    public void setAcoLi(Integer acoLi) {
        this.acoLi = acoLi;
    }

    public Integer getIbhMm() {
        return ibhMm;
    }

    public void setIbhMm(Integer ibhMm) {
        this.ibhMm = ibhMm;
    }

    public Integer getIbhMa() {
        return ibhMa;
    }

    public void setIbhMa(Integer ibhMa) {
        this.ibhMa = ibhMa;
    }

    public Integer getIbhNo() {
        return ibhNo;
    }

    public void setIbhNo(Integer ibhNo) {
        this.ibhNo = ibhNo;
    }

    public Integer getIbhBi() {
        return ibhBi;
    }

    public void setIbhBi(Integer ibhBi) {
        this.ibhBi = ibhBi;
    }

    public Integer getIbhMb() {
        return ibhMb;
    }

    public void setIbhMb(Integer ibhMb) {
        this.ibhMb = ibhMb;
    }

    public Integer getIbhNs() {
        return ibhNs;
    }

    public void setIbhNs(Integer ibhNs) {
        this.ibhNs = ibhNs;
    }

    public Integer getIbhBe() {
        return ibhBe;
    }

    public void setIbhBe(Integer ibhBe) {
        this.ibhBe = ibhBe;
    }

    public Integer getIbhWo() {
        return ibhWo;
    }

    public void setIbhWo(Integer ibhWo) {
        this.ibhWo = ibhWo;
    }

    public Integer getIbhMi() {
        return ibhMi;
    }

    public void setIbhMi(Integer ibhMi) {
        this.ibhMi = ibhMi;
    }

    public Integer getIbhLi() {
        return ibhLi;
    }

    public void setIbhLi(Integer ibhLi) {
        this.ibhLi = ibhLi;
    }

    public Integer getCasMm() {
        return casMm;
    }

    public void setCasMm(Integer casMm) {
        this.casMm = casMm;
    }

    public Integer getCasMa() {
        return casMa;
    }

    public void setCasMa(Integer casMa) {
        this.casMa = casMa;
    }

    public Integer getCasNo() {
        return casNo;
    }

    public void setCasNo(Integer casNo) {
        this.casNo = casNo;
    }

    public Integer getCasBi() {
        return casBi;
    }

    public void setCasBi(Integer casBi) {
        this.casBi = casBi;
    }

    public Integer getCasMb() {
        return casMb;
    }

    public void setCasMb(Integer casMb) {
        this.casMb = casMb;
    }

    public Integer getCasNs() {
        return casNs;
    }

    public void setCasNs(Integer casNs) {
        this.casNs = casNs;
    }

    public Integer getCasBe() {
        return casBe;
    }

    public void setCasBe(Integer casBe) {
        this.casBe = casBe;
    }

    public Integer getCasWo() {
        return casWo;
    }

    public void setCasWo(Integer casWo) {
        this.casWo = casWo;
    }

    public Integer getCasMi() {
        return casMi;
    }

    public void setCasMi(Integer casMi) {
        this.casMi = casMi;
    }

    public Integer getCasLi() {
        return casLi;
    }

    public void setCasLi(Integer casLi) {
        this.casLi = casLi;
    }

    public Integer getVgsMm() {
        return vgsMm;
    }

    public void setVgsMm(Integer vgsMm) {
        this.vgsMm = vgsMm;
    }

    public Integer getVgsMa() {
        return vgsMa;
    }

    public void setVgsMa(Integer vgsMa) {
        this.vgsMa = vgsMa;
    }

    public Integer getVgsNo() {
        return vgsNo;
    }

    public void setVgsNo(Integer vgsNo) {
        this.vgsNo = vgsNo;
    }

    public Integer getVgsBi() {
        return vgsBi;
    }

    public void setVgsBi(Integer vgsBi) {
        this.vgsBi = vgsBi;
    }

    public Integer getVgsMb() {
        return vgsMb;
    }

    public void setVgsMb(Integer vgsMb) {
        this.vgsMb = vgsMb;
    }

    public Integer getThpGroup() {
        return thpGroup;
    }

    public void setThpGroup(Integer thpGroup) {
        this.thpGroup = thpGroup;
    }

    public Integer getTepGroup() {
        return tepGroup;
    }

    public void setTepGroup(Integer tepGroup) {
        this.tepGroup = tepGroup;
    }

    public Integer getTvGroup() {
        return tvGroup;
    }

    public void setTvGroup(Integer tvGroup) {
        this.tvGroup = tvGroup;
    }

    public Integer getTpdGroup() {
        return tpdGroup;
    }

    public void setTpdGroup(Integer tpdGroup) {
        this.tpdGroup = tpdGroup;
    }

    public Integer getPvGroup() {
        return pvGroup;
    }

    public void setPvGroup(Integer pvGroup) {
        this.pvGroup = pvGroup;
    }

    public Integer getFtGroup() {
        return ftGroup;
    }

    public void setFtGroup(Integer ftGroup) {
        this.ftGroup = ftGroup;
    }

    public Integer getSoGroup() {
        return soGroup;
    }

    public void setSoGroup(Integer soGroup) {
        this.soGroup = soGroup;
    }

    public Integer getFsGroup() {
        return fsGroup;
    }

    public void setFsGroup(Integer fsGroup) {
        this.fsGroup = fsGroup;
    }

    public Integer getLeGroup() {
        return leGroup;
    }

    public void setLeGroup(Integer leGroup) {
        this.leGroup = leGroup;
    }

    public Integer getSnGroup() {
        return snGroup;
    }

    public void setSnGroup(Integer snGroup) {
        this.snGroup = snGroup;
    }

    public Integer getSfsGroup() {
        return sfsGroup;
    }

    public void setSfsGroup(Integer sfsGroup) {
        this.sfsGroup = sfsGroup;
    }

    public Integer getClGroup() {
        return clGroup;
    }

    public void setClGroup(Integer clGroup) {
        this.clGroup = clGroup;
    }

    public Integer getIpiGroup() {
        return ipiGroup;
    }

    public void setIpiGroup(Integer ipiGroup) {
        this.ipiGroup = ipiGroup;
    }

    public Integer getIsiGroup() {
        return isiGroup;
    }

    public void setIsiGroup(Integer isiGroup) {
        this.isiGroup = isiGroup;
    }

    public Integer getImaGroup() {
        return imaGroup;
    }

    public void setImaGroup(Integer imaGroup) {
        this.imaGroup = imaGroup;
    }

    public Integer getOcuGroup() {
        return ocuGroup;
    }

    public void setOcuGroup(Integer ocuGroup) {
        this.ocuGroup = ocuGroup;
    }

    public Integer getCacGroup() {
        return cacGroup;
    }

    public void setCacGroup(Integer cacGroup) {
        this.cacGroup = cacGroup;
    }

    public Integer getPmrGroup() {
        return pmrGroup;
    }

    public void setPmrGroup(Integer pmrGroup) {
        this.pmrGroup = pmrGroup;
    }

    public Integer getCcfGroup() {
        return ccfGroup;
    }

    public void setCcfGroup(Integer ccfGroup) {
        this.ccfGroup = ccfGroup;
    }

    public Integer getLaGroup() {
        return laGroup;
    }

    public void setLaGroup(Integer laGroup) {
        this.laGroup = laGroup;
    }

    public Integer getPpoGroup() {
        return ppoGroup;
    }

    public void setPpoGroup(Integer ppoGroup) {
        this.ppoGroup = ppoGroup;
    }

    public Integer getFcGroup() {
        return fcGroup;
    }

    public void setFcGroup(Integer fcGroup) {
        this.fcGroup = fcGroup;
    }

    public Integer getAcoGroup() {
        return acoGroup;
    }

    public void setAcoGroup(Integer acoGroup) {
        this.acoGroup = acoGroup;
    }

    public Integer getIbhGroup() {
        return ibhGroup;
    }

    public void setIbhGroup(Integer ibhGroup) {
        this.ibhGroup = ibhGroup;
    }

    public Integer getCasGroup() {
        return casGroup;
    }

    public void setCasGroup(Integer casGroup) {
        this.casGroup = casGroup;
    }

    public Integer getVgsGroup() {
        return vgsGroup;
    }

    public void setVgsGroup(Integer vgsGroup) {
        this.vgsGroup = vgsGroup;
    }

    public String getOtrasLineas() {
        return otrasLineas;
    }

    public void setOtrasLineas(String otrasLineas) {
        this.otrasLineas = otrasLineas;
    }

    public String getParadaSubida() {
        return paradaSubida;
    }

    public void setParadaSubida(String paradaSubida) {
        this.paradaSubida = paradaSubida;
    }

    public String getParadaBajada() {
        return paradaBajada;
    }

    public void setParadaBajada(String paradaBajada) {
        this.paradaBajada = paradaBajada;
    }

    public Integer getIamMm() {
        return iamMm;
    }

    public void setIamMm(Integer iamMm) {
        this.iamMm = iamMm;
    }

    public Integer getIamMa() {
        return iamMa;
    }

    public void setIamMa(Integer iamMa) {
        this.iamMa = iamMa;
    }

    public Integer getIamNo() {
        return iamNo;
    }

    public void setIamNo(Integer iamNo) {
        this.iamNo = iamNo;
    }

    public Integer getIamBi() {
        return iamBi;
    }

    public void setIamBi(Integer iamBi) {
        this.iamBi = iamBi;
    }

    public Integer getIamMb() {
        return iamMb;
    }

    public void setIamMb(Integer iamMb) {
        this.iamMb = iamMb;
    }

    public Integer getIamNs() {
        return iamNs;
    }

    public void setIamNs(Integer iamNs) {
        this.iamNs = iamNs;
    }

    public Integer getIamBe() {
        return iamBe;
    }

    public void setIamBe(Integer iamBe) {
        this.iamBe = iamBe;
    }

    public Integer getIamWo() {
        return iamWo;
    }

    public void setIamWo(Integer iamWo) {
        this.iamWo = iamWo;
    }

    public Integer getIamMi() {
        return iamMi;
    }

    public void setIamMi(Integer iamMi) {
        this.iamMi = iamMi;
    }

    public Integer getIamLi() {
        return iamLi;
    }

    public void setIamLi(Integer iamLi) {
        this.iamLi = iamLi;
    }

    public Integer getCpaMm() {
        return cpaMm;
    }

    public void setCpaMm(Integer cpaMm) {
        this.cpaMm = cpaMm;
    }

    public Integer getCpaMa() {
        return cpaMa;
    }

    public void setCpaMa(Integer cpaMa) {
        this.cpaMa = cpaMa;
    }

    public Integer getCpaNo() {
        return cpaNo;
    }

    public void setCpaNo(Integer cpaNo) {
        this.cpaNo = cpaNo;
    }

    public Integer getCpaBi() {
        return cpaBi;
    }

    public void setCpaBi(Integer cpaBi) {
        this.cpaBi = cpaBi;
    }

    public Integer getCpaMb() {
        return cpaMb;
    }

    public void setCpaMb(Integer cpaMb) {
        this.cpaMb = cpaMb;
    }

    public Integer getCpaNs() {
        return cpaNs;
    }

    public void setCpaNs(Integer cpaNs) {
        this.cpaNs = cpaNs;
    }

    public Integer getCpaBe() {
        return cpaBe;
    }

    public void setCpaBe(Integer cpaBe) {
        this.cpaBe = cpaBe;
    }

    public Integer getCpaWo() {
        return cpaWo;
    }

    public void setCpaWo(Integer cpaWo) {
        this.cpaWo = cpaWo;
    }

    public Integer getCpaMi() {
        return cpaMi;
    }

    public void setCpaMi(Integer cpaMi) {
        this.cpaMi = cpaMi;
    }

    public Integer getCpaLi() {
        return cpaLi;
    }

    public void setCpaLi(Integer cpaLi) {
        this.cpaLi = cpaLi;
    }

    public Integer getDmrMm() {
        return dmrMm;
    }

    public void setDmrMm(Integer dmrMm) {
        this.dmrMm = dmrMm;
    }

    public Integer getDmrMa() {
        return dmrMa;
    }

    public void setDmrMa(Integer dmrMa) {
        this.dmrMa = dmrMa;
    }

    public Integer getDmrNo() {
        return dmrNo;
    }

    public void setDmrNo(Integer dmrNo) {
        this.dmrNo = dmrNo;
    }

    public Integer getDmrBi() {
        return dmrBi;
    }

    public void setDmrBi(Integer dmrBi) {
        this.dmrBi = dmrBi;
    }

    public Integer getDmrMb() {
        return dmrMb;
    }

    public void setDmrMb(Integer dmrMb) {
        this.dmrMb = dmrMb;
    }

    public Integer getDmrNs() {
        return dmrNs;
    }

    public void setDmrNs(Integer dmrNs) {
        this.dmrNs = dmrNs;
    }

    public Integer getDmrBe() {
        return dmrBe;
    }

    public void setDmrBe(Integer dmrBe) {
        this.dmrBe = dmrBe;
    }

    public Integer getDmrWo() {
        return dmrWo;
    }

    public void setDmrWo(Integer dmrWo) {
        this.dmrWo = dmrWo;
    }

    public Integer getDmrMi() {
        return dmrMi;
    }

    public void setDmrMi(Integer dmrMi) {
        this.dmrMi = dmrMi;
    }

    public Integer getDmrLi() {
        return dmrLi;
    }

    public void setDmrLi(Integer dmrLi) {
        this.dmrLi = dmrLi;
    }

    public Integer getIamGroup() {
        return iamGroup;
    }

    public void setIamGroup(Integer iamGroup) {
        this.iamGroup = iamGroup;
    }

    public Integer getCpaGroup() {
        return cpaGroup;
    }

    public void setCpaGroup(Integer cpaGroup) {
        this.cpaGroup = cpaGroup;
    }

    public Integer getDmrGroup() {
        return dmrGroup;
    }

    public void setDmrGroup(Integer dmrGroup) {
        this.dmrGroup = dmrGroup;
    }


}