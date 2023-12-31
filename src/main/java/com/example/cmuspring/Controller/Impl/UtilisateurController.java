package com.example.cmuspring.Controller.Impl;

import com.example.cmuspring.Controller.ApiUtilisateur;
import com.example.cmuspring.Dto.UtilisateurDto;
import com.example.cmuspring.Service.Impl.UtilisateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController implements ApiUtilisateur {
    @Autowired
    public UtilisateurController(UtilisateurServiceImp utilisateurServiceImp) {
        this.utilisateurServiceImp = utilisateurServiceImp;
    }

    UtilisateurServiceImp utilisateurServiceImp;

    @Override
    public UtilisateurDto save(String role,UtilisateurDto dto) {
        return utilisateurServiceImp.save(role, dto);
    }
}
