package nvc.it.ice_factory_thanakit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_thanakit.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String> {
    
}
