package com.bizao.bizaoflightmanagerservice.service;
import com.bizao.bizaoflightmanagerservice.model.Vol;
import com.bizao.bizaoflightmanagerservice.repository.VolRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class VolServiceImpl implements VolService {

 
    final VolRepository volRepository;

    @Override
    public Vol saveVol(Vol vol) {
        return volRepository.save(vol);
    }

    @Override
    public Vol updateVol(String id, Vol vol) {
       Vol volToUpdate =volRepository.findById(id).orElseThrow();
       volToUpdate.setNumeroVol(vol.getNumeroVol());
       volToUpdate.setDepart(vol.getDepart());
       volToUpdate.setDestination(vol.getDestination());
       volToUpdate.setDateDepart(vol.getDateDepart());
       volToUpdate.setDateArrivee(vol.getDateArrivee());
       volToUpdate.setPrix(vol.getPrix());
        return volRepository.save(vol);
    }

    @Override
    public void deleteVol(String id) {
         volRepository.deleteById(id);
    }

    @Override
    public Vol getVol(String id) {
        return volRepository.findById(id).get();
    }

    @Override
    public List<Vol> getVols() {
        return volRepository.findAll();
    }
    
}
