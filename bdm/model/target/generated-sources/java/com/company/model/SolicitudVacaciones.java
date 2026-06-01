
package com.company.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "SolicitudVacaciones")
@Table(name = "SOLICITUDVACACIONES")
@NamedQueries({
    @NamedQuery(name = "SolicitudVacaciones.findByPersistenceId", query = "SELECT s\nFROM SolicitudVacaciones s\nWHERE s.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "SolicitudVacaciones.findBySolicitanteId", query = "SELECT s\nFROM SolicitudVacaciones s\nWHERE s.solicitanteId= :solicitanteId\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudVacaciones.findByFechaInicio", query = "SELECT s\nFROM SolicitudVacaciones s\nWHERE s.fechaInicio= :fechaInicio\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudVacaciones.findByNumeroDias", query = "SELECT s\nFROM SolicitudVacaciones s\nWHERE s.numeroDias= :numeroDias\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudVacaciones.findByEstaAprobado", query = "SELECT s\nFROM SolicitudVacaciones s\nWHERE s.estaAprobado= :estaAprobado\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudVacaciones.find", query = "SELECT s\nFROM SolicitudVacaciones s\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SolicitudVacaciones.countForFindBySolicitanteId", query = "SELECT COUNT(s)\nFROM SolicitudVacaciones s\nWHERE s.solicitanteId= :solicitanteId\n"),
    @NamedQuery(name = "SolicitudVacaciones.countForFindByFechaInicio", query = "SELECT COUNT(s)\nFROM SolicitudVacaciones s\nWHERE s.fechaInicio= :fechaInicio\n"),
    @NamedQuery(name = "SolicitudVacaciones.countForFindByNumeroDias", query = "SELECT COUNT(s)\nFROM SolicitudVacaciones s\nWHERE s.numeroDias= :numeroDias\n"),
    @NamedQuery(name = "SolicitudVacaciones.countForFindByEstaAprobado", query = "SELECT COUNT(s)\nFROM SolicitudVacaciones s\nWHERE s.estaAprobado= :estaAprobado\n"),
    @NamedQuery(name = "SolicitudVacaciones.countForFind", query = "SELECT COUNT(s)\nFROM SolicitudVacaciones s\n")
})
public class SolicitudVacaciones implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "SOLICITANTEID", nullable = false)
    private Long solicitanteId;
    @Column(name = "FECHAINICIO", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate fechaInicio;
    @Column(name = "NUMERODIAS", nullable = false)
    private Integer numeroDias;
    @Column(name = "ESTAAPROBADO", nullable = true)
    private Boolean estaAprobado;

    public SolicitudVacaciones() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setSolicitanteId(Long solicitanteId) {
        this.solicitanteId = solicitanteId;
    }

    public Long getSolicitanteId() {
        return solicitanteId;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Integer getNumeroDias() {
        return numeroDias;
    }

    public void setEstaAprobado(Boolean estaAprobado) {
        this.estaAprobado = estaAprobado;
    }

    public Boolean isEstaAprobado() {
        return estaAprobado;
    }

}
