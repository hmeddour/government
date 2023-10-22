package com.meilleurtaux.government.service;

import com.meilleurtaux.government.model.Commune;
import feign.FeignException;

import java.util.List;

public interface CommuneService {

    List<Commune> getCommunesByPostalCode(final String codePostal) throws FeignException;
}
