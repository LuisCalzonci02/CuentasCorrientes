package com.NttData.CuentasSevice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CuentaCorriente extends Cuenta{

    private float cantidad;
    private String acuerdo;



}
