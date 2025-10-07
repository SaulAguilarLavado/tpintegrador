package com.utp.tpintegrador.market.persistance.crud;

import com.utp.tpintegrador.market.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository  extends CrudRepository<Producto, Integer> {

    List<Producto>findByIdCategoriaOrderByNameAsc(int idCategoria);

    public Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
