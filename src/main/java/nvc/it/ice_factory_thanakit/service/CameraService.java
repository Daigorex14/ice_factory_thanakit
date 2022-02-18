package nvc.it.ice_factory_thanakit.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.ice_factory_thanakit.model.Camera;
import nvc.it.ice_factory_thanakit.model.Event;
import nvc.it.ice_factory_thanakit.repository.CameraRepository;

@Service
public class CameraService {
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCameras(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }

    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }

    public Optional<Camera> addEvents(String id, Event event){
        Camera currentCamera = cameraRepository.findById(id).get();
        List<Event> events = currentCamera.getEvents();
        events.add(event);
        event.setCreatedAt(new Date(System.currentTimeMillis()));
        currentCamera.setEvents(events);

        return Optional.of(cameraRepository.save(currentCamera));
    }
}
