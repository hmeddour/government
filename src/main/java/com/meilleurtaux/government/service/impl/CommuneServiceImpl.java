package com.meilleurtaux.government.service.impl;

import com.meilleurtaux.government.client.GovernmentApiClient;
import com.meilleurtaux.government.exception.BadRequestException;
import com.meilleurtaux.government.model.Commune;
import com.meilleurtaux.government.service.CommuneService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuneServiceImpl implements CommuneService {

    @Autowired
    private GovernmentApiClient governmentApiClient;

    @Override
    public List<Commune> getCommunesByPostalCode(final String codePostal) throws FeignException {
        if (!codePostal.matches("\\d{5}"))
            throw new BadRequestException("Postal code should contain exactly 5 digits.");

        return governmentApiClient.getCommunesByPostalCode(codePostal);
    }
}
