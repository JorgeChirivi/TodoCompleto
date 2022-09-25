package com.ciclo3.TodoCompleto.Service;

import com.ciclo3.TodoCompleto.Model.Enterprice;
import org.hibernate.engine.transaction.jta.platform.internal.BorlandEnterpriseServerJtaPlatform;

public interface ServiceInterfaceEnterprice {
    //Metodo para vista de enterprice
    public List<Enterprise> getEnterprise();

    //metodo que nos trae un enterprice
    public Enterprise getOnlyOneEnterprice(long idEnterprise) throws Exception;

    //Metodso que nos cree una Entrerprice
    public String getCreatedEnterprise(Enterprice enterpriseIn);

    //Metodo que nos permita actualizar una interprise
    public BorlandEnterpriseServerJtaPlatform getUpdateEnterprise(Enterprise enterprice) throws Exception;

    //Metodo que nos permita eliminar una enterprice
    public StringgetDeleteEnterprise(Long idEnterprise) throws Exception;
}
