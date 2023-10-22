package com.meilleurtaux.government.client;

import com.meilleurtaux.government.model.Commune;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "government-api-client", url = "https://geo.api.gouv.fr")
public interface GovernmentApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/communes?codePostal={codePostal}", produces = "application/json")
    List<Commune> getCommunesByPostalCode(@RequestParam("codePostal") final String codePostal);
}
