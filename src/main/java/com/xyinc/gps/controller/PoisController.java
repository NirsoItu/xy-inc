package com.xyinc.gps.controller;

import com.xyinc.gps.model.Pois;
import com.xyinc.gps.repository.PoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/pois")
public class PoisController {

    @Autowired

    private PoisRepository poisRepository;


    //Create a new POI
    @PostMapping(path = "/addPoi")
    public @ResponseBody
    String addNewPoi(@RequestParam @Valid String name, @RequestParam @Valid Integer cooY1,
                     @RequestParam @Valid Integer cooX1) {

        Pois n = new Pois();
        n.setName(name);
        n.setCooX1(cooX1);
        n.setCooY1(cooY1);
        poisRepository.save(n);
        return "Poi created wiht success!";
        //return new ResponseEntity<Pois>(pois, HttpStatus.CREATED); ** Test
    }

    //Show all POIs
    @GetMapping("/allPois")
    public @ResponseBody
    Iterable<Pois> getAllPois() {
        return poisRepository.findAll();
    }


    @GetMapping("/underTen")
    public @ResponseBody
    Iterable<Pois> findByCoo(@RequestParam Integer cooX2, @RequestParam Integer cooY2) {
        return poisRepository.findByCoo(cooX2, cooY2);

    }
}