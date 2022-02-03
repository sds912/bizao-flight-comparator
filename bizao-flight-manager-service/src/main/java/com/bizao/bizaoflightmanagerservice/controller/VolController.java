package com.bizao.bizaoflightmanagerservice.controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.bizao.bizaoflightmanagerservice.model.Vol;
import com.bizao.bizaoflightmanagerservice.service.VolService;

@Slf4j
@RestController
@RequestMapping("/api/v1/vols")
@RequiredArgsConstructor
public class VolController {

    final VolService volService;

   @PostMapping("/save")
    public Vol saveVol(@RequestBody Vol vol) {
       Vol saveVol=volService.saveVol(vol);
       log.info("Vol id:"+saveVol.getId()+" numero vol:"+vol.getNumeroVol());
        return saveVol;
    }

   @PutMapping( "/update/{id}")
    public Vol updateVol(@PathVariable("id") String id,@RequestBody Vol vol) {

       Vol saveVol=volService.updateVol(id, vol);
       log.info("Vol id:"+saveVol.getId() + " numero vol:"+saveVol.getNumeroVol());
        return saveVol;
    }

   @DeleteMapping("/delete/{id}")
    public void deleteVol(@PathVariable("id") String id) {
       Vol Vol=volService.getVol(id);
       log.info("Vol id:"+Vol.getId() + " Deleted!!!");
       volService.deleteVol(id);
    }

   @GetMapping("/{id}")
    public Vol getVol(@PathVariable("id") String id) {
       Vol Vol=volService.getVol(id);
       log.info("Vol id:"+Vol.getId() + " numero vol:"+Vol.getNumeroVol());
        return volService.getVol(id);
    }

  @GetMapping("/")
    public List<Vol> getVols() {
        return volService.getVols();
    }

}