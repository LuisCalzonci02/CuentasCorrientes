package com.NttData.CuentasSevice.controller;

import com.NttData.CuentasSevice.repository.CuentaRepositoryDAO;
import com.NttData.CuentasSevice.entity.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CuentaController {

    @Autowired
    private CuentaRepositoryDAO cuentaRepositoryDAO;


    @GetMapping("/cuentas")
    public List<Cuenta> allCuentas(){
        return (List<Cuenta>) cuentaRepositoryDAO.findAll();
    }
    @GetMapping("/cuentas/{id}")
    public Optional<Cuenta> buscarPorId(@PathVariable("id") Integer id){
        return cuentaRepositoryDAO.findById(id);
    }
    @PostMapping("/cuentas")
    public ResponseEntity<String> createCuentas(@RequestBody Cuenta cuenta, BindingResult result){

        if (result.hasErrors()){
            return ResponseEntity.status(400).body("Fallida");
        }else {
            cuentaRepositoryDAO.save(cuenta);
            return ResponseEntity.ok("Status Finalizada");

        }



    }



}
