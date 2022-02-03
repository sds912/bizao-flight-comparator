package com.bizao.bizaoflightmanagerservice.service;

import java.util.List;

import com.bizao.bizaoflightmanagerservice.model.Vol;


public interface VolService {
    Vol saveVol(Vol vol);
    Vol updateVol(String id, Vol vol);
    void deleteVol(String id);
    Vol getVol(String id);
    List<Vol> getVols();
    
}
