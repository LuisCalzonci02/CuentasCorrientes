package com.NttData.CuentasSevice.repository;

import com.NttData.CuentasSevice.entity.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaRepositoryDAO extends CrudRepository<Cuenta, Integer> {
}
