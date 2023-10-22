package com.meilleurtaux.government.resource;

import com.meilleurtaux.government.model.Commune;
import com.meilleurtaux.government.service.impl.CommuneServiceImpl;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/communes")
@CrossOrigin
public class CommuneController {

    @Autowired
    private CommuneServiceImpl communeService;

    @GetMapping
    public ResponseEntity<List<Commune>> getCommunesByPostalCode(@RequestParam("codePostal") final String codePostal) {
        try {
            List<Commune> communesByPostalCode = communeService.getCommunesByPostalCode(codePostal);
            return new ResponseEntity<>(communesByPostalCode, HttpStatus.OK);
        } catch (FeignException.BadRequest e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (FeignException.NotFound e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (FeignException.InternalServerError e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
