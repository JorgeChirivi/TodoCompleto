package com.ciclo3.TodoCompleto.Service;

import com.ciclo3.TodoCompleto.Model.Enterprice;
import org.hibernate.engine.transaction.jta.platform.internal.BorlandEnterpriseServerJtaPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

public class ServiceEnterprice implements ServiceInterfaceEnterprice{

    //Atribute
    Date Today = new Date();

    //inyectar un objeto del repositorio  de laentidad enterprise
    @Autowired
    RepositoryEnterprice repositoryEnterprice;
    @Override
    public List<Enterprise> getEnterprise() {
        return repositoryEnterprice.findAll();
    }

    @Override
    public Enterprise getOnlyOneEnterprice(long idEnterprise) throws Exception {
        Optional<Enterprice> EnterpriseBD = repositoryEnterprice.findById(idEnterprice);
        if(EnterpriseBD.isPresent()) {
            return EnterpriseBD.get();
        }
        throw new Exception(("IdEnterprise no asignada a ninguna  enterprice de nuestra base de datos"));

    }

    @Override
    public String getCreatedEnterprise(Enterprice enterpriseIn) {
        //presguntamos si ya alguna enterprice  ya registrada  con ese Id.
        Optional<Enterprice> EnterpriseBd = repositoryEnterprice.findById(enterpriseIn.getIdEnterprice());
        if(!EnterpriseBd.isPresent()) {
            repositoryEnterprice.save(enterpriseIn);
            return "Enterprice cread con exito";
        }
        return ("Ese Id ya esta registrado a una Enterprise Existente");
    }

    @Override
    public BorlandEnterpriseServerJtaPlatform getUpdateEnterprise(Enterprise enterprice) throws Exception {
        //Llamamos a la enterprise a actualizar de la BD
        Enterprice enterpriceBd = getOnlyOneEnterprice(EnterpriceIn.getIdEnterprice());

        //Actualizamos atributos
        if(enterpriceIn.getNameEnterprise()!enterprice )
        return null;
    }
}
