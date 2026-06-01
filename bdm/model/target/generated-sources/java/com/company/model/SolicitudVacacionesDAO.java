
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface SolicitudVacacionesDAO
    extends BusinessObjectDAO
{


    public SolicitudVacaciones findByPersistenceId(Long persistenceId);

    public List<SolicitudVacaciones> findBySolicitanteId(Long solicitanteId, int startIndex, int maxResults);

    public List<SolicitudVacaciones> findByFechaInicio(LocalDate fechaInicio, int startIndex, int maxResults);

    public List<SolicitudVacaciones> findByNumeroDias(Integer numeroDias, int startIndex, int maxResults);

    public List<SolicitudVacaciones> findByEstaAprobado(Boolean estaAprobado, int startIndex, int maxResults);

    public List<SolicitudVacaciones> find(int startIndex, int maxResults);

    public Long countForFindBySolicitanteId(Long solicitanteId);

    public Long countForFindByFechaInicio(LocalDate fechaInicio);

    public Long countForFindByNumeroDias(Integer numeroDias);

    public Long countForFindByEstaAprobado(Boolean estaAprobado);

    public Long countForFind();

    public SolicitudVacaciones newInstance(Long solicitanteId, LocalDate fechaInicio, Integer numeroDias);

}
