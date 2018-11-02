package com.vi.springboottraining.controller;

import com.vi.springboottraining.model.Hero;
import com.vi.springboottraining.repository.HeroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/heroes")
public class HeroController {

    HeroRepository heroRepository;

    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @GetMapping({"", "/"})
    public Iterable<Hero> getAll(){
        return this.heroRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Hero> getHeroById(@PathVariable("id") String id){
        return this.heroRepository.findById(id);
    }

    /**
     * search by name
     * @param name
     * @return
     */
    @GetMapping("/name/{name}")
    public Hero[] getHeroByName(@PathVariable("name") String name){
        return this.heroRepository.findAllByNameContaining(name);
    }

    @PostMapping({"", "/"})
    public Hero saveHero(@RequestBody Hero hero){
        return this.heroRepository.save(hero);
    }

    @PutMapping({"", "/"})
    public Hero updateHero(@RequestBody Hero hero){
        return this.heroRepository.save(hero);
    }

    @DeleteMapping("/id/{id}")
    public void deleteHeroById(@PathVariable("id") String id){
        this.heroRepository.deleteById(id);
    }
}
