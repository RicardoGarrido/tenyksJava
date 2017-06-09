package test31.dao;

import java.io.Serializable;

public interface GenericDao<Entity, PK extends Serializable> {
    void Guardar(Entity t);
    void Actualizar(Entity t);
    Entity Buscar(PK id);
    void Eliminar(Entity t);
}
