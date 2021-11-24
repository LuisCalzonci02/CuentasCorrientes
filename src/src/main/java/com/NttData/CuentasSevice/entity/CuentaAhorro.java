package com.NttData.CuentasSevice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuentaAhorro extends Cuenta {

    private float cantidad;
    public String acuerdo;


}
